package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjl;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzjt<T extends zzjl> {
    private static final Logger zza = Logger.getLogger(zzjg.class.getName());
    private static final String zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    zzjt() {
    }

    static <T extends zzjl> T zzb(Class<T> cls) {
        String str;
        Class<zzjt> cls2 = zzjt.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(zzjl.class)) {
            str = zzb;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (zzjl) cls.cast(((zzjt) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException(e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        } catch (IllegalAccessException e12) {
            throw new IllegalStateException(e12);
        } catch (InvocationTargetException e13) {
            throw new IllegalStateException(e13);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzjt) it.next()).zza()));
                } catch (ServiceConfigurationError e14) {
                    ServiceConfigurationError serviceConfigurationError = e14;
                    Logger logger = zza;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (zzjl) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzjl) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract T zza();
}
