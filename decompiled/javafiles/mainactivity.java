package io.swar.alap;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import io.swar.alap.MainActivity;
import io.swar.alap.a;
import io.swar.alap.activities.FileManageActivity;
import io.swar.alap.activities.LoginActivity;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import l1.f;
import o2.d0;
import qb.h;
import t6.b;

/* loaded from: classes.dex */
public class MainActivity extends androidx.appcompat.app.d implements AdapterView.OnItemSelectedListener, a.c {
    public static String J = "MusicTest";
    public static String K = "tutorial_shown";
    public static int L = 0;
    public static int M = 1;
    public static int N = 2;
    public static String O = "selectedRememberPlayTanpura";
    public static String P = "selectedScaleOctave";
    public static String Q = "selectedScalePosition";
    public static String R = "selectedScaleType";
    public static String S = "selectedAutoScroll";
    public static String T = "selectedThreshold";
    public static String U = "tanpuraVolume";
    private static MediaPlayer V;
    private static MediaPlayer W;
    public h.g A;
    public h.g B;
    public h.g C;
    public h.g D;
    public h.g E;
    Handler F;
    Runnable G;

    /* renamed from: g, reason: collision with root package name */
    private FirebaseAuth f12409g;

    /* renamed from: i, reason: collision with root package name */
    private io.swar.alap.a f12411i;

    /* renamed from: j, reason: collision with root package name */
    private ImageButton f12412j;

    /* renamed from: k, reason: collision with root package name */
    private ImageButton f12413k;

    /* renamed from: l, reason: collision with root package name */
    private ImageButton f12414l;

    /* renamed from: n, reason: collision with root package name */
    private MainSurfaceView f12416n;

    /* renamed from: o, reason: collision with root package name */
    public Menu f12417o;

    /* renamed from: p, reason: collision with root package name */
    private Spinner f12418p;

    /* renamed from: q, reason: collision with root package name */
    private Toolbar f12419q;

    /* renamed from: r, reason: collision with root package name */
    public t6.b f12420r;

    /* renamed from: s, reason: collision with root package name */
    private WebView f12421s;

    /* renamed from: t, reason: collision with root package name */
    private FirebaseAnalytics f12422t;

    /* renamed from: v, reason: collision with root package name */
    private x6.m f12424v;

    /* renamed from: w, reason: collision with root package name */
    public h.g f12425w;

    /* renamed from: x, reason: collision with root package name */
    public h.g f12426x;

    /* renamed from: y, reason: collision with root package name */
    public h.g f12427y;

    /* renamed from: z, reason: collision with root package name */
    public h.g f12428z;

    /* renamed from: h, reason: collision with root package name */
    private oa.a f12410h = new oa.a();

    /* renamed from: m, reason: collision with root package name */
    final Handler f12415m = new Handler();

    /* renamed from: u, reason: collision with root package name */
    private int[] f12423u = new int[24];
    String H = "io.swar.taal";
    private w6.a I = new i();

    class a implements h.InterfaceC0284h {
        a() {
        }

        @Override // qb.h.InterfaceC0284h
        public void a(qb.h hVar, int i10) {
            if (i10 == 3) {
                MainActivity.this.A.Y();
            }
        }
    }

    class b implements h.InterfaceC0284h {
        b() {
        }

        @Override // qb.h.InterfaceC0284h
        public void a(qb.h hVar, int i10) {
            if (i10 == 3) {
                MainActivity.this.C.Y();
            }
        }
    }

    class c implements h.InterfaceC0284h {
        c() {
        }

        @Override // qb.h.InterfaceC0284h
        public void a(qb.h hVar, int i10) {
            if (i10 == 3) {
                MainActivity.this.E.Y();
            }
        }
    }

    class d implements h.InterfaceC0284h {
        d() {
        }

        @Override // qb.h.InterfaceC0284h
        public void a(qb.h hVar, int i10) {
            if (i10 == 3) {
                MainActivity.this.E.Y();
            }
        }
    }

    class e implements h.InterfaceC0284h {
        e() {
        }

        @Override // qb.h.InterfaceC0284h
        public void a(qb.h hVar, int i10) {
            if (i10 == 3) {
                MainActivity.this.f12427y.Y();
            }
        }
    }

    class f implements h.InterfaceC0284h {
        f() {
        }

        @Override // qb.h.InterfaceC0284h
        public void a(qb.h hVar, int i10) {
        }
    }

