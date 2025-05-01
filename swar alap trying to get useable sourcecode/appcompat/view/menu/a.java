package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class a implements y.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f649a;

    /* renamed from: b, reason: collision with root package name */
    private final int f650b;

    /* renamed from: c, reason: collision with root package name */
    private final int f651c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f652d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f653e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f654f;

    /* renamed from: g, reason: collision with root package name */
    private char f655g;

    /* renamed from: i, reason: collision with root package name */
    private char f657i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f659k;

    /* renamed from: l, reason: collision with root package name */
    private Context f660l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f661m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f662n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f663o;

    /* renamed from: h, reason: collision with root package name */
    private int f656h = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f658j = 4096;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f664p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f665q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f666r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f667s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f668t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f660l = context;
        this.f649a = i11;
        this.f650b = i10;
        this.f651c = i13;
        this.f652d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f659k;
        if (drawable != null) {
            if (this.f666r || this.f667s) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
                this.f659k = r10;
                Drawable mutate = r10.mutate();
                this.f659k = mutate;
                if (this.f666r) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f664p);
                }
                if (this.f667s) {
                    androidx.core.graphics.drawable.a.p(this.f659k, this.f665q);
                }
            }
        }
    }

    @Override // y.b
    public y.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // y.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // y.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // y.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public y.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // y.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public y.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // y.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // y.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public y.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // y.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // y.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f658j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f657i;
    }

    @Override // y.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f662n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f650b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f659k;
    }

    @Override // y.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f664p;
    }

    @Override // y.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f665q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f654f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f649a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // y.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f656h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f655g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f651c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f652d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f653e;
        return charSequence != null ? charSequence : this.f652d;
    }

    @Override // y.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f663o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // y.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f668t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f668t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f668t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f668t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f657i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f668t = (z10 ? 1 : 0) | (this.f668t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f668t = (z10 ? 2 : 0) | (this.f668t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f668t = (z10 ? 16 : 0) | (this.f668t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f659k = androidx.core.content.a.e(this.f660l, i10);
        c();
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f664p = colorStateList;
        this.f666r = true;
        c();
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f665q = mode;
        this.f667s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f654f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f655g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f661m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f655g = c10;
        this.f657i = Character.toLowerCase(c11);
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f652d = this.f660l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f653e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f668t = (this.f668t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f657i = Character.toLowerCase(c10);
        this.f658j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public y.b setContentDescription(CharSequence charSequence) {
        this.f662n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f659k = drawable;
        c();
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f655g = c10;
        this.f656h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f655g = c10;
        this.f656h = KeyEvent.normalizeMetaState(i10);
        this.f657i = Character.toLowerCase(c11);
        this.f658j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f652d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public y.b setTooltipText(CharSequence charSequence) {
        this.f663o = charSequence;
        return this;
    }
}