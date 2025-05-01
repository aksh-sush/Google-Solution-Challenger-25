package com.onesignal.common.modeling;

import cb.a;
import db.g;
import db.l;
import org.json.JSONObject;

public class j extends i {
    private final a _create;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a aVar, String str, y7.a aVar2) {
        super(str, aVar2);
        l.e(aVar, "_create");
        this._create = aVar;
        load();
    }

    public g create(JSONObject jSONObject) {
        g gVar = (g) this._create.invoke();
        if (jSONObject != null) {
            gVar.initializeFromJson(jSONObject);
        }
        return gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(a aVar, String str, y7.a aVar2, int i10, g gVar) {
        this(aVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : aVar2);
    }
}
