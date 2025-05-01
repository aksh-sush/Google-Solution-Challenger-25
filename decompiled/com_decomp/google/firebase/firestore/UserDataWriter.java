package com.google.firebase.firestore;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ServerTimestamps;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.r1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t5.x;

public class UserDataWriter {
    private final FirebaseFirestore firestore;
    private final DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7828a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.firestore.DocumentSnapshot$ServerTimestampBehavior[] r0 = com.google.firebase.firestore.DocumentSnapshot.ServerTimestampBehavior.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7828a = r0
                com.google.firebase.firestore.DocumentSnapshot$ServerTimestampBehavior r1 = com.google.firebase.firestore.DocumentSnapshot.ServerTimestampBehavior.PREVIOUS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7828a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.DocumentSnapshot$ServerTimestampBehavior r1 = com.google.firebase.firestore.DocumentSnapshot.ServerTimestampBehavior.ESTIMATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.UserDataWriter.a.<clinit>():void");
        }
    }

    UserDataWriter(FirebaseFirestore firebaseFirestore, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior2) {
        this.firestore = firebaseFirestore;
        this.serverTimestampBehavior = serverTimestampBehavior2;
    }

    private List<Object> convertArray(t5.a aVar) {
        ArrayList arrayList = new ArrayList(aVar.q());
        for (x convertValue : aVar.a()) {
            arrayList.add(convertValue(convertValue));
        }
        return arrayList;
    }

    private Object convertReference(x xVar) {
        DatabaseId fromName = DatabaseId.fromName(xVar.B());
        DocumentKey fromName2 = DocumentKey.fromName(xVar.B());
        DatabaseId databaseId = this.firestore.getDatabaseId();
        if (!fromName.equals(databaseId)) {
            Logger.warn("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", fromName2.getPath(), fromName.getProjectId(), fromName.getDatabaseId(), databaseId.getProjectId(), databaseId.getDatabaseId());
        }
        return new DocumentReference(fromName2, this.firestore);
    }

    private Object convertServerTimestamp(x xVar) {
        int i10 = a.f7828a[this.serverTimestampBehavior.ordinal()];
        if (i10 == 1) {
            x previousValue = ServerTimestamps.getPreviousValue(xVar);
            if (previousValue == null) {
                return null;
            }
            return convertValue(previousValue);
        } else if (i10 != 2) {
            return null;
        } else {
            return convertTimestamp(ServerTimestamps.getLocalWriteTime(xVar));
        }
    }

    private Object convertTimestamp(r1 r1Var) {
        return new Timestamp(r1Var.m(), r1Var.l());
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> convertObject(Map<String, x> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), convertValue((x) next.getValue()));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Object convertValue(x xVar) {
        switch (Values.typeOrder(xVar)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(xVar.u());
            case 2:
                return xVar.E().equals(x.c.INTEGER_VALUE) ? Long.valueOf(xVar.z()) : Double.valueOf(xVar.x());
            case 3:
                return convertTimestamp(xVar.D());
            case 4:
                return convertServerTimestamp(xVar);
            case 5:
                return xVar.C();
            case 6:
                return Blob.fromByteString(xVar.v());
            case 7:
                return convertReference(xVar);
            case 8:
                return new GeoPoint(xVar.y().l(), xVar.y().m());
            case 9:
                return convertArray(xVar.t());
            case 10:
                return convertObject(xVar.A().l());
            default:
                throw Assert.fail("Unknown value type: " + xVar.E(), new Object[0]);
        }
    }
}