    class g implements SeekBar.OnSeekBarChangeListener {
        g() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            MainActivity.this.l1(i10);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    class h implements SeekBar.OnSeekBarChangeListener {
        h() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            MainActivity.this.k1(i10);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    class i implements w6.a {
        i() {
        }

        @Override // w6.a
        public void a(y6.b bVar, CompoundButton compoundButton, boolean z10) {
            if (!bVar.o(12)) {
                if (bVar.o(4)) {
                    MainActivity.this.g1(Boolean.valueOf(z10));
                    return;
                }
                return;
            }
            MainActivity.this.h1(z10 ? MainActivity.M : MainActivity.N);
            MainActivity mainActivity = MainActivity.this;
            if (!z10) {
                mainActivity.e1();
            } else {
                mainActivity.V0();
                MainActivity.this.G0();
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlayer mediaPlayer;
            try {
                try {
                    if (!MainActivity.V.isPlaying() && !MainActivity.W.isPlaying()) {
                        MainActivity.this.F.removeCallbacks(this);
                        return;
                    }
                    if (MainActivity.V.isPlaying()) {
                        if (!MainActivity.W.isPlaying()) {
                            Log.d("Handler", "run: mp2 not running, starting mp2");
                            mediaPlayer = MainActivity.W;
                        }
                        if (!MainActivity.V.isPlaying() || MainActivity.W.isPlaying()) {
                            MainActivity.this.F.postDelayed(this, 5500L);
                            Log.d("Handler", "run: running playMusic handler");
                        }
                        return;
                    }
                    Log.d("Handler", "run: mp1 not running, starting mp1");
                    mediaPlayer = MainActivity.V;
                    mediaPlayer.start();
                    if (MainActivity.V.isPlaying()) {
                    }
                    MainActivity.this.F.postDelayed(this, 5500L);
                    Log.d("Handler", "run: running playMusic handler");
                } catch (Exception unused) {
                    MainActivity.this.e1();
                    MainActivity.this.F.removeCallbacks(this);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                MainActivity.this.L0();
                MainActivity.this.k0();
            }
        }
    }

    class k implements ea.e {
        k() {
        }

        @Override // ea.e
        public void a(int i10) {
            Log.d(MainActivity.class.getName(), Integer.toString(i10));
        }
    }

    class l implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ImageButton f12440e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ImageButton f12441f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ImageButton f12442g;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MainActivity.this.H0();
                l.this.f12440e.setClickable(true);
                l.this.f12440e.setContentDescription("play");
                l lVar = l.this;
                lVar.f12440e.setColorFilter(MainActivity.this.getResources().getColor(R.color.activeColor));
                l.this.f12440e.setImageResource(R.drawable.ic_media_play);
                l.this.f12441f.setClickable(true);
                l.this.f12441f.clearColorFilter();
                l.this.f12442g.setClickable(false);
                l lVar2 = l.this;
                lVar2.f12442g.setColorFilter(MainActivity.this.getResources().getColor(R.color.inactiveColor));
            }
        }

        l(ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3) {
            this.f12440e = imageButton;
            this.f12441f = imageButton2;
            this.f12442g = imageButton3;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.f12415m.post(new a());
        }
    }

    class m implements f.g {
        m() {
        }

        @Override // l1.f.g
        public void a(l1.f fVar, l1.b bVar) {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.d1(mainActivity.getApplicationContext(), MainActivity.this.H);
        }
    }

    class n extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f12446a;

        n(Activity activity) {
            this.f12446a = activity;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            Toast.makeText(this.f12446a, str, 0).show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            int errorCode;
            CharSequence description;
            errorCode = webResourceError.getErrorCode();
            description = webResourceError.getDescription();
            onReceivedError(webView, errorCode, description.toString(), webResourceRequest.getUrl().toString());
        }
    }

    class o implements b.a {
        o() {
        }

