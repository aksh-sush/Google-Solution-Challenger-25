package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class c0 extends TextView implements androidx.core.widget.n {

    /* renamed from: e, reason: collision with root package name */
    private final e f1117e;

    /* renamed from: f, reason: collision with root package name */
    private final b0 f1118f;

    /* renamed from: g, reason: collision with root package name */
    private final a0 f1119g;

    /* renamed from: h, reason: collision with root package name */
    private m f1120h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1121i;

    /* renamed from: j, reason: collision with root package name */
    private a f1122j;

    /* renamed from: k, reason: collision with root package name */
    private Future f1123k;

    private interface a {
        void a(int[] iArr, int i10);

        void b(TextClassifier textClassifier);

        int[] c();

        void d(int i10);

        TextClassifier e();

        int f();

        void g(int i10, int i11, int i12, int i13);

        int h();

        int i();

        void j(int i10);

        int k();

        void l(int i10);
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.c0.a
        public void a(int[] iArr, int i10) {
            c0.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.c0.a
        public void b(TextClassifier textClassifier) {
            c0.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.c0.a
        public int[] c() {
            return c0.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.c0.a
        public void d(int i10) {
        }

        @Override // androidx.appcompat.widget.c0.a
        public TextClassifier e() {
            return c0.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.c0.a
        public int f() {
            return c0.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.c0.a
        public void g(int i10, int i11, int i12, int i13) {
            c0.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.c0.a
        public int h() {
            return c0.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.c0.a
        public int i() {
            return c0.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.c0.a
        public void j(int i10) {
        }

        @Override // androidx.appcompat.widget.c0.a
        public int k() {
            return c0.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.c0.a
        public void l(int i10) {
            c0.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.c0.b, androidx.appcompat.widget.c0.a
        public void d(int i10) {
            c0.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.c0.b, androidx.appcompat.widget.c0.a
        public void j(int i10) {
            c0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public c0(Context context) {
        this(context, null);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1120h == null) {
            this.f1120h = new m(this);
        }
        return this.f1120h;
    }

    private void q() {
        Future future = this.f1123k;
        if (future != null) {
            try {
                this.f1123k = null;
                android.support.v4.media.session.b.a(future.get());
                androidx.core.widget.j.m(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1117e;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q1.f1294b) {
            return getSuperCaller().f();
        }
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            return b0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q1.f1294b) {
            return getSuperCaller().i();
        }
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            return b0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q1.f1294b) {
            return getSuperCaller().k();
        }
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            return b0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q1.f1294b) {
            return getSuperCaller().c();
        }
        b0 b0Var = this.f1118f;
        return b0Var != null ? b0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (q1.f1294b) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            return b0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.p(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.j.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.j.c(this);
    }

    a getSuperCaller() {
        a bVar;
        if (this.f1122j == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                bVar = new c();
            } else if (i10 >= 26) {
                bVar = new b();
            }
            this.f1122j = bVar;
        }
        return this.f1122j;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1117e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1117e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1118f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1118f.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        q();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        return (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f1119g) == null) ? getSuperCaller().e() : a0Var.a();
    }

    public n.a getTextMetricsParamsCompat() {
        return androidx.core.widget.j.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1118f.r(this, onCreateInputConnection, editorInfo);
        return n.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        q();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b0 b0Var = this.f1118f;
        if ((b0Var == null || q1.f1294b || !b0Var.l()) ? false : true) {
            this.f1118f.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (q1.f1294b) {
            getSuperCaller().g(i10, i11, i12, i13);
            return;
        }
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (q1.f1294b) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (q1.f1294b) {
            getSuperCaller().l(i10);
            return;
        }
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1117e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1117e;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? g.a.b(context, i10) : null, i11 != 0 ? g.a.b(context, i11) : null, i12 != 0 ? g.a.b(context, i12) : null, i13 != 0 ? g.a.b(context, i13) : null);
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? g.a.b(context, i10) : null, i11 != 0 ? g.a.b(context, i11) : null, i12 != 0 ? g.a.b(context, i12) : null, i13 != 0 ? g.a.b(context, i13) : null);
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i10);
        } else {
            androidx.core.widget.j.j(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i10);
        } else {
            androidx.core.widget.j.k(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.j.l(this, i10);
    }

    public void setPrecomputedText(androidx.core.text.n nVar) {
        androidx.core.widget.j.m(this, nVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1117e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1117e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1118f.w(colorStateList);
        this.f1118f.b();
    }

    @Override // androidx.core.widget.n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1118f.x(mode);
        this.f1118f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f1119g) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            a0Var.b(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.n> future) {
        this.f1123k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(n.a aVar) {
        androidx.core.widget.j.o(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (q1.f1294b) {
            super.setTextSize(i10, f10);
            return;
        }
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f1121i) {
            return;
        }
        Typeface a10 = (typeface == null || i10 <= 0) ? null : androidx.core.graphics.e.a(getContext(), typeface, i10);
        this.f1121i = true;
        if (a10 != null) {
            typeface = a10;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f1121i = false;
        }
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1118f;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(c1.b(context), attributeSet, i10);
        this.f1121i = false;
        this.f1122j = null;
        b1.a(this, getContext());
        e eVar = new e(this);
        this.f1117e = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1118f = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        this.f1119g = new a0(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}