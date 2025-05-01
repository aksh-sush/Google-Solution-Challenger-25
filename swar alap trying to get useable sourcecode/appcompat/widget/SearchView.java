package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends s0 implements androidx.appcompat.view.c {

    /* renamed from: r0, reason: collision with root package name */
    static final o f924r0;
    final ImageView A;
    private final View B;
    private q C;
    private Rect D;
    private Rect E;
    private int[] F;
    private int[] G;
    private final ImageView H;
    private final Drawable I;
    private final int J;
    private final int K;
    private final Intent L;
    private final Intent M;
    private final CharSequence N;
    View.OnFocusChangeListener O;
    private View.OnClickListener P;
    private boolean Q;
    private boolean R;
    b0.a S;
    private boolean T;
    private CharSequence U;
    private boolean V;
    private boolean W;

    /* renamed from: a0, reason: collision with root package name */
    private int f925a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f926b0;

    /* renamed from: c0, reason: collision with root package name */
    private CharSequence f927c0;

    /* renamed from: d0, reason: collision with root package name */
    private CharSequence f928d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f929e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f930f0;

    /* renamed from: g0, reason: collision with root package name */
    SearchableInfo f931g0;

    /* renamed from: h0, reason: collision with root package name */
    private Bundle f932h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Runnable f933i0;

    /* renamed from: j0, reason: collision with root package name */
    private Runnable f934j0;

    /* renamed from: k0, reason: collision with root package name */
    private final WeakHashMap f935k0;

    /* renamed from: l0, reason: collision with root package name */
    private final View.OnClickListener f936l0;

    /* renamed from: m0, reason: collision with root package name */
    View.OnKeyListener f937m0;

    /* renamed from: n0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f938n0;

    /* renamed from: o0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f939o0;

    /* renamed from: p0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f940p0;

    /* renamed from: q0, reason: collision with root package name */
    private TextWatcher f941q0;

    /* renamed from: t, reason: collision with root package name */
    final SearchAutoComplete f942t;

    /* renamed from: u, reason: collision with root package name */
    private final View f943u;

    /* renamed from: v, reason: collision with root package name */
    private final View f944v;

    /* renamed from: w, reason: collision with root package name */
    private final View f945w;

    /* renamed from: x, reason: collision with root package name */
    final ImageView f946x;

    /* renamed from: y, reason: collision with root package name */
    final ImageView f947y;

    /* renamed from: z, reason: collision with root package name */
    final ImageView f948z;

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: i, reason: collision with root package name */
        private int f949i;

        /* renamed from: j, reason: collision with root package name */
        private SearchView f950j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f951k;

        /* renamed from: l, reason: collision with root package name */
        final Runnable f952l;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, f.a.f10028m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f924r0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f951k) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f951k = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f949i <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f951k) {
                removeCallbacks(this.f952l);
                post(this.f952l);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f950j.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f950j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f950j.hasFocus() && getVisibility() == 0) {
                this.f951k = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f951k = false;
                removeCallbacks(this.f952l);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f951k = true;
                    return;
                }
                this.f951k = false;
                removeCallbacks(this.f952l);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f950j = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f949i = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f952l = new a();
            this.f949i = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.a aVar = SearchView.this.S;
            if (aVar instanceof a1) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f946x) {
                searchView.V();
                return;
            }
            if (view == searchView.f948z) {
                searchView.R();
                return;
            }
            if (view == searchView.f947y) {
                searchView.W();
            } else if (view == searchView.A) {
                searchView.a0();
            } else if (view == searchView.f942t) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f931g0 == null) {
                return false;
            }
            if (searchView.f942t.isPopupShowing() && SearchView.this.f942t.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (SearchView.this.f942t.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.f942t.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    private static class o {

        /* renamed from: a, reason: collision with root package name */
        private Method f964a;

        /* renamed from: b, reason: collision with root package name */
        private Method f965b;

        /* renamed from: c, reason: collision with root package name */
        private Method f966c;

        o() {
            this.f964a = null;
            this.f965b = null;
            this.f966c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f964a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f965b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f966c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f965b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f964a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f966c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends d0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        boolean f967g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f967g = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f967g + "}";
        }

        @Override // d0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f967g));
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private static class q extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f968a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f969b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f970c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f971d;

        /* renamed from: e, reason: collision with root package name */
        private final int f972e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f973f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f972e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f969b = new Rect();
            this.f971d = new Rect();
            this.f970c = new Rect();
            a(rect, rect2);
            this.f968a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f969b.set(rect);
            this.f971d.set(rect);
            Rect rect3 = this.f971d;
            int i10 = this.f972e;
            rect3.inset(-i10, -i10);
            this.f970c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float f10;
            int i10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f973f;
                    if (z11 && !this.f971d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f973f;
                        this.f973f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f969b.contains(x10, y10)) {
                    this.f973f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f970c.contains(x10, y10)) {
                Rect rect = this.f970c;
                f10 = x10 - rect.left;
                i10 = y10 - rect.top;
            } else {
                f10 = this.f968a.getWidth() / 2;
                i10 = this.f968a.getHeight() / 2;
            }
            motionEvent.setLocation(f10, i10);
            return this.f968a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f924r0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f928d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f932h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f931g0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int i11;
        String o10;
        try {
            String o11 = a1.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f931g0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = a1.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f931g0.getSuggestIntentData();
            }
            if (o12 != null && (o10 = a1.o(cursor, "suggest_intent_data_id")) != null) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            return C(str2, o12 == null ? null : Uri.parse(o12), a1.o(cursor, "suggest_intent_extra_data"), a1.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f932h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f942t.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.F);
        getLocationInWindow(this.G);
        int[] iArr = this.F;
        int i10 = iArr[1];
        int[] iArr2 = this.G;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.Q || this.I == null) {
            return charSequence;
        }
        int textSize = (int) (this.f942t.getTextSize() * 1.25d);
        this.I.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.I), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f931g0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f931g0.getVoiceSearchLaunchWebSearch() ? this.L : this.f931g0.getVoiceSearchLaunchRecognizer() ? this.M : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.T || this.f926b0) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor b10 = this.S.b();
        if (b10 == null || !b10.moveToPosition(i10)) {
            return false;
        }
        O(D(b10, i11, str));
        return true;
    }

    private void b0() {
        post(this.f933i0);
    }

    private void c0(int i10) {
        CharSequence c10;
        Editable text = this.f942t.getText();
        Cursor b10 = this.S.b();
        if (b10 == null) {
            return;
        }
        if (!b10.moveToPosition(i10) || (c10 = this.S.c(b10)) == null) {
            setQuery(text);
        } else {
            setQuery(c10);
        }
    }

    private void e0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f942t.getText());
        if (!z11 && (!this.Q || this.f929e0)) {
            z10 = false;
        }
        this.f948z.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.f948z.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f942t;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(f.d.f10055e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(f.d.f10056f);
    }

    private void h0() {
        this.f942t.setThreshold(this.f931g0.getSuggestThreshold());
        this.f942t.setImeOptions(this.f931g0.getImeOptions());
        int inputType = this.f931g0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f931g0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f942t.setInputType(inputType);
        b0.a aVar = this.S;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f931g0.getSuggestAuthority() != null) {
            a1 a1Var = new a1(getContext(), this, this.f931g0, this.f935k0);
            this.S = a1Var;
            this.f942t.setAdapter(a1Var);
            ((a1) this.S).x(this.V ? 2 : 1);
        }
    }

    private void i0() {
        this.f945w.setVisibility((N() && (this.f947y.getVisibility() == 0 || this.A.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z10) {
        this.f947y.setVisibility((this.T && N() && hasFocus() && (z10 || !this.f926b0)) ? 0 : 8);
    }

    private void k0(boolean z10) {
        this.R = z10;
        int i10 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f942t.getText());
        this.f946x.setVisibility(i10);
        j0(z11);
        this.f943u.setVisibility(z10 ? 8 : 0);
        this.H.setVisibility((this.H.getDrawable() == null || this.Q) ? 8 : 0);
        e0();
        l0(!z11);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.f926b0 && !L() && z10) {
            this.f947y.setVisibility(8);
            i10 = 0;
        }
        this.A.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f942t.setText(charSequence);
        this.f942t.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.B.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f944v.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = q1.b(this);
            int dimensionPixelSize = this.Q ? resources.getDimensionPixelSize(f.d.f10053c) + resources.getDimensionPixelSize(f.d.f10054d) : 0;
            this.f942t.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.f942t.setDropDownHorizontalOffset(b10 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.f942t.setDropDownWidth((((this.B.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f942t);
            return;
        }
        o oVar = f924r0;
        oVar.b(this.f942t);
        oVar.a(this.f942t);
    }

    public boolean L() {
        return this.R;
    }

    void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void R() {
        if (!TextUtils.isEmpty(this.f942t.getText())) {
            this.f942t.setText("");
            this.f942t.requestFocus();
            this.f942t.setImeVisibility(true);
        } else if (this.Q) {
            clearFocus();
            k0(true);
        }
    }

    boolean S(int i10, int i11, String str) {
        Q(i10, 0, null);
        this.f942t.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i10) {
        c0(i10);
        return true;
    }

    protected void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f942t.requestFocus();
        this.f942t.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.f942t.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f931g0 != null) {
            P(0, null, text.toString());
        }
        this.f942t.setImeVisibility(false);
        G();
    }

    boolean X(View view, int i10, KeyEvent keyEvent) {
        if (this.f931g0 != null && this.S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.f942t.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f942t.setSelection(i10 == 21 ? 0 : this.f942t.length());
                this.f942t.setListSelection(0);
                this.f942t.clearListSelection();
                this.f942t.b();
                return true;
            }
            if (i10 == 19) {
                this.f942t.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.f942t.getText();
        this.f928d0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        j0(z10);
        l0(!z10);
        e0();
        i0();
        this.f927c0 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.f942t.hasFocus()) {
            H();
        }
    }

    void a0() {
        Intent E;
        SearchableInfo searchableInfo = this.f931g0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                E = F(this.L, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                E = E(this.M, searchableInfo);
            }
            getContext().startActivity(E);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f929e0) {
            return;
        }
        this.f929e0 = true;
        int imeOptions = this.f942t.getImeOptions();
        this.f930f0 = imeOptions;
        this.f942t.setImeOptions(imeOptions | 33554432);
        this.f942t.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.f942t.clearFocus();
        this.f942t.setImeVisibility(false);
        this.W = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.f942t.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f942t;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f928d0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // androidx.appcompat.view.c
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f942t.setImeOptions(this.f930f0);
        this.f929e0 = false;
    }

    void f0() {
        int[] iArr = this.f942t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f944v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f945w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f942t.getImeOptions();
    }

    public int getInputType() {
        return this.f942t.getInputType();
    }

    public int getMaxWidth() {
        return this.f925a0;
    }

    public CharSequence getQuery() {
        return this.f942t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f931g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.N : getContext().getText(this.f931g0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.K;
    }

    int getSuggestionRowLayout() {
        return this.J;
    }

    public b0.a getSuggestionsAdapter() {
        return this.S;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f933i0);
        post(this.f934j0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.s0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.f942t, this.D);
            Rect rect = this.E;
            Rect rect2 = this.D;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.C;
            if (qVar != null) {
                qVar.a(this.E, this.D);
                return;
            }
            q qVar2 = new q(this.E, this.D, this.f942t);
            this.C = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // androidx.appcompat.widget.s0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.L()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f925a0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f925a0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f925a0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        k0(pVar.f967g);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f967g = L();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f942t.requestFocus(i10, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f932h0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        k0(z10);
        g0();
    }

    public void setImeOptions(int i10) {
        this.f942t.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f942t.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f925a0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.V = z10;
        b0.a aVar = this.S;
        if (aVar instanceof a1) {
            ((a1) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f931g0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.f926b0 = K;
        if (K) {
            this.f942t.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.T = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(b0.a aVar) {
        this.S = aVar;
        this.f942t.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.f933i0 = new b();
        this.f934j0 = new c();
        this.f935k0 = new WeakHashMap();
        f fVar = new f();
        this.f936l0 = fVar;
        this.f937m0 = new g();
        h hVar = new h();
        this.f938n0 = hVar;
        i iVar = new i();
        this.f939o0 = iVar;
        j jVar = new j();
        this.f940p0 = jVar;
        this.f941q0 = new a();
        int[] iArr = f.j.f10225n2;
        f1 v10 = f1.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.h0.q0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        LayoutInflater.from(context).inflate(v10.n(f.j.f10275x2, f.g.f10133r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(f.f.D);
        this.f942t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f943u = findViewById(f.f.f10115z);
        View findViewById = findViewById(f.f.C);
        this.f944v = findViewById;
        View findViewById2 = findViewById(f.f.J);
        this.f945w = findViewById2;
        ImageView imageView = (ImageView) findViewById(f.f.f10113x);
        this.f946x = imageView;
        ImageView imageView2 = (ImageView) findViewById(f.f.A);
        this.f947y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(f.f.f10114y);
        this.f948z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(f.f.E);
        this.A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(f.f.B);
        this.H = imageView5;
        androidx.core.view.h0.w0(findViewById, v10.g(f.j.f10280y2));
        androidx.core.view.h0.w0(findViewById2, v10.g(f.j.C2));
        int i11 = f.j.B2;
        imageView.setImageDrawable(v10.g(i11));
        imageView2.setImageDrawable(v10.g(f.j.f10265v2));
        imageView3.setImageDrawable(v10.g(f.j.f10250s2));
        imageView4.setImageDrawable(v10.g(f.j.E2));
        imageView5.setImageDrawable(v10.g(i11));
        this.I = v10.g(f.j.A2);
        k1.a(imageView, getResources().getString(f.h.f10149n));
        this.J = v10.n(f.j.D2, f.g.f10132q);
        this.K = v10.n(f.j.f10255t2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f941q0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f937m0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v10.a(f.j.f10270w2, true));
        int f10 = v10.f(f.j.f10235p2, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.N = v10.p(f.j.f10260u2);
        this.U = v10.p(f.j.f10285z2);
        int k10 = v10.k(f.j.f10245r2, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v10.k(f.j.f10240q2, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v10.a(f.j.f10230o2, true));
        v10.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.M = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.Q);
        g0();
    }
}