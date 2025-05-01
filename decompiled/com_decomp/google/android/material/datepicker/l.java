package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.c0;
import androidx.core.view.h0;
import androidx.core.view.h1;
import androidx.fragment.app.d;
import androidx.fragment.app.u;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.v;
import g5.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o4.c;
import o4.e;
import o4.h;
import o4.i;
import o4.j;

public final class l<S> extends d {
    static final Object W = "CONFIRM_BUTTON_TAG";
    static final Object X = "CANCEL_BUTTON_TAG";
    static final Object Y = "TOGGLE_BUTTON_TAG";
    private a A;
    private j B;
    private int C;
    private CharSequence D;
    private boolean E;
    private int F;
    private int G;
    private CharSequence H;
    private int I;
    private CharSequence J;
    private int K;
    private CharSequence L;
    private int M;
    private CharSequence N;
    private TextView O;
    private TextView P;
    private CheckableImageButton Q;
    private g R;
    private Button S;
    private boolean T;
    private CharSequence U;
    private CharSequence V;

    /* renamed from: u  reason: collision with root package name */
    private final LinkedHashSet f7069u = new LinkedHashSet();

    /* renamed from: v  reason: collision with root package name */
    private final LinkedHashSet f7070v = new LinkedHashSet();

    /* renamed from: w  reason: collision with root package name */
    private final LinkedHashSet f7071w = new LinkedHashSet();

    /* renamed from: x  reason: collision with root package name */
    private final LinkedHashSet f7072x = new LinkedHashSet();

    /* renamed from: y  reason: collision with root package name */
    private int f7073y;

    /* renamed from: z  reason: collision with root package name */
    private r f7074z;

    class a implements c0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f7075a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f7076b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f7077c;

        a(int i10, View view, int i11) {
            this.f7075a = i10;
            this.f7076b = view;
            this.f7077c = i11;
        }

        public h1 a(View view, h1 h1Var) {
            int i10 = h1Var.f(h1.m.d()).f2215b;
            if (this.f7075a >= 0) {
                this.f7076b.getLayoutParams().height = this.f7075a + i10;
                View view2 = this.f7076b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f7076b;
            view3.setPadding(view3.getPaddingLeft(), this.f7077c + i10, this.f7076b.getPaddingRight(), this.f7076b.getPaddingBottom());
            return h1Var;
        }
    }

    class b extends q {
        b() {
        }
    }

    private d A() {
        android.support.v4.media.session.b.a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence B(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    private String C() {
        A();
        requireContext();
        throw null;
    }

    private static int E(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(c.mtrl_calendar_content_padding);
        int i10 = n.f().f7086h;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(c.mtrl_calendar_day_width) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(c.mtrl_calendar_month_horizontal_padding));
    }

    private int F(Context context) {
        int i10 = this.f7073y;
        if (i10 != 0) {
            return i10;
        }
        A();
        throw null;
    }

    private void G(Context context) {
        this.Q.setTag(Y);
        this.Q.setImageDrawable(y(context));
        this.Q.setChecked(this.F != 0);
        h0.s0(this.Q, (androidx.core.view.a) null);
        P(this.Q);
        this.Q.setOnClickListener(new k(this));
    }

    static boolean H(Context context) {
        return L(context, 16843277);
    }

    private boolean I() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean J(Context context) {
        return L(context, o4.a.nestedScrollable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(View view) {
        A();
        throw null;
    }

    static boolean L(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d5.b.d(context, o4.a.materialCalendarStyle, j.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    private void M() {
        int F2 = F(requireContext());
        A();
        j z10 = j.z((d) null, F2, this.A, (h) null);
        this.B = z10;
        r rVar = z10;
        if (this.F == 1) {
            A();
            rVar = m.l((d) null, F2, this.A);
        }
        this.f7074z = rVar;
        O();
        N(D());
        u m10 = getChildFragmentManager().m();
        m10.m(e.mtrl_calendar_frame, this.f7074z);
        m10.h();
        this.f7074z.j(new b());
    }

    private void O() {
        this.O.setText((this.F != 1 || !I()) ? this.U : this.V);
    }

    private void P(CheckableImageButton checkableImageButton) {
        this.Q.setContentDescription(checkableImageButton.getContext().getString(this.F == 1 ? h.mtrl_picker_toggle_to_calendar_input_mode : h.mtrl_picker_toggle_to_text_input_mode));
    }

    private static Drawable y(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, g.a.b(context, o4.d.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], g.a.b(context, o4.d.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private void z(Window window) {
        if (!this.T) {
            View findViewById = requireView().findViewById(e.fullscreen_header);
            com.google.android.material.internal.c.a(window, true, v.d(findViewById), (Integer) null);
            h0.F0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
            this.T = true;
        }
    }

    public String D() {
        A();
        getContext();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void N(String str) {
        this.P.setContentDescription(C());
        this.P.setText(str);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f7071w.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f7073y = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.A = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.C = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.D = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.F = bundle.getInt("INPUT_MODE_KEY");
        this.G = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.H = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.I = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.J = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.K = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.L = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.M = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.N = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.D;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.C);
        }
        this.U = charSequence;
        this.V = B(charSequence);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.E ? o4.g.mtrl_picker_fullscreen : o4.g.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.E) {
            view = inflate.findViewById(e.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(E(context), -2);
        } else {
            view = inflate.findViewById(e.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(E(context), -1);
        }
        view.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(e.mtrl_picker_header_selection_text);
        this.P = textView;
        h0.u0(textView, 1);
        this.Q = (CheckableImageButton) inflate.findViewById(e.mtrl_picker_header_toggle);
        this.O = (TextView) inflate.findViewById(e.mtrl_picker_title_text);
        G(context);
        this.S = (Button) inflate.findViewById(e.confirm_button);
        A();
        throw null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f7072x.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f7073y);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        a.b bVar = new a.b(this.A);
        j jVar = this.B;
        n u10 = jVar == null ? null : jVar.u();
        if (u10 != null) {
            bVar.b(u10.f7088j);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.C);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.D);
        bundle.putInt("INPUT_MODE_KEY", this.F);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.G);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.H);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.I);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.J);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.K);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.L);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.M);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.N);
    }

    public void onStart() {
        super.onStart();
        Window window = t().getWindow();
        if (this.E) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.R);
            z(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.R, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new w4.a(t(), rect));
        }
        M();
    }

    public void onStop() {
        this.f7074z.k();
        super.onStop();
    }

    public final Dialog p(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), F(requireContext()));
        Context context = dialog.getContext();
        this.E = H(context);
        int i10 = o4.a.materialCalendarStyle;
        int i11 = i.Widget_MaterialComponents_MaterialCalendar;
        this.R = new g(context, (AttributeSet) null, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.B2, i10, i11);
        int color = obtainStyledAttributes.getColor(j.C2, 0);
        obtainStyledAttributes.recycle();
        this.R.J(context);
        this.R.T(ColorStateList.valueOf(color));
        this.R.S(h0.y(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
