package com.onesignal.common.modeling;

import cb.l;
import db.g;
import db.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sa.t;

public abstract class i implements com.onesignal.common.events.d, b, a {
    private final y7.a _prefs;
    private final com.onesignal.common.events.b changeSubscription;
    private final List<g> models;
    private final String name;

    static final class a extends m implements l {
        final /* synthetic */ g $model;
        final /* synthetic */ String $tag;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, String str) {
            super(1);
            this.$model = gVar;
            this.$tag = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((c) obj);
            return t.f15300a;
        }

        public final void invoke(c cVar) {
            db.l.e(cVar, "it");
            cVar.onModelAdded(this.$model, this.$tag);
        }
    }

    static final class b extends m implements l {
        final /* synthetic */ g $item;
        final /* synthetic */ String $tag;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, String str) {
            super(1);
            this.$item = gVar;
            this.$tag = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((c) obj);
            return t.f15300a;
        }

        public final void invoke(c cVar) {
            db.l.e(cVar, "it");
            cVar.onModelRemoved(this.$item, this.$tag);
        }
    }

    static final class c extends m implements l {
        final /* synthetic */ h $args;
        final /* synthetic */ String $tag;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar, String str) {
            super(1);
            this.$args = hVar;
            this.$tag = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((c) obj);
            return t.f15300a;
        }

        public final void invoke(c cVar) {
            db.l.e(cVar, "it");
            cVar.onModelUpdated(this.$args, this.$tag);
        }
    }

    static final class d extends m implements l {
        final /* synthetic */ g $model;
        final /* synthetic */ String $tag;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, String str) {
            super(1);
            this.$model = gVar;
            this.$tag = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((c) obj);
            return t.f15300a;
        }

        public final void invoke(c cVar) {
            db.l.e(cVar, "it");
            cVar.onModelRemoved(this.$model, this.$tag);
        }
    }

    public i() {
        this((String) null, (y7.a) null, 3, (g) null);
    }

    private final void addItem(g gVar, String str, Integer num) {
        synchronized (this.models) {
            if (num != null) {
                this.models.add(num.intValue(), gVar);
            } else {
                this.models.add(gVar);
            }
            gVar.subscribe((a) this);
            persist();
            this.changeSubscription.fire(new a(gVar, str));
            t tVar = t.f15300a;
        }
    }

    static /* synthetic */ void addItem$default(i iVar, g gVar, String str, Integer num, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                num = null;
            }
            iVar.addItem(gVar, str, num);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
    }

    private final void removeItem(g gVar, String str) {
        synchronized (this.models) {
            this.models.remove(gVar);
            gVar.unsubscribe((a) this);
            persist();
            this.changeSubscription.fire(new d(gVar, str));
            t tVar = t.f15300a;
        }
    }

    public void add(int i10, g gVar, String str) {
        T t10;
        db.l.e(gVar, "model");
        db.l.e(str, "tag");
        synchronized (this.models) {
            Iterator<T> it = this.models.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (db.l.a(((g) t10).getId(), gVar.getId())) {
                    break;
                }
            }
            g gVar2 = (g) t10;
            if (gVar2 != null) {
                removeItem(gVar2, str);
            }
            addItem(gVar, str, Integer.valueOf(i10));
            t tVar = t.f15300a;
        }
    }

    public void clear(String str) {
        db.l.e(str, "tag");
        synchronized (this.models) {
            List<g> R = w.R(this.models);
            this.models.clear();
            persist();
            for (g gVar : R) {
                gVar.unsubscribe((a) this);
                this.changeSubscription.fire(new b(gVar, str));
            }
            t tVar = t.f15300a;
        }
    }

    public abstract /* synthetic */ g create(JSONObject jSONObject);

    public g get(String str) {
        T t10;
        db.l.e(str, "id");
        Iterator<T> it = this.models.iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (db.l.a(((g) t10).getId(), str)) {
                break;
            }
        }
        return (g) t10;
    }

    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    public final String getName() {
        return this.name;
    }

    public Collection<g> list() {
        return this.models;
    }

    /* access modifiers changed from: protected */
    public final void load() {
        y7.a aVar;
        synchronized (this.models) {
            if (!(this.name == null || (aVar = this._prefs) == null)) {
                JSONArray jSONArray = new JSONArray(aVar.getString("OneSignal", "MODEL_STORE_" + this.name, "[]"));
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    g create = create(jSONArray.getJSONObject(i10));
                    if (create != null) {
                        this.models.add(create);
                        create.subscribe((a) this);
                    }
                }
            }
            t tVar = t.f15300a;
        }
    }

    public void onChanged(h hVar, String str) {
        db.l.e(hVar, "args");
        db.l.e(str, "tag");
        synchronized (this.models) {
            persist();
            this.changeSubscription.fire(new c(hVar, str));
            t tVar = t.f15300a;
        }
    }

    public final void persist() {
        synchronized (this.models) {
            if (!(this.name == null || this._prefs == null)) {
                JSONArray jSONArray = new JSONArray();
                for (g json : this.models) {
                    jSONArray.put(json.toJSON());
                }
                y7.a aVar = this._prefs;
                aVar.saveString("OneSignal", "MODEL_STORE_" + this.name, jSONArray.toString());
            }
            t tVar = t.f15300a;
        }
    }

    public void remove(String str, String str2) {
        T t10;
        db.l.e(str, "id");
        db.l.e(str2, "tag");
        synchronized (this.models) {
            Iterator<T> it = this.models.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (db.l.a(((g) t10).getId(), str)) {
                    break;
                }
            }
            g gVar = (g) t10;
            if (gVar != null) {
                removeItem(gVar, str2);
                t tVar = t.f15300a;
            }
        }
    }

    public void replaceAll(List<g> list, String str) {
        db.l.e(list, "models");
        db.l.e(str, "tag");
        synchronized (list) {
            clear(str);
            for (g add : list) {
                add(add, str);
            }
            t tVar = t.f15300a;
        }
    }

    public void subscribe(c cVar) {
        db.l.e(cVar, "handler");
        this.changeSubscription.subscribe(cVar);
    }

    public void unsubscribe(c cVar) {
        db.l.e(cVar, "handler");
        this.changeSubscription.unsubscribe(cVar);
    }

    public i(String str, y7.a aVar) {
        this.name = str;
        this._prefs = aVar;
        this.changeSubscription = new com.onesignal.common.events.b();
        this.models = new ArrayList();
    }

    public void add(g gVar, String str) {
        T t10;
        db.l.e(gVar, "model");
        db.l.e(str, "tag");
        synchronized (this.models) {
            Iterator<T> it = this.models.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (db.l.a(((g) t10).getId(), gVar.getId())) {
                    break;
                }
            }
            g gVar2 = (g) t10;
            if (gVar2 != null) {
                removeItem(gVar2, str);
            }
            addItem$default(this, gVar, str, (Integer) null, 4, (Object) null);
            t tVar = t.f15300a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, y7.a aVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : aVar);
    }
}
