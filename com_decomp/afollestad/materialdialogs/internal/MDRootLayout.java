package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import l1.e;
import l1.g;
import l1.i;
import l1.k;
import l1.n;
import l1.o;

public class MDRootLayout extends ViewGroup {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final MDButton[] f4617e = new MDButton[3];

    /* renamed from: f  reason: collision with root package name */
    private int f4618f;

    /* renamed from: g  reason: collision with root package name */
    private View f4619g;

    /* renamed from: h  reason: collision with root package name */
    private View f4620h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f4621i = false;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f4622j = false;

    /* renamed from: k  reason: collision with root package name */
    private o f4623k = o.ADAPTIVE;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4624l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4625m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f4626n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4627o;

    /* renamed from: p  reason: collision with root package name */
    private int f4628p;

    /* renamed from: q  reason: collision with root package name */
    private int f4629q;

    /* renamed from: r  reason: collision with root package name */
    private int f4630r;

    /* renamed from: s  reason: collision with root package name */
    private e f4631s = e.START;

    /* renamed from: t  reason: collision with root package name */
    private int f4632t;

    /* renamed from: u  reason: collision with root package name */
    private Paint f4633u;

    /* renamed from: v  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f4634v;

    /* renamed from: w  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f4635w;

    /* renamed from: x  reason: collision with root package name */
    private int f4636x;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f4637e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f4638f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f4639g;

        a(View view, boolean z10, boolean z11) {
            this.f4637e = view;
            this.f4638f = z10;
            this.f4639g = z11;
        }

        public boolean onPreDraw() {
            if (this.f4637e.getMeasuredHeight() == 0) {
                return true;
            }
            if (!MDRootLayout.l((WebView) this.f4637e)) {
                if (this.f4638f) {
                    boolean unused = MDRootLayout.this.f4621i = false;
                }
                if (this.f4639g) {
                    boolean unused2 = MDRootLayout.this.f4622j = false;
                }
            } else {
                MDRootLayout.this.h((ViewGroup) this.f4637e, this.f4638f, this.f4639g);
            }
            this.f4637e.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    class b extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f4641a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4642b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f4643c;

        b(ViewGroup viewGroup, boolean z10, boolean z11) {
            this.f4641a = viewGroup;
            this.f4642b = z10;
            this.f4643c = z11;
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            super.b(recyclerView, i10, i11);
            MDButton[] e10 = MDRootLayout.this.f4617e;
            int length = e10.length;
            boolean z10 = false;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    MDButton mDButton = e10[i12];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.p(this.f4641a, this.f4642b, this.f4643c, z10);
            MDRootLayout.this.invalidate();
        }
    }

    class c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewGroup f4645e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f4646f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f4647g;

        c(ViewGroup viewGroup, boolean z10, boolean z11) {
            this.f4645e = viewGroup;
            this.f4646f = z10;
            this.f4647g = z11;
        }

        public void onScrollChanged() {
            MDButton[] e10 = MDRootLayout.this.f4617e;
            int length = e10.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    MDButton mDButton = e10[i10];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f4645e;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.q((WebView) viewGroup, this.f4646f, this.f4647g, z10);
            } else {
                MDRootLayout.this.p(viewGroup, this.f4646f, this.f4647g, z10);
            }
            MDRootLayout.this.invalidate();
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4649a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                l1.e[] r0 = l1.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4649a = r0
                l1.e r1 = l1.e.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4649a     // Catch:{ NoSuchFieldError -> 0x001d }
                l1.e r1 = l1.e.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.d.<clinit>():void");
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public void h(ViewGroup viewGroup, boolean z10, boolean z11) {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        ViewTreeObserver viewTreeObserver;
        if ((!z11 && this.f4634v == null) || (z11 && this.f4635w == null)) {
            if (viewGroup instanceof RecyclerView) {
                b bVar = new b(viewGroup, z10, z11);
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                recyclerView.m(bVar);
                bVar.b(recyclerView, 0, 0);
                return;
            }
            c cVar = new c(viewGroup, z10, z11);
            if (!z11) {
                this.f4634v = cVar;
                viewTreeObserver = viewGroup.getViewTreeObserver();
                onScrollChangedListener = this.f4634v;
            } else {
                this.f4635w = cVar;
                viewTreeObserver = viewGroup.getViewTreeObserver();
                onScrollChangedListener = this.f4635w;
            }
            viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
            cVar.onScrollChanged();
        }
    }

