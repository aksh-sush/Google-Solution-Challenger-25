package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.util.Assert;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import t5.r;
import t5.x;

public final class ObjectValue implements Cloneable {
    private Map<String, Object> overlayMap;
    private x partialValue;

    public ObjectValue() {
        this((x) x.F().m(r.j()).build());
    }

    private r applyOverlay(FieldPath fieldPath, Map<String, Object> map) {
        x extractNestedValue = extractNestedValue(this.partialValue, fieldPath);
        r.b r10 = Values.isMapValue(extractNestedValue) ? (r.b) extractNestedValue.A().toBuilder() : r.r();
        boolean z10 = false;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Map) {
                r applyOverlay = applyOverlay((FieldPath) fieldPath.append(str), (Map) value);
                if (applyOverlay != null) {
                    r10.g(str, (x) x.F().m(applyOverlay).build());
                }
            } else if (value instanceof x) {
                r10.g(str, (x) value);
            } else if (r10.e(str)) {
                Assert.hardAssert(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                r10.h(str);
            }
            z10 = true;
        }
        if (z10) {
            return (r) r10.build();
        }
        return null;
    }

    private x buildProto() {
        r applyOverlay = applyOverlay(FieldPath.EMPTY_PATH, this.overlayMap);
        if (applyOverlay != null) {
            this.partialValue = (x) x.F().m(applyOverlay).build();
            this.overlayMap.clear();
        }
        return this.partialValue;
    }

    private FieldMask extractFieldMask(r rVar) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : rVar.l().entrySet()) {
            FieldPath fromSingleSegment = FieldPath.fromSingleSegment((String) entry.getKey());
            if (Values.isMapValue((x) entry.getValue())) {
                Set<FieldPath> mask = extractFieldMask(((x) entry.getValue()).A()).getMask();
                if (!mask.isEmpty()) {
                    for (FieldPath append : mask) {
                        hashSet.add((FieldPath) fromSingleSegment.append(append));
                    }
                }
            }
            hashSet.add(fromSingleSegment);
        }
        return FieldMask.fromSet(hashSet);
    }

    private x extractNestedValue(x xVar, FieldPath fieldPath) {
        if (fieldPath.isEmpty()) {
            return xVar;
        }
        int i10 = 0;
        while (true) {
            int length = fieldPath.length() - 1;
            r A = xVar.A();
            if (i10 >= length) {
                return A.m(fieldPath.getLastSegment(), (x) null);
            }
            xVar = A.m(fieldPath.getSegment(i10), (x) null);
            if (!Values.isMapValue(xVar)) {
                return null;
            }
            i10++;
        }
    }

    public static ObjectValue fromMap(Map<String, x> map) {
        return new ObjectValue((x) x.F().l(r.r().f(map)).build());
    }

    private void setOverlay(FieldPath fieldPath, x xVar) {
        Map<String, Object> hashMap;
        Map<String, Object> map = this.overlayMap;
        for (int i10 = 0; i10 < fieldPath.length() - 1; i10++) {
            String segment = fieldPath.getSegment(i10);
            Object obj = map.get(segment);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof x) {
                    x xVar2 = (x) obj;
                    if (xVar2.E() == x.c.MAP_VALUE) {
                        HashMap hashMap2 = new HashMap(xVar2.A().l());
                        map.put(segment, hashMap2);
                        map = hashMap2;
                    }
                }
                hashMap = new HashMap<>();
                map.put(segment, hashMap);
            }
            map = hashMap;
        }
        map.put(fieldPath.getLastSegment(), xVar);
    }

    public ObjectValue clone() {
        return new ObjectValue(buildProto());
    }

    public void delete(FieldPath fieldPath) {
        Assert.hardAssert(!fieldPath.isEmpty(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        setOverlay(fieldPath, (x) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ObjectValue) {
            return Values.equals(buildProto(), ((ObjectValue) obj).buildProto());
        }
        return false;
    }

    public x get(FieldPath fieldPath) {
        return extractNestedValue(buildProto(), fieldPath);
    }

    public FieldMask getFieldMask() {
        return extractFieldMask(buildProto().A());
    }

    public Map<String, x> getFieldsMap() {
        return buildProto().A().l();
    }

    public int hashCode() {
        return buildProto().hashCode();
    }

    public void set(FieldPath fieldPath, x xVar) {
        Assert.hardAssert(!fieldPath.isEmpty(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        setOverlay(fieldPath, xVar);
    }

    public void setAll(Map<FieldPath, x> map) {
        for (Map.Entry next : map.entrySet()) {
            FieldPath fieldPath = (FieldPath) next.getKey();
            if (next.getValue() == null) {
                delete(fieldPath);
            } else {
                set(fieldPath, (x) next.getValue());
            }
        }
    }

    public String toString() {
        return "ObjectValue{internalValue=" + buildProto() + '}';
    }

    public ObjectValue(x xVar) {
        this.overlayMap = new HashMap();
        Assert.hardAssert(xVar.E() == x.c.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        Assert.hardAssert(!ServerTimestamps.isServerTimestamp(xVar), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.partialValue = xVar;
    }
}
