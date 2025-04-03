package com.onesignal.common.modeling;

import com.onesignal.common.events.d;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public interface b extends d {

    public static final class a {
        public static /* synthetic */ void add$default(b bVar, int i10, g gVar, String str, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    str = "NORMAL";
                }
                bVar.add(i10, gVar, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
        }

        public static /* synthetic */ void clear$default(b bVar, String str, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = "NORMAL";
                }
                bVar.clear(str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clear");
        }

        public static /* synthetic */ g create$default(b bVar, JSONObject jSONObject, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    jSONObject = null;
                }
                return bVar.create(jSONObject);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }

        public static /* synthetic */ void remove$default(b bVar, String str, String str2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = "NORMAL";
                }
                bVar.remove(str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
        }

        public static /* synthetic */ void replaceAll$default(b bVar, List list, String str, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = "NORMAL";
                }
                bVar.replaceAll(list, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceAll");
        }

        public static /* synthetic */ void add$default(b bVar, g gVar, String str, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = "NORMAL";
                }
                bVar.add(gVar, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
        }
    }

    void add(int i10, g gVar, String str);

    void add(g gVar, String str);

    void clear(String str);

    g create(JSONObject jSONObject);

    g get(String str);

    /* synthetic */ boolean getHasSubscribers();

    Collection<g> list();

    void remove(String str, String str2);

    void replaceAll(List<g> list, String str);

    /* synthetic */ void subscribe(Object obj);

    /* synthetic */ void unsubscribe(Object obj);
}
