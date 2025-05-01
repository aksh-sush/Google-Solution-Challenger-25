package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.s0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f272a;

    /* renamed from: b, reason: collision with root package name */
    final x f273b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f274c;

    /* renamed from: d, reason: collision with root package name */
    private final int f275d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f276e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f277f;

    /* renamed from: g, reason: collision with root package name */
    ListView f278g;

    /* renamed from: h, reason: collision with root package name */
    private View f279h;

    /* renamed from: i, reason: collision with root package name */
    private int f280i;

    /* renamed from: j, reason: collision with root package name */
    private int f281j;

    /* renamed from: k, reason: collision with root package name */
    private int f282k;

    /* renamed from: l, reason: collision with root package name */
    private int f283l;

    /* renamed from: m, reason: collision with root package name */
    private int f284m;

    /* renamed from: o, reason: collision with root package name */
    Button f286o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f287p;

    /* renamed from: q, reason: collision with root package name */
    Message f288q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f289r;

    /* renamed from: s, reason: collision with root package name */
    Button f290s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f291t;

    /* renamed from: u, reason: collision with root package name */
    Message f292u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f293v;

    /* renamed from: w, reason: collision with root package name */
    Button f294w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f295x;

    /* renamed from: y, reason: collision with root package name */
    Message f296y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f297z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f285n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: e, reason: collision with root package name */
        private final int f298e;

        /* renamed from: f, reason: collision with root package name */
        private final int f299f;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f10210k2);
            this.f299f = obtainStyledAttributes.getDimensionPixelOffset(f.j.f10215l2, -1);
            this.f298e = obtainStyledAttributes.getDimensionPixelOffset(f.j.f10220m2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f298e, getPaddingRight(), z11 ? getPaddingBottom() : this.f299f);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f286o || (message2 = alertController.f288q) == null) && (view != alertController.f290s || (message2 = alertController.f292u) == null)) ? (view != alertController.f294w || (message = alertController.f296y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f273b).sendToTarget();
        }
    }

    class b implements NestedScrollView.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f301a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f302b;

        b(View view, View view2) {
            this.f301a = view;
            this.f302b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.f(nestedScrollView, this.f301a, this.f302b);
        }
    }

    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f304e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f305f;

        c(View view, View view2) {
            this.f304e = view;
            this.f305f = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.A, this.f304e, this.f305f);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f307a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f308b;

        d(View view, View view2) {
            this.f307a = view;
            this.f308b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.f(absListView, this.f307a, this.f308b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    class e implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f310e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f311f;

        e(View view, View view2) {
            this.f310e = view;
            this.f311f = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.f278g, this.f310e, this.f311f);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* renamed from: a, reason: collision with root package name */
        public final Context f313a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f314b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f316d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f318f;

        /* renamed from: g, reason: collision with root package name */
        public View f319g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f320h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f321i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f322j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f323k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f324l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f325m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f326n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f327o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f328p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f329q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f331s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f332t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f333u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f334v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f335w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f336x;

        /* renamed from: y, reason: collision with root package name */
        public int f337y;

        /* renamed from: z, reason: collision with root package name */
        public View f338z;

        /* renamed from: c, reason: collision with root package name */
        public int f315c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f317e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f330r = true;

        class a extends ArrayAdapter {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ RecycleListView f339e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f339e = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f339e.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* renamed from: e, reason: collision with root package name */
            private final int f341e;

            /* renamed from: f, reason: collision with root package name */
            private final int f342f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ RecycleListView f343g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ AlertController f344h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f343g = recycleListView;
                this.f344h = alertController;
                Cursor cursor2 = getCursor();
                this.f341e = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f342f = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f341e));
                this.f343g.setItemChecked(cursor.getPosition(), cursor.getInt(this.f342f) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f314b.inflate(this.f344h.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AlertController f346e;

            c(AlertController alertController) {
                this.f346e = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                f.this.f336x.onClick(this.f346e.f273b, i10);
                if (f.this.H) {
                    return;
                }
                this.f346e.f273b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ RecycleListView f348e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AlertController f349f;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f348e = recycleListView;
                this.f349f = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f348e.isItemChecked(i10);
                }
                f.this.J.onClick(this.f349f.f273b, i10, this.f348e.isItemChecked(i10));
            }
        }

        public f(Context context) {
            this.f313a = context;
            this.f314b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(androidx.appcompat.app.AlertController r10) {
            /*
                r9 = this;
                android.view.LayoutInflater r0 = r9.f314b
                int r1 = r10.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r9.G
                if (r1 == 0) goto L34
                android.database.Cursor r1 = r9.K
                if (r1 != 0) goto L25
                androidx.appcompat.app.AlertController$f$a r8 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r9.f313a
                int r4 = r10.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r9.f334v
                r1 = r8
                r2 = r9
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L68
            L25:
                androidx.appcompat.app.AlertController$f$b r8 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r9.f313a
                android.database.Cursor r4 = r9.K
                r5 = 0
                r1 = r8
                r2 = r9
                r6 = r0
                r7 = r10
                r1.<init>(r3, r4, r5, r6, r7)
                goto L68
            L34:
                boolean r1 = r9.H
                if (r1 == 0) goto L3b
                int r1 = r10.N
                goto L3d
            L3b:
                int r1 = r10.O
            L3d:
                r4 = r1
                android.database.Cursor r1 = r9.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5a
                android.widget.SimpleCursorAdapter r8 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r9.f313a
                android.database.Cursor r5 = r9.K
                java.lang.String r1 = r9.L
                java.lang.String[] r6 = new java.lang.String[]{r1}
                int[] r7 = new int[]{r2}
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                goto L68
            L5a:
                android.widget.ListAdapter r8 = r9.f335w
                if (r8 == 0) goto L5f
                goto L68
            L5f:
                androidx.appcompat.app.AlertController$h r8 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r9.f313a
                java.lang.CharSequence[] r3 = r9.f334v
                r8.<init>(r1, r4, r2, r3)
            L68:
                r10.H = r8
                int r1 = r9.I
                r10.I = r1
                android.content.DialogInterface$OnClickListener r1 = r9.f336x
                if (r1 == 0) goto L7b
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r10)
            L77:
                r0.setOnItemClickListener(r1)
                goto L85
            L7b:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r9.J
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r10)
                goto L77
            L85:
                android.widget.AdapterView$OnItemSelectedListener r1 = r9.N
                if (r1 == 0) goto L8c
                r0.setOnItemSelectedListener(r1)
            L8c:
                boolean r1 = r9.H
                if (r1 == 0) goto L95
                r1 = 1
            L91:
                r0.setChoiceMode(r1)
                goto L9b
            L95:
                boolean r1 = r9.G
                if (r1 == 0) goto L9b
                r1 = 2
                goto L91
            L9b:
                r10.f278g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f319g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f318f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f316d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f315c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f317e;
                if (i11 != 0) {
                    alertController.m(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f320h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f321i;
            if (charSequence3 != null || this.f322j != null) {
                alertController.k(-1, charSequence3, this.f323k, null, this.f322j);
            }
            CharSequence charSequence4 = this.f324l;
            if (charSequence4 != null || this.f325m != null) {
                alertController.k(-2, charSequence4, this.f326n, null, this.f325m);
            }
            CharSequence charSequence5 = this.f327o;
            if (charSequence5 != null || this.f328p != null) {
                alertController.k(-3, charSequence5, this.f329q, null, this.f328p);
            }
            if (this.f334v != null || this.K != null || this.f335w != null) {
                b(alertController);
            }
            View view2 = this.f338z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i12 = this.f337y;
            if (i12 != 0) {
                alertController.r(i12);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f351a;

        public g(DialogInterface dialogInterface) {
            this.f351a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f351a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, x xVar, Window window) {
        this.f272a = context;
        this.f273b = xVar;
        this.f274c = window;
        this.R = new g(xVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.j.F, f.a.f10026k, 0);
        this.J = obtainStyledAttributes.getResourceId(f.j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(f.j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(f.j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(f.j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(f.j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(f.j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(f.j.M, true);
        this.f275d = obtainStyledAttributes.getDimensionPixelSize(f.j.H, 0);
        obtainStyledAttributes.recycle();
        xVar.i(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        return (i10 != 0 && this.Q == 1) ? i10 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View view2;
        Runnable eVar;
        View findViewById = this.f274c.findViewById(f.f.f10111v);
        View findViewById2 = this.f274c.findViewById(f.f.f10110u);
        if (Build.VERSION.SDK_INT < 23) {
            if (findViewById != null && (i10 & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i10 & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById == null && findViewById2 == null) {
                return;
            }
            if (this.f277f != null) {
                this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
                view2 = this.A;
                eVar = new c(findViewById, findViewById2);
            } else {
                ListView listView = this.f278g;
                if (listView != null) {
                    listView.setOnScrollListener(new d(findViewById, findViewById2));
                    view2 = this.f278g;
                    eVar = new e(findViewById, findViewById2);
                } else {
                    if (findViewById != null) {
                        viewGroup.removeView(findViewById);
                    }
                    if (findViewById2 == null) {
                        return;
                    }
                }
            }
            view2.post(eVar);
            return;
        }
        androidx.core.view.h0.I0(view, i10, i11);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 == null) {
            return;
        }
        viewGroup.removeView(findViewById2);
    }

    private void u(ViewGroup viewGroup) {
        int i10;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f286o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f287p) && this.f289r == null) {
            this.f286o.setVisibility(8);
            i10 = 0;
        } else {
            this.f286o.setText(this.f287p);
            Drawable drawable = this.f289r;
            if (drawable != null) {
                int i11 = this.f275d;
                drawable.setBounds(0, 0, i11, i11);
                this.f286o.setCompoundDrawables(this.f289r, null, null, null);
            }
            this.f286o.setVisibility(0);
            i10 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f290s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f291t) && this.f293v == null) {
            this.f290s.setVisibility(8);
        } else {
            this.f290s.setText(this.f291t);
            Drawable drawable2 = this.f293v;
            if (drawable2 != null) {
                int i12 = this.f275d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f290s.setCompoundDrawables(this.f293v, null, null, null);
            }
            this.f290s.setVisibility(0);
            i10 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f294w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f295x) && this.f297z == null) {
            this.f294w.setVisibility(8);
        } else {
            this.f294w.setText(this.f295x);
            Drawable drawable3 = this.f297z;
            if (drawable3 != null) {
                int i13 = this.f275d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f294w.setCompoundDrawables(this.f297z, null, null, null);
            }
            this.f294w.setVisibility(0);
            i10 |= 4;
        }
        if (z(this.f272a)) {
            if (i10 == 1) {
                button = this.f286o;
            } else if (i10 == 2) {
                button = this.f290s;
            } else if (i10 == 4) {
                button = this.f294w;
            }
            b(button);
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f274c.findViewById(f.f.f10112w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f277f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f278g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f278g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f279h;
        if (view == null) {
            view = this.f280i != 0 ? LayoutInflater.from(this.f272a).inflate(this.f280i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !a(view)) {
            this.f274c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f274c.findViewById(f.f.f10103n);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f285n) {
            frameLayout.setPadding(this.f281j, this.f282k, this.f283l, this.f284m);
        }
        if (this.f278g != null) {
            ((LinearLayout.LayoutParams) ((s0.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.View] */
    private void x(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            viewGroup2 = this.f274c.findViewById(f.f.O);
        } else {
            this.D = (ImageView) this.f274c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(this.f276e)) && this.P) {
                TextView textView = (TextView) this.f274c.findViewById(f.f.f10099j);
                this.E = textView;
                textView.setText(this.f276e);
                int i10 = this.B;
                if (i10 != 0) {
                    this.D.setImageResource(i10);
                    return;
                }
                Drawable drawable = this.C;
                if (drawable != null) {
                    this.D.setImageDrawable(drawable);
                    return;
                } else {
                    this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                    this.D.setVisibility(8);
                    return;
                }
            }
            this.f274c.findViewById(f.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup2 = viewGroup;
        }
        viewGroup2.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y() {
        /*
            r8 = this;
            android.view.Window r0 = r8.f274c
            int r1 = f.f.f10109t
            android.view.View r0 = r0.findViewById(r1)
            int r1 = f.f.P
            android.view.View r2 = r0.findViewById(r1)
            int r3 = f.f.f10102m
            android.view.View r4 = r0.findViewById(r3)
            int r5 = f.f.f10100k
            android.view.View r6 = r0.findViewById(r5)
            int r7 = f.f.f10104o
            android.view.View r0 = r0.findViewById(r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.w(r0)
            android.view.View r1 = r0.findViewById(r1)
            android.view.View r3 = r0.findViewById(r3)
            android.view.View r5 = r0.findViewById(r5)
            android.view.ViewGroup r1 = r8.i(r1, r2)
            android.view.ViewGroup r2 = r8.i(r3, r4)
            android.view.ViewGroup r3 = r8.i(r5, r6)
            r8.v(r2)
            r8.u(r3)
            r8.x(r1)
            int r0 = r0.getVisibility()
            r4 = 8
            r5 = 1
            r6 = 0
            if (r0 == r4) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = 0
        L53:
            if (r1 == 0) goto L5d
            int r7 = r1.getVisibility()
            if (r7 == r4) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            if (r3 == 0) goto L68
            int r3 = r3.getVisibility()
            if (r3 == r4) goto L68
            r3 = 1
            goto L69
        L68:
            r3 = 0
        L69:
            if (r3 != 0) goto L78
            if (r2 == 0) goto L78
            int r4 = f.f.K
            android.view.View r4 = r2.findViewById(r4)
            if (r4 == 0) goto L78
            r4.setVisibility(r6)
        L78:
            if (r7 == 0) goto L95
            androidx.core.widget.NestedScrollView r4 = r8.A
            if (r4 == 0) goto L81
            r4.setClipToPadding(r5)
        L81:
            java.lang.CharSequence r4 = r8.f277f
            if (r4 != 0) goto L8c
            android.widget.ListView r4 = r8.f278g
            if (r4 == 0) goto L8a
            goto L8c
        L8a:
            r1 = 0
            goto L92
        L8c:
            int r4 = f.f.N
            android.view.View r1 = r1.findViewById(r4)
        L92:
            if (r1 == 0) goto La2
            goto L9f
        L95:
            if (r2 == 0) goto La2
            int r1 = f.f.L
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto La2
        L9f:
            r1.setVisibility(r6)
        La2:
            android.widget.ListView r1 = r8.f278g
            boolean r4 = r1 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r4 == 0) goto Lad
            androidx.appcompat.app.AlertController$RecycleListView r1 = (androidx.appcompat.app.AlertController.RecycleListView) r1
            r1.a(r7, r3)
        Lad:
            if (r0 != 0) goto Lc1
            android.widget.ListView r0 = r8.f278g
            if (r0 == 0) goto Lb4
            goto Lb6
        Lb4:
            androidx.core.widget.NestedScrollView r0 = r8.A
        Lb6:
            if (r0 == 0) goto Lc1
            if (r3 == 0) goto Lbb
            r6 = 2
        Lbb:
            r1 = r7 | r6
            r3 = 3
            r8.p(r2, r0, r1, r3)
        Lc1:
            android.widget.ListView r0 = r8.f278g
            if (r0 == 0) goto Ld7
            android.widget.ListAdapter r1 = r8.H
            if (r1 == 0) goto Ld7
            r0.setAdapter(r1)
            int r1 = r8.I
            r2 = -1
            if (r1 <= r2) goto Ld7
            r0.setItemChecked(r1, r5)
            r0.setSelection(r1)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.y():void");
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f10025j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f272a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f278g;
    }

    public void e() {
        this.f273b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f295x = charSequence;
            this.f296y = message;
            this.f297z = drawable;
        } else if (i10 == -2) {
            this.f291t = charSequence;
            this.f292u = message;
            this.f293v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f287p = charSequence;
            this.f288q = message;
            this.f289r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f277f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f276e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f279h = null;
        this.f280i = i10;
        this.f285n = false;
    }

    public void s(View view) {
        this.f279h = view;
        this.f280i = 0;
        this.f285n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f279h = view;
        this.f280i = 0;
        this.f285n = true;
        this.f281j = i10;
        this.f282k = i11;
        this.f283l = i12;
        this.f284m = i13;
    }
}