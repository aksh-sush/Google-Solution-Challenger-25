package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class c extends x implements DialogInterface {

    /* renamed from: j, reason: collision with root package name */
    final AlertController f374j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.f f375a;

        /* renamed from: b, reason: collision with root package name */
        private final int f376b;

        public a(Context context) {
            this(context, c.l(context, 0));
        }

        public c a() {
            c cVar = new c(this.f375a.f313a, this.f376b);
            this.f375a.a(cVar.f374j);
            cVar.setCancelable(this.f375a.f330r);
            if (this.f375a.f330r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f375a.f331s);
            cVar.setOnDismissListener(this.f375a.f332t);
            DialogInterface.OnKeyListener onKeyListener = this.f375a.f333u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f375a.f313a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f375a;
            fVar.f335w = listAdapter;
            fVar.f336x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f375a.f319g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f375a.f316d = drawable;
            return this;
        }

        public a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f375a.f333u = onKeyListener;
            return this;
        }

        public a g(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f375a;
            fVar.f335w = listAdapter;
            fVar.f336x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.f375a.f318f = charSequence;
            return this;
        }

        public a i(View view) {
            AlertController.f fVar = this.f375a;
            fVar.f338z = view;
            fVar.f337y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f375a = new AlertController.f(new ContextThemeWrapper(context, c.l(context, i10)));
            this.f376b = i10;
        }
    }

    protected c(Context context, int i10) {
        super(context, l(context, i10));
        this.f374j = new AlertController(getContext(), this, getWindow());
    }

    static int l(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f10027l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView j() {
        return this.f374j.d();
    }

    @Override // androidx.appcompat.app.x, androidx.activity.k, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f374j.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f374j.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f374j.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.x, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f374j.q(charSequence);
    }
}