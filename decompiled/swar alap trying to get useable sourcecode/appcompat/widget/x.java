package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;

/* loaded from: classes.dex */
public class x extends Spinner {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f1377m = {R.attr.spinnerMode};

    /* renamed from: e, reason: collision with root package name */
    private final androidx.appcompat.widget.e f1378e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f1379f;

    /* renamed from: g, reason: collision with root package name */
    private r0 f1380g;

    /* renamed from: h, reason: collision with root package name */
    private SpinnerAdapter f1381h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f1382i;

    /* renamed from: j, reason: collision with root package name */
    private j f1383j;

    /* renamed from: k, reason: collision with root package name */
    int f1384k;

    /* renamed from: l, reason: collision with root package name */
    final Rect f1385l;

    class a extends r0 {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ h f1386n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f1386n = hVar;
        }

        @Override // androidx.appcompat.widget.r0
        public androidx.appcompat.view.menu.p b() {
            return this.f1386n;
        }

        @Override // androidx.appcompat.widget.r0
        public boolean c() {
            if (x.this.getInternalPopup().b()) {
                return true;
            }
            x.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!x.this.getInternalPopup().b()) {
                x.this.b();
            }
            ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    private static final class c {
        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    private static final class d {
        static int a(View view) {
            return view.getTextAlignment();
        }

        static int b(View view) {
            return view.getTextDirection();
        }

        static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    private static final class e {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (androidx.core.util.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class f implements j, DialogInterface.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        androidx.appcompat.app.c f1389e;

        /* renamed from: f, reason: collision with root package name */
        private ListAdapter f1390f;

        /* renamed from: g, reason: collision with root package name */
        private CharSequence f1391g;

        f() {
        }

        @Override // androidx.appcompat.widget.x.j
        public int a() {
            return 0;
        }

        @Override // androidx.appcompat.widget.x.j
        public boolean b() {
            androidx.appcompat.app.c cVar = this.f1389e;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.x.j
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1389e;
            if (cVar != null) {
                cVar.dismiss();
                this.f1389e = null;
            }
        }

        @Override // androidx.appcompat.widget.x.j
        public Drawable f() {
            return null;
        }

        @Override // androidx.appcompat.widget.x.j
        public void h(CharSequence charSequence) {
            this.f1391g = charSequence;
        }

        @Override // androidx.appcompat.widget.x.j
        public void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.j
        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.j
        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.j
        public void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.j
        public void m(int i10, int i11) {
            if (this.f1390f == null) {
                return;
            }
            c.a aVar = new c.a(x.this.getPopupContext());
            CharSequence charSequence = this.f1391g;
            if (charSequence != null) {
                aVar.h(charSequence);
            }
            androidx.appcompat.app.c a10 = aVar.g(this.f1390f, x.this.getSelectedItemPosition(), this).a();
            this.f1389e = a10;
            ListView j10 = a10.j();
            d.d(j10, i10);
            d.c(j10, i11);
            this.f1389e.show();
        }

        @Override // androidx.appcompat.widget.x.j
        public int n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.x.j
        public CharSequence o() {
            return this.f1391g;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            x.this.setSelection(i10);
            if (x.this.getOnItemClickListener() != null) {
                x.this.performItemClick(null, i10, this.f1390f.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.x.j
        public void p(ListAdapter listAdapter) {
            this.f1390f = listAdapter;
        }
    }

    private static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: e, reason: collision with root package name */
        private SpinnerAdapter f1393e;

        /* renamed from: f, reason: collision with root package name */
        private ListAdapter f1394f;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1393e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1394f = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || Build.VERSION.SDK_INT < 23 || !y.a(spinnerAdapter)) {
                return;
            }
            e.a(z.a(spinnerAdapter), theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1394f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1393e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1393e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1393e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1393e;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1393e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1394f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1393e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1393e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class h extends t0 implements j {
        private CharSequence N;
        ListAdapter O;
        private final Rect P;
        private int Q;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ x f1395e;

            a(x xVar) {
                this.f1395e = xVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                x.this.setSelection(i10);
                if (x.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    x.this.performItemClick(view, i10, hVar.O.getItemId(i10));
                }
                h.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.V(x.this)) {
                    h.this.dismiss();
                } else {
                    h.this.T();
                    h.super.d();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1398e;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1398e = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1398e);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.P = new Rect();
            D(x.this);
            J(true);
            P(0);
            L(new a(x.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void T() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.f()
                if (r0 == 0) goto L24
                androidx.appcompat.widget.x r1 = androidx.appcompat.widget.x.this
                android.graphics.Rect r1 = r1.f1385l
                r0.getPadding(r1)
                androidx.appcompat.widget.x r0 = androidx.appcompat.widget.x.this
                boolean r0 = androidx.appcompat.widget.q1.b(r0)
                if (r0 == 0) goto L1c
                androidx.appcompat.widget.x r0 = androidx.appcompat.widget.x.this
                android.graphics.Rect r0 = r0.f1385l
                int r0 = r0.right
                goto L2e
            L1c:
                androidx.appcompat.widget.x r0 = androidx.appcompat.widget.x.this
                android.graphics.Rect r0 = r0.f1385l
                int r0 = r0.left
                int r0 = -r0
                goto L2e
            L24:
                androidx.appcompat.widget.x r0 = androidx.appcompat.widget.x.this
                android.graphics.Rect r0 = r0.f1385l
                r1 = 0
                r0.right = r1
                r0.left = r1
                r0 = 0
            L2e:
                androidx.appcompat.widget.x r1 = androidx.appcompat.widget.x.this
                int r1 = r1.getPaddingLeft()
                androidx.appcompat.widget.x r2 = androidx.appcompat.widget.x.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.x r3 = androidx.appcompat.widget.x.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.x r4 = androidx.appcompat.widget.x.this
                int r5 = r4.f1384k
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.O
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.f()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.x r5 = androidx.appcompat.widget.x.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.x r6 = androidx.appcompat.widget.x.this
                android.graphics.Rect r6 = r6.f1385l
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r1
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r1
                int r4 = r4 - r2
            L7e:
                r8.F(r4)
                goto L85
            L82:
                r8.F(r5)
            L85:
                androidx.appcompat.widget.x r4 = androidx.appcompat.widget.x.this
                boolean r4 = androidx.appcompat.widget.q1.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r1 = r8.z()
                int r3 = r3 - r1
                int r1 = r8.U()
                int r3 = r3 - r1
                int r0 = r0 + r3
                goto La0
            L9a:
                int r2 = r8.U()
                int r1 = r1 + r2
                int r0 = r0 + r1
            La0:
                r8.l(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.h.T():void");
        }

        public int U() {
            return this.Q;
        }

        boolean V(View view) {
            return androidx.core.view.h0.V(view) && view.getGlobalVisibleRect(this.P);
        }

        @Override // androidx.appcompat.widget.x.j
        public void h(CharSequence charSequence) {
            this.N = charSequence;
        }

        @Override // androidx.appcompat.widget.x.j
        public void k(int i10) {
            this.Q = i10;
        }

        @Override // androidx.appcompat.widget.x.j
        public void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean b10 = b();
            T();
            I(2);
            super.d();
            ListView g10 = g();
            g10.setChoiceMode(1);
            d.d(g10, i10);
            d.c(g10, i11);
            Q(x.this.getSelectedItemPosition());
            if (b10 || (viewTreeObserver = x.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.x.j
        public CharSequence o() {
            return this.N;
        }

        @Override // androidx.appcompat.widget.t0, androidx.appcompat.widget.x.j
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.O = listAdapter;
        }
    }

    static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        boolean f1400e;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        i(Parcel parcel) {
            super(parcel);
            this.f1400e = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1400e ? (byte) 1 : (byte) 0);
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    interface j {
        int a();

        boolean b();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i10);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.J);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f1385l);
        Rect rect = this.f1385l;
        return i11 + rect.left + rect.right;
    }

    void b() {
        this.f1383j.m(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1378e;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f1383j;
        return jVar != null ? jVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f1383j;
        return jVar != null ? jVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1383j != null ? this.f1384k : super.getDropDownWidth();
    }

    final j getInternalPopup() {
        return this.f1383j;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f1383j;
        return jVar != null ? jVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1379f;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f1383j;
        return jVar != null ? jVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1378e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1378e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1383j;
        if (jVar == null || !jVar.b()) {
            return;
        }
        this.f1383j.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1383j == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f1400e || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f1383j;
        iVar.f1400e = jVar != null && jVar.b();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        r0 r0Var = this.f1380g;
        if (r0Var == null || !r0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f1383j;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1378e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1378e;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        j jVar = this.f1383j;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            jVar.k(i10);
            this.f1383j.l(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        j jVar = this.f1383j;
        if (jVar != null) {
            jVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1383j != null) {
            this.f1384k = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f1383j;
        if (jVar != null) {
            jVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(g.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f1383j;
        if (jVar != null) {
            jVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1378e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1378e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public x(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1382i) {
            this.f1381h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1383j != null) {
            Context context = this.f1379f;
            if (context == null) {
                context = getContext();
            }
            this.f1383j.p(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public x(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1385l = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.b1.a(r6, r0)
            int[] r0 = f.j.F2
            r1 = 0
            androidx.appcompat.widget.f1 r0 = androidx.appcompat.widget.f1.v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1378e = r2
            if (r11 == 0) goto L29
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r7, r11)
        L26:
            r6.f1379f = r2
            goto L39
        L29:
            int r11 = f.j.K2
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L37
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r7, r11)
            goto L26
        L37:
            r6.f1379f = r7
        L39:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L69
            int[] r11 = androidx.appcompat.widget.x.f1377m     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
            if (r3 == 0) goto L4d
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
        L4d:
            r11.recycle()
            goto L69
        L51:
            r3 = move-exception
            goto L57
        L53:
            r7 = move-exception
            goto L63
        L55:
            r3 = move-exception
            r11 = r2
        L57:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L69
            goto L4d
        L61:
            r7 = move-exception
            r2 = r11
        L63:
            if (r2 == 0) goto L68
            r2.recycle()
        L68:
            throw r7
        L69:
            r11 = 1
            if (r10 == 0) goto La6
            if (r10 == r11) goto L6f
            goto Lb6
        L6f:
            androidx.appcompat.widget.x$h r10 = new androidx.appcompat.widget.x$h
            android.content.Context r3 = r6.f1379f
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1379f
            int[] r4 = f.j.F2
            androidx.appcompat.widget.f1 r1 = androidx.appcompat.widget.f1.v(r3, r8, r4, r9, r1)
            int r3 = f.j.J2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.f1384k = r3
            int r3 = f.j.H2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.i(r3)
            int r3 = f.j.I2
            java.lang.String r3 = r0.o(r3)
            r10.h(r3)
            r1.w()
            r6.f1383j = r10
            androidx.appcompat.widget.x$a r1 = new androidx.appcompat.widget.x$a
            r1.<init>(r6, r10)
            r6.f1380g = r1
            goto Lb6
        La6:
            androidx.appcompat.widget.x$f r10 = new androidx.appcompat.widget.x$f
            r10.<init>()
            r6.f1383j = r10
            int r1 = f.j.I2
            java.lang.String r1 = r0.o(r1)
            r10.h(r1)
        Lb6:
            int r10 = f.j.G2
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto Lce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = f.g.f10135t
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lce:
            r0.w()
            r6.f1382i = r11
            android.widget.SpinnerAdapter r7 = r6.f1381h
            if (r7 == 0) goto Ldc
            r6.setAdapter(r7)
            r6.f1381h = r2
        Ldc:
            androidx.appcompat.widget.e r7 = r6.f1378e
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}