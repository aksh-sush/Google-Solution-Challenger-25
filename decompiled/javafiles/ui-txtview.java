package d7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private int f9418a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f9419b = -1;

    public static void c(a aVar, TextView textView, ColorStateList colorStateList) {
        if (aVar != null && textView != null) {
            aVar.b(textView, colorStateList);
        } else if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static void d(a aVar, Context context, GradientDrawable gradientDrawable) {
        if (aVar != null && gradientDrawable != null) {
            aVar.a(context, gradientDrawable);
        } else if (gradientDrawable != null) {
            gradientDrawable.setColor(0);
        }
    }

    public static int g(a aVar, Context context, int i10, int i11) {
        return aVar == null ? e7.a.m(context, i10, i11) : aVar.f(context, i10, i11);
    }

    public void a(Context context, GradientDrawable gradientDrawable) {
        int i10 = this.f9418a;
        if (i10 != 0) {
            gradientDrawable.setColor(i10);
            return;
        }
        int i11 = this.f9419b;
        if (i11 != -1) {
            gradientDrawable.setColor(androidx.core.content.a.c(context, i11));
        }
    }

    public void b(TextView textView, ColorStateList colorStateList) {
        int i10 = this.f9418a;
        if (i10 != 0) {
            textView.setTextColor(i10);
        } else if (this.f9419b != -1) {
            textView.setTextColor(androidx.core.content.a.c(textView.getContext(), this.f9419b));
        } else if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public int e(Context context) {
        int i10;
        if (this.f9418a == 0 && (i10 = this.f9419b) != -1) {
            this.f9418a = androidx.core.content.a.c(context, i10);
        }
        return this.f9418a;
    }

    public int f(Context context, int i10, int i11) {
        int e10 = e(context);
        return e10 == 0 ? e7.a.m(context, i10, i11) : e10;
    }

    public void h(int i10) {
        this.f9418a = i10;
    }
}