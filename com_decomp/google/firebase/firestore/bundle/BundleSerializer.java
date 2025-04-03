package com.google.firebase.firestore.bundle;

import android.util.Base64;
import com.google.firebase.Timestamp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c1;
import com.google.protobuf.j;
import com.google.protobuf.r1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
import t5.a;
import t5.r;
import t5.x;

public class BundleSerializer {
    private static final long MILLIS_PER_SECOND = 1000;
    private final RemoteSerializer remoteSerializer;
    private final SimpleDateFormat timestampFormat;

    public BundleSerializer(RemoteSerializer remoteSerializer2) {
        this.remoteSerializer = remoteSerializer2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.timestampFormat = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    private void decodeArrayValue(x.b bVar, JSONArray jSONArray) {
        a.b r10 = a.r();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                r10.f(decodeValue(jSONArray.getJSONObject(i10)));
            }
        }
        bVar.f(r10);
    }

    private Bound decodeBound(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean optBoolean = jSONObject.optBoolean("before", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(decodeValue(optJSONArray.getJSONObject(i10)));
            }
        }
        return new Bound(arrayList, optBoolean);
    }

    private BundledQuery decodeBundledQuery(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        verifyNoSelect(jSONObject2);
        ResourcePath decodeName = decodeName(jSONObject.getString("parent"));
        JSONArray jSONArray = jSONObject2.getJSONArray(Constants.MessagePayloadKeys.FROM);
        verifyCollectionSelector(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        boolean optBoolean = jSONObject3.optBoolean("allDescendants", false);
        String string = jSONObject3.getString("collectionId");
        if (!optBoolean) {
            decodeName = (ResourcePath) decodeName.append(string);
            string = null;
        }
        List<Filter> decodeWhere = decodeWhere(jSONObject2.optJSONObject("where"));
        List<OrderBy> decodeOrderBy = decodeOrderBy(jSONObject2.optJSONArray("orderBy"));
        Bound decodeBound = decodeBound(jSONObject2.optJSONObject("startAt"));
        Bound decodeBound2 = decodeBound(jSONObject2.optJSONObject("endAt"));
        verifyNoOffset(jSONObject2);
        int decodeLimit = decodeLimit(jSONObject2);
        return new BundledQuery(new Target(decodeName, string, decodeWhere, decodeOrderBy, (long) decodeLimit, decodeBound, decodeBound2), decodeLimitType(jSONObject));
    }

    private void decodeCompositeFilter(List<Filter> list, JSONObject jSONObject) {
        if (jSONObject.getString("op").equals("AND")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("filters");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    decodeFilter(list, optJSONArray.getJSONObject(i10));
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
    }

    private void decodeFieldFilter(List<Filter> list, JSONObject jSONObject) {
        list.add(FieldFilter.create(decodeFieldReference(jSONObject.getJSONObject("field")), decodeFieldFilterOperator(jSONObject.getString("op")), decodeValue(jSONObject.getJSONObject(FirebaseAnalytics.Param.VALUE))));
    }

    private Filter.Operator decodeFieldFilterOperator(String str) {
        return Filter.Operator.valueOf(str);
    }

    private FieldPath decodeFieldReference(JSONObject jSONObject) {
        return FieldPath.fromServerFormat(jSONObject.getString("fieldPath"));
    }

    private void decodeFilter(List<Filter> list, JSONObject jSONObject) {
        if (jSONObject.has("compositeFilter")) {
            decodeCompositeFilter(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            decodeFieldFilter(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            decodeUnaryFilter(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    private void decodeGeoPoint(x.b bVar, JSONObject jSONObject) {
        bVar.j(w5.a.n().e(jSONObject.optDouble("latitude")).f(jSONObject.optDouble("longitude")));
    }

    private int decodeLimit(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("limit");
        return optJSONObject != null ? optJSONObject.optInt(FirebaseAnalytics.Param.VALUE, -1) : jSONObject.optInt("limit", -1);
    }

    private Query.LimitType decodeLimitType(JSONObject jSONObject) {
        String optString = jSONObject.optString("limitType", "FIRST");
        if (optString.equals("FIRST")) {
            return Query.LimitType.LIMIT_TO_FIRST;
        }
        if (optString.equals("LAST")) {
            return Query.LimitType.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: " + optString);
    }

    private void decodeMapValue(x.b bVar, JSONObject jSONObject) {
        r.b r10 = r.r();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                r10.g(next, decodeValue(jSONObject.getJSONObject(next)));
            }
        }
        bVar.l(r10);
    }

    private ResourcePath decodeName(String str) {
        ResourcePath fromString = ResourcePath.fromString(str);
        if (this.remoteSerializer.isLocalResourceName(fromString)) {
            return (ResourcePath) fromString.popFirst(5);
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: " + str);
    }

    private List<OrderBy> decodeOrderBy(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                arrayList.add(OrderBy.getInstance(jSONObject.optString("direction", "ASCENDING").equals("ASCENDING") ? OrderBy.Direction.ASCENDING : OrderBy.Direction.DESCENDING, decodeFieldReference(jSONObject.getJSONObject("field"))));
            }
        }
        return arrayList;
    }

    private SnapshotVersion decodeSnapshotVersion(Object obj) {
        return new SnapshotVersion(decodeTimestamp(obj));
    }

    private Timestamp decodeTimestamp(Object obj) {
        if (obj instanceof String) {
            return decodeTimestamp((String) obj);
        }
        if (obj instanceof JSONObject) {
            return decodeTimestamp((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    private static long decodeTimezoneOffset(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        }
        throw new IllegalArgumentException("Invalid offset value: " + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        r1 = com.google.firebase.firestore.model.Values.NULL_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        r1 = com.google.firebase.firestore.model.Values.NAN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        r4.add(com.google.firebase.firestore.core.FieldFilter.create(r0, r5, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void decodeUnaryFilter(java.util.List<com.google.firebase.firestore.core.Filter> r4, org.json.JSONObject r5) {
        /*
            r3 = this;
            java.lang.String r0 = "field"
            org.json.JSONObject r0 = r5.getJSONObject(r0)
            com.google.firebase.firestore.model.FieldPath r0 = r3.decodeFieldReference(r0)
            java.lang.String r1 = "op"
            java.lang.String r5 = r5.getString(r1)
            r5.hashCode()
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case -2125479834: goto L_0x003d;
                case -1465346180: goto L_0x0032;
                case -244195494: goto L_0x0027;
                case 1019893512: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0047
        L_0x001c:
            java.lang.String r1 = "IS_NOT_NULL"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0025
            goto L_0x0047
        L_0x0025:
            r2 = 3
            goto L_0x0047
        L_0x0027:
            java.lang.String r1 = "IS_NOT_NAN"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0030
            goto L_0x0047
        L_0x0030:
            r2 = 2
            goto L_0x0047
        L_0x0032:
            java.lang.String r1 = "IS_NULL"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x003b
            goto L_0x0047
        L_0x003b:
            r2 = 1
            goto L_0x0047
        L_0x003d:
            java.lang.String r1 = "IS_NAN"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            switch(r2) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0067;
                case 2: goto L_0x0064;
                case 3: goto L_0x0061;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected unary filter: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L_0x0061:
            com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.NOT_EQUAL
            goto L_0x0069
        L_0x0064:
            com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.NOT_EQUAL
            goto L_0x006e
        L_0x0067:
            com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.EQUAL
        L_0x0069:
            t5.x r1 = com.google.firebase.firestore.model.Values.NULL_VALUE
            goto L_0x0070
        L_0x006c:
            com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.EQUAL
        L_0x006e:
            t5.x r1 = com.google.firebase.firestore.model.Values.NAN_VALUE
        L_0x0070:
            com.google.firebase.firestore.core.FieldFilter r5 = com.google.firebase.firestore.core.FieldFilter.create(r0, r5, r1)
            r4.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.bundle.BundleSerializer.decodeUnaryFilter(java.util.List, org.json.JSONObject):void");
    }

    private x decodeValue(JSONObject jSONObject) {
        x.b F = x.F();
        if (jSONObject.has("nullValue")) {
            F.n(c1.NULL_VALUE);
        } else if (jSONObject.has("booleanValue")) {
            F.g(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            F.k(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            F.i(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            decodeTimestamp(F, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            F.p(jSONObject.optString("stringValue", ""));
        } else if (jSONObject.has("bytesValue")) {
            F.h(j.o(Base64.decode(jSONObject.getString("bytesValue"), 0)));
        } else if (jSONObject.has("referenceValue")) {
            F.o(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            decodeGeoPoint(F, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            decodeArrayValue(F, jSONObject.getJSONObject("arrayValue").optJSONArray("values"));
        } else if (jSONObject.has("mapValue")) {
            decodeMapValue(F, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        } else {
            throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
        }
        return (x) F.build();
    }

    private List<Filter> decodeWhere(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            decodeFilter(arrayList, jSONObject);
        }
        return arrayList;
    }

    private static int parseNanos(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < 9; i11++) {
            i10 *= 10;
            if (i11 < str.length()) {
                if (str.charAt(i11) < '0' || str.charAt(i11) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: " + str);
                }
                i10 += str.charAt(i11) - '0';
            }
        }
        return i10;
    }

    private void verifyCollectionSelector(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    private void verifyNoOffset(JSONObject jSONObject) {
        if (jSONObject.has("offset")) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    private void verifyNoSelect(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    public BundleMetadata decodeBundleMetadata(JSONObject jSONObject) {
        return new BundleMetadata(jSONObject.getString("id"), jSONObject.getInt("version"), decodeSnapshotVersion(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    public BundledDocumentMetadata decodeBundledDocumentMetadata(JSONObject jSONObject) {
        DocumentKey fromPath = DocumentKey.fromPath(decodeName(jSONObject.getString("name")));
        SnapshotVersion decodeSnapshotVersion = decodeSnapshotVersion(jSONObject.get("readTime"));
        boolean optBoolean = jSONObject.optBoolean("exists", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.getString(i10));
            }
        }
        return new BundledDocumentMetadata(fromPath, decodeSnapshotVersion, optBoolean, arrayList);
    }

    /* access modifiers changed from: package-private */
    public BundleDocument decodeDocument(JSONObject jSONObject) {
        DocumentKey fromPath = DocumentKey.fromPath(decodeName(jSONObject.getString("name")));
        SnapshotVersion decodeSnapshotVersion = decodeSnapshotVersion(jSONObject.get("updateTime"));
        x.b F = x.F();
        decodeMapValue(F, jSONObject.getJSONObject("fields"));
        return new BundleDocument(MutableDocument.newFoundDocument(fromPath, decodeSnapshotVersion, ObjectValue.fromMap(F.e().l())));
    }

    public NamedQuery decodeNamedQuery(JSONObject jSONObject) {
        return new NamedQuery(jSONObject.getString("name"), decodeBundledQuery(jSONObject.getJSONObject("bundledQuery")), decodeSnapshotVersion(jSONObject.get("readTime")));
    }

    private Timestamp decodeTimestamp(String str) {
        try {
            int indexOf = str.indexOf(84);
            if (indexOf != -1) {
                int indexOf2 = str.indexOf(90, indexOf);
                if (indexOf2 == -1) {
                    indexOf2 = str.indexOf(43, indexOf);
                }
                if (indexOf2 == -1) {
                    indexOf2 = str.indexOf(45, indexOf);
                }
                if (indexOf2 != -1) {
                    int i10 = 0;
                    String substring = str.substring(0, indexOf2);
                    String str2 = "";
                    int indexOf3 = substring.indexOf(46);
                    if (indexOf3 != -1) {
                        String substring2 = substring.substring(0, indexOf3);
                        str2 = substring.substring(indexOf3 + 1);
                        substring = substring2;
                    }
                    long time = this.timestampFormat.parse(substring).getTime() / 1000;
                    if (!str2.isEmpty()) {
                        i10 = parseNanos(str2);
                    }
                    if (str.charAt(indexOf2) != 'Z') {
                        long decodeTimezoneOffset = decodeTimezoneOffset(str.substring(indexOf2 + 1));
                        time = str.charAt(indexOf2) == '+' ? time - decodeTimezoneOffset : time + decodeTimezoneOffset;
                    } else if (str.length() != indexOf2 + 1) {
                        throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(indexOf2) + "\"");
                    }
                    return new Timestamp(time, i10);
                }
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: " + str);
            }
            throw new IllegalArgumentException("Invalid timestamp: " + str);
        } catch (ParseException e10) {
            throw new IllegalArgumentException("Failed to parse timestamp", e10);
        }
    }

    private Timestamp decodeTimestamp(JSONObject jSONObject) {
        return new Timestamp(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    private void decodeTimestamp(x.b bVar, Object obj) {
        Timestamp decodeTimestamp = decodeTimestamp(obj);
        bVar.q(r1.n().f(decodeTimestamp.getSeconds()).e(decodeTimestamp.getNanoseconds()));
    }
}
