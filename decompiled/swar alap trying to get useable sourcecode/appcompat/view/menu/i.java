package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.b;

/* loaded from: classes.dex */
public final class i implements y.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a, reason: collision with root package name */
    private final int f760a;

    /* renamed from: b, reason: collision with root package name */
    private final int f761b;

    /* renamed from: c, reason: collision with root package name */
    private final int f762c;

    /* renamed from: d, reason: collision with root package name */
    private final int f763d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f764e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f765f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f766g;

    /* renamed from: h, reason: collision with root package name */
    private char f767h;

    /* renamed from: j, reason: collision with root package name */
    private char f769j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f771l;

    /* renamed from: n, reason: collision with root package name */
    g f773n;

    /* renamed from: o, reason: collision with root package name */
    private r f774o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f775p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f776q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f777r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f778s;

    /* renamed from: z, reason: collision with root package name */
    private int f785z;

    /* renamed from: i, reason: collision with root package name */
    private int f768i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f770k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f772m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f779t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f780u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f781v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f782w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f783x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f784y = 16;
    private boolean D = false;

    class a implements b.InterfaceC0034b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0034b
        public void onActionProviderVisibilityChanged(boolean z10) {
            i iVar = i.this;
            iVar.f773n.J(iVar);
        }
    }

    i(g gVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f773n = gVar;
        this.f760a = i11;
        this.f761b = i10;
        this.f762c = i12;
        this.f763d = i13;
        this.f764e = charSequence;
        this.f785z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f783x && (this.f781v || this.f782w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f781v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f779t);
            }
            if (this.f782w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f780u);
            }
            this.f783x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f773n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f785z & 4) == 4;
    }

    @Override // y.b
    public y.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.g();
        }
        this.A = null;
        this.B = bVar;
        this.f773n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.i(new a());
        }
        return this;
    }

    @Override // y.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f773n.I(this);
    }

    @Override // y.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f785z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f773n.f(this);
        }
        return false;
    }

    @Override // y.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f773n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f763d;
    }

    char g() {
        return this.f773n.G() ? this.f769j : this.f767h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // y.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View c10 = bVar.c(this);
        this.A = c10;
        return c10;
    }

    @Override // y.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f770k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f769j;
    }

    @Override // y.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f777r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f761b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f771l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f772m == 0) {
            return null;
        }
        Drawable b10 = g.a.b(this.f773n.u(), this.f772m);
        this.f772m = 0;
        this.f771l = b10;
        return e(b10);
    }

    @Override // y.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f779t;
    }

    @Override // y.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f780u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f766g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f760a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // y.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f768i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f767h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f762c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f774o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f764e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f765f;
        return charSequence != null ? charSequence : this.f764e;
    }

    @Override // y.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f778s;
    }

    String h() {
        int i10;
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f773n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f773n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(f.h.f10148m));
        }
        int i11 = this.f773n.G() ? this.f770k : this.f768i;
        d(sb2, i11, 65536, resources.getString(f.h.f10144i));
        d(sb2, i11, 4096, resources.getString(f.h.f10140e));
        d(sb2, i11, 2, resources.getString(f.h.f10139d));
        d(sb2, i11, 1, resources.getString(f.h.f10145j));
        d(sb2, i11, 4, resources.getString(f.h.f10147l));
        d(sb2, i11, 8, resources.getString(f.h.f10143h));
        if (g10 == '\b') {
            i10 = f.h.f10141f;
        } else if (g10 == '\n') {
            i10 = f.h.f10142g;
        } else {
            if (g10 != ' ') {
                sb2.append(g10);
                return sb2.toString();
            }
            i10 = f.h.f10146k;
        }
        sb2.append(resources.getString(i10));
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f774o != null;
    }

    CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // y.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f784y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f784y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f784y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.f()) ? (this.f784y & 8) == 0 : (this.f784y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f785z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.c(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f776q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f773n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f775p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f766g != null) {
            try {
                this.f773n.u().startActivity(this.f766g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.d();
    }

    public boolean l() {
        return (this.f784y & 32) == 32;
    }

    public boolean m() {
        return (this.f784y & 4) != 0;
    }

    public boolean n() {
        return (this.f785z & 1) == 1;
    }

    public boolean o() {
        return (this.f785z & 2) == 2;
    }

    @Override // y.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public y.b setActionView(int i10) {
        Context u10 = this.f773n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, (ViewGroup) new LinearLayout(u10), false));
        return this;
    }

    @Override // y.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public y.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f760a) > 0) {
            view.setId(i10);
        }
        this.f773n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f773n.K(false);
    }

    void s(boolean z10) {
        int i10 = this.f784y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f784y = i11;
        if (i10 != i11) {
            this.f773n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f769j == c10) {
            return this;
        }
        this.f769j = Character.toLowerCase(c10);
        this.f773n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f784y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f784y = i11;
        if (i10 != i11) {
            this.f773n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f784y & 4) != 0) {
            this.f773n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f784y = z10 ? this.f784y | 16 : this.f784y & (-17);
        this.f773n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f771l = null;
        this.f772m = i10;
        this.f783x = true;
        this.f773n.K(false);
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f779t = colorStateList;
        this.f781v = true;
        this.f783x = true;
        this.f773n.K(false);
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f780u = mode;
        this.f782w = true;
        this.f783x = true;
        this.f773n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f766g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f767h == c10) {
            return this;
        }
        this.f767h = c10;
        this.f773n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f776q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f767h = c10;
        this.f769j = Character.toLowerCase(c11);
        this.f773n.K(false);
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f785z = i10;
        this.f773n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f773n.u().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f765f = charSequence;
        this.f773n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f773n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f784y = (z10 ? 4 : 0) | (this.f784y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f764e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        this.f784y = z10 ? this.f784y | 32 : this.f784y & (-33);
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // y.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public y.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(r rVar) {
        this.f774o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f784y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f784y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f773n.A();
    }

    @Override // y.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f769j == c10 && this.f770k == i10) {
            return this;
        }
        this.f769j = Character.toLowerCase(c10);
        this.f770k = KeyEvent.normalizeMetaState(i10);
        this.f773n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public y.b setContentDescription(CharSequence charSequence) {
        this.f777r = charSequence;
        this.f773n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f772m = 0;
        this.f771l = drawable;
        this.f783x = true;
        this.f773n.K(false);
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f767h == c10 && this.f768i == i10) {
            return this;
        }
        this.f767h = c10;
        this.f768i = KeyEvent.normalizeMetaState(i10);
        this.f773n.K(false);
        return this;
    }

    @Override // y.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f767h = c10;
        this.f768i = KeyEvent.normalizeMetaState(i10);
        this.f769j = Character.toLowerCase(c11);
        this.f770k = KeyEvent.normalizeMetaState(i11);
        this.f773n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f764e = charSequence;
        this.f773n.K(false);
        r rVar = this.f774o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public y.b setTooltipText(CharSequence charSequence) {
        this.f778s = charSequence;
        this.f773n.K(false);
        return this;
    }
}