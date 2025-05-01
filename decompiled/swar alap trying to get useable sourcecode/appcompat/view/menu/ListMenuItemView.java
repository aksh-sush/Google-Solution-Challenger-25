package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.f1;
import androidx.core.view.h0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e, reason: collision with root package name */
    private i f632e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f633f;

    /* renamed from: g, reason: collision with root package name */
    private RadioButton f634g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f635h;

    /* renamed from: i, reason: collision with root package name */
    private CheckBox f636i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f637j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f638k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f639l;

    /* renamed from: m, reason: collision with root package name */
    private LinearLayout f640m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f641n;

    /* renamed from: o, reason: collision with root package name */
    private int f642o;

    /* renamed from: p, reason: collision with root package name */
    private Context f643p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f644q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f645r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f646s;

    /* renamed from: t, reason: collision with root package name */
    private LayoutInflater f647t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f648u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.C);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f640m;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(f.g.f10123h, (ViewGroup) this, false);
        this.f636i = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(f.g.f10124i, (ViewGroup) this, false);
        this.f633f = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(f.g.f10126k, (ViewGroup) this, false);
        this.f634g = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f647t == null) {
            this.f647t = LayoutInflater.from(getContext());
        }
        return this.f647t;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f638k;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f639l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f639l.getLayoutParams();
        rect.top += this.f639l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i10) {
        this.f632e = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f632e;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f632e.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f637j.setText(this.f632e.h());
        }
        if (this.f637j.getVisibility() != i10) {
            this.f637j.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        h0.w0(this, this.f641n);
        TextView textView = (TextView) findViewById(f.f.M);
        this.f635h = textView;
        int i10 = this.f642o;
        if (i10 != -1) {
            textView.setTextAppearance(this.f643p, i10);
        }
        this.f637j = (TextView) findViewById(f.f.F);
        ImageView imageView = (ImageView) findViewById(f.f.I);
        this.f638k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f645r);
        }
        this.f639l = (ImageView) findViewById(f.f.f10107r);
        this.f640m = (LinearLayout) findViewById(f.f.f10101l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f633f != null && this.f644q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f633f.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f634g == null && this.f636i == null) {
            return;
        }
        if (this.f632e.m()) {
            if (this.f634g == null) {
                g();
            }
            compoundButton = this.f634g;
            view = this.f636i;
        } else {
            if (this.f636i == null) {
                c();
            }
            compoundButton = this.f636i;
            view = this.f634g;
        }
        if (z10) {
            compoundButton.setChecked(this.f632e.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f636i;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f634g;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f632e.m()) {
            if (this.f634g == null) {
                g();
            }
            compoundButton = this.f634g;
        } else {
            if (this.f636i == null) {
                c();
            }
            compoundButton = this.f636i;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f648u = z10;
        this.f644q = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f639l;
        if (imageView != null) {
            imageView.setVisibility((this.f646s || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f632e.z() || this.f648u;
        if (z10 || this.f644q) {
            ImageView imageView = this.f633f;
            if (imageView == null && drawable == null && !this.f644q) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f644q) {
                this.f633f.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f633f;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f633f.getVisibility() != 0) {
                this.f633f.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f635h.setText(charSequence);
            if (this.f635h.getVisibility() == 0) {
                return;
            }
            textView = this.f635h;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f635h.getVisibility() == 8) {
                return;
            } else {
                textView = this.f635h;
            }
        }
        textView.setVisibility(i10);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        f1 v10 = f1.v(getContext(), attributeSet, f.j.f10164b2, i10, 0);
        this.f641n = v10.g(f.j.f10175d2);
        this.f642o = v10.n(f.j.f10170c2, -1);
        this.f644q = v10.a(f.j.f10180e2, false);
        this.f643p = context;
        this.f645r = v10.g(f.j.f10185f2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, f.a.f10040y, 0);
        this.f646s = obtainStyledAttributes.hasValue(0);
        v10.w();
        obtainStyledAttributes.recycle();
    }
}