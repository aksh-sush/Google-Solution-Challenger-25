package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.r0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends c0 implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: l, reason: collision with root package name */
    i f617l;

    /* renamed from: m, reason: collision with root package name */
    private CharSequence f618m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f619n;

    /* renamed from: o, reason: collision with root package name */
    g.b f620o;

    /* renamed from: p, reason: collision with root package name */
    private r0 f621p;

    /* renamed from: q, reason: collision with root package name */
    b f622q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f623r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f624s;

    /* renamed from: t, reason: collision with root package name */
    private int f625t;

    /* renamed from: u, reason: collision with root package name */
    private int f626u;

    /* renamed from: v, reason: collision with root package name */
    private int f627v;

    private class a extends r0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.r0
        public p b() {
            b bVar = ActionMenuItemView.this.f622q;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.r0
        protected boolean c() {
            p b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f620o;
            return bVar != null && bVar.a(actionMenuItemView.f617l) && (b10 = b()) != null && b10.b();
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void t() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f618m);
        if (this.f619n != null && (!this.f617l.B() || (!this.f623r && !this.f624s))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f618m : null);
        CharSequence contentDescription = this.f617l.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z12 ? null : this.f617l.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f617l.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            k1.a(this, z12 ? null : this.f617l.getTitle());
        } else {
            k1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return r();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return r() && this.f617l.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i10) {
        this.f617l = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f621p == null) {
            this.f621p = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f617l;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f620o;
        if (bVar != null) {
            bVar.a(this.f617l);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f623r = s();
        t();
    }

    @Override // androidx.appcompat.widget.c0, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean r10 = r();
        if (r10 && (i12 = this.f626u) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f625t) : this.f625t;
        if (mode != 1073741824 && this.f625t > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (r10 || this.f619n == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f619n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        r0 r0Var;
        if (this.f617l.hasSubMenu() && (r0Var = this.f621p) != null && r0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f624s != z10) {
            this.f624s = z10;
            i iVar = this.f617l;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f619n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f627v;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        t();
    }

    public void setItemInvoker(g.b bVar) {
        this.f620o = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f626u = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f622q = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f618m = charSequence;
        t();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f623r = s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f10262v, i10, 0);
        this.f625t = obtainStyledAttributes.getDimensionPixelSize(f.j.f10267w, 0);
        obtainStyledAttributes.recycle();
        this.f627v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f626u = -1;
        setSaveEnabled(false);
    }
}