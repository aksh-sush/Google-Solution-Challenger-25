package com.onesignal.common.modeling;

import cb.l;
import com.onesignal.common.modeling.b;
import db.m;
import org.json.JSONObject;
import sa.t;

public class k implements d, c {
    private final com.onesignal.common.events.b changeSubscription = new com.onesignal.common.events.b();
    private final Object replaceLock = new Object();
    private final String singletonId = "-singleton-";
    private final i store;

    static final class a extends m implements l {
        final /* synthetic */ h $args;
        final /* synthetic */ String $tag;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, String str) {
            super(1);
            this.$args = hVar;
            this.$tag = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e) obj);
            return t.f15300a;
        }

        public final void invoke(e eVar) {
            db.l.e(eVar, "it");
            eVar.onModelUpdated(this.$args, this.$tag);
        }
    }

    static final class b extends m implements l {
        final /* synthetic */ g $existingModel;
        final /* synthetic */ String $tag;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, String str) {
            super(1);
            this.$existingModel = gVar;
            this.$tag = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e) obj);
            return t.f15300a;
        }

        public final void invoke(e eVar) {
            db.l.e(eVar, "it");
            eVar.onModelReplaced(this.$existingModel, this.$tag);
        }
    }

    public k(i iVar) {
        db.l.e(iVar, "store");
        this.store = iVar;
        iVar.subscribe((c) this);
    }

    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    public g getModel() {
        synchronized (this) {
            g gVar = this.store.get(this.singletonId);
            if (gVar != null) {
                return gVar;
            }
            g create$default = b.a.create$default(this.store, (JSONObject) null, 1, (Object) null);
            if (create$default != null) {
                create$default.setId(this.singletonId);
                b.a.add$default(this.store, create$default, (String) null, 2, (Object) null);
                return create$default;
            }
            throw new Exception("Unable to initialize model from store " + this.store);
        }
    }

    public final i getStore() {
        return this.store;
    }

    public void onModelAdded(g gVar, String str) {
        db.l.e(gVar, "model");
        db.l.e(str, "tag");
    }

    public void onModelRemoved(g gVar, String str) {
        db.l.e(gVar, "model");
        db.l.e(str, "tag");
    }

    public void onModelUpdated(h hVar, String str) {
        db.l.e(hVar, "args");
        db.l.e(str, "tag");
        this.changeSubscription.fire(new a(hVar, str));
    }

    public void replace(g gVar, String str) {
        db.l.e(gVar, "model");
        db.l.e(str, "tag");
        synchronized (this.replaceLock) {
            g model = getModel();
            model.initializeFromModel(this.singletonId, gVar);
            this.store.persist();
            this.changeSubscription.fire(new b(model, str));
            t tVar = t.f15300a;
        }
    }

    public void subscribe(e eVar) {
        db.l.e(eVar, "handler");
        this.changeSubscription.subscribe(eVar);
    }

    public void unsubscribe(e eVar) {
        db.l.e(eVar, "handler");
        this.changeSubscription.unsubscribe(eVar);
    }
}
