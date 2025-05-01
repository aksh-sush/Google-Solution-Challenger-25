package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.h0;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f799a;

    /* renamed from: b, reason: collision with root package name */
    private final g f800b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f801c;

    /* renamed from: d, reason: collision with root package name */
    private final int f802d;

    /* renamed from: e, reason: collision with root package name */
    private final int f803e;

    /* renamed from: f, reason: collision with root package name */
    private View f804f;

    /* renamed from: g, reason: collision with root package name */
    private int f805g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f806h;

    /* renamed from: i, reason: collision with root package name */
    private m.a f807i;

    /* renamed from: j, reason: collision with root package name */
    private k f808j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f809k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f810l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z10, int i10) {
        this(context, gVar, view, z10, i10, 0);
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.f799a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        k dVar = Math.min(point.x, point.y) >= this.f799a.getResources().getDimensionPixelSize(f.d.f10051a) ? new d(this.f799a, this.f804f, this.f802d, this.f803e, this.f801c) : new q(this.f799a, this.f800b, this.f804f, this.f802d, this.f803e, this.f801c);
        dVar.l(this.f800b);
        dVar.u(this.f810l);
        dVar.p(this.f804f);
        dVar.k(this.f807i);
        dVar.r(this.f806h);
        dVar.s(this.f805g);
        return dVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        k c10 = c();
        c10.v(z11);
        if (z10) {
            if ((androidx.core.view.o.b(this.f805g, h0.E(this.f804f)) & 7) == 5) {
                i10 -= this.f804f.getWidth();
            }
            c10.t(i10);
            c10.w(i11);
            int i12 = (int) ((this.f799a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.d();
    }

    public void b() {
        if (d()) {
            this.f808j.dismiss();
        }
    }

    public k c() {
        if (this.f808j == null) {
            this.f808j = a();
        }
        return this.f808j;
    }

    public boolean d() {
        k kVar = this.f808j;
        return kVar != null && kVar.b();
    }

    protected void e() {
        this.f808j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f809k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f804f = view;
    }

    public void g(boolean z10) {
        this.f806h = z10;
        k kVar = this.f808j;
        if (kVar != null) {
            kVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f805g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f809k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f807i = aVar;
        k kVar = this.f808j;
        if (kVar != null) {
            kVar.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f804f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f804f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z10, int i10, int i11) {
        this.f805g = 8388611;
        this.f810l = new a();
        this.f799a = context;
        this.f800b = gVar;
        this.f804f = view;
        this.f801c = z10;
        this.f802d = i10;
        this.f803e = i11;
    }
}