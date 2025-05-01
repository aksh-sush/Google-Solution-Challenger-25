package com.google.firebase.firestore;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.util.CustomClassMapper;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Date;
import java.util.Map;
import t5.x;

public class DocumentSnapshot {
    private final Document doc;
    private final FirebaseFirestore firestore;
    private final DocumentKey key;
    private final SnapshotMetadata metadata;

    public enum ServerTimestampBehavior {
        NONE,
        ESTIMATE,
        PREVIOUS;
        
        static final ServerTimestampBehavior DEFAULT = null;

        static {
            ServerTimestampBehavior serverTimestampBehavior;
            DEFAULT = serverTimestampBehavior;
        }
    }

    DocumentSnapshot(FirebaseFirestore firebaseFirestore, DocumentKey documentKey, Document document, boolean z10, boolean z11) {
        this.firestore = (FirebaseFirestore) Preconditions.checkNotNull(firebaseFirestore);
        this.key = (DocumentKey) Preconditions.checkNotNull(documentKey);
        this.doc = document;
        this.metadata = new SnapshotMetadata(z11, z10);
    }

    private <T> T castTypedValue(Object obj, String str, Class<T> cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new RuntimeException("Field '" + str + "' is not a " + cls.getName());
    }

    static DocumentSnapshot fromDocument(FirebaseFirestore firebaseFirestore, Document document, boolean z10, boolean z11) {
        return new DocumentSnapshot(firebaseFirestore, document.getKey(), document, z10, z11);
    }

    static DocumentSnapshot fromNoDocument(FirebaseFirestore firebaseFirestore, DocumentKey documentKey, boolean z10) {
        return new DocumentSnapshot(firebaseFirestore, documentKey, (Document) null, z10, false);
    }

    private Object getInternal(FieldPath fieldPath, ServerTimestampBehavior serverTimestampBehavior) {
        x field;
        Document document = this.doc;
        if (document == null || (field = document.getField(fieldPath)) == null) {
            return null;
        }
        return new UserDataWriter(this.firestore, serverTimestampBehavior).convertValue(field);
    }

    private <T> T getTypedValue(String str, Class<T> cls) {
        Preconditions.checkNotNull(str, "Provided field must not be null.");
        return castTypedValue(get(str, ServerTimestampBehavior.DEFAULT), str, cls);
    }

    public boolean contains(FieldPath fieldPath) {
        Preconditions.checkNotNull(fieldPath, "Provided field path must not be null.");
        Document document = this.doc;
        return (document == null || document.getField(fieldPath.getInternalPath()) == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r4.doc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.firestore.DocumentSnapshot
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.firebase.firestore.DocumentSnapshot r5 = (com.google.firebase.firestore.DocumentSnapshot) r5
            com.google.firebase.firestore.FirebaseFirestore r1 = r4.firestore
            com.google.firebase.firestore.FirebaseFirestore r3 = r5.firestore
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003c
            com.google.firebase.firestore.model.DocumentKey r1 = r4.key
            com.google.firebase.firestore.model.DocumentKey r3 = r5.key
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003c
            com.google.firebase.firestore.model.Document r1 = r4.doc
            if (r1 != 0) goto L_0x0029
            com.google.firebase.firestore.model.Document r1 = r5.doc
            if (r1 != 0) goto L_0x003c
            goto L_0x0031
        L_0x0029:
            com.google.firebase.firestore.model.Document r3 = r5.doc
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003c
        L_0x0031:
            com.google.firebase.firestore.SnapshotMetadata r1 = r4.metadata
            com.google.firebase.firestore.SnapshotMetadata r5 = r5.metadata
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.DocumentSnapshot.equals(java.lang.Object):boolean");
    }

    public boolean exists() {
        return this.doc != null;
    }

    public Object get(FieldPath fieldPath) {
        return get(fieldPath, ServerTimestampBehavior.DEFAULT);
    }

    public Blob getBlob(String str) {
        return (Blob) getTypedValue(str, Blob.class);
    }

    public Boolean getBoolean(String str) {
        return (Boolean) getTypedValue(str, Boolean.class);
    }

    public Map<String, Object> getData() {
        return getData(ServerTimestampBehavior.DEFAULT);
    }

    public Date getDate(String str) {
        return getDate(str, ServerTimestampBehavior.DEFAULT);
    }

    /* access modifiers changed from: package-private */
    public Document getDocument() {
        return this.doc;
    }

    public DocumentReference getDocumentReference(String str) {
        return (DocumentReference) getTypedValue(str, DocumentReference.class);
    }

    public Double getDouble(String str) {
        Number number = (Number) getTypedValue(str, Number.class);
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    public GeoPoint getGeoPoint(String str) {
        return (GeoPoint) getTypedValue(str, GeoPoint.class);
    }

    public String getId() {
        return this.key.getPath().getLastSegment();
    }

    public Long getLong(String str) {
        Number number = (Number) getTypedValue(str, Number.class);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    public SnapshotMetadata getMetadata() {
        return this.metadata;
    }

    public DocumentReference getReference() {
        return new DocumentReference(this.key, this.firestore);
    }

    public String getString(String str) {
        return (String) getTypedValue(str, String.class);
    }

    public Timestamp getTimestamp(String str) {
        return getTimestamp(str, ServerTimestampBehavior.DEFAULT);
    }

    public int hashCode() {
        int hashCode = ((this.firestore.hashCode() * 31) + this.key.hashCode()) * 31;
        Document document = this.doc;
        int i10 = 0;
        int hashCode2 = (hashCode + (document != null ? document.getKey().hashCode() : 0)) * 31;
        Document document2 = this.doc;
        if (document2 != null) {
            i10 = document2.getData().hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.metadata.hashCode();
    }

    public <T> T toObject(Class<T> cls) {
        return toObject(cls, ServerTimestampBehavior.DEFAULT);
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.key + ", metadata=" + this.metadata + ", doc=" + this.doc + '}';
    }

    public boolean contains(String str) {
        return contains(FieldPath.fromDotSeparatedPath(str));
    }

    public Object get(FieldPath fieldPath, ServerTimestampBehavior serverTimestampBehavior) {
        Preconditions.checkNotNull(fieldPath, "Provided field path must not be null.");
        Preconditions.checkNotNull(serverTimestampBehavior, "Provided serverTimestampBehavior value must not be null.");
        return getInternal(fieldPath.getInternalPath(), serverTimestampBehavior);
    }

    public Map<String, Object> getData(ServerTimestampBehavior serverTimestampBehavior) {
        Preconditions.checkNotNull(serverTimestampBehavior, "Provided serverTimestampBehavior value must not be null.");
        UserDataWriter userDataWriter = new UserDataWriter(this.firestore, serverTimestampBehavior);
        Document document = this.doc;
        if (document == null) {
            return null;
        }
        return userDataWriter.convertObject(document.getData().getFieldsMap());
    }

    public Date getDate(String str, ServerTimestampBehavior serverTimestampBehavior) {
        Preconditions.checkNotNull(str, "Provided field path must not be null.");
        Preconditions.checkNotNull(serverTimestampBehavior, "Provided serverTimestampBehavior value must not be null.");
        Timestamp timestamp = getTimestamp(str, serverTimestampBehavior);
        if (timestamp != null) {
            return timestamp.toDate();
        }
        return null;
    }

    public Timestamp getTimestamp(String str, ServerTimestampBehavior serverTimestampBehavior) {
        Preconditions.checkNotNull(str, "Provided field path must not be null.");
        Preconditions.checkNotNull(serverTimestampBehavior, "Provided serverTimestampBehavior value must not be null.");
        return (Timestamp) castTypedValue(getInternal(FieldPath.fromDotSeparatedPath(str).getInternalPath(), serverTimestampBehavior), str, Timestamp.class);
    }

    public <T> T toObject(Class<T> cls, ServerTimestampBehavior serverTimestampBehavior) {
        Preconditions.checkNotNull(cls, "Provided POJO type must not be null.");
        Preconditions.checkNotNull(serverTimestampBehavior, "Provided serverTimestampBehavior value must not be null.");
        Map<String, Object> data = getData(serverTimestampBehavior);
        if (data == null) {
            return null;
        }
        return CustomClassMapper.convertToCustomClass(data, cls, getReference());
    }

    public <T> T get(FieldPath fieldPath, Class<T> cls) {
        return get(fieldPath, cls, ServerTimestampBehavior.DEFAULT);
    }

    public <T> T get(FieldPath fieldPath, Class<T> cls, ServerTimestampBehavior serverTimestampBehavior) {
        Object obj = get(fieldPath, serverTimestampBehavior);
        if (obj == null) {
            return null;
        }
        return CustomClassMapper.convertToCustomClass(obj, cls, getReference());
    }

    public Object get(String str) {
        return get(FieldPath.fromDotSeparatedPath(str), ServerTimestampBehavior.DEFAULT);
    }

    public Object get(String str, ServerTimestampBehavior serverTimestampBehavior) {
        return get(FieldPath.fromDotSeparatedPath(str), serverTimestampBehavior);
    }

    public <T> T get(String str, Class<T> cls) {
        return get(FieldPath.fromDotSeparatedPath(str), cls, ServerTimestampBehavior.DEFAULT);
    }

    public <T> T get(String str, Class<T> cls, ServerTimestampBehavior serverTimestampBehavior) {
        return get(FieldPath.fromDotSeparatedPath(str), cls, serverTimestampBehavior);
    }
}