    private static boolean i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    public static boolean j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().q()) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r4.getChildAt(0).getMeasuredHeight();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean k(android.widget.ScrollView r4) {
        /*
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r0 = r4.getChildAt(r1)
            int r0 = r0.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r4 = r4.getPaddingBottom()
            int r2 = r2 - r4
            if (r2 >= r0) goto L_0x0021
            r1 = 1
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.k(android.widget.ScrollView):boolean");
    }

    /* access modifiers changed from: private */
    public static boolean l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    private static View m(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    private static View n(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f13152u, i10, 0);
        this.f4626n = obtainStyledAttributes.getBoolean(n.f13153v, true);
        obtainStyledAttributes.recycle();
        this.f4628p = resources.getDimensionPixelSize(i.md_notitle_vertical_padding);
        this.f4629q = resources.getDimensionPixelSize(i.md_button_frame_vertical_padding);
        this.f4632t = resources.getDimensionPixelSize(i.md_button_padding_frame_side);
        this.f4630r = resources.getDimensionPixelSize(i.md_button_height);
        this.f4633u = new Paint();
        this.f4636x = resources.getDimensionPixelSize(i.md_divider_height);
        this.f4633u.setColor(n1.a.l(context, g.md_divider_color));
        setWillNotDraw(false);
    }

    /* access modifiers changed from: private */
    public void p(ViewGroup viewGroup, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        if (z10 && viewGroup.getChildCount() > 0) {
            View view = this.f4619g;
            this.f4621i = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (z11 && viewGroup.getChildCount() > 0) {
            if (!z12 || (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() >= viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom()) {
                z13 = false;
            }
            this.f4622j = z13;
        }
    }

    /* access modifiers changed from: private */
    public void q(WebView webView, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        if (z10) {
            View view = this.f4619g;
            this.f4621i = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z11) {
            if (!z12 || ((float) ((webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom())) >= ((float) webView.getContentHeight()) * webView.getScale()) {
                z13 = false;
            }
            this.f4622j = z13;
        }
    }

    private void r() {
        e eVar;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i10 = d.f4649a[this.f4631s.ordinal()];
            if (i10 == 1) {
                eVar = e.END;
            } else if (i10 == 2) {
                eVar = e.START;
            } else {
                return;
            }
            this.f4631s = eVar;
        }
    }

    private static boolean s(View view) {
        boolean z10 = true;
        boolean z11 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!z11 || !(view instanceof MDButton)) {
            return z11;
        }
        if (((MDButton) view).getText().toString().trim().length() <= 0) {
            z10 = false;
        }
        return z10;
    }

    private void u(View view, boolean z10, boolean z11) {
        ScrollView scrollView;
        if (view != null) {
            if (view instanceof ScrollView) {
                ScrollView scrollView2 = (ScrollView) view;
                boolean k10 = k(scrollView2);
                scrollView = scrollView2;
                if (!k10) {
                    if (z10) {
                        this.f4621i = false;
                    }
                    if (!z11) {
                        return;
                    }
                    this.f4622j = false;
                    return;
                }
            } else if (view instanceof AdapterView) {
                AdapterView adapterView = (AdapterView) view;
                boolean i10 = i(adapterView);
                scrollView = adapterView;
                if (!i10) {
                    if (z10) {
                        this.f4621i = false;
                    }
                    if (!z11) {
                        return;
                    }
                    this.f4622j = false;
                    return;
                }
            } else if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, z10, z11));
                return;
            } else if (view instanceof RecyclerView) {
                boolean j10 = j((RecyclerView) view);
                if (z10) {
                    this.f4621i = j10;
                }
                if (z11) {
                    this.f4622j = j10;
                }
                if (j10) {
                    scrollView = (ViewGroup) view;
                } else {
                    return;
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                View n10 = n(viewGroup);
                u(n10, z10, z11);
                View m10 = m(viewGroup);
                if (m10 != n10) {
                    u(m10, false, true);
                    return;
                }
                return;
            } else {
                return;
            }
            h(scrollView, z10, z11);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f4620h;
        if (view != null) {
            if (this.f4621i) {
                int top = view.getTop();
                canvas.drawRect(0.0f, (float) (top - this.f4636x), (float) getMeasuredWidth(), (float) top, this.f4633u);
            }
            if (this.f4622j) {
                int bottom = this.f4620h.getBottom();
                canvas.drawRect(0.0f, (float) bottom, (float) getMeasuredWidth(), (float) (bottom + this.f4636x), this.f4633u);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() == k.md_titleFrame) {
                this.f4619g = childAt;
            } else if (childAt.getId() == k.md_buttonDefaultNeutral) {
                this.f4617e[0] = (MDButton) childAt;
            } else if (childAt.getId() == k.md_buttonDefaultNegative) {
                this.f4617e[1] = (MDButton) childAt;
            } else if (childAt.getId() == k.md_buttonDefaultPositive) {
                this.f4617e[2] = (MDButton) childAt;
            } else {
                this.f4620h = childAt;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        MDButton mDButton;
        int i18;
        int i19;
        int i20;
        int i21;
        if (s(this.f4619g)) {
            int measuredHeight = this.f4619g.getMeasuredHeight() + i11;
            this.f4619g.layout(i10, i11, i12, measuredHeight);
            i11 = measuredHeight;
        } else if (!this.f4627o && this.f4625m) {
            i11 += this.f4628p;
        }
        if (s(this.f4620h)) {
            View view = this.f4620h;
            view.layout(i10, i11, i12, view.getMeasuredHeight() + i11);
        }
        if (this.f4624l) {
            int i22 = i13 - this.f4629q;
            for (MDButton mDButton2 : this.f4617e) {
                if (s(mDButton2)) {
                    mDButton2.layout(i10, i22 - mDButton2.getMeasuredHeight(), i12, i22);
                    i22 -= mDButton2.getMeasuredHeight();
                }
            }
        } else {
            if (this.f4625m) {
                i13 -= this.f4629q;
            }
            int i23 = i13 - this.f4630r;
            int i24 = this.f4632t;
            if (s(this.f4617e[2])) {
                if (this.f4631s == e.END) {
                    i21 = i10 + i24;
                    i20 = this.f4617e[2].getMeasuredWidth() + i21;
                    i14 = -1;
                } else {
                    int i25 = i12 - i24;
                    i21 = i25 - this.f4617e[2].getMeasuredWidth();
                    i20 = i25;
                    i14 = i21;
                }
                this.f4617e[2].layout(i21, i23, i20, i13);
                i24 += this.f4617e[2].getMeasuredWidth();
            } else {
                i14 = -1;
            }
            if (s(this.f4617e[1])) {
                e eVar = this.f4631s;
                if (eVar == e.END) {
                    i19 = i24 + i10;
                    i18 = this.f4617e[1].getMeasuredWidth() + i19;
                } else if (eVar == e.START) {
                    i18 = i12 - i24;
                    i19 = i18 - this.f4617e[1].getMeasuredWidth();
                } else {
                    i19 = this.f4632t + i10;
                    i18 = this.f4617e[1].getMeasuredWidth() + i19;
                    i15 = i18;
                    this.f4617e[1].layout(i19, i23, i18, i13);
                }
                i15 = -1;
                this.f4617e[1].layout(i19, i23, i18, i13);
            } else {
                i15 = -1;
            }
            if (s(this.f4617e[0])) {
                e eVar2 = this.f4631s;
                if (eVar2 == e.END) {
                    i16 = i12 - this.f4632t;
                    i17 = i16 - this.f4617e[0].getMeasuredWidth();
                } else if (eVar2 == e.START) {
                    i17 = i10 + this.f4632t;
                    i16 = this.f4617e[0].getMeasuredWidth() + i17;
                } else {
                    if (i15 != -1 || i14 == -1) {
                        if (i14 == -1 && i15 != -1) {
                            mDButton = this.f4617e[0];
                        } else if (i14 == -1) {
                            i15 = ((i12 - i10) / 2) - (this.f4617e[0].getMeasuredWidth() / 2);
                            mDButton = this.f4617e[0];
                        }
                        i14 = i15 + mDButton.getMeasuredWidth();
                    } else {
                        i15 = i14 - this.f4617e[0].getMeasuredWidth();
                    }
                    i16 = i14;
                    i17 = i15;
                }
                this.f4617e[0].layout(i17, i23, i16, i13);
            }
        }
        u(this.f4620h, true, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            int r1 = android.view.View.MeasureSpec.getSize(r13)
            int r2 = r11.f4618f
            if (r1 <= r2) goto L_0x000d
            r1 = r2
        L_0x000d:
            r2 = 1
            r11.f4625m = r2
            l1.o r3 = r11.f4623k
            l1.o r4 = l1.o.ALWAYS
            r5 = 0
            if (r3 != r4) goto L_0x001a
            r3 = 1
        L_0x0018:
            r8 = 0
            goto L_0x0058
        L_0x001a:
            l1.o r4 = l1.o.NEVER
            if (r3 != r4) goto L_0x0020
            r3 = 0
            goto L_0x0018
        L_0x0020:
            com.afollestad.materialdialogs.internal.MDButton[] r3 = r11.f4617e
            int r4 = r3.length
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0026:
            if (r6 >= r4) goto L_0x0041
            r9 = r3[r6]
            if (r9 == 0) goto L_0x003e
            boolean r10 = s(r9)
            if (r10 == 0) goto L_0x003e
            r9.b(r5, r5)
            r11.measureChild(r9, r12, r13)
            int r8 = r9.getMeasuredWidth()
            int r7 = r7 + r8
            r8 = 1
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0041:
            android.content.Context r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = l1.i.md_neutral_button_margin
            int r3 = r3.getDimensionPixelSize(r4)
            int r3 = r3 * 2
            int r3 = r0 - r3
            if (r7 <= r3) goto L_0x0057
            r3 = 1
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            r11.f4624l = r3
            if (r3 == 0) goto L_0x007c
            com.afollestad.materialdialogs.internal.MDButton[] r3 = r11.f4617e
            int r4 = r3.length
            r6 = 0
            r7 = 0
        L_0x0061:
            if (r6 >= r4) goto L_0x007d
            r9 = r3[r6]
            if (r9 == 0) goto L_0x0079
            boolean r10 = s(r9)
            if (r10 == 0) goto L_0x0079
            r9.b(r2, r5)
            r11.measureChild(r9, r12, r13)
            int r8 = r9.getMeasuredHeight()
            int r7 = r7 + r8
            r8 = 1
        L_0x0079:
            int r6 = r6 + 1
            goto L_0x0061
        L_0x007c:
            r7 = 0
        L_0x007d:
            if (r8 == 0) goto L_0x0099
            boolean r12 = r11.f4624l
            if (r12 == 0) goto L_0x008e
            int r12 = r1 - r7
            int r13 = r11.f4629q
            int r3 = r13 * 2
            int r3 = r3 + r5
            int r13 = r13 * 2
            int r13 = r13 + r5
            goto L_0x00a1
        L_0x008e:
            int r12 = r11.f4630r
            int r12 = r1 - r12
            int r13 = r11.f4629q
            int r13 = r13 * 2
            int r3 = r13 + 0
            goto L_0x00a0
        L_0x0099:
            int r12 = r11.f4629q
            int r12 = r12 * 2
            int r3 = r12 + 0
            r12 = r1
        L_0x00a0:
            r13 = 0
        L_0x00a1:
            android.view.View r4 = r11.f4619g
            boolean r4 = s(r4)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x00bc
            android.view.View r4 = r11.f4619g
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            r4.measure(r7, r5)
            android.view.View r4 = r11.f4619g
            int r4 = r4.getMeasuredHeight()
            int r12 = r12 - r4
            goto L_0x00c3
        L_0x00bc:
            boolean r4 = r11.f4627o
            if (r4 != 0) goto L_0x00c3
            int r4 = r11.f4628p
            int r3 = r3 + r4
        L_0x00c3:
            android.view.View r4 = r11.f4620h
            boolean r4 = s(r4)
            if (r4 == 0) goto L_0x0110
            android.view.View r4 = r11.f4620h
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            int r7 = r12 - r13
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r4.measure(r6, r7)
            android.view.View r4 = r11.f4620h
            int r4 = r4.getMeasuredHeight()
            int r6 = r12 - r3
            if (r4 > r6) goto L_0x010d
            boolean r4 = r11.f4626n
            if (r4 == 0) goto L_0x0101
            android.view.View r4 = r11.f4619g
            boolean r4 = s(r4)
            if (r4 != 0) goto L_0x0101
            if (r8 == 0) goto L_0x00f5
            goto L_0x0101
        L_0x00f5:
            r11.f4625m = r5
            android.view.View r2 = r11.f4620h
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r13
            int r5 = r12 - r2
            goto L_0x0111
        L_0x0101:
            r11.f4625m = r2
            android.view.View r13 = r11.f4620h
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r3
            int r5 = r12 - r13
            goto L_0x0111
        L_0x010d:
            r11.f4625m = r5
            goto L_0x0111
        L_0x0110:
            r5 = r12
        L_0x0111:
            int r1 = r1 - r5
            r11.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public void setButtonGravity(e eVar) {
        this.f4631s = eVar;
        r();
    }

    public void setButtonStackedGravity(e eVar) {
        for (MDButton mDButton : this.f4617e) {
            if (mDButton != null) {
                mDButton.setStackedGravity(eVar);
            }
        }
    }

    public void setDividerColor(int i10) {
        this.f4633u.setColor(i10);
        invalidate();
    }

    public void setMaxHeight(int i10) {
        this.f4618f = i10;
    }

    public void setStackingBehavior(o oVar) {
        this.f4623k = oVar;
        invalidate();
    }

    public void t() {
        this.f4627o = true;
    }
}
