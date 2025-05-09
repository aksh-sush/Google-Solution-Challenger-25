package com.google.protobuf;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

abstract class v0 {
    private static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    private static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else if (!(obj instanceof j)) {
            return obj instanceof t0 ? obj == ((t0) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        } else {
            obj2 = j.f8600f;
        }
        return obj.equals(obj2);
    }

    static final void c(StringBuilder sb2, int i10, String str, Object obj) {
        String a10;
        if (obj instanceof List) {
            for (Object c10 : (List) obj) {
                c(sb2, i10, str, c10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c11 : ((Map) obj).entrySet()) {
                c(sb2, i10, str, c11);
            }
        } else {
            sb2.append(10);
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                a10 = q1.c((String) obj);
            } else if (obj instanceof j) {
                sb2.append(": \"");
                a10 = q1.a((j) obj);
            } else {
                if (obj instanceof z) {
                    sb2.append(" {");
                    d((z) obj, sb2, i10 + 2);
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb2.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i13 = i10 + 2;
                    c(sb2, i13, "key", entry.getKey());
                    c(sb2, i13, FirebaseAnalytics.Param.VALUE, entry.getValue());
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                } else {
                    sb2.append(": ");
                    sb2.append(obj.toString());
                    return;
                }
                sb2.append("}");
                return;
            }
            sb2.append(a10);
            sb2.append('\"');
        }
    }

    private static void d(t0 t0Var, StringBuilder sb2, int i10) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : t0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z10 = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb2, i10, a(str2), z.invokeOrDie(method2, t0Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb2, i10, a(str3), z.invokeOrDie(method3, t0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object invokeOrDie = z.invokeOrDie(method4, t0Var, new Object[0]);
                    if (method5 != null) {
                        z10 = ((Boolean) z.invokeOrDie(method5, t0Var, new Object[0])).booleanValue();
                    } else if (b(invokeOrDie)) {
                        z10 = false;
                    }
                    if (z10) {
                        c(sb2, i10, a(str4), invokeOrDie);
                    }
                }
            }
        }
        u1 u1Var = ((z) t0Var).unknownFields;
        if (u1Var != null) {
            u1Var.p(sb2, i10);
        }
    }

    static String e(t0 t0Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(t0Var, sb2, 0);
        return sb2.toString();
    }
}
