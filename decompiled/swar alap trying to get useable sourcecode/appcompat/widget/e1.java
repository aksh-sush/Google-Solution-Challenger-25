package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class e1 extends x0 {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f1158b;

    public e1(Context context, Resources resources) {
        super(resources);
        this.f1158b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable a10 = a(i10);
        Context context = (Context) this.f1158b.get();
        if (a10 != null && context != null) {
            w0.h().x(context, i10, a10);
        }
        return a10;
    }
}