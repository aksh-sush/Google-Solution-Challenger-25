package com.google.firebase.firestore;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.core.UserData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.mutation.ArrayTransformOperation;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.model.mutation.NumericIncrementTransformOperation;
import com.google.firebase.firestore.model.mutation.ServerTimestampOperation;
import com.google.firebase.firestore.model.mutation.TransformOperation;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.CustomClassMapper;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.c1;
import com.google.protobuf.r1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t5.a;
import t5.r;
import t5.x;

public final class UserDataReader {
    private final DatabaseId databaseId;

    public UserDataReader(DatabaseId databaseId2) {
        this.databaseId = databaseId2;
    }

    private ObjectValue convertAndParseDocumentData(Object obj, UserData.ParseContext parseContext) {
        if (!obj.getClass().isArray()) {
            x parseData = parseData(CustomClassMapper.convertToPlainJavaTypes(obj), parseContext);
            if (parseData.E() == x.c.MAP_VALUE) {
                return new ObjectValue(parseData);
            }
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was " + "of type: " + Util.typeName(obj));
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was " + "an array");
    }

    private List<x> parseArrayTransformElements(List<Object> list) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(convertAndParseFieldData(list.get(i10), parseAccumulator.rootContext().childContext(i10)));
        }
        return arrayList;
    }

    private x parseData(Object obj, UserData.ParseContext parseContext) {
        if (obj instanceof Map) {
            return parseMap((Map) obj, parseContext);
        }
        if (obj instanceof FieldValue) {
            parseSentinelFieldValue((FieldValue) obj, parseContext);
            return null;
        }
        if (parseContext.getPath() != null) {
            parseContext.addToFieldMask(parseContext.getPath());
        }
        if (!(obj instanceof List)) {
            return parseScalarValue(obj, parseContext);
        }
        if (!parseContext.isArrayElement() || parseContext.getDataSource() == UserData.Source.ArrayArgument) {
            return parseList((List) obj, parseContext);
        }
        throw parseContext.createError("Nested arrays are not supported");
    }

    private <T> x parseList(List<T> list, UserData.ParseContext parseContext) {
        a.b r10 = a.r();
        int i10 = 0;
        for (T parseData : list) {
            x parseData2 = parseData(parseData, parseContext.childContext(i10));
            if (parseData2 == null) {
                parseData2 = (x) x.F().n(c1.NULL_VALUE).build();
            }
            r10.f(parseData2);
            i10++;
        }
        return (x) x.F().f(r10).build();
    }

    private <K, V> x parseMap(Map<K, V> map, UserData.ParseContext parseContext) {
        x.b l10;
        if (map.isEmpty()) {
            if (parseContext.getPath() != null && !parseContext.getPath().isEmpty()) {
                parseContext.addToFieldMask(parseContext.getPath());
            }
            l10 = x.F().m(r.j());
        } else {
            r.b r10 = r.r();
            for (Map.Entry next : map.entrySet()) {
                if (next.getKey() instanceof String) {
                    String str = (String) next.getKey();
                    x parseData = parseData(next.getValue(), parseContext.childContext(str));
                    if (parseData != null) {
                        r10.g(str, parseData);
                    }
                } else {
                    throw parseContext.createError(String.format("Non-String Map key (%s) is not allowed", new Object[]{next.getValue()}));
                }
            }
            l10 = x.F().l(r10);
        }
        return (x) l10.build();
    }

    private x parseScalarValue(Object obj, UserData.ParseContext parseContext) {
        if (obj == null) {
            return (x) x.F().n(c1.NULL_VALUE).build();
        }
        if (obj instanceof Integer) {
            return (x) x.F().k((long) ((Integer) obj).intValue()).build();
        }
        if (obj instanceof Long) {
            return (x) x.F().k(((Long) obj).longValue()).build();
        }
        if (obj instanceof Float) {
            return (x) x.F().i(((Float) obj).doubleValue()).build();
        }
        if (obj instanceof Double) {
            return (x) x.F().i(((Double) obj).doubleValue()).build();
        }
        if (obj instanceof Boolean) {
            return (x) x.F().g(((Boolean) obj).booleanValue()).build();
        }
        if (obj instanceof String) {
            return (x) x.F().p((String) obj).build();
        }
        if (obj instanceof Date) {
            return parseTimestamp(new Timestamp((Date) obj));
        }
        if (obj instanceof Timestamp) {
            return parseTimestamp((Timestamp) obj);
        }
        if (obj instanceof GeoPoint) {
            GeoPoint geoPoint = (GeoPoint) obj;
            return (x) x.F().j(w5.a.n().e(geoPoint.getLatitude()).f(geoPoint.getLongitude())).build();
        } else if (obj instanceof Blob) {
            return (x) x.F().h(((Blob) obj).toByteString()).build();
        } else {
            if (obj instanceof DocumentReference) {
                DocumentReference documentReference = (DocumentReference) obj;
                if (documentReference.getFirestore() != null) {
                    DatabaseId databaseId2 = documentReference.getFirestore().getDatabaseId();
                    if (!databaseId2.equals(this.databaseId)) {
                        throw parseContext.createError(String.format("Document reference is for database %s/%s but should be for database %s/%s", new Object[]{databaseId2.getProjectId(), databaseId2.getDatabaseId(), this.databaseId.getProjectId(), this.databaseId.getDatabaseId()}));
                    }
                }
                return (x) x.F().o(String.format("projects/%s/databases/%s/documents/%s", new Object[]{this.databaseId.getProjectId(), this.databaseId.getDatabaseId(), documentReference.getPath()})).build();
            } else if (obj.getClass().isArray()) {
                throw parseContext.createError("Arrays are not supported; use a List instead");
            } else {
                throw parseContext.createError("Unsupported type: " + Util.typeName(obj));
            }
        }
    }

    private void parseSentinelFieldValue(FieldValue fieldValue, UserData.ParseContext parseContext) {
        TransformOperation numericIncrementTransformOperation;
        FieldPath path;
        boolean z10 = true;
        if (!parseContext.isWrite()) {
            throw parseContext.createError(String.format("%s() can only be used with set() and update()", new Object[]{fieldValue.getMethodName()}));
        } else if (parseContext.getPath() == null) {
            throw parseContext.createError(String.format("%s() is not currently supported inside arrays", new Object[]{fieldValue.getMethodName()}));
        } else if (!(fieldValue instanceof FieldValue.c)) {
            if (fieldValue instanceof FieldValue.e) {
                path = parseContext.getPath();
                numericIncrementTransformOperation = ServerTimestampOperation.getInstance();
            } else {
                if (fieldValue instanceof FieldValue.b) {
                    numericIncrementTransformOperation = new ArrayTransformOperation.Union(parseArrayTransformElements(((FieldValue.b) fieldValue).a()));
                } else if (fieldValue instanceof FieldValue.a) {
                    numericIncrementTransformOperation = new ArrayTransformOperation.Remove(parseArrayTransformElements(((FieldValue.a) fieldValue).a()));
                } else if (fieldValue instanceof FieldValue.d) {
                    numericIncrementTransformOperation = new NumericIncrementTransformOperation(parseQueryValue(((FieldValue.d) fieldValue).a()));
                } else {
                    throw Assert.fail("Unknown FieldValue type: %s", Util.typeName(fieldValue));
                }
                path = parseContext.getPath();
            }
            parseContext.addToFieldTransforms(path, numericIncrementTransformOperation);
        } else if (parseContext.getDataSource() == UserData.Source.MergeSet) {
            parseContext.addToFieldMask(parseContext.getPath());
        } else if (parseContext.getDataSource() == UserData.Source.Update) {
            if (parseContext.getPath().length() <= 0) {
                z10 = false;
            }
            Assert.hardAssert(z10, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
            throw parseContext.createError("FieldValue.delete() can only appear at the top level of your update data");
        } else {
            throw parseContext.createError("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
        }
    }

    private x parseTimestamp(Timestamp timestamp) {
        return (x) x.F().q(r1.n().f(timestamp.getSeconds()).e((timestamp.getNanoseconds() / 1000) * 1000)).build();
    }

    public x convertAndParseFieldData(Object obj, UserData.ParseContext parseContext) {
        return parseData(CustomClassMapper.convertToPlainJavaTypes(obj), parseContext);
    }

    public UserData.ParsedSetData parseMergeData(Object obj, FieldMask fieldMask) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.MergeSet);
        ObjectValue convertAndParseDocumentData = convertAndParseDocumentData(obj, parseAccumulator.rootContext());
        if (fieldMask == null) {
            return parseAccumulator.toMergeData(convertAndParseDocumentData);
        }
        for (FieldPath next : fieldMask.getMask()) {
            if (!parseAccumulator.contains(next)) {
                throw new IllegalArgumentException("Field '" + next.toString() + "' is specified in your field mask but not in your input data.");
            }
        }
        return parseAccumulator.toMergeData(convertAndParseDocumentData, fieldMask);
    }

    public x parseQueryValue(Object obj) {
        return parseQueryValue(obj, false);
    }

    public UserData.ParsedSetData parseSetData(Object obj) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Set);
        return parseAccumulator.toSetData(convertAndParseDocumentData(obj, parseAccumulator.rootContext()));
    }

    public UserData.ParsedUpdateData parseUpdateData(List<Object> list) {
        Assert.hardAssert(list.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Update);
        UserData.ParseContext rootContext = parseAccumulator.rootContext();
        ObjectValue objectValue = new ObjectValue();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z10 = next instanceof String;
            Assert.hardAssert(z10 || (next instanceof FieldPath), "Expected argument to be String or FieldPath.", new Object[0]);
            FieldPath internalPath = (z10 ? FieldPath.fromDotSeparatedPath((String) next) : (FieldPath) next).getInternalPath();
            if (next2 instanceof FieldValue.c) {
                rootContext.addToFieldMask(internalPath);
            } else {
                x convertAndParseFieldData = convertAndParseFieldData(next2, rootContext.childContext(internalPath));
                if (convertAndParseFieldData != null) {
                    rootContext.addToFieldMask(internalPath);
                    objectValue.set(internalPath, convertAndParseFieldData);
                }
            }
        }
        return parseAccumulator.toUpdateData(objectValue);
    }

    public x parseQueryValue(Object obj, boolean z10) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(z10 ? UserData.Source.ArrayArgument : UserData.Source.Argument);
        x convertAndParseFieldData = convertAndParseFieldData(obj, parseAccumulator.rootContext());
        Assert.hardAssert(convertAndParseFieldData != null, "Parsed data should not be null.", new Object[0]);
        Assert.hardAssert(parseAccumulator.getFieldTransforms().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return convertAndParseFieldData;
    }

    public UserData.ParsedUpdateData parseUpdateData(Map<String, Object> map) {
        Preconditions.checkNotNull(map, "Provided update data must not be null.");
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Update);
        UserData.ParseContext rootContext = parseAccumulator.rootContext();
        ObjectValue objectValue = new ObjectValue();
        for (Map.Entry next : map.entrySet()) {
            FieldPath internalPath = FieldPath.fromDotSeparatedPath((String) next.getKey()).getInternalPath();
            Object value = next.getValue();
            if (value instanceof FieldValue.c) {
                rootContext.addToFieldMask(internalPath);
            } else {
                x convertAndParseFieldData = convertAndParseFieldData(value, rootContext.childContext(internalPath));
                if (convertAndParseFieldData != null) {
                    rootContext.addToFieldMask(internalPath);
                    objectValue.set(internalPath, convertAndParseFieldData);
                }
            }
        }
        return parseAccumulator.toUpdateData(objectValue);
    }
}
