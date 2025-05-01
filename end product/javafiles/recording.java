package io.swar.alap;

import android.content.Context;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Log;
import com.facebook.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public class a {

    /* renamed from: p, reason: collision with root package name */
    private static final int f12508p;

    /* renamed from: q, reason: collision with root package name */
    private static final int f12509q;

    /* renamed from: r, reason: collision with root package name */
    private static short[] f12510r;

    /* renamed from: s, reason: collision with root package name */
    private static int f12511s;

    /* renamed from: a, reason: collision with root package name */
    private final oa.a f12512a;

    /* renamed from: e, reason: collision with root package name */
    private AudioTrack f12516e;

    /* renamed from: g, reason: collision with root package name */
    private AudioRecord f12518g;

    /* renamed from: j, reason: collision with root package name */
    private final c f12521j;

    /* renamed from: n, reason: collision with root package name */
    File f12525n;

    /* renamed from: o, reason: collision with root package name */
    Context f12526o;

    /* renamed from: b, reason: collision with root package name */
    private final short[] f12513b = new short[f12509q];

    /* renamed from: c, reason: collision with root package name */
    private boolean f12514c = false;

    /* renamed from: d, reason: collision with root package name */
    private final b f12515d = new b();

    /* renamed from: f, reason: collision with root package name */
    private Runnable f12517f = null;

    /* renamed from: h, reason: collision with root package name */
    private Runnable f12519h = null;

    /* renamed from: i, reason: collision with root package name */
    private int f12520i = 0;

    /* renamed from: k, reason: collision with root package name */
    int f12522k = 0;

    /* renamed from: l, reason: collision with root package name */
    int f12523l = 0;

    /* renamed from: m, reason: collision with root package name */
    private final String f12524m = "/SampleFile.txt";

    /* renamed from: io.swar.alap.a$a, reason: collision with other inner class name */
    class C0243a implements AudioTrack.OnPlaybackPositionUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f12527a;

        C0243a(int i10) {
            this.f12527a = i10;
        }

        @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
        public void onMarkerReached(AudioTrack audioTrack) {
        }

        @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
        public void onPeriodicNotification(AudioTrack audioTrack) {
            try {
                a.this.O(this.f12527a);
            } catch (Exception unused) {
            }
        }
    }

    public class b implements AudioRecord.OnRecordPositionUpdateListener {
        public b() {
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onMarkerReached(AudioRecord audioRecord) {
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onPeriodicNotification(AudioRecord audioRecord) {
            int read = audioRecord.read(a.this.f12513b, 0, a.f12509q);
            for (int i10 = 0; i10 < read; i10++) {
                a.this.f12512a.a(a.this.f12513b[i10]);
                if (a.this.f12514c) {
                    a.f12510r[a.n()] = a.this.f12513b[i10];
                    if (a.f12511s >= a.f12510r.length) {
                        a.this.f12514c = false;
                        if (a.this.f12519h != null) {
                            a.this.f12519h.run();
                        }
                    }
                }
            }
        }
    }

    interface c {
        void e(boolean z10);

        void g();

        void j(boolean z10);
    }

    static {
        int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
        f12508p = minBufferSize;
        f12509q = minBufferSize / 2;
        f12510r = null;
        f12511s = 0;
    }

    a(oa.a aVar, Context context, c cVar) {
        this.f12512a = aVar;
        this.f12526o = context;
        this.f12521j = cVar;
        r();
    }

    private void F() {
        AudioTrack audioTrack = this.f12516e;
        if (audioTrack != null) {
            audioTrack.stop();
            this.f12516e.release();
            this.f12516e = null;
        }
    }

    private void G(File file) {
        file.delete();
        if (file.exists()) {
            file.getCanonicalFile().delete();
            if (file.exists()) {
                i0.l().deleteFile(file.getName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(int i10) {
        boolean z10;
        int i11 = i10 / 2;
        int i12 = this.f12520i;
        int i13 = i12 + i11;
        int i14 = f12511s;
        if (i13 > i14) {
            i11 = i14 - i12;
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            this.f12512a.a(f12510r[this.f12520i + i15]);
        }
        AudioTrack audioTrack = this.f12516e;
        if (audioTrack != null) {
            audioTrack.write(f12510r, this.f12520i, i11);
            this.f12520i += i11;
            if (z10) {
                M();
                Runnable runnable = this.f12517f;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    static int n() {
        int i10 = f12511s;
        f12511s = i10 + 1;
        return i10;
    }

    private void r() {
        AudioRecord audioRecord = new AudioRecord(0, 44100, 16, 2, f12508p);
        this.f12518g = audioRecord;
        audioRecord.setRecordPositionUpdateListener(this.f12515d);
        AudioRecord audioRecord2 = this.f12518g;
        int i10 = f12509q;
        audioRecord2.setPositionNotificationPeriod(i10);
        this.f12518g.startRecording();
        this.f12518g.read(this.f12513b, 0, i10);
    }

    private void s() {
        f12510r = new short[15938000];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            int available = fileInputStream.available();
            try {
                Log.d("Recorder", "loadTaalFile: fis_length=>" + available + " file_length=>" + file.length());
                J((available / 2) + (-50));
                f12510r = (short[]) objectInputStream.readObject();
                this.f12520i = 0;
                objectInputStream.close();
                fileInputStream.close();
                this.f12521j.e(true);
            } catch (Throwable th) {
                objectInputStream.close();
                fileInputStream.close();
                this.f12521j.e(true);
                throw th;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f12521j.e(false);
            Log.e("Recorder", "loadTaalFile: " + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(InputStream inputStream) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            int available = inputStream.available();
            try {
                Log.d("Recorder", "loadTaalFile: fis_length=>" + available);
                J((available / 2) + (-50));
                f12510r = (short[]) objectInputStream.readObject();
                this.f12520i = 0;
                objectInputStream.close();
                inputStream.close();
                this.f12521j.e(true);
            } catch (Throwable th) {
                objectInputStream.close();
                inputStream.close();
                this.f12521j.e(true);
                throw th;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f12521j.e(false);
            Log.e("Recorder", "loadTaalFile: " + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(String str) {
        File file = new File(this.f12525n, "Alaps");
        File file2 = new File(file, "SwarAlap_" + str + ".alap");
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file2));
            try {
                short[] sArr = new short[q()];
                Log.d("Recorder", "saveTaalFile: length " + q());
                for (int i10 = 0; i10 < q(); i10++) {
                    sArr[i10] = f12510r[i10];
                }
                objectOutputStream.writeObject(sArr);
                objectOutputStream.close();
                Log.d("Recorder", "saveTaalFile: taal_output=>" + q() + " file_length=>" + file2.length());
                this.f12521j.j(true);
            } catch (Throwable th) {
                objectOutputStream.close();
                Log.d("Recorder", "saveTaalFile: taal_output=>" + q() + " file_length=>" + file2.length());
                this.f12521j.j(true);
                throw th;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f12521j.j(false);
            try {
                G(file2);
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void B(final File file) {
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() { // from class: oa.m
            @Override // java.lang.Runnable
            public final void run() {
                io.swar.alap.a.this.v(file);
            }
        };
        new Thread(new Runnable() { // from class: oa.n
            @Override // java.lang.Runnable
            public final void run() {
                handler.post(runnable);
            }
        }).start();
    }

    public void C(final InputStream inputStream) {
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() { // from class: oa.o
            @Override // java.lang.Runnable
            public final void run() {
                io.swar.alap.a.this.x(inputStream);
            }
        };
        new Thread(new Runnable() { // from class: oa.p
            @Override // java.lang.Runnable
            public final void run() {
                handler.post(runnable);
            }
        }).start();
    }

    public void D() {
        F();
    }

    public void E() {
        F();
        AudioRecord audioRecord = this.f12518g;
        if (audioRecord != null) {
            audioRecord.stop();
            this.f12518g.release();
            this.f12518g = null;
        }
    }

    public void H(final String str) {
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() { // from class: oa.q
            @Override // java.lang.Runnable
            public final void run() {
                io.swar.alap.a.this.z(str);
            }
        };
        new Thread(new Runnable() { // from class: oa.r
            @Override // java.lang.Runnable
            public final void run() {
                handler.post(runnable);
            }
        }).start();
    }

    public void I(Runnable runnable) {
        this.f12517f = runnable;
    }

    public void J(int i10) {
        f12511s = i10;
    }

    public void K() {
        E();
        this.f12512a.c();
        int minBufferSize = AudioTrack.getMinBufferSize(44100, 4, 2);
        AudioTrack audioTrack = new AudioTrack(3, 44100, 4, 2, minBufferSize, 1);
        this.f12516e = audioTrack;
        audioTrack.setPositionNotificationPeriod(minBufferSize / 2);
        this.f12516e.setPlaybackPositionUpdateListener(new C0243a(minBufferSize));
        this.f12516e.play();
        O(minBufferSize);
        O(minBufferSize);
        O(minBufferSize);
    }

    public void L(File file) {
        s();
        f12511s = 0;
        this.f12525n = file;
        this.f12514c = true;
        this.f12520i = 0;
    }

    public void M() {
        F();
        this.f12520i = 0;
        r();
    }

    public void N(boolean z10) {
        this.f12514c = false;
        if (z10) {
            return;
        }
        this.f12521j.g();
    }

    public int q() {
        return f12511s;
    }

    public boolean t() {
        return this.f12520i > 0;
    }

    public Boolean u() {
        return Boolean.valueOf(f12510r != null);
    }
}