        @Override // t6.b.a
        public boolean a(View view, int i10, y6.b bVar) {
            MainActivity mainActivity;
            String str;
            if (bVar.g() == 3) {
                MainActivity.this.f12416n.k();
                mainActivity = MainActivity.this;
                str = "indian_western_from_menu";
            } else {
                if (bVar.g() != 5) {
                    if (bVar.g() == 6) {
                        MainActivity.this.z0("tutorial_from_menu");
                        MainActivity.this.U0();
                        return true;
                    }
                    if (bVar.g() == 8) {
                        MainActivity.this.z0("rate_us_from_menu");
                        String packageName = MainActivity.this.getPackageName();
                        try {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
                            return true;
                        }
                    }
                    if (bVar.g() == 9) {
                        MainActivity.this.z0("modify_volume_threshold_from_menu");
                        MainActivity.this.g0();
                        return true;
                    }
                    if (bVar.g() == 10) {
                        MainActivity.this.z0("contact_us_from_menu");
                        return true;
                    }
                    if (bVar.g() == 11) {
                        MainActivity.this.z0("in_app_tutorial_from_menu");
                        MainActivity.this.f12420r.a();
                        MainActivity.this.b1();
                        return true;
                    }
                    if (bVar.g() == 13) {
                        MainActivity.this.z0("modify_tanpura_volume_from_menu");
                        MainActivity.this.h0();
                        return true;
                    }
                    if (bVar.g() == 14) {
                        MainActivity.this.z0("join_community_from_menu");
                        MainActivity.this.T0();
                        return true;
                    }
                    if (bVar.g() == 15) {
                        MainActivity.this.z0("play_table_tanpura_from_menu");
                        MainActivity.this.a1();
                        return true;
                    }
                    if (bVar.g() == 16) {
                        MainActivity.this.z0("load_recorded_files_from_menu");
                        MainActivity.this.W0();
                        return true;
                    }
                    if (bVar.g() == 17) {
                        MainActivity.this.Z0();
                        return true;
                    }
                    if (bVar.g() != 18) {
                        if (bVar.g() != 19) {
                            return true;
                        }
                        MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(MainActivity.this.getString(R.string.privacyPolicyUrl))));
                        return true;
                    }
                    File[] listFiles = new File(MainActivity.this.getExternalFilesDir(null), "Alaps").listFiles();
                    if (listFiles != null && listFiles.length > 0) {
                        MainActivity.this.startActivity(new Intent(MainActivity.this, (Class<?>) FileManageActivity.class));
                        return true;
                    }
                    Toast.makeText(MainActivity.this, R.string.no_alap_file, 0).show();
                    MainActivity.this.f12420r.a();
                    return true;
                }
                MainActivity.this.f12418p.performClick();
                mainActivity = MainActivity.this;
                str = "pick_scale_from_menu";
            }
            mainActivity.z0(str);
            MainActivity.this.f12420r.a();
            return true;
        }
    }

    class p implements Comparator {
        p() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return Long.compare(file2.lastModified(), file.lastModified());
        }
    }

    class q implements f.g {
        q() {
        }

        @Override // l1.f.g
        public void a(l1.f fVar, l1.b bVar) {
            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://rebrand.ly/SwarAlap-In-APP-join-community-link")));
        }
    }

    class r implements f.g {
        r() {
        }

        @Override // l1.f.g
        public void a(l1.f fVar, l1.b bVar) {
            Intent intent = new Intent(MainActivity.this, (Class<?>) WebInstance.class);
            intent.putExtra("url", "https://rebrand.ly/SwarAlap-In-APP-Tutorial-link");
            MainActivity.this.startActivity(intent);
        }
    }

    class s implements h.InterfaceC0284h {
        s() {
        }

        @Override // qb.h.InterfaceC0284h
        public void a(qb.h hVar, int i10) {
            if (i10 == 3 || i10 == 6) {
                MainActivity.this.f12428z.Y();
            }
        }
    }

    class t implements h.InterfaceC0284h {
        t() {
        }

        @Override // qb.h.InterfaceC0284h
        public void a(qb.h hVar, int i10) {
            if (i10 == 3 || i10 == 6) {
                MainActivity.this.f12426x.Y();
            }
        }
    }

    class u implements h.InterfaceC0284h {
        u() {
        }

        @Override // qb.h.InterfaceC0284h
        public void a(qb.h hVar, int i10) {
            if (i10 == 3) {
                MainActivity.this.B.Y();
            }
        }
    }

    private void A0(String str, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(FirebaseAnalytics.Param.ITEM_ID, i10);
        this.f12422t.logEvent(str, bundle);
    }

    private void B0() {
        FirebaseAuth.getInstance().signOut();
        d0.m().s();
        oa.t.c(this);
        c1();
    }

    private void C0(int i10) {
        try {
            float f10 = i10 / 100.0f;
            V.setVolume(f10, f10);
            W.setVolume(f10, f10);
        } catch (Exception unused) {
        }
    }

    private void D0() {
        z0("global_alap_load");
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        startActivityForResult(intent, 7418);
    }

    private void E0() {
        z0("local_alap_load");
        File[] listFiles = new File(getExternalFilesDir(null), "Alaps").listFiles();
        if (listFiles != null && listFiles.length > 1) {
            Arrays.sort(listFiles, new p());
        }
        if (listFiles == null || listFiles.length <= 0) {
            Toast.makeText(this, R.string.no_alap_file, 0).show();
            this.f12420r.a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            Log.d("MainActivity", "onItemClick-File name: " + file.getName());
            arrayList.add(file);
        }
        Y0(arrayList);
    }

    private boolean M0() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        return (audioManager.isSpeakerphoneOn() || audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn() || audioManager.isWiredHeadsetOn()) ? false : true;
    }

    private Boolean N0() {
        Boolean valueOf = Boolean.valueOf(getSharedPreferences(J, 0).getBoolean(S, true));
        this.f12416n.setAutoScroll(valueOf);
        return valueOf;
    }

    private int O0() {
        SharedPreferences sharedPreferences = getSharedPreferences(J, 0);
        int i10 = sharedPreferences.getInt(P, 3);
        int i11 = sharedPreferences.getInt(Q, 0);
        this.f12416n.n(i11, i10);
        return i11;
    }

    private int P0() {
        int i10 = getSharedPreferences(J, 0).getInt(R, oa.s.f14454b);
        this.f12416n.h(i10);
        return i10;
    }

    private int Q0() {
        int i10 = getSharedPreferences(J, 0).getInt(U, 15);
        C0(i10);
        return i10;
    }

    private String R0() {
        int i10 = getSharedPreferences(J, 0).getInt(T, 20);
        this.f12410h.p(i10);
        return i10 + "";
    }

    private void S0(boolean z10) {
        SharedPreferences.Editor edit = getSharedPreferences(J, 0).edit();
        edit.putBoolean(K, z10);
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        new f.d(this).p(R.string.join_community).c(R.string.community_recommendation_description).n("Take me to the WhatsApp group").l(new q()).o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        new f.d(this).q("Video Tutorials").c(R.string.tutorial_recommendation_description).n("Sure").l(new r()).o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0() {
        if (M0()) {
            new f.d(this).p(R.string.earpiece_recommendation_title).c(R.string.earpiece_recommendation_description).n("Okay").o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        new f.d(this).q("Choose Location").e("Select location to load file from").n("Swar Alap").l(new f.g() { // from class: oa.g
            @Override // l1.f.g
            public final void a(l1.f fVar, l1.b bVar) {
                MainActivity.this.r0(fVar, bVar);
            }
        }).i("Others").k(new f.g() { // from class: oa.h
            @Override // l1.f.g
            public final void a(l1.f fVar, l1.b bVar) {
                MainActivity.this.s0(fVar, bVar);
            }
        }).o();
    }

    private void Y0(final ArrayList arrayList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select single file: ");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.item_file_select);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayAdapter.add(((File) arrayList.get(i10)).getName());
        }
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: oa.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                dialogInterface.dismiss();
            }
        });
        builder.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() { // from class: oa.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                MainActivity.this.w0(arrayList, dialogInterface, i11);
            }
        });
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z0() {
        new f.d(this).p(R.string.logout).c(R.string.logout_message).m(R.string.yes).l(new f.g() { // from class: oa.c
            @Override // l1.f.g
            public final void a(l1.f fVar, l1.b bVar) {
                MainActivity.this.x0(fVar, bVar);
            }
        }).g(R.string.no).j(new f.g() { // from class: oa.d
            @Override // l1.f.g
            public final void a(l1.f fVar, l1.b bVar) {
                fVar.dismiss();
            }
        }).o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1() {
        if (getBaseContext().getPackageManager().getLaunchIntentForPackage(this.H) == null) {
            new f.d(this).q("Swar Taal").e("Swar Taal is another application created by us in which you can play the tabla and the tanpura. It is fully integrated with Swar Alap.").n("Play Store").h("Cancel").l(new m()).o();
        } else {
            d1(getApplicationContext(), this.H);
        }
    }

    private void c1() {
        S0(false);
        startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(Boolean bool) {
        z0("auto_scroll_" + bool);
        SharedPreferences.Editor edit = getSharedPreferences(J, 0).edit();
        edit.putBoolean(S, bool.booleanValue());
        edit.commit();
        this.f12416n.setAutoScroll(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(int i10) {
        SharedPreferences.Editor edit = getSharedPreferences(J, 0).edit();
        edit.putInt(O, i10);
        edit.commit();
    }

    private int i0() {
        return getSharedPreferences(J, 0).getInt(O, L);
    }

    private void i1(int i10) {
        A0("scale_list", i10 + 1);
        SharedPreferences.Editor edit = getSharedPreferences(J, 0).edit();
        edit.putInt(P, 3);
        edit.putInt(Q, i10);
        edit.commit();
        this.f12416n.n(i10, 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void j1(String str) {
        str.hashCode();
        int i10 = 11;
        char c10 = 65535;
        switch (str.hashCode()) {
            case 65:
                if (str.equals("A")) {
                    c10 = 0;
                    break;
                }
                break;
            case 66:
                if (str.equals("B")) {
                    c10 = 1;
                    break;
                }
                break;
            case 67:
                if (str.equals("C")) {
                    c10 = 2;
                    break;
                }
                break;
            case 68:
                if (str.equals("D")) {
                    c10 = 3;
                    break;
                }
                break;
            case 69:
                if (str.equals("E")) {
                    c10 = 4;
                    break;
                }
                break;
            case 70:
                if (str.equals("F")) {
                    c10 = 5;
                    break;
                }
                break;
            case 71:
                if (str.equals("G")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2050:
                if (str.equals("A#")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2112:
                if (str.equals("C#")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2143:
                if (str.equals("D#")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2205:
                if (str.equals("F#")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2236:
                if (str.equals("G#")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 9;
                break;
            case 1:
                break;
            case 2:
            default:
                i10 = 0;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 5;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 10;
                break;
            case '\b':
                i10 = 1;
                break;
            case '\t':
                i10 = 3;
                break;
            case '\n':
                i10 = 6;
                break;
            case 11:
                i10 = 8;
                break;
        }
        i1(i10);
        try {
            this.f12418p.setSelection(i10);
            this.f12420r.i(5L, new u6.e(this.f12416n.getAllNotesForDropdown()[i10]));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1(int i10) {
        SharedPreferences.Editor edit = getSharedPreferences(J, 0).edit();
        edit.putInt(U, i10);
        edit.commit();
        C0(i10);
        this.f12420r.i(13L, new u6.e(i10 + ""));
    }

    private void l0(Uri uri) {
        String str;
        Toast makeText;
        Log.d("MainActivity", "handleAlapFileLoading: URI info" + uri.getPath() + "  " + uri.toString() + " " + uri.getLastPathSegment());
        if (uri.getLastPathSegment() != null) {
            if (uri.getLastPathSegment().split("\\.").length <= 1) {
                if (uri.toString().split(":")[0].equals("file")) {
                    if (j0()) {
                        if (uri.getPath() != null) {
                            try {
                                File file = new File(uri.getPath());
                                Log.d("MainActivity", "handleAlapFileLoading: " + file.getName() + "  " + file.getPath() + " " + file.getAbsolutePath());
                                if (this.f12411i == null) {
                                    o0();
                                }
                                this.f12411i.B(file);
                                return;
                            } catch (Exception e10) {
                                e = e10;
                                str = "handleAlapFileLoading: Error in loading file-- file =>";
                            }
                        }
                        makeText = Toast.makeText(this, "Wrong file information", 0);
                    }
                    Toast.makeText(this, R.string.storage_permission_needed, 0).show();
                    K0();
                    return;
                }
                if (uri.toString().split(":")[0].equals(FirebaseAnalytics.Param.CONTENT)) {
                    try {
                        InputStream openInputStream = getContentResolver().openInputStream(uri);
                        if (this.f12411i == null) {
                            o0();
                        }
                        this.f12411i.C(openInputStream);
                        return;
                    } catch (Exception e11) {
                        e = e11;
                        str = "handleAlapFileLoading: Error in loading content file =>";
                    }
                }
                makeText = Toast.makeText(this, R.string.only_load_alap, 0);
                Log.e("MainActivity", str, e);
                e.printStackTrace();
                return;
            }
            if (uri.getLastPathSegment().split("\\.")[1].equals("alap")) {
                try {
                    if (!uri.toString().split(":")[0].equals("file")) {
                        if (uri.toString().split(":")[0].equals(FirebaseAnalytics.Param.CONTENT)) {
                            InputStream openInputStream2 = getContentResolver().openInputStream(uri);
                            if (this.f12411i == null) {
                                o0();
                            }
                            this.f12411i.C(openInputStream2);
                            return;
                        }
                        return;
                    }
                    if (j0()) {
                        if (uri.getPath() != null) {
                            File file2 = new File(uri.getPath());
                            Log.d("MainActivity", "handleAlapFileLoading: " + file2.getName() + "  " + file2.getPath() + " " + file2.getAbsolutePath());
                            if (this.f12411i == null) {
                                o0();
                            }
                            this.f12411i.B(file2);
                            return;
                        }
                        makeText = Toast.makeText(this, "Wrong file information", 0);
                    }
                    Toast.makeText(this, R.string.storage_permission_needed, 0).show();
                    K0();
                    return;
                } catch (Exception e12) {
                    e = e12;
                    Log.e("MainActivity", "handleAlapFileLoading: Error in loading file =>", e);
                }
            }
            makeText = Toast.makeText(this, R.string.only_load_alap, 0);
            makeText.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l1(int i10) {
        SharedPreferences.Editor edit = getSharedPreferences(J, 0).edit();
        edit.putInt(T, i10);
        edit.commit();
        this.f12410h.p(i10);
        this.f12420r.i(9L, new u6.e(i10 + ""));
    }

    private void m0(Intent intent) {
        Uri uri;
        if (intent.getData() != null) {
            l0(intent.getData());
        } else {
            Log.d("MainActivity", "onNewIntent: intentData == null");
        }
        if (intent.getAction() == null) {
            Log.d("MainActivity", "onNewIntent: intentAction == null");
        } else {
            if (!intent.getAction().equals("android.intent.action.SEND") || (uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM")) == null) {
                return;
            }
            l0(uri);
        }
    }

    private void n0(boolean z10) {
        if (!z10) {
            Toast.makeText(this, R.string.file_loading_failed, 0).show();
            return;
        }
        Toast.makeText(this, R.string.file_loading_success, 0).show();
        if (this.f12411i.t()) {
            H0();
            this.f12411i.M();
            this.f12413k.setImageResource(R.drawable.ic_media_play);
        } else {
            this.f12411i.N(true);
            this.f12416n.setIsRecording(false);
        }
        this.f12412j.setClickable(true);
        this.f12412j.clearColorFilter();
        this.f12413k.setClickable(true);
        this.f12413k.setColorFilter(getResources().getColor(R.color.activeColor));
        this.f12413k.setContentDescription("play");
        this.f12414l.setClickable(false);
        this.f12414l.setColorFilter(getResources().getColor(R.color.inactiveColor));
        this.f12420r.a();
    }

    private void o0() {
        this.f12411i = new io.swar.alap.a(this.f12410h, getBaseContext(), this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.record);
        this.f12411i.I(new l((ImageButton) findViewById(R.id.playPause), imageButton, (ImageButton) findViewById(R.id.stop)));
    }

    private boolean q0() {
        return getSharedPreferences(J, 0).getBoolean(K, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(l1.f fVar, l1.b bVar) {
        E0();
        fVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(l1.f fVar, l1.b bVar) {
        D0();
        fVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(l1.f fVar, l1.b bVar) {
        this.f12411i.H(new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss", Locale.getDefault()).format(new Date(System.currentTimeMillis())));
        z0("save_alap_file");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(ArrayList arrayList, DialogInterface dialogInterface, int i10) {
        this.f12411i.B((File) arrayList.get(i10));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(l1.f fVar, l1.b bVar) {
        B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(String str) {
        this.f12422t.logEvent(str, new Bundle());
    }

    public void F0() {
        try {
            this.F.removeCallbacks(this.G);
            if (V.isPlaying()) {
                V.pause();
            }
            if (W.isPlaying()) {
                W.pause();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void G0() {
        try {
            z0("play_tanpura");
            C0(Q0());
            V.start();
        } catch (Exception e10) {
            e10.printStackTrace();
            k0();
            C0(Q0());
            V.start();
        }
        this.F = new Handler();
        j jVar = new j();
        this.G = jVar;
        this.F.postDelayed(jVar, 5500L);
    }

    public void H0() {
        if (i0() == M) {
            k0();
            G0();
        }
    }

    public void I0() {
        int[] iArr = this.f12423u;
        iArr[0] = R.raw.tanpura_pa_sa_c;
        iArr[1] = R.raw.tanpura_pa_sa_c2;
        iArr[2] = R.raw.tanpura_pa_sa_d;
        iArr[3] = R.raw.tanpura_pa_sa_d2;
        iArr[4] = R.raw.tanpura_pa_sa_e;
        iArr[5] = R.raw.tanpura_pa_sa_f;
        iArr[6] = R.raw.tanpura_pa_sa_f2;
        iArr[7] = R.raw.tanpura_pa_sa_g;
        iArr[8] = R.raw.tanpura_pa_sa_g2;
        iArr[9] = R.raw.tanpura_pa_sa_a;
        iArr[10] = R.raw.tanpura_pa_sa_a2;
        iArr[11] = R.raw.tanpura_pa_sa_b;
    }

    public void J0() {
        try {
            V.release();
            W.release();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void K0() {
        androidx.core.app.b.u(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 6723);
    }

    public void L0() {
        try {
            this.F.removeCallbacks(this.G);
            this.F.postDelayed(this.G, 5500L);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void X0() {
        new f.d(this).p(R.string.save_file).c(R.string.save_file_description).m(R.string.yes).l(new f.g() { // from class: oa.e
            @Override // l1.f.g
            public final void a(l1.f fVar, l1.b bVar) {
                MainActivity.this.t0(fVar, bVar);
            }
        }).g(R.string.no).j(new f.g() { // from class: oa.f
            @Override // l1.f.g
            public final void a(l1.f fVar, l1.b bVar) {
                fVar.dismiss();
            }
        }).o();
    }

    public void b1() {
        z0("in_app_tutorial_shown");
        h.g gVar = (h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) new h.g(this).X(R.id.pitchNoteDummy)).O(false)).P(getResources().getColor(R.color.transparentBlueColor))).R(getResources().getColor(R.color.transparentWhiteColor))).S(R.string.in_app_tutorial_intro_title)).Q(true)).V(R.string.in_app_tutorial_intro_description)).U(new s());
        this.f12425w = gVar;
        gVar.Y();
        this.f12428z = (h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) new h.g(this).X(R.id.pitchNoteDummy)).O(false)).P(getResources().getColor(R.color.transparentBlueColor))).R(getResources().getColor(R.color.transparentWhiteColor))).T(getResources().getString(R.string.in_app_tutorial_pitch_note_title))).Q(true)).W(getResources().getString(R.string.in_app_tutorial_pitch_note_description))).U(new t());
        this.f12426x = (h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) new h.g(this).X(R.id.selectedScale)).O(false)).P(getResources().getColor(R.color.transparentBlueColor))).T("Set your scale")).Q(true)).W("If you don't know your scale, go to the video tutorials section in the menu to learn how to.")).U(new u());
        this.B = (h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) new h.g(this).X(R.id.scaleRightDummy)).O(false)).P(getResources().getColor(R.color.transparentBlueColor))).R(getResources().getColor(R.color.transparentWhiteColor))).T("Toggle Indian/Western scale")).Q(true)).W("You can toggle between the indian and the western scale by tapping here.")).U(new a());
        this.A = (h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) new h.g(this).X(R.id.record)).O(false)).P(getResources().getColor(R.color.transparentBlueColor))).T("Record your singing")).Q(true)).W("You can record your voice for analyzing it closely after singing.")).U(new b());
        this.C = (h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) new h.g(this).X(R.id.playPause)).O(false)).P(getResources().getColor(R.color.transparentBlueColor))).T("Play your recording")).Q(true)).W("You will be able to analyze your recording while playing back.")).U(new c());
        this.D = (h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) new h.g(this).X(R.id.holdDummy)).O(false)).P(getResources().getColor(R.color.transparentBlueColor))).R(getResources().getColor(R.color.transparentWhiteColor))).T("HOLD")).T("Hold your screen")).Q(true)).W("Click on this button to hold the screen. You can resume the screen scrolling upon clicking here again.")).U(new d());
        this.E = (h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) new h.g(this).X(R.id.earphoneDummy)).O(false)).P(getResources().getColor(R.color.transparentBlueColor))).R(getResources().getColor(R.color.transparentWhiteColor))).T("Use your earphones")).W("Please use your earphones for a smooth experience.")).U(new e());
        this.f12427y = (h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) ((h.g) new h.g(this).X(R.id.menuDummy)).O(false)).P(getResources().getColor(R.color.transparentBlueColor))).R(getResources().getColor(R.color.transparentWhiteColor))).T("Click for Menu")).W("Check out the options inside the menu.")).U(new f());
        S0(true);
    }

    public void d1(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new Intent("android.intent.action.VIEW");
            launchIntentForPackage.setData(Uri.parse("market://details?id=" + str));
        }
        launchIntentForPackage.putExtra("android.intent.extra.TEXT", this.f12416n.getAllNotesForDropdown()[O0()]);
        launchIntentForPackage.addFlags(268435456);
        context.startActivity(launchIntentForPackage);
    }

    @Override // io.swar.alap.a.c
    public void e(boolean z10) {
        n0(z10);
    }

    public void e1() {
        f1();
        J0();
    }

    public void f1() {
        try {
            this.F.removeCallbacks(this.G);
            V.stop();
            W.stop();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // io.swar.alap.a.c
    public void g() {
        X0();
    }

    public void g0() {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.slider_popup, (ViewGroup) null);
        new PopupWindow(inflate, -2, -2, true).showAtLocation(inflate, 80, 0, 300);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.seekBar1);
        seekBar.setMax(50);
        seekBar.setProgress((int) this.f12410h.l());
        seekBar.setOnSeekBarChangeListener(new g());
    }

    public void h0() {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.slider_popup, (ViewGroup) null);
        new PopupWindow(inflate, -2, -2, true).showAtLocation(inflate, 80, 0, 300);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.seekBar1);
        seekBar.setMax(100);
        seekBar.setProgress(Q0());
        seekBar.setOnSeekBarChangeListener(new h());
    }

    @Override // io.swar.alap.a.c
    public void j(boolean z10) {
        Toast.makeText(this, z10 ? R.string.alap_file_saved_success : R.string.error_saving_file, 0).show();
    }

    public boolean j0() {
        return androidx.core.content.a.a(this, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    public void k0() {
        int i10 = getSharedPreferences(J, 0).getInt(Q, 0);
        V = MediaPlayer.create(this, this.f12423u[i10]);
        W = MediaPlayer.create(this, this.f12423u[i10]);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        Uri data;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 7418 && i11 == -1) {
            if (intent == null) {
                Log.e("MainActivity", "onActivityResult: Data == null");
                return;
            }
            if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                if (clipData.getItemCount() <= 0 || (data = clipData.getItemAt(0).getUri()) == null) {
                    return;
                }
            } else {
                data = intent.getData();
                if (data == null) {
                    return;
                }
            }
            l0(data);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        t6.b bVar = this.f12420r;
        if (bVar == null || !bVar.f()) {
            super.onBackPressed();
        } else {
            this.f12420r.a();
        }
    }

    public void onClick(View view) {
        ImageButton imageButton;
        int color;
        int id = view.getId();
        if (id == R.id.playPause) {
            Log.d("on click", "onClick: playpause");
            if (this.f12413k.getContentDescription().equals("play")) {
                z0("play_button");
                if (!this.f12411i.u().booleanValue()) {
                    p0().booleanValue();
                }
                F0();
                this.f12411i.K();
                this.f12413k.setImageResource(R.drawable.ic_media_pause);
                this.f12413k.setContentDescription("pause");
            } else {
                z0("pause_button");
                L0();
                H0();
                this.f12411i.D();
                this.f12413k.setImageResource(R.drawable.ic_media_play);
                this.f12413k.setContentDescription("play");
            }
            this.f12412j.setClickable(false);
            this.f12412j.setColorFilter(getResources().getColor(R.color.inactiveColor));
            this.f12414l.setClickable(true);
            imageButton = this.f12414l;
            color = getResources().getColor(R.color.activeColor);
        } else {
            if (id == R.id.record) {
                Log.d("on click", "onClick: record");
                z0("record_button");
                Toast.makeText(this, R.string.max_record_time_message, 0).show();
                this.f12411i.L(getExternalFilesDir(null));
                this.f12412j.setClickable(false);
                this.f12412j.setColorFilter(getResources().getColor(R.color.inactiveColor));
                this.f12413k.setClickable(false);
                this.f12413k.setColorFilter(getResources().getColor(R.color.inactiveColor));
                this.f12414l.setClickable(true);
                this.f12414l.setColorFilter(getResources().getColor(R.color.activeColor));
                this.f12416n.setIsRecording(true);
                return;
            }
            if (id != R.id.stop) {
                return;
            }
            Log.d("on click", "onClick: stop");
            z0("stop_button");
            if (this.f12411i.t()) {
                H0();
                this.f12411i.M();
                this.f12413k.setImageResource(R.drawable.ic_media_play);
            } else {
                this.f12411i.N(false);
                this.f12416n.setIsRecording(false);
            }
            this.f12412j.setClickable(true);
            this.f12412j.clearColorFilter();
            this.f12413k.setClickable(true);
            this.f12413k.setColorFilter(getResources().getColor(R.color.activeColor));
            this.f12413k.setContentDescription("play");
            this.f12414l.setClickable(false);
            imageButton = this.f12414l;
            color = getResources().getColor(R.color.inactiveColor);
        }
        imageButton.setColorFilter(color);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12422t = FirebaseAnalytics.getInstance(this);
        setContentView(R.layout.activity_main);
        MainSurfaceView mainSurfaceView = (MainSurfaceView) findViewById(R.id.msv);
        this.f12416n = mainSurfaceView;
        mainSurfaceView.setAnalyzer(this.f12410h);
        WebView webView = new WebView(this);
        this.f12421s = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
        if (stringExtra != null) {
            j1(stringExtra);
        }
        m0(getIntent());
        I0();
        k0();
        this.f12409g = FirebaseAuth.getInstance();
        g7.b.a().setLogLevel(c8.b.VERBOSE);
        g7.b.e(this, "0673766c-a8c7-4f21-a6f0-257cb8e551f3");
        ea.a.o(this).g(0).h(3).j(10).k(true).f(false).i(new k()).e();
        ea.a.n(this);
        this.f12421s.setWebViewClient(new n(this));
        x6.k kVar = (x6.k) ((x6.k) ((x6.k) new x6.k().Y(oa.t.a(this, "name") == null ? "User Name" : oa.t.a(this, "name"))).e0((oa.t.a(this, "email") == null || oa.t.a(this, "email") == "nan") ? "" : oa.t.a(this, "email"))).C(false);
        x6.j jVar = (x6.j) ((x6.j) ((x6.j) new x6.j().k(1L)).X(R.string.app_name)).C(false);
        P0();
        x6.k kVar2 = (x6.k) ((x6.k) ((x6.k) new x6.k().k(3L)).X(R.string.drawer_item_toggle)).C(false);
        x6.l lVar = (x6.l) ((x6.l) ((x6.l) ((x6.l) ((x6.l) new x6.l().k(4L)).X(R.string.drawer_item_auto_scroll)).l0(N0().booleanValue())).C(false)).m0(this.I);
        x6.k kVar3 = (x6.k) ((x6.k) ((x6.k) ((x6.k) new x6.k().k(5L)).X(R.string.drawer_item_change_scale)).C(false)).h0(this.f12416n.getAllNotesForDropdown()[O0()]);
        x6.k kVar4 = (x6.k) ((x6.k) ((x6.k) ((x6.k) new x6.k().k(9L)).X(R.string.drawer_item_change_threshold)).C(false)).h0(R0());
        x6.k kVar5 = (x6.k) ((x6.k) ((x6.k) ((x6.k) ((x6.k) ((x6.k) new x6.k().k(6L)).X(R.string.drawer_item_video_tutorial)).a0(Typeface.DEFAULT_BOLD)).Z(getResources().getColor(R.color.white))).C(false)).W(FontAwesome.a.faw_external_link);
        x6.k kVar6 = (x6.k) ((x6.k) ((x6.k) ((x6.k) new x6.k().k(8L)).X(R.string.drawer_item_rate_us)).C(false)).W(FontAwesome.a.faw_star);
        x6.k kVar7 = (x6.k) ((x6.k) ((x6.k) new x6.k().k(7L)).Y("v 3.0.2")).C(false);
        x6.k kVar8 = (x6.k) ((x6.k) ((x6.k) ((x6.k) new x6.k().k(11L)).X(R.string.drawer_item_inapp_tutorial)).C(false)).W(FontAwesome.a.faw_graduation_cap);
        this.f12424v = (x6.m) ((x6.m) ((x6.m) ((x6.m) ((x6.m) new x6.m().k(12L)).X(R.string.drawer_item_play_tanpura)).l0(i0() == M || p0().booleanValue())).C(false)).m0(this.I);
        x6.k kVar9 = (x6.k) ((x6.k) ((x6.k) ((x6.k) new x6.k().k(14L)).X(R.string.join_community)).C(false)).W(FontAwesome.a.faw_handshake_o);
        x6.j jVar2 = (x6.j) ((x6.j) ((x6.j) new x6.j().k(15L)).X(R.string.play_tabla)).C(false);
        x6.k kVar10 = (x6.k) ((x6.k) ((x6.k) new x6.k().k(16L)).X(R.string.play_recordings)).C(false);
        x6.k kVar11 = (x6.k) ((x6.k) ((x6.k) ((x6.k) new x6.k().k(17L)).X(R.string.drawer_item_log_out)).C(false)).W(FontAwesome.a.faw_window_close_o);
        x6.k kVar12 = (x6.k) ((x6.k) ((x6.k) new x6.k().k(18L)).X(R.string.manage_recordings)).C(false);
        x6.k kVar13 = (x6.k) ((x6.k) ((x6.k) ((x6.k) new x6.k().k(19L)).X(R.string.privacy_policy)).W(FontAwesome.a.faw_shield)).C(false);
        x6.i iVar = (x6.i) ((x6.i) ((x6.i) new x6.i().Y("Recordings")).D(kVar10, kVar12)).C(false);
        this.f12412j = (ImageButton) findViewById(R.id.record);
        this.f12413k = (ImageButton) findViewById(R.id.playPause);
        this.f12414l = (ImageButton) findViewById(R.id.stop);
        Spinner spinner = (Spinner) findViewById(R.id.selectedScale);
        this.f12418p = spinner;
        spinner.bringToFront();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, this.f12416n.getAllNotesForDropdown());
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.f12418p.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f12418p.setSelection(O0(), false);
        this.f12418p.setOnItemSelectedListener(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        this.f12419q = toolbar;
        G(toolbar);
        w().v("");
        getBaseContext().getPackageManager().getLaunchIntentForPackage(this.H);
        this.f12420r = new t6.c().p(this).u(true).t(this.f12419q).a(jVar, kVar, new x6.h(), kVar2, kVar3, kVar4, lVar, iVar, jVar2, new x6.h(), kVar8, kVar5, kVar9, kVar13, kVar11).b(kVar6).r(new o()).s(true).b(kVar7).c();
        if (q0()) {
            return;
        }
        b1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        this.f12417o = menu;
        return true;
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.e, android.app.Activity
    protected void onDestroy() {
        h1(L);
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        i1(i10);
        this.f12420r.i(5L, new u6.e(this.f12416n.getAllNotesForDropdown()[i10]));
        f1();
        k0();
        int i02 = i0();
        if (i02 == M) {
            V0();
            G0();
        } else if (i02 == N) {
            e1();
        } else {
            q0();
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra != null) {
            j1(stringExtra);
        }
        m0(intent);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_hold) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (menuItem.getTitle().equals(getString(R.string.hold))) {
            z0("hold_button");
            this.f12416n.e();
            menuItem.setTitle(getString(R.string.resume));
            F0();
            return true;
        }
        z0("unhold_button");
        this.f12416n.l();
        menuItem.setTitle(getString(R.string.hold));
        H0();
        return true;
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onPause() {
        e1();
        Menu menu = this.f12417o;
        if (menu != null) {
            MenuItem findItem = menu.findItem(R.id.action_hold);
            if (findItem.getTitle().equals("resume")) {
                this.f12416n.l();
                findItem.setTitle("hold");
            }
        }
        io.swar.alap.a aVar = this.f12411i;
        if (aVar != null) {
            aVar.E();
            this.f12411i = null;
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1234) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                Log.d("TAG", "permission denied by user");
                return;
            } else {
                onResume();
                return;
            }
        }
        if (i10 != 6723) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            Toast.makeText(this, R.string.storage_permission_needed, 0).show();
        } else if (getIntent().getData() != null) {
            l0(getIntent().getData());
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (i0() == M) {
            k0();
            G0();
        }
        if (androidx.core.content.a.a(this, "android.permission.RECORD_AUDIO") != 0) {
            androidx.core.app.b.u(this, new String[]{"android.permission.RECORD_AUDIO"}, 1234);
        } else {
            o0();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(this.f12420r.g(bundle));
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.f12409g.getCurrentUser() == null) {
            c1();
        }
    }

    public Boolean p0() {
        boolean z10;
        try {
            if (!V.isPlaying() && !W.isPlaying()) {
                z10 = false;
                return Boolean.valueOf(z10);
            }
            z10 = true;
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}