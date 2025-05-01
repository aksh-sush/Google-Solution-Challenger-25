package com.onesignal.session.internal.outcomes.impl;

import android.content.ContentValues;
import cb.p;
import db.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.l;
import mb.h0;
import mb.w0;
import o7.b;
import org.json.JSONArray;
import org.json.JSONException;
import sa.o;
import sa.t;
import t9.d;

public final class j implements d {
    /* access modifiers changed from: private */
    public final o7.c _databaseProvider;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t9.d.values().length];
            iArr[t9.d.DIRECT.ordinal()] = 1;
            iArr[t9.d.INDIRECT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class b extends l implements p {
        final /* synthetic */ String $notificationIdColumnName;
        final /* synthetic */ String $notificationTableName;
        int label;
        final /* synthetic */ j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, String str2, j jVar, va.d dVar) {
            super(2, dVar);
            this.$notificationTableName = str;
            this.$notificationIdColumnName = str2;
            this.this$0 = jVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new b(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("NOT EXISTS(SELECT NULL FROM ");
                sb2.append(this.$notificationTableName);
                sb2.append(" n WHERE n.");
                sb2.append(this.$notificationIdColumnName);
                sb2.append(" = channel_influence_id AND channel_type = \"");
                String cVar = t9.c.NOTIFICATION.toString();
                Locale locale = Locale.ROOT;
                db.l.d(locale, "ROOT");
                String lowerCase = cVar.toLowerCase(locale);
                db.l.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                sb2.append(lowerCase);
                sb2.append("\")");
                this.this$0._databaseProvider.getOs().delete("cached_unique_outcome", sb2.toString(), (String[]) null);
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class c extends l implements p {
        final /* synthetic */ f $event;
        int label;
        final /* synthetic */ j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar, f fVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = jVar;
            this.$event = fVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new c(this.this$0, this.$event, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                this.this$0._databaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar, va.d dVar) {
            super(dVar);
            this.this$0 = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getAllEventsToSend(this);
        }
    }

    static final class e extends l implements p {
        final /* synthetic */ List<f> $events;
        int label;
        final /* synthetic */ j this$0;

        static final class a extends m implements cb.l {
            final /* synthetic */ List<f> $events;
            final /* synthetic */ j this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar, List<f> list) {
                super(1);
                this.this$0 = jVar;
                this.$events = list;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                o7.a aVar2 = aVar;
                db.l.e(aVar2, "cursor");
                if (aVar.moveToFirst()) {
                    do {
                        String string = aVar2.getString("notification_influence_type");
                        d.a aVar3 = t9.d.Companion;
                        t9.d fromString = aVar3.fromString(string);
                        t9.d fromString2 = aVar3.fromString(aVar2.getString("iam_influence_type"));
                        String optString = aVar2.getOptString(com.onesignal.session.internal.influence.impl.e.NOTIFICATIONS_IDS);
                        if (optString == null) {
                            optString = "[]";
                        }
                        String optString2 = aVar2.getOptString("iam_ids");
                        String str = optString2 == null ? "[]" : optString2;
                        String string2 = aVar2.getString("name");
                        float f10 = aVar2.getFloat("weight");
                        long j10 = aVar2.getLong("timestamp");
                        long j11 = aVar2.getLong("session_time");
                        try {
                            l lVar = new l((JSONArray) null, (JSONArray) null, 3, (db.g) null);
                            l lVar2 = new l((JSONArray) null, (JSONArray) null, 3, (db.g) null);
                            k access$getNotificationInfluenceSource = this.this$0.getNotificationInfluenceSource(fromString, lVar, lVar2, optString);
                            k unused = this.this$0.getIAMInfluenceSource(fromString2, lVar, lVar2, str, access$getNotificationInfluenceSource);
                            if (access$getNotificationInfluenceSource == null) {
                                access$getNotificationInfluenceSource = new k((l) null, (l) null);
                            }
                            this.$events.add(new f(string2, access$getNotificationInfluenceSource, f10, j11, j10));
                        } catch (JSONException e10) {
                            com.onesignal.debug.internal.logging.a.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e10);
                        }
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(j jVar, List<f> list, va.d dVar) {
            super(2, dVar);
            this.this$0 = jVar;
            this.$events = list;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new e(this.this$0, this.$events, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                b.a.query$default(this.this$0._databaseProvider.getOs(), "outcome", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null, new a(this.this$0, this.$events), 254, (Object) null);
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((e) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(j jVar, va.d dVar) {
            super(dVar);
            this.this$0 = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getNotCachedUniqueInfluencesForOutcome((String) null, (List<t9.b>) null, this);
        }
    }

    static final class g extends l implements p {
        final /* synthetic */ List<t9.b> $influences;
        final /* synthetic */ String $name;
        final /* synthetic */ List<t9.b> $uniqueInfluences;
        int label;
        final /* synthetic */ j this$0;

        static final class a extends m implements cb.l {
            final /* synthetic */ JSONArray $availableInfluenceIds;
            final /* synthetic */ String $channelInfluenceId;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(JSONArray jSONArray, String str) {
                super(1);
                this.$availableInfluenceIds = jSONArray;
                this.$channelInfluenceId = str;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                if (aVar.getCount() == 0) {
                    this.$availableInfluenceIds.put(this.$channelInfluenceId);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(List<t9.b> list, String str, j jVar, List<t9.b> list2, va.d dVar) {
            super(2, dVar);
            this.$influences = list;
            this.$name = str;
            this.this$0 = jVar;
            this.$uniqueInfluences = list2;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new g(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                try {
                    for (t9.b next : this.$influences) {
                        JSONArray jSONArray = new JSONArray();
                        JSONArray ids = next.getIds();
                        if (ids != null) {
                            int length = ids.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                String string = ids.getString(i10);
                                String[] strArr = {string, next.getInfluenceChannel().toString(), this.$name};
                                b.a.query$default(this.this$0._databaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", strArr, (String) null, (String) null, (String) null, "1", new a(jSONArray, string), 112, (Object) null);
                            }
                            if (jSONArray.length() > 0) {
                                t9.b copy = next.copy();
                                copy.setIds(jSONArray);
                                this.$uniqueInfluences.add(copy);
                            }
                        }
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((g) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class h extends l implements p {
        final /* synthetic */ f $eventParams;
        int label;
        final /* synthetic */ j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar, j jVar, va.d dVar) {
            super(2, dVar);
            this.$eventParams = fVar;
            this.this$0 = jVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new h(this.$eventParams, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            l indirectBody;
            l directBody;
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                db.t tVar = new db.t();
                tVar.f9426e = new JSONArray();
                db.t tVar2 = new db.t();
                tVar2.f9426e = new JSONArray();
                db.t tVar3 = new db.t();
                t9.d dVar = t9.d.UNATTRIBUTED;
                tVar3.f9426e = dVar;
                db.t tVar4 = new db.t();
                tVar4.f9426e = dVar;
                k outcomeSource = this.$eventParams.getOutcomeSource();
                if (!(outcomeSource == null || (directBody = outcomeSource.getDirectBody()) == null)) {
                    JSONArray notificationIds = directBody.getNotificationIds();
                    if (notificationIds != null && notificationIds.length() > 0) {
                        tVar3.f9426e = t9.d.DIRECT;
                        tVar.f9426e = notificationIds;
                    }
                    JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
                    if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                        tVar4.f9426e = t9.d.DIRECT;
                        tVar2.f9426e = inAppMessagesIds;
                    }
                }
                k outcomeSource2 = this.$eventParams.getOutcomeSource();
                if (!(outcomeSource2 == null || (indirectBody = outcomeSource2.getIndirectBody()) == null)) {
                    JSONArray notificationIds2 = indirectBody.getNotificationIds();
                    if (notificationIds2 != null && notificationIds2.length() > 0) {
                        tVar3.f9426e = t9.d.INDIRECT;
                        tVar.f9426e = notificationIds2;
                    }
                    JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
                    if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                        tVar4.f9426e = t9.d.INDIRECT;
                        tVar2.f9426e = inAppMessagesIds2;
                    }
                }
                ContentValues contentValues = new ContentValues();
                f fVar = this.$eventParams;
                contentValues.put(com.onesignal.session.internal.influence.impl.e.NOTIFICATIONS_IDS, ((JSONArray) tVar.f9426e).toString());
                contentValues.put("iam_ids", ((JSONArray) tVar2.f9426e).toString());
                String obj2 = ((t9.d) tVar3.f9426e).toString();
                Locale locale = Locale.ROOT;
                db.l.d(locale, "ROOT");
                String lowerCase = obj2.toLowerCase(locale);
                db.l.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                contentValues.put("notification_influence_type", lowerCase);
                String obj3 = ((t9.d) tVar4.f9426e).toString();
                db.l.d(locale, "ROOT");
                String lowerCase2 = obj3.toLowerCase(locale);
                db.l.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                contentValues.put("iam_influence_type", lowerCase2);
                contentValues.put("name", fVar.getOutcomeId());
                contentValues.put("weight", kotlin.coroutines.jvm.internal.b.b(fVar.getWeight()));
                contentValues.put("timestamp", kotlin.coroutines.jvm.internal.b.d(fVar.getTimestamp()));
                contentValues.put("session_time", kotlin.coroutines.jvm.internal.b.d(fVar.getSessionTime()));
                this.this$0._databaseProvider.getOs().insert("outcome", (String) null, contentValues);
                return contentValues;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((h) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class i extends l implements p {
        final /* synthetic */ f $eventParams;
        int label;
        final /* synthetic */ j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar, j jVar, va.d dVar) {
            super(2, dVar);
            this.$eventParams = fVar;
            this.this$0 = jVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new i(this.$eventParams, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                String outcomeId = this.$eventParams.getOutcomeId();
                ArrayList<a> arrayList = new ArrayList<>();
                k outcomeSource = this.$eventParams.getOutcomeSource();
                l directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
                k outcomeSource2 = this.$eventParams.getOutcomeSource();
                l indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
                this.this$0.addIdsToListFromSource(arrayList, directBody);
                this.this$0.addIdsToListFromSource(arrayList, indirectBody);
                for (a aVar : arrayList) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("channel_influence_id", aVar.getInfluenceId());
                    contentValues.put("channel_type", aVar.getChannel().toString());
                    contentValues.put("name", outcomeId);
                    this.this$0._databaseProvider.getOs().insert("cached_unique_outcome", (String) null, contentValues);
                }
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((i) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public j(o7.c cVar) {
        db.l.e(cVar, "_databaseProvider");
        this._databaseProvider = cVar;
    }

    private final void addIdToListFromChannel(List<a> list, JSONArray jSONArray, t9.c cVar) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    String string = jSONArray.getString(i10);
                    db.l.d(string, "influenceId");
                    list.add(new a(string, cVar));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void addIdsToListFromSource(List<a> list, l lVar) {
        if (lVar != null) {
            JSONArray inAppMessagesIds = lVar.getInAppMessagesIds();
            JSONArray notificationIds = lVar.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, t9.c.IAM);
            addIdToListFromChannel(list, notificationIds, t9.c.NOTIFICATION);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r7 = r7.setIndirectBody(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onesignal.session.internal.outcomes.impl.k getIAMInfluenceSource(t9.d r3, com.onesignal.session.internal.outcomes.impl.l r4, com.onesignal.session.internal.outcomes.impl.l r5, java.lang.String r6, com.onesignal.session.internal.outcomes.impl.k r7) {
        /*
            r2 = this;
            int[] r0 = com.onesignal.session.internal.outcomes.impl.j.a.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L_0x0026
            r4 = 2
            if (r3 == r4) goto L_0x0010
            goto L_0x003b
        L_0x0010:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>(r6)
            r5.setInAppMessagesIds(r3)
            if (r7 == 0) goto L_0x0020
            com.onesignal.session.internal.outcomes.impl.k r7 = r7.setIndirectBody((com.onesignal.session.internal.outcomes.impl.l) r5)
            if (r7 != 0) goto L_0x003b
        L_0x0020:
            com.onesignal.session.internal.outcomes.impl.k r7 = new com.onesignal.session.internal.outcomes.impl.k
            r7.<init>(r1, r5)
            goto L_0x003b
        L_0x0026:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>(r6)
            r4.setInAppMessagesIds(r3)
            if (r7 == 0) goto L_0x0036
            com.onesignal.session.internal.outcomes.impl.k r7 = r7.setDirectBody((com.onesignal.session.internal.outcomes.impl.l) r4)
            if (r7 != 0) goto L_0x003b
        L_0x0036:
            com.onesignal.session.internal.outcomes.impl.k r7 = new com.onesignal.session.internal.outcomes.impl.k
            r7.<init>(r4, r1)
        L_0x003b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.j.getIAMInfluenceSource(t9.d, com.onesignal.session.internal.outcomes.impl.l, com.onesignal.session.internal.outcomes.impl.l, java.lang.String, com.onesignal.session.internal.outcomes.impl.k):com.onesignal.session.internal.outcomes.impl.k");
    }

    /* access modifiers changed from: private */
    public final k getNotificationInfluenceSource(t9.d dVar, l lVar, l lVar2, String str) {
        k kVar;
        int i10 = a.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i10 == 1) {
            lVar.setNotificationIds(new JSONArray(str));
            kVar = new k(lVar, (l) null);
        } else if (i10 != 2) {
            return null;
        } else {
            lVar2.setNotificationIds(new JSONArray(str));
            kVar = new k((l) null, lVar2);
        }
        return kVar;
    }

    public Object cleanCachedUniqueOutcomeEventNotifications(va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new b("notification", com.onesignal.session.internal.influence.impl.e.NOTIFICATION_ID_TAG, this, (va.d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }

    public Object deleteOldOutcomeEvent(f fVar, va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new c(this, fVar, (va.d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAllEventsToSend(va.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.onesignal.session.internal.outcomes.impl.j.d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.session.internal.outcomes.impl.j$d r0 = (com.onesignal.session.internal.outcomes.impl.j.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.session.internal.outcomes.impl.j$d r0 = new com.onesignal.session.internal.outcomes.impl.j$d
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            sa.o.b(r7)
            goto L_0x0053
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            sa.o.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            mb.d0 r2 = mb.w0.b()
            com.onesignal.session.internal.outcomes.impl.j$e r4 = new com.onesignal.session.internal.outcomes.impl.j$e
            r5 = 0
            r4.<init>(r6, r7, r5)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = mb.h.g(r2, r4, r0)
            if (r0 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r7
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.j.getAllEventsToSend(va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getNotCachedUniqueInfluencesForOutcome(java.lang.String r12, java.util.List<t9.b> r13, va.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.onesignal.session.internal.outcomes.impl.j.f
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.onesignal.session.internal.outcomes.impl.j$f r0 = (com.onesignal.session.internal.outcomes.impl.j.f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.session.internal.outcomes.impl.j$f r0 = new com.onesignal.session.internal.outcomes.impl.j$f
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r12 = r0.L$0
            java.util.List r12 = (java.util.List) r12
            sa.o.b(r14)
            goto L_0x0058
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            sa.o.b(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            mb.d0 r2 = mb.w0.b()
            com.onesignal.session.internal.outcomes.impl.j$g r10 = new com.onesignal.session.internal.outcomes.impl.j$g
            r9 = 0
            r4 = r10
            r5 = r13
            r6 = r12
            r7 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r14
            r0.label = r3
            java.lang.Object r12 = mb.h.g(r2, r10, r0)
            if (r12 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r12 = r14
        L_0x0058:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.j.getNotCachedUniqueInfluencesForOutcome(java.lang.String, java.util.List, va.d):java.lang.Object");
    }

    public Object saveOutcomeEvent(f fVar, va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new h(fVar, this, (va.d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }

    public Object saveUniqueOutcomeEventParams(f fVar, va.d dVar) {
        com.onesignal.debug.internal.logging.a.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + fVar + ')', (Throwable) null, 2, (Object) null);
        Object g10 = mb.h.g(w0.b(), new i(fVar, this, (va.d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }
}
