package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.api.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class d0 {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f1134l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f1135m = new ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    private static ConcurrentHashMap f1136n = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private int f1137a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1138b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f1139c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f1140d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f1141e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f1142f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f1143g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f1144h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f1145i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f1146j;

    /* renamed from: k, reason: collision with root package name */
    private final f f1147k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    private static final class b {
        static boolean a(View view) {
            return view.isInLayout();
        }
    }

    private static final class c {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = a.e.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.d0.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) d0.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.d0.d, androidx.appcompat.widget.d0.f
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.d0.f
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    private static class f {
        f() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) d0.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    d0(TextView textView) {
        this.f1145i = textView;
        this.f1146j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        this.f1147k = i10 >= 29 ? new e() : i10 >= 23 ? new d() : new f();
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1137a = 0;
        this.f1140d = -1.0f;
        this.f1141e = -1.0f;
        this.f1139c = -1.0f;
        this.f1142f = new int[0];
        this.f1138b = false;
    }

    private int e(RectF rectF) {
        int length = this.f1142f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f1142f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f1142f[i12];
    }

    private static Method k(String str) {
        try {
            Method method = (Method) f1135m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1135m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    private void s(float f10) {
        if (f10 != this.f1145i.getPaint().getTextSize()) {
            this.f1145i.getPaint().setTextSize(f10);
            boolean a10 = b.a(this.f1145i);
            if (this.f1145i.getLayout() != null) {
                this.f1138b = false;
                try {
                    Method k10 = k("nullLayouts");
                    if (k10 != null) {
                        k10.invoke(this.f1145i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (a10) {
                    this.f1145i.forceLayout();
                } else {
                    this.f1145i.requestLayout();
                }
                this.f1145i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f1137a == 1) {
            if (!this.f1143g || this.f1142f.length == 0) {
                int floor = ((int) Math.floor((this.f1141e - this.f1140d) / this.f1139c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1140d + (i10 * this.f1139c));
                }
                this.f1142f = b(iArr);
            }
            this.f1138b = true;
        } else {
            this.f1138b = false;
        }
        return this.f1138b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1142f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z10 = this.f1142f.length > 0;
        this.f1143g = z10;
        if (z10) {
            this.f1137a = 1;
            this.f1140d = r0[0];
            this.f1141e = r0[r1 - 1];
            this.f1139c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1145i.getText();
        TransformationMethod transformationMethod = this.f1145i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1145i)) != null) {
            text = transformation;
        }
        int b10 = a.b(this.f1145i);
        l(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) m(this.f1145i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10);
        return (b10 == -1 || (d10.getLineCount() <= b10 && d10.getLineEnd(d10.getLineCount() - 1) == text.length())) && ((float) d10.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f1145i instanceof k);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f1137a = 1;
        this.f1140d = f10;
        this.f1141e = f11;
        this.f1139c = f12;
        this.f1143g = false;
    }

    void a() {
        if (n()) {
            if (this.f1138b) {
                if (this.f1145i.getMeasuredHeight() <= 0 || this.f1145i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1147k.b(this.f1145i) ? 1048576 : (this.f1145i.getMeasuredWidth() - this.f1145i.getTotalPaddingLeft()) - this.f1145i.getTotalPaddingRight();
                int height = (this.f1145i.getHeight() - this.f1145i.getCompoundPaddingBottom()) - this.f1145i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1134l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float e10 = e(rectF);
                    if (e10 != this.f1145i.getTextSize()) {
                        t(0, e10);
                    }
                }
            }
            this.f1138b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return Build.VERSION.SDK_INT >= 23 ? c.a(charSequence, alignment, i10, i11, this.f1145i, this.f1144h, this.f1147k) : a.a(charSequence, alignment, i10, this.f1145i, this.f1144h);
    }

    int f() {
        return Math.round(this.f1141e);
    }

    int g() {
        return Math.round(this.f1140d);
    }

    int h() {
        return Math.round(this.f1139c);
    }

    int[] i() {
        return this.f1142f;
    }

    int j() {
        return this.f1137a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f1144h;
        if (textPaint == null) {
            this.f1144h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1144h.set(this.f1145i.getPaint());
        this.f1144h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f1137a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1146j;
        int[] iArr = f.j.f10188g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1145i;
        androidx.core.view.h0.q0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = f.j.f10213l0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1137a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = f.j.f10208k0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = f.j.f10198i0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = f.j.f10193h0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = f.j.f10203j0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f1137a = 0;
            return;
        }
        if (this.f1137a == 1) {
            if (!this.f1143g) {
                DisplayMetrics displayMetrics = this.f1146j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f1146j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1146j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1142f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1143g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f1146j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f10) {
        Context context = this.f1146j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}