package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.LimboDocumentChange;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class View {
    private boolean current;
    private DocumentSet documentSet;
    private ImmutableSortedSet<DocumentKey> limboDocuments;
    private ImmutableSortedSet<DocumentKey> mutatedKeys;
    private final Query query;
    private ViewSnapshot.SyncState syncState = ViewSnapshot.SyncState.NONE;
    private ImmutableSortedSet<DocumentKey> syncedDocuments;

    public static class DocumentChanges {
        final DocumentViewChangeSet changeSet;
        final DocumentSet documentSet;
        final ImmutableSortedSet<DocumentKey> mutatedKeys;
        /* access modifiers changed from: private */
        public final boolean needsRefill;

        private DocumentChanges(DocumentSet documentSet2, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet<DocumentKey> immutableSortedSet, boolean z10) {
            this.documentSet = documentSet2;
            this.changeSet = documentViewChangeSet;
            this.mutatedKeys = immutableSortedSet;
            this.needsRefill = z10;
        }

        public boolean needsRefill() {
            return this.needsRefill;
        }

        /* synthetic */ DocumentChanges(DocumentSet documentSet2, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet immutableSortedSet, boolean z10, a aVar) {
            this(documentSet2, documentViewChangeSet, immutableSortedSet, z10);
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7845a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.firebase.firestore.core.DocumentViewChange$Type[] r0 = com.google.firebase.firestore.core.DocumentViewChange.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7845a = r0
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7845a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.MODIFIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7845a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.METADATA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7845a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.REMOVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.View.a.<clinit>():void");
        }
    }

    public View(Query query2, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        this.query = query2;
        this.documentSet = DocumentSet.emptySet(query2.comparator());
        this.syncedDocuments = immutableSortedSet;
        this.limboDocuments = DocumentKey.emptyKeySet();
        this.mutatedKeys = DocumentKey.emptyKeySet();
    }

    private void applyTargetChange(TargetChange targetChange) {
        if (targetChange != null) {
            Iterator<DocumentKey> it = targetChange.getAddedDocuments().iterator();
            while (it.hasNext()) {
                this.syncedDocuments = this.syncedDocuments.insert(it.next());
            }
            Iterator<DocumentKey> it2 = targetChange.getModifiedDocuments().iterator();
            while (it2.hasNext()) {
                DocumentKey next = it2.next();
                Assert.hardAssert(this.syncedDocuments.contains(next), "Modified document %s not found in view.", next);
            }
            Iterator<DocumentKey> it3 = targetChange.getRemovedDocuments().iterator();
            while (it3.hasNext()) {
                this.syncedDocuments = this.syncedDocuments.remove(it3.next());
            }
            this.current = targetChange.isCurrent();
        }
    }

    private static int changeTypeOrder(DocumentViewChange documentViewChange) {
        int i10 = a.f7845a[documentViewChange.getType().ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (!(i10 == 2 || i10 == 3)) {
                if (i10 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + documentViewChange.getType());
            }
        }
        return i11;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ int lambda$applyChanges$0(DocumentViewChange documentViewChange, DocumentViewChange documentViewChange2) {
        int compareIntegers = Util.compareIntegers(changeTypeOrder(documentViewChange), changeTypeOrder(documentViewChange2));
        documentViewChange.getType().compareTo(documentViewChange2.getType());
        return compareIntegers != 0 ? compareIntegers : this.query.comparator().compare(documentViewChange.getDocument(), documentViewChange2.getDocument());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r3 = r2.documentSet.getDocument(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean shouldBeLimboDoc(com.google.firebase.firestore.model.DocumentKey r3) {
        /*
            r2 = this;
            com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.DocumentKey> r0 = r2.syncedDocuments
            boolean r0 = r0.contains(r3)
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            com.google.firebase.firestore.model.DocumentSet r0 = r2.documentSet
            com.google.firebase.firestore.model.Document r3 = r0.getDocument(r3)
            if (r3 != 0) goto L_0x0013
            return r1
        L_0x0013:
            boolean r3 = r3.hasLocalMutations()
            if (r3 == 0) goto L_0x001a
            return r1
        L_0x001a:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.View.shouldBeLimboDoc(com.google.firebase.firestore.model.DocumentKey):boolean");
    }

    private boolean shouldWaitForSyncedDocument(Document document, Document document2) {
        return document.hasLocalMutations() && document2.hasCommittedMutations() && !document2.hasLocalMutations();
    }

    private List<LimboDocumentChange> updateLimboDocuments() {
        if (!this.current) {
            return Collections.emptyList();
        }
        ImmutableSortedSet<DocumentKey> immutableSortedSet = this.limboDocuments;
        this.limboDocuments = DocumentKey.emptyKeySet();
        Iterator<Document> it = this.documentSet.iterator();
        while (it.hasNext()) {
            Document next = it.next();
            if (shouldBeLimboDoc(next.getKey())) {
                this.limboDocuments = this.limboDocuments.insert(next.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(immutableSortedSet.size() + this.limboDocuments.size());
        Iterator<DocumentKey> it2 = immutableSortedSet.iterator();
        while (it2.hasNext()) {
            DocumentKey next2 = it2.next();
            if (!this.limboDocuments.contains(next2)) {
                arrayList.add(new LimboDocumentChange(LimboDocumentChange.Type.REMOVED, next2));
            }
        }
        Iterator<DocumentKey> it3 = this.limboDocuments.iterator();
        while (it3.hasNext()) {
            DocumentKey next3 = it3.next();
            if (!immutableSortedSet.contains(next3)) {
                arrayList.add(new LimboDocumentChange(LimboDocumentChange.Type.ADDED, next3));
            }
        }
        return arrayList;
    }

    public ViewChange applyChanges(DocumentChanges documentChanges) {
        return applyChanges(documentChanges, (TargetChange) null);
    }

    public ViewChange applyOnlineStateChange(OnlineState onlineState) {
        if (!this.current || onlineState != OnlineState.OFFLINE) {
            return new ViewChange((ViewSnapshot) null, Collections.emptyList());
        }
        this.current = false;
        return applyChanges(new DocumentChanges(this.documentSet, new DocumentViewChangeSet(), this.mutatedKeys, false, (a) null));
    }

    public DocumentChanges computeDocChanges(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap) {
        return computeDocChanges(immutableSortedMap, (DocumentChanges) null);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedSet<DocumentKey> getLimboDocuments() {
        return this.limboDocuments;
    }

    public ViewSnapshot.SyncState getSyncState() {
        return this.syncState;
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedSet<DocumentKey> getSyncedDocuments() {
        return this.syncedDocuments;
    }

    public ViewChange applyChanges(DocumentChanges documentChanges, TargetChange targetChange) {
        ViewSnapshot viewSnapshot;
        DocumentChanges documentChanges2 = documentChanges;
        Assert.hardAssert(!documentChanges.needsRefill, "Cannot apply changes that need a refill", new Object[0]);
        DocumentSet documentSet2 = this.documentSet;
        this.documentSet = documentChanges2.documentSet;
        this.mutatedKeys = documentChanges2.mutatedKeys;
        List<DocumentViewChange> changes = documentChanges2.changeSet.getChanges();
        Collections.sort(changes, new c0(this));
        applyTargetChange(targetChange);
        List<LimboDocumentChange> updateLimboDocuments = updateLimboDocuments();
        ViewSnapshot.SyncState syncState2 = this.limboDocuments.size() == 0 && this.current ? ViewSnapshot.SyncState.SYNCED : ViewSnapshot.SyncState.LOCAL;
        boolean z10 = syncState2 != this.syncState;
        this.syncState = syncState2;
        if (changes.size() != 0 || z10) {
            viewSnapshot = new ViewSnapshot(this.query, documentChanges2.documentSet, documentSet2, changes, syncState2 == ViewSnapshot.SyncState.LOCAL, documentChanges2.mutatedKeys, z10, false);
        } else {
            viewSnapshot = null;
        }
        return new ViewChange(viewSnapshot, updateLimboDocuments);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        if (r0.query.comparator().compare(r6, r4) > 0) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        if (r0.query.comparator().compare(r6, r7) < 0) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011e, code lost:
        if (r7 == null) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.firestore.core.View.DocumentChanges computeDocChanges(com.google.firebase.database.collection.ImmutableSortedMap<com.google.firebase.firestore.model.DocumentKey, com.google.firebase.firestore.model.Document> r19, com.google.firebase.firestore.core.View.DocumentChanges r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            if (r1 == 0) goto L_0x0009
            com.google.firebase.firestore.core.DocumentViewChangeSet r2 = r1.changeSet
            goto L_0x000e
        L_0x0009:
            com.google.firebase.firestore.core.DocumentViewChangeSet r2 = new com.google.firebase.firestore.core.DocumentViewChangeSet
            r2.<init>()
        L_0x000e:
            r5 = r2
            if (r1 == 0) goto L_0x0014
            com.google.firebase.firestore.model.DocumentSet r2 = r1.documentSet
            goto L_0x0016
        L_0x0014:
            com.google.firebase.firestore.model.DocumentSet r2 = r0.documentSet
        L_0x0016:
            if (r1 == 0) goto L_0x001b
            com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.DocumentKey> r3 = r1.mutatedKeys
            goto L_0x001d
        L_0x001b:
            com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.DocumentKey> r3 = r0.mutatedKeys
        L_0x001d:
            com.google.firebase.firestore.core.Query r4 = r0.query
            boolean r4 = r4.hasLimitToFirst()
            if (r4 == 0) goto L_0x0039
            int r4 = r2.size()
            long r7 = (long) r4
            com.google.firebase.firestore.core.Query r4 = r0.query
            long r9 = r4.getLimitToFirst()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0039
            com.google.firebase.firestore.model.Document r4 = r2.getLastDocument()
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            com.google.firebase.firestore.core.Query r7 = r0.query
            boolean r7 = r7.hasLimitToLast()
            if (r7 == 0) goto L_0x0056
            int r7 = r2.size()
            long r7 = (long) r7
            com.google.firebase.firestore.core.Query r9 = r0.query
            long r9 = r9.getLimitToLast()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0056
            com.google.firebase.firestore.model.Document r7 = r2.getFirstDocument()
            goto L_0x0057
        L_0x0056:
            r7 = 0
        L_0x0057:
            java.util.Iterator r8 = r19.iterator()
            r11 = r2
            r10 = 0
        L_0x005d:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0150
            java.lang.Object r12 = r8.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r14 = r12.getKey()
            com.google.firebase.firestore.model.DocumentKey r14 = (com.google.firebase.firestore.model.DocumentKey) r14
            com.google.firebase.firestore.model.Document r15 = r2.getDocument(r14)
            com.google.firebase.firestore.core.Query r6 = r0.query
            java.lang.Object r16 = r12.getValue()
            r13 = r16
            com.google.firebase.firestore.model.Document r13 = (com.google.firebase.firestore.model.Document) r13
            boolean r6 = r6.matches(r13)
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r12.getValue()
            com.google.firebase.firestore.model.Document r6 = (com.google.firebase.firestore.model.Document) r6
            goto L_0x008b
        L_0x008a:
            r6 = 0
        L_0x008b:
            if (r15 == 0) goto L_0x009b
            com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.DocumentKey> r12 = r0.mutatedKeys
            com.google.firebase.firestore.model.DocumentKey r13 = r15.getKey()
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L_0x009b
            r12 = 1
            goto L_0x009c
        L_0x009b:
            r12 = 0
        L_0x009c:
            if (r6 == 0) goto L_0x00b8
            boolean r13 = r6.hasLocalMutations()
            if (r13 != 0) goto L_0x00b6
            com.google.firebase.database.collection.ImmutableSortedSet<com.google.firebase.firestore.model.DocumentKey> r13 = r0.mutatedKeys
            com.google.firebase.firestore.model.DocumentKey r9 = r6.getKey()
            boolean r9 = r13.contains(r9)
            if (r9 == 0) goto L_0x00b8
            boolean r9 = r6.hasCommittedMutations()
            if (r9 == 0) goto L_0x00b8
        L_0x00b6:
            r9 = 1
            goto L_0x00b9
        L_0x00b8:
            r9 = 0
        L_0x00b9:
            if (r15 == 0) goto L_0x00fe
            if (r6 == 0) goto L_0x00fe
            com.google.firebase.firestore.model.ObjectValue r13 = r15.getData()
            r17 = r2
            com.google.firebase.firestore.model.ObjectValue r2 = r6.getData()
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x00f9
            boolean r2 = r0.shouldWaitForSyncedDocument(r15, r6)
            if (r2 != 0) goto L_0x0122
            com.google.firebase.firestore.core.DocumentViewChange$Type r2 = com.google.firebase.firestore.core.DocumentViewChange.Type.MODIFIED
            com.google.firebase.firestore.core.DocumentViewChange r2 = com.google.firebase.firestore.core.DocumentViewChange.create(r2, r6)
            r5.addChange(r2)
            if (r4 == 0) goto L_0x00ea
            com.google.firebase.firestore.core.Query r2 = r0.query
            java.util.Comparator r2 = r2.comparator()
            int r2 = r2.compare(r6, r4)
            if (r2 > 0) goto L_0x0120
        L_0x00ea:
            if (r7 == 0) goto L_0x010d
            com.google.firebase.firestore.core.Query r2 = r0.query
            java.util.Comparator r2 = r2.comparator()
            int r2 = r2.compare(r6, r7)
            if (r2 >= 0) goto L_0x010d
            goto L_0x0120
        L_0x00f9:
            if (r12 == r9) goto L_0x0122
            com.google.firebase.firestore.core.DocumentViewChange$Type r2 = com.google.firebase.firestore.core.DocumentViewChange.Type.METADATA
            goto L_0x0106
        L_0x00fe:
            r17 = r2
            if (r15 != 0) goto L_0x010f
            if (r6 == 0) goto L_0x010f
            com.google.firebase.firestore.core.DocumentViewChange$Type r2 = com.google.firebase.firestore.core.DocumentViewChange.Type.ADDED
        L_0x0106:
            com.google.firebase.firestore.core.DocumentViewChange r2 = com.google.firebase.firestore.core.DocumentViewChange.create(r2, r6)
            r5.addChange(r2)
        L_0x010d:
            r13 = 1
            goto L_0x0123
        L_0x010f:
            if (r15 == 0) goto L_0x0122
            if (r6 != 0) goto L_0x0122
            com.google.firebase.firestore.core.DocumentViewChange$Type r2 = com.google.firebase.firestore.core.DocumentViewChange.Type.REMOVED
            com.google.firebase.firestore.core.DocumentViewChange r2 = com.google.firebase.firestore.core.DocumentViewChange.create(r2, r15)
            r5.addChange(r2)
            if (r4 != 0) goto L_0x0120
            if (r7 == 0) goto L_0x010d
        L_0x0120:
            r10 = 1
            goto L_0x010d
        L_0x0122:
            r13 = 0
        L_0x0123:
            if (r13 == 0) goto L_0x014c
            if (r6 == 0) goto L_0x0143
            com.google.firebase.firestore.model.DocumentSet r11 = r11.add(r6)
            boolean r2 = r6.hasLocalMutations()
            if (r2 == 0) goto L_0x013a
            com.google.firebase.firestore.model.DocumentKey r2 = r6.getKey()
            com.google.firebase.database.collection.ImmutableSortedSet r2 = r3.insert(r2)
            goto L_0x014b
        L_0x013a:
            com.google.firebase.firestore.model.DocumentKey r2 = r6.getKey()
            com.google.firebase.database.collection.ImmutableSortedSet r2 = r3.remove(r2)
            goto L_0x014b
        L_0x0143:
            com.google.firebase.firestore.model.DocumentSet r11 = r11.remove(r14)
            com.google.firebase.database.collection.ImmutableSortedSet r2 = r3.remove(r14)
        L_0x014b:
            r3 = r2
        L_0x014c:
            r2 = r17
            goto L_0x005d
        L_0x0150:
            com.google.firebase.firestore.core.Query r2 = r0.query
            boolean r2 = r2.hasLimitToFirst()
            if (r2 != 0) goto L_0x0164
            com.google.firebase.firestore.core.Query r2 = r0.query
            boolean r2 = r2.hasLimitToLast()
            if (r2 == 0) goto L_0x0161
            goto L_0x0164
        L_0x0161:
            r6 = r3
            r4 = r11
            goto L_0x01b2
        L_0x0164:
            com.google.firebase.firestore.core.Query r2 = r0.query
            boolean r2 = r2.hasLimitToFirst()
            if (r2 == 0) goto L_0x0173
            com.google.firebase.firestore.core.Query r2 = r0.query
            long r6 = r2.getLimitToFirst()
            goto L_0x0179
        L_0x0173:
            com.google.firebase.firestore.core.Query r2 = r0.query
            long r6 = r2.getLimitToLast()
        L_0x0179:
            int r2 = r11.size()
            long r8 = (long) r2
        L_0x017e:
            long r8 = r8 - r6
            r6 = 0
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0161
            com.google.firebase.firestore.core.Query r2 = r0.query
            boolean r2 = r2.hasLimitToFirst()
            if (r2 == 0) goto L_0x0192
            com.google.firebase.firestore.model.Document r2 = r11.getLastDocument()
            goto L_0x0196
        L_0x0192:
            com.google.firebase.firestore.model.Document r2 = r11.getFirstDocument()
        L_0x0196:
            com.google.firebase.firestore.model.DocumentKey r4 = r2.getKey()
            com.google.firebase.firestore.model.DocumentSet r11 = r11.remove(r4)
            com.google.firebase.firestore.model.DocumentKey r4 = r2.getKey()
            com.google.firebase.database.collection.ImmutableSortedSet r3 = r3.remove(r4)
            com.google.firebase.firestore.core.DocumentViewChange$Type r4 = com.google.firebase.firestore.core.DocumentViewChange.Type.REMOVED
            com.google.firebase.firestore.core.DocumentViewChange r2 = com.google.firebase.firestore.core.DocumentViewChange.create(r4, r2)
            r5.addChange(r2)
            r6 = 1
            goto L_0x017e
        L_0x01b2:
            if (r10 == 0) goto L_0x01b9
            if (r1 != 0) goto L_0x01b7
            goto L_0x01b9
        L_0x01b7:
            r13 = 0
            goto L_0x01ba
        L_0x01b9:
            r13 = 1
        L_0x01ba:
            java.lang.String r1 = "View was refilled using docs that themselves needed refilling."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.google.firebase.firestore.util.Assert.hardAssert(r13, r1, r2)
            com.google.firebase.firestore.core.View$DocumentChanges r1 = new com.google.firebase.firestore.core.View$DocumentChanges
            r8 = 0
            r3 = r1
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.View.computeDocChanges(com.google.firebase.database.collection.ImmutableSortedMap, com.google.firebase.firestore.core.View$DocumentChanges):com.google.firebase.firestore.core.View$DocumentChanges");
    }
}
