package com.onesignal.inAppMessages.internal.repositories.impl;

import android.content.ContentValues;
import cb.p;
import com.google.firebase.messaging.Constants;
import com.onesignal.common.j;
import com.onesignal.inAppMessages.internal.h;
import db.g;
import db.m;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import mb.h0;
import mb.w0;
import o7.b;
import org.json.JSONArray;
import org.json.JSONException;
import sa.o;
import sa.t;

public final class a implements n8.a {
    public static final C0150a Companion = new C0150a((g) null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    /* access modifiers changed from: private */
    public final o7.c _databaseProvider;
    /* access modifiers changed from: private */
    public final k8.a _prefs;
    /* access modifiers changed from: private */
    public final a8.a _time;

    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$a  reason: collision with other inner class name */
    public static final class C0150a {
        private C0150a() {
        }

        public /* synthetic */ C0150a(g gVar) {
            this();
        }
    }

    static final class b extends l implements p {
        int label;
        final /* synthetic */ a this$0;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$b$a  reason: collision with other inner class name */
        static final class C0151a extends m implements cb.l {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0151a(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                if (aVar.getCount() == 0) {
                    com.onesignal.debug.internal.logging.a.debug$default("Attempted to clean 6 month old IAM data, but none exists!", (Throwable) null, 2, (Object) null);
                } else if (aVar.moveToFirst()) {
                    do {
                        String string = aVar.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
                        String string2 = aVar.getString("click_ids");
                        this.$oldMessageIds.add(string);
                        this.$oldClickedClickIds.addAll(j.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new b(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            LinkedHashSet linkedHashSet;
            LinkedHashSet linkedHashSet2;
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                String[] strArr = {Constants.MessagePayloadKeys.MSGID_SERVER, "click_ids"};
                String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - a.IAM_CACHE_DATA_LIFETIME)};
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                try {
                    linkedHashSet2 = linkedHashSet4;
                    linkedHashSet = linkedHashSet3;
                    try {
                        b.a.query$default(this.this$0._databaseProvider.getOs(), "in_app_message", strArr, "last_display < ?", strArr2, (String) null, (String) null, (String) null, (String) null, new C0151a(linkedHashSet3, linkedHashSet4), 240, (Object) null);
                    } catch (JSONException e10) {
                        e = e10;
                    }
                } catch (JSONException e11) {
                    e = e11;
                    linkedHashSet2 = linkedHashSet4;
                    linkedHashSet = linkedHashSet3;
                    e.printStackTrace();
                    this.this$0._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
                    this.this$0._prefs.cleanInAppMessageIds(linkedHashSet);
                    this.this$0._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
                    return t.f15300a;
                }
                this.this$0._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
                this.this$0._prefs.cleanInAppMessageIds(linkedHashSet);
                this.this$0._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.listInAppMessages(this);
        }
    }

    static final class d extends l implements p {
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
        int label;
        final /* synthetic */ a this$0;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$d$a  reason: collision with other inner class name */
        static final class C0152a extends m implements cb.l {
            final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
            final /* synthetic */ a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0152a(a aVar, List<com.onesignal.inAppMessages.internal.a> list) {
                super(1);
                this.this$0 = aVar;
                this.$inAppMessages = list;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o7.a) obj);
                return t.f15300a;
            }

            public final void invoke(o7.a aVar) {
                db.l.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    do {
                        String string = aVar.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
                        String string2 = aVar.getString("click_ids");
                        int i10 = aVar.getInt("display_quantity");
                        long j10 = aVar.getLong("last_display");
                        this.$inAppMessages.add(new com.onesignal.inAppMessages.internal.a(string, j.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)), aVar.getInt("displayed_in_session") == 1, new h(i10, j10, this.this$0._time), this.this$0._time));
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, List<com.onesignal.inAppMessages.internal.a> list, va.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$inAppMessages = list;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new d(this.this$0, this.$inAppMessages, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                try {
                    b.a.query$default(this.this$0._databaseProvider.getOs(), "in_app_message", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null, new C0152a(this.this$0, this.$inAppMessages), 254, (Object) null);
                } catch (JSONException e10) {
                    com.onesignal.debug.internal.logging.a.error("Generating JSONArray from iam click ids:JSON Failed.", e10);
                }
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((d) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class e extends l implements p {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, ContentValues contentValues, com.onesignal.inAppMessages.internal.a aVar2, va.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$values = contentValues;
            this.$inAppMessage = aVar2;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new e(this.this$0, this.$values, this.$inAppMessage, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                if (this.this$0._databaseProvider.getOs().update("in_app_message", this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                    this.this$0._databaseProvider.getOs().insert("in_app_message", (String) null, this.$values);
                }
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((e) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public a(o7.c cVar, a8.a aVar, k8.a aVar2) {
        db.l.e(cVar, "_databaseProvider");
        db.l.e(aVar, "_time");
        db.l.e(aVar2, "_prefs");
        this._databaseProvider = cVar;
        this._time = aVar;
        this._prefs = aVar2;
    }

    public Object cleanCachedInAppMessages(va.d dVar) {
        Object g10 = mb.h.g(w0.b(), new b(this, (va.d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object listInAppMessages(va.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.onesignal.inAppMessages.internal.repositories.impl.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.inAppMessages.internal.repositories.impl.a$c r0 = (com.onesignal.inAppMessages.internal.repositories.impl.a.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.repositories.impl.a$c r0 = new com.onesignal.inAppMessages.internal.repositories.impl.a$c
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
            com.onesignal.inAppMessages.internal.repositories.impl.a$d r4 = new com.onesignal.inAppMessages.internal.repositories.impl.a$d
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
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.repositories.impl.a.listInAppMessages(va.d):java.lang.Object");
    }

    public Object saveInAppMessage(com.onesignal.inAppMessages.internal.a aVar, va.d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.MessagePayloadKeys.MSGID_SERVER, aVar.getMessageId());
        contentValues.put("display_quantity", kotlin.coroutines.jvm.internal.b.c(aVar.getRedisplayStats().getDisplayQuantity()));
        contentValues.put("last_display", kotlin.coroutines.jvm.internal.b.d(aVar.getRedisplayStats().getLastDisplayTime()));
        contentValues.put("click_ids", aVar.getClickedClickIds().toString());
        contentValues.put("displayed_in_session", kotlin.coroutines.jvm.internal.b.a(aVar.isDisplayedInSession()));
        Object g10 = mb.h.g(w0.b(), new e(this, contentValues, aVar, (va.d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }
}
