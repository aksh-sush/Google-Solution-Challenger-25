package com.google.firebase.firestore.local;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.protobuf.j;
import java.util.List;

interface g0 {
    void a();

    MutationBatch b(int i10);

    int c();

    List d(Iterable iterable);

    MutationBatch e(Timestamp timestamp, List list, List list2);

    MutationBatch f(int i10);

    void g(MutationBatch mutationBatch);

    j getLastStreamToken();

    List h(Query query);

    List i(DocumentKey documentKey);

    void j(MutationBatch mutationBatch, j jVar);

    void k(j jVar);

    List l();

    void start();
}
