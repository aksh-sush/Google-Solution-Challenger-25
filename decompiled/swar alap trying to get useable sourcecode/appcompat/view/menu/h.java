package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: e, reason: collision with root package name */
    private g f756e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.appcompat.app.c f757f;

    /* renamed from: g, reason: collision with root package name */
    e f758g;

    /* renamed from: h, reason: collision with root package name */
    private m.a f759h;

    public h(g gVar) {
        this.f756e = gVar;
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void a(g gVar, boolean z10) {
        if (z10 || gVar == this.f756e) {
            c();
        }
        m.a aVar = this.f759h;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean b(g gVar) {
        m.a aVar = this.f759h;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.c cVar = this.f757f;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f756e;
        c.a aVar = new c.a(gVar.u());
        e eVar = new e(aVar.b(), f.g.f10125j);
        this.f758g = eVar;
        eVar.k(this);
        this.f756e.b(this.f758g);
        aVar.c(this.f758g.b(), this);
        View y10 = gVar.y();
        if (y10 != null) {
            aVar.d(y10);
        } else {
            aVar.e(gVar.w()).h(gVar.x());
        }
        aVar.f(this);
        androidx.appcompat.app.c a10 = aVar.a();
        this.f757f = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f757f.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f757f.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f756e.L((i) this.f758g.b().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f758g.a(this.f756e, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f757f.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f757f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f756e.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f756e.performShortcut(i10, keyEvent, 0);
    }
}