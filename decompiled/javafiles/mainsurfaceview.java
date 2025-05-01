package io.swar.alap;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewTreeObserver;
import com.google.common.collect.e;
import com.google.common.collect.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Timer;
import java.util.TimerTask;
import oa.s;

/* loaded from: classes.dex */
public class MainSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: s0, reason: collision with root package name */
    private static String[] f12457s0;

    /* renamed from: v0, reason: collision with root package name */
    private static final String[] f12460v0;

    /* renamed from: w0, reason: collision with root package name */
    private static String[] f12461w0;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private SurfaceHolder K;
    private boolean L;
    private boolean M;
    private boolean N;
    private int O;
    private int P;
    private Paint Q;
    Path R;
    private double[] S;
    private int T;
    private float U;
    private float[] V;
    private float W;

    /* renamed from: a0, reason: collision with root package name */
    private int f12465a0;

    /* renamed from: b0, reason: collision with root package name */
    private Timer f12466b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f12467c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f12468d0;

    /* renamed from: e, reason: collision with root package name */
    private String f12469e;

    /* renamed from: e0, reason: collision with root package name */
    private int f12470e0;

    /* renamed from: f, reason: collision with root package name */
    private int f12471f;

    /* renamed from: f0, reason: collision with root package name */
    private int f12472f0;

    /* renamed from: g, reason: collision with root package name */
    private int f12473g;

    /* renamed from: g0, reason: collision with root package name */
    private float f12474g0;

    /* renamed from: h, reason: collision with root package name */
    private FirebaseAnalytics f12475h;

    /* renamed from: h0, reason: collision with root package name */
    private float f12476h0;

    /* renamed from: i, reason: collision with root package name */
    private oa.a f12477i;

    /* renamed from: i0, reason: collision with root package name */
    float f12478i0;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12479j;

    /* renamed from: j0, reason: collision with root package name */
    private float f12480j0;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12481k;

    /* renamed from: k0, reason: collision with root package name */
    float f12482k0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12483l;

    /* renamed from: l0, reason: collision with root package name */
    float f12484l0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12485m;

    /* renamed from: m0, reason: collision with root package name */
    private float f12486m0;

    /* renamed from: n, reason: collision with root package name */
    private int f12487n;

    /* renamed from: n0, reason: collision with root package name */
    boolean f12488n0;

    /* renamed from: o, reason: collision with root package name */
    private int f12489o;

    /* renamed from: o0, reason: collision with root package name */
    private float f12490o0;

    /* renamed from: p, reason: collision with root package name */
    private float f12491p;

    /* renamed from: p0, reason: collision with root package name */
    private float f12492p0;

    /* renamed from: q, reason: collision with root package name */
    private int[] f12493q;

    /* renamed from: r, reason: collision with root package name */
    private int f12494r;

    /* renamed from: s, reason: collision with root package name */
    private int[] f12495s;

    /* renamed from: t, reason: collision with root package name */
    private int f12496t;

    /* renamed from: u, reason: collision with root package name */
    private int f12497u;

    /* renamed from: v, reason: collision with root package name */
    private int f12498v;

    /* renamed from: w, reason: collision with root package name */
    private int f12499w;

    /* renamed from: x, reason: collision with root package name */
    private int f12500x;

    /* renamed from: y, reason: collision with root package name */
    private int f12501y;

    /* renamed from: z, reason: collision with root package name */
    private int f12502z;

    /* renamed from: q0, reason: collision with root package name */
    private static final String[] f12455q0 = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};

    /* renamed from: r0, reason: collision with root package name */
    private static final String[] f12456r0 = {"C - White 1", "C#- Black 1", "D - White 2", "D# - Black 2", "E", "F", "F#", "G", "G#", "A", "A#", "B"};

    /* renamed from: t0, reason: collision with root package name */
    private static int f12458t0 = 35;

    /* renamed from: u0, reason: collision with root package name */
    private static final String[] f12459u0 = {"", "♯", "", "♯", "", "", "♯", "", "♯", "", "♯", ""};

    /* renamed from: x0, reason: collision with root package name */
    private static int f12462x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    private static int f12463y0 = 3;

    /* renamed from: z0, reason: collision with root package name */
    private static float f12464z0 = 35 + 16.0f;
    private static e A0 = e.A(new t.a().b("C", "C", "Sa").b("C#", "C", "re").b("D", "C", "Re").b("D#", "C", "ga").b("E", "C", "Ga").b("F", "C", "ma").b("F#", "C", "Ma").b("G", "C", "Pa").b("G#", "C", "da").b("A", "C", "Da").b("A#", "C", "ni").b("B", "C", "Ni").b("C#", "C#", "Sa").b("D", "C#", "re").b("D#", "C#", "Re").b("E", "C#", "ga").b("F", "C#", "Ga").b("F#", "C#", "ma").b("G", "C#", "Ma").b("G#", "C#", "Pa").b("A", "C#", "da").b("A#", "C#", "Da").b("B", "C#", "ni").b("C", "C#", "Ni").b("D", "D", "Sa").b("D#", "D", "re").b("E", "D", "Re").b("F", "D", "ga").b("F#", "D", "Ga").b("G", "D", "ma").b("G#", "D", "Ma").b("A", "D", "Pa").b("A#", "D", "da").b("B", "D", "Da").b("C", "D", "ni").b("C#", "D", "Ni").b("D#", "D#", "Sa").b("E", "D#", "re").b("F", "D#", "Re").b("F#", "D#", "ga").b("G", "D#", "Ga").b("G#", "D#", "ma").b("A", "D#", "Ma").b("A#", "D#", "Pa").b("B", "D#", "da").b("C", "D#", "Da").b("C#", "D#", "ni").b("D", "D#", "Ni").b("E", "E", "Sa").b("F", "E", "re").b("F#", "E", "Re").b("G", "E", "ga").b("G#", "E", "Ga").b("A", "E", "ma").b("A#", "E", "Ma").b("B", "E", "Pa").b("C", "E", "da").b("C#", "E", "Da").b("D", "E", "ni").b("D#", "E", "Ni").b("F", "F", "Sa").b("F#", "F", "re").b("G", "F", "Re").b("G#", "F", "ga").b("A", "F", "Ga").b("A#", "F", "ma").b("B", "F", "Ma").b("C", "F", "Pa").b("C#", "F", "da").b("D", "F", "Da").b("D#", "F", "ni").b("E", "F", "Ni").b("F#", "F#", "Sa").b("G", "F#", "re").b("G#", "F#", "Re").b("A", "F#", "ga").b("A#", "F#", "Ga").b("B", "F#", "ma").b("C", "F#", "Ma").b("C#", "F#", "Pa").b("D", "F#", "da").b("D#", "F#", "Da").b("E", "F#", "ni").b("F", "F#", "Ni").b("G", "G", "Sa").b("G#", "G", "re").b("A", "G", "Re").b("A#", "G", "ga").b("B", "G", "Ga").b("C", "G", "ma").b("C#", "G", "Ma").b("D", "G", "Pa").b("D#", "G", "da").b("E", "G", "Da").b("F", "G", "ni").b("F#", "G", "Ni").b("G#", "G#", "Sa").b("A", "G#", "re").b("A#", "G#", "Re").b("B", "G#", "ga").b("C", "G#", "Ga").b("C#", "G#", "ma").b("D", "G#", "Ma").b("D#", "G#", "Pa").b("E", "G#", "da").b("F", "G#", "Da").b("F#", "G#", "ni").b("G", "G#", "Ni").b("A", "A", "Sa").b("A#", "A", "re").b("B", "A", "Re").b("C", "A", "ga").b("C#", "A", "Ga").b("D", "A", "ma").b("D#", "A", "Ma").b("E", "A", "Pa").b("F", "A", "da").b("F#", "A", "Da").b("G", "A", "ni").b("G#", "A", "Ni").b("A#", "A#", "Sa").b("B", "A#", "re").b("C", "A#", "Re").b("C#", "A#", "ga").b("D", "A#", "Ga").b("D#", "A#", "ma").b("E", "A#", "Ma").b("F", "A#", "Pa").b("F#", "A#", "da").b("G", "A#", "Da").b("G#", "A#", "ni").b("A", "A#", "Ni").b("B", "B", "Sa").b("C", "B", "re").b("C#", "B", "Re").b("D", "B", "ga").b("D#", "B", "Ga").b("E", "B", "maa").b("F", "B", "Maa").b("F#", "B", "Pa").b("G", "B", "da").b("G#", "B", "Da").b("A", "B", "ni").b("A#", "B", "Nii").a());

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            MainSurfaceView.this.c();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            MainSurfaceView.this.d();
        }
    }

    static {
        String[] strArr = {"C", "C", "D", "D", "E", "F", "F", "G", "G", "A", "A", "B"};
        f12460v0 = strArr;
        f12461w0 = strArr;
    }

    public MainSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12469e = "C";
        this.f12471f = 0;
        this.f12473g = 3;
        this.f12493q = new int[]{-1};
        this.f12494r = getResources().getColor(R.color.tonicNoteColor);
        this.f12495s = new int[]{-1, -65536, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.f12496t = -65536;
        this.f12497u = getResources().getColor(R.color.yAxisColor);
        this.f12498v = getResources().getColor(R.color.pitchColor);
        this.f12499w = -1;
        this.f12500x = getResources().getColor(R.color.darkGreen);
        this.f12501y = getResources().getColor(R.color.lightGreen);
        this.f12502z = getResources().getColor(R.color.yellow);
        this.A = getResources().getColor(R.color.orange);
        this.B = -256;
        this.C = this.f12494r;
        this.D = -1;
        this.E = -65536;
        this.f12484l0 = 0.0f;
        this.f12486m0 = 300.0f;
        this.f12488n0 = false;
        this.f12492p0 = -30.0f;
        this.Q = new Paint(1);
        this.W = 1.0f;
        this.f12480j0 = 0.42666668f;
        this.f12487n = 2400;
        this.f12470e0 = 0;
        this.f12472f0 = 2;
        this.f12490o0 = 2.0f;
        this.V = new float[((int) (800.0f - f12464z0)) * 4];
        this.f12483l = false;
        this.f12481k = false;
        this.L = true;
        this.P = 1;
        this.f12491p = 0.0f;
        this.f12479j = false;
        this.F = true;
        this.G = true;
        this.H = false;
        this.J = true;
        this.f12467c0 = false;
        this.f12468d0 = s.f14453a;
        this.f12489o = 0;
        this.I = true;
        this.O = 0;
        this.f12465a0 = 12 - this.f12471f;
        this.N = true;
        this.M = false;
        this.S = new double[3];
        this.T = 0;
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f12476h0 = getWidth() > getHeight() ? 800.0f : 480.0f;
        this.f12484l0 = (getWidth() / this.W) - f12458t0;
        this.W = getWidth() / this.f12476h0;
        this.f12474g0 = getHeight() / this.W;
        this.f12478i0 = (this.f12476h0 / 2.0f) + 19.2f + this.f12492p0;
        this.f12482k0 = 54.0f;
        Path path = new Path();
        this.R = path;
        path.moveTo(this.f12478i0, this.f12482k0);
        this.R.lineTo(this.f12478i0 - 6.0f, this.f12482k0 - 5.0f);
        this.R.lineTo(this.f12478i0 + 6.0f, this.f12482k0 - 5.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.swar.alap.MainSurfaceView.d():void");
    }

    private void g(String str) {
        this.f12475h.logEvent(str, new Bundle());
    }

    private void i() {
        Timer timer = new Timer(true);
        this.f12466b0 = timer;
        timer.schedule(new b(), 33L, 33L);
    }

    private void j() {
        Timer timer = this.f12466b0;
        if (timer != null) {
            timer.cancel();
            this.f12466b0 = null;
        }
    }

    private void setSargamScale(MainSurfaceView mainSurfaceView) {
        f12457s0 = f12455q0;
    }

    public void e() {
        j();
    }

    public void f() {
        SurfaceHolder holder = getHolder();
        this.K = holder;
        holder.addCallback(this);
        setFocusable(true);
        requestFocus();
        this.Q.setTypeface(Typeface.MONOSPACE);
        this.f12475h = FirebaseAnalytics.getInstance(getContext());
    }

    public String[] getAllNotesForBadge() {
        return f12455q0;
    }

    public String[] getAllNotesForDropdown() {
        return f12455q0;
    }

    public float getCurrentVerticalZooming() {
        return this.f12480j0 / 0.42666668f;
    }

    public void h(int i10) {
        this.f12468d0 = i10;
    }

    public void k() {
        int i10 = this.f12468d0;
        this.f12468d0 = i10 == s.f14455c + (-1) ? s.f14453a : i10 + 1;
        SharedPreferences.Editor edit = getContext().getSharedPreferences(MainActivity.J, 0).edit();
        edit.putInt(MainActivity.R, this.f12468d0);
        edit.commit();
        g("scale_set_to_" + this.f12468d0);
    }

    public void l() {
        i();
    }

    public void m(int i10, boolean z10) {
        this.f12465a0 = i10;
        this.N = z10;
        this.M = false;
    }

    public void n(int i10, int i11) {
        this.f12469e = f12455q0[i10];
        this.f12473g = i11;
        this.f12471f = i10;
        m(i10, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r3 > (r4 * 0.42666668f)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r0 > 4800) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.swar.alap.MainSurfaceView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnalyzer(oa.a aVar) {
        this.f12477i = aVar;
    }

    public void setAutoScroll(Boolean bool) {
        this.f12479j = bool.booleanValue();
    }

    public void setIsRecording(boolean z10) {
        this.f12485m = z10;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        setSargamScale(this);
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
        c();
        i();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j();
    }
}