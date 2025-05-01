package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.c1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    private static final Class[] f538b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f539c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f540d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f541e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f542f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f543g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    private static final androidx.collection.g f544h = new androidx.collection.g();

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f545a = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        private final View f546e;

        /* renamed from: f, reason: collision with root package name */
        private final String f547f;

        /* renamed from: g, reason: collision with root package name */
        private Method f548g;

        /* renamed from: h, reason: collision with root package name */
        private Context f549h;

        public a(View view, String str) {
            this.f546e = view;
            this.f547f = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f547f, View.class)) != null) {
                        this.f548g = method;
                        this.f549h = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f546e.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f546e.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f547f + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f546e.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f548g == null) {
                a(this.f546e.getContext());
            }
            try {
                this.f548g.invoke(this.f549h, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f540d);
        if (obtainStyledAttributes.hasValue(0)) {
            androidx.core.view.h0.t0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f541e);
        if (obtainStyledAttributes2.hasValue(0)) {
            androidx.core.view.h0.v0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f542f);
        if (obtainStyledAttributes3.hasValue(0)) {
            androidx.core.view.h0.H0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && androidx.core.view.h0.R(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f539c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        androidx.collection.g gVar = f544h;
        Constructor constructor = (Constructor) gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f538b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f545a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f545a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f543g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View s10 = s(context, str, strArr[i10]);
                if (s10 != null) {
                    return s10;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f545a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.R3, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(f.j.S3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(f.j.T3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.d c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected androidx.appcompat.widget.f d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    protected androidx.appcompat.widget.g f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.k g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.k(context, attributeSet);
    }

    protected androidx.appcompat.widget.o h(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.o(context, attributeSet);
    }

    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected androidx.appcompat.widget.q j(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.q(context, attributeSet);
    }

    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    protected androidx.appcompat.widget.t l(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet);
    }

    protected androidx.appcompat.widget.v m(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.v(context, attributeSet);
    }

    protected androidx.appcompat.widget.x n(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.x(context, attributeSet);
    }

    protected androidx.appcompat.widget.c0 o(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.c0(context, attributeSet);
    }

    protected androidx.appcompat.widget.h0 p(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h0(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Context context2;
        View l10;
        context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = c1.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                l10 = l(context2, attributeSet);
                v(l10, str);
                break;
            case "CheckedTextView":
                l10 = f(context2, attributeSet);
                v(l10, str);
                break;
            case "MultiAutoCompleteTextView":
                l10 = j(context2, attributeSet);
                v(l10, str);
                break;
            case "TextView":
                l10 = o(context2, attributeSet);
                v(l10, str);
                break;
            case "ImageButton":
                l10 = h(context2, attributeSet);
                v(l10, str);
                break;
            case "SeekBar":
                l10 = m(context2, attributeSet);
                v(l10, str);
                break;
            case "Spinner":
                l10 = n(context2, attributeSet);
                v(l10, str);
                break;
            case "RadioButton":
                l10 = k(context2, attributeSet);
                v(l10, str);
                break;
            case "ToggleButton":
                l10 = p(context2, attributeSet);
                v(l10, str);
                break;
            case "ImageView":
                l10 = i(context2, attributeSet);
                v(l10, str);
                break;
            case "AutoCompleteTextView":
                l10 = c(context2, attributeSet);
                v(l10, str);
                break;
            case "CheckBox":
                l10 = e(context2, attributeSet);
                v(l10, str);
                break;
            case "EditText":
                l10 = g(context2, attributeSet);
                v(l10, str);
                break;
            case "Button":
                l10 = d(context2, attributeSet);
                v(l10, str);
                break;
            default:
                l10 = q(context2, str, attributeSet);
                break;
        }
        if (l10 == null && context != context2) {
            l10 = t(context2, str, attributeSet);
        }
        if (l10 != null) {
            b(l10, attributeSet);
            a(context2, l10, attributeSet);
        }
        return l10;
    }
}