package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c1 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1126c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f1127d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f1128a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f1129b;

    private c1(Context context) {
        super(context);
        if (!p1.c()) {
            this.f1128a = new e1(this, context.getResources());
            this.f1129b = null;
            return;
        }
        p1 p1Var = new p1(this, context.getResources());
        this.f1128a = p1Var;
        Resources.Theme newTheme = p1Var.newTheme();
        this.f1129b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof c1) || (context.getResources() instanceof e1) || (context.getResources() instanceof p1) || !p1.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1126c) {
            ArrayList arrayList = f1127d;
            if (arrayList == null) {
                f1127d = new ArrayList();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f1127d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1127d.remove(size);
                    }
                }
                for (int size2 = f1127d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f1127d.get(size2);
                    c1 c1Var = weakReference2 != null ? (c1) weakReference2.get() : null;
                    if (c1Var != null && c1Var.getBaseContext() == context) {
                        return c1Var;
                    }
                }
            }
            c1 c1Var2 = new c1(context);
            f1127d.add(new WeakReference(c1Var2));
            return c1Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1128a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1128a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1129b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1129b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}