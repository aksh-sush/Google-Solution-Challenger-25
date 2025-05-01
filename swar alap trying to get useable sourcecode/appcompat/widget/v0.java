package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class v0 extends t0 implements u0 {
    private static Method O;
    private u0 N;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    public static class c extends p0 {

        /* renamed from: r, reason: collision with root package name */
        final int f1357r;

        /* renamed from: s, reason: collision with root package name */
        final int f1358s;

        /* renamed from: t, reason: collision with root package name */
        private u0 f1359t;

        /* renamed from: u, reason: collision with root package name */
        private MenuItem f1360u;

        static class a {
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f1357r = 21;
                this.f1358s = 22;
            } else {
                this.f1357r = 22;
                this.f1358s = 21;
            }
        }

        @Override // androidx.appcompat.widget.p0
        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.p0
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.p0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.p0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.p0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.p0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.p0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int i10;
            int pointToPosition;
            int i11;
            if (this.f1359t != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    i10 = 0;
                }
                androidx.appcompat.view.menu.i item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i11 = pointToPosition - i10) < 0 || i11 >= fVar.getCount()) ? null : fVar.getItem(i11);
                MenuItem menuItem = this.f1360u;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g b10 = fVar.b();
                    if (menuItem != null) {
                        this.f1359t.e(b10, menuItem);
                    }
                    this.f1360u = item;
                    if (item != null) {
                        this.f1359t.c(b10, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1357r) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f1358s) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.f) adapter).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.p0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(u0 u0Var) {
            this.f1359t = u0Var;
        }

        @Override // androidx.appcompat.widget.p0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                O = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public v0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.a(this.J, (Transition) obj);
        }
    }

    public void T(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.b(this.J, (Transition) obj);
        }
    }

    public void U(u0 u0Var) {
        this.N = u0Var;
    }

    public void V(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.J, z10);
            return;
        }
        Method method = O;
        if (method != null) {
            try {
                method.invoke(this.J, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.u0
    public void c(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        u0 u0Var = this.N;
        if (u0Var != null) {
            u0Var.c(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.u0
    public void e(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        u0 u0Var = this.N;
        if (u0Var != null) {
            u0Var.e(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.t0
    p0 s(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}