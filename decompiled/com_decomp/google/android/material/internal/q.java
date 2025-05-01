package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import d5.d;
import d5.f;
import java.lang.ref.WeakReference;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f7197a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final f f7198b = new a();

    /* renamed from: c  reason: collision with root package name */
    private float f7199c;

    /* renamed from: d  reason: collision with root package name */
    private float f7200d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f7201e = true;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public WeakReference f7202f = new WeakReference((Object) null);

    /* renamed from: g  reason: collision with root package name */
    private d f7203g;

    class a extends f {
        a() {
        }

        public void a(int i10) {
            boolean unused = q.this.f7201e = true;
            b bVar = (b) q.this.f7202f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(Typeface typeface, boolean z10) {
            if (!z10) {
                boolean unused = q.this.f7201e = true;
                b bVar = (b) q.this.f7202f.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public q(b bVar) {
        i(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f7197a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f7197a.measureText(charSequence, 0, charSequence.length());
    }

    private void h(String str) {
        this.f7199c = d(str);
        this.f7200d = c(str);
        this.f7201e = false;
    }

    public d e() {
        return this.f7203g;
    }

    public TextPaint f() {
        return this.f7197a;
    }

    public float g(String str) {
        if (!this.f7201e) {
            return this.f7199c;
        }
        h(str);
        return this.f7199c;
    }

    public void i(b bVar) {
        this.f7202f = new WeakReference(bVar);
    }

    public void j(d dVar, Context context) {
        if (this.f7203g != dVar) {
            this.f7203g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f7197a, this.f7198b);
                b bVar = (b) this.f7202f.get();
                if (bVar != null) {
                    this.f7197a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f7197a, this.f7198b);
                this.f7201e = true;
            }
            b bVar2 = (b) this.f7202f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z10) {
        this.f7201e = z10;
    }

    public void l(Context context) {
        this.f7203g.n(context, this.f7197a, this.f7198b);
    }
}
