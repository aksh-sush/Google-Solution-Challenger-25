package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f553f;

    /* renamed from: a, reason: collision with root package name */
    private int f554a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f555b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f556c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f557d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f558e;

    static class a {
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f554a = i10;
    }

    private Resources b() {
        if (this.f558e == null) {
            Configuration configuration = this.f557d;
            this.f558e = (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) ? super.getResources() : a.a(this, this.f557d).getResources();
        }
        return this.f558e;
    }

    private void d() {
        boolean z10 = this.f555b == null;
        if (z10) {
            this.f555b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f555b.setTo(theme);
            }
        }
        f(this.f555b, this.f554a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f553f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f553f = configuration2;
        }
        return configuration.equals(f553f);
    }

    public void a(Configuration configuration) {
        if (this.f558e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f557d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f557d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f554a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f556c == null) {
            this.f556c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f556c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f555b;
        if (theme != null) {
            return theme;
        }
        if (this.f554a == 0) {
            this.f554a = f.i.f10154e;
        }
        d();
        return this.f555b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f554a != i10) {
            this.f554a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f555b = theme;
    }
}