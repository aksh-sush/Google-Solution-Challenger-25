package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* loaded from: classes.dex */
class o1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1255a;

    /* renamed from: b, reason: collision with root package name */
    private final View f1256b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f1257c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f1258d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f1259e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f1260f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f1261g;

    o1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1258d = layoutParams;
        this.f1259e = new Rect();
        this.f1260f = new int[2];
        this.f1261g = new int[2];
        this.f1255a = context;
        View inflate = LayoutInflater.from(context).inflate(f.g.f10134s, (ViewGroup) null);
        this.f1256b = inflate;
        this.f1257c = (TextView) inflate.findViewById(f.f.f10108s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = f.i.f10150a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1255a.getResources().getDimensionPixelOffset(f.d.f10061k);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1255a.getResources().getDimensionPixelOffset(f.d.f10060j);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1255a.getResources().getDimensionPixelOffset(z10 ? f.d.f10063m : f.d.f10062l);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f1259e);
        Rect rect = this.f1259e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1255a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1259e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f1261g);
        view.getLocationOnScreen(this.f1260f);
        int[] iArr = this.f1260f;
        int i13 = iArr[0];
        int[] iArr2 = this.f1261g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1256b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1256b.getMeasuredHeight();
        int i15 = this.f1260f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i17 <= this.f1259e.height() : i16 < 0) {
            layoutParams.y = i16;
        } else {
            layoutParams.y = i17;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f1255a.getSystemService("window")).removeView(this.f1256b);
        }
    }

    boolean d() {
        return this.f1256b.getParent() != null;
    }

    void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1257c.setText(charSequence);
        a(view, i10, i11, z10, this.f1258d);
        ((WindowManager) this.f1255a.getSystemService("window")).addView(this.f1256b, this.f1258d);
    }
}