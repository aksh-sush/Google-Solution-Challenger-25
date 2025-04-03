package com.google.firebase.firestore.util;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Blob;
import com.google.firebase.firestore.DocumentId;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.Exclude;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.PropertyName;
import com.google.firebase.firestore.ServerTimestamp;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CustomClassMapper {
    private static final int MAX_DEPTH = 500;
    private static final ConcurrentMap<Class<?>, a> mappers = new ConcurrentHashMap();

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Class f8251a;

        /* renamed from: b  reason: collision with root package name */
        private final Constructor f8252b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f8253c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f8254d;

        /* renamed from: e  reason: collision with root package name */
        private final Map f8255e = new HashMap();

        /* renamed from: f  reason: collision with root package name */
        private final Map f8256f = new HashMap();

        /* renamed from: g  reason: collision with root package name */
        private final Map f8257g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        private final Map f8258h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        private final HashSet f8259i = new HashSet();

        /* renamed from: j  reason: collision with root package name */
        private final HashSet f8260j = new HashSet();

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x01a1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        a(java.lang.Class r11) {
            /*
                r10 = this;
                r10.<init>()
                r10.f8251a = r11
                java.lang.Class<com.google.firebase.firestore.ThrowOnExtraProperties> r0 = com.google.firebase.firestore.ThrowOnExtraProperties.class
                boolean r0 = r11.isAnnotationPresent(r0)
                r10.f8253c = r0
                java.lang.Class<com.google.firebase.firestore.IgnoreExtraProperties> r0 = com.google.firebase.firestore.IgnoreExtraProperties.class
                boolean r0 = r11.isAnnotationPresent(r0)
                r1 = 1
                r0 = r0 ^ r1
                r10.f8254d = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f8255e = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f8257g = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f8256f = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f8258h = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r10.f8259i = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r10.f8260j = r0
                r0 = 0
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x004c }
                java.lang.reflect.Constructor r2 = r11.getDeclaredConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x004c }
                r2.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x004c }
                goto L_0x004d
            L_0x004c:
                r2 = 0
            L_0x004d:
                r10.f8252b = r2
                java.lang.reflect.Method[] r2 = r11.getMethods()
                int r3 = r2.length
                r4 = 0
            L_0x0055:
                if (r4 >= r3) goto L_0x00a4
                r5 = r2[r4]
                boolean r6 = s(r5)
                if (r6 == 0) goto L_0x00a1
                java.lang.String r6 = n(r5)
                r10.c(r6)
                r5.setAccessible(r1)
                java.util.Map r7 = r10.f8256f
                boolean r7 = r7.containsKey(r6)
                if (r7 != 0) goto L_0x007a
                java.util.Map r7 = r10.f8256f
                r7.put(r6, r5)
                r10.f(r5)
                goto L_0x00a1
            L_0x007a:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Found conflicting getters for name "
                r1.append(r2)
                java.lang.String r2 = r5.getName()
                r1.append(r2)
                java.lang.String r2 = " on class "
                r1.append(r2)
                java.lang.String r11 = r11.getName()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            L_0x00a1:
                int r4 = r4 + 1
                goto L_0x0055
            L_0x00a4:
                java.lang.reflect.Field[] r2 = r11.getFields()
                int r3 = r2.length
                r4 = 0
            L_0x00aa:
                if (r4 >= r3) goto L_0x00c1
                r5 = r2[r4]
                boolean r6 = r(r5)
                if (r6 == 0) goto L_0x00be
                java.lang.String r6 = m(r5)
                r10.c(r6)
                r10.e(r5)
            L_0x00be:
                int r4 = r4 + 1
                goto L_0x00aa
            L_0x00c1:
                r2 = r11
            L_0x00c2:
                java.lang.reflect.Method[] r3 = r2.getDeclaredMethods()
                int r4 = r3.length
                r5 = 0
            L_0x00c8:
                if (r5 >= r4) goto L_0x0199
                r6 = r3[r5]
                boolean r7 = t(r6)
                if (r7 == 0) goto L_0x0195
                java.lang.String r7 = n(r6)
                java.util.Map r8 = r10.f8255e
                java.util.Locale r9 = java.util.Locale.US
                java.lang.String r9 = r7.toLowerCase(r9)
                java.lang.Object r8 = r8.get(r9)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L_0x0195
                boolean r8 = r8.equals(r7)
                if (r8 == 0) goto L_0x016e
                java.util.Map r8 = r10.f8257g
                java.lang.Object r8 = r8.get(r7)
                java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
                if (r8 != 0) goto L_0x0103
                r6.setAccessible(r1)
                java.util.Map r8 = r10.f8257g
                r8.put(r7, r6)
                r10.g(r6)
                goto L_0x0195
            L_0x0103:
                boolean r7 = k(r6, r8)
                if (r7 != 0) goto L_0x0195
                if (r2 != r11) goto L_0x0132
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Class "
                r1.append(r2)
                java.lang.String r11 = r11.getName()
                r1.append(r11)
                java.lang.String r11 = " has multiple setter overloads with name "
                r1.append(r11)
                java.lang.String r11 = r6.getName()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            L_0x0132:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found conflicting setters with name: "
                r0.append(r1)
                java.lang.String r1 = r6.getName()
                r0.append(r1)
                java.lang.String r1 = " (conflicts with "
                r0.append(r1)
                java.lang.String r1 = r8.getName()
                r0.append(r1)
                java.lang.String r1 = " defined on "
                r0.append(r1)
                java.lang.Class r1 = r8.getDeclaringClass()
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
            L_0x016e:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found setter on "
                r0.append(r1)
                java.lang.String r1 = r2.getName()
                r0.append(r1)
                java.lang.String r1 = " with invalid case-sensitive name: "
                r0.append(r1)
                java.lang.String r1 = r6.getName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
            L_0x0195:
                int r5 = r5 + 1
                goto L_0x00c8
            L_0x0199:
                java.lang.reflect.Field[] r3 = r2.getDeclaredFields()
                int r4 = r3.length
                r5 = 0
            L_0x019f:
                if (r5 >= r4) goto L_0x01cb
                r6 = r3[r5]
                java.lang.String r7 = m(r6)
                java.util.Map r8 = r10.f8255e
                java.util.Locale r9 = java.util.Locale.US
                java.lang.String r9 = r7.toLowerCase(r9)
                boolean r8 = r8.containsKey(r9)
                if (r8 == 0) goto L_0x01c8
                java.util.Map r8 = r10.f8258h
                boolean r8 = r8.containsKey(r7)
                if (r8 != 0) goto L_0x01c8
                r6.setAccessible(r1)
                java.util.Map r8 = r10.f8258h
                r8.put(r7, r6)
                r10.e(r6)
            L_0x01c8:
                int r5 = r5 + 1
                goto L_0x019f
            L_0x01cb:
                java.lang.Class r2 = r2.getSuperclass()
                if (r2 == 0) goto L_0x01d9
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                boolean r3 = r2.equals(r3)
                if (r3 == 0) goto L_0x00c2
            L_0x01d9:
                java.util.Map r0 = r10.f8255e
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x022d
                java.util.HashSet r0 = r10.f8260j
                java.util.Iterator r0 = r0.iterator()
            L_0x01e7:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x022c
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.util.Map r2 = r10.f8257g
                boolean r2 = r2.containsKey(r1)
                if (r2 != 0) goto L_0x01e7
                java.util.Map r2 = r10.f8258h
                boolean r2 = r2.containsKey(r1)
                if (r2 == 0) goto L_0x0204
                goto L_0x01e7
            L_0x0204:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "@DocumentId is annotated on property "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " of class "
                r2.append(r1)
                java.lang.String r11 = r11.getName()
                r2.append(r11)
                java.lang.String r11 = " but no field or public setter was found"
                r2.append(r11)
                java.lang.String r11 = r2.toString()
                r0.<init>(r11)
                throw r0
            L_0x022c:
                return
            L_0x022d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "No properties to serialize found on class "
                r1.append(r2)
                java.lang.String r11 = r11.getName()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.util.CustomClassMapper.a.<init>(java.lang.Class):void");
        }

        private void c(String str) {
            Map map = this.f8255e;
            Locale locale = Locale.US;
            String str2 = (String) map.put(str.toLowerCase(locale), str);
            if (str2 != null && !str.equals(str2)) {
                throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
            }
        }

        private static String d(AccessibleObject accessibleObject) {
            Class cls = PropertyName.class;
            if (accessibleObject.isAnnotationPresent(cls)) {
                return ((PropertyName) accessibleObject.getAnnotation(cls)).value();
            }
            return null;
        }

        private void e(Field field) {
            if (field.isAnnotationPresent(ServerTimestamp.class)) {
                Class<?> type = field.getType();
                if (type == Date.class || type == Timestamp.class) {
                    this.f8259i.add(m(field));
                } else {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
            }
            if (field.isAnnotationPresent(DocumentId.class)) {
                j("Field", "is", field.getType());
                this.f8260j.add(m(field));
            }
        }

        private void f(Method method) {
            if (method.isAnnotationPresent(ServerTimestamp.class)) {
                Class<?> returnType = method.getReturnType();
                if (returnType == Date.class || returnType == Timestamp.class) {
                    this.f8259i.add(n(method));
                } else {
                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                }
            }
            if (method.isAnnotationPresent(DocumentId.class)) {
                j("Method", "returns", method.getReturnType());
                this.f8260j.add(n(method));
            }
        }

        private void g(Method method) {
            if (method.isAnnotationPresent(ServerTimestamp.class)) {
                throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
            } else if (method.isAnnotationPresent(DocumentId.class)) {
                j("Method", "accepts", method.getParameterTypes()[0]);
                this.f8260j.add(n(method));
            }
        }

        private void j(String str, String str2, Type type) {
            if (type != String.class && type != DocumentReference.class) {
                throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + type + " instead of String or DocumentReference.");
            }
        }

        private static boolean k(Method method, Method method2) {
            CustomClassMapper.hardAssert(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            CustomClassMapper.hardAssert(method.getReturnType().equals(Void.TYPE), "Expected void return type");
            CustomClassMapper.hardAssert(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
            Class[] parameterTypes = method.getParameterTypes();
            Class[] parameterTypes2 = method2.getParameterTypes();
            CustomClassMapper.hardAssert(parameterTypes.length == 1, "Expected exactly one parameter");
            CustomClassMapper.hardAssert(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        private void l(Map map, b bVar, Object obj, HashSet hashSet) {
            Iterator it = this.f8260j.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!hashSet.contains(str)) {
                    c a10 = bVar.f8261a.a(str);
                    Class<String> cls = String.class;
                    if (this.f8257g.containsKey(str)) {
                        Method method = (Method) this.f8257g.get(str);
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        if (genericParameterTypes.length != 1) {
                            throw CustomClassMapper.deserializeError(a10, "Setter does not have exactly one parameter");
                        } else if (o(genericParameterTypes[0], map) == cls) {
                            ApiUtil.invoke(method, obj, bVar.f8262b.getId());
                        } else {
                            ApiUtil.invoke(method, obj, bVar.f8262b);
                        }
                    } else {
                        Field field = (Field) this.f8258h.get(str);
                        try {
                            field.set(obj, field.getType() == cls ? bVar.f8262b.getId() : bVar.f8262b);
                        } catch (IllegalAccessException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                } else {
                    throw new RuntimeException("'" + str + "' was found from document " + bVar.f8262b.getPath() + ", cannot apply @DocumentId on this property for class " + this.f8251a.getName());
                }
            }
        }

        /* access modifiers changed from: private */
        public static String m(Field field) {
            String d10 = d(field);
            return d10 != null ? d10 : field.getName();
        }

        private static String n(Method method) {
            String d10 = d(method);
            return d10 != null ? d10 : q(method.getName());
        }

        private Type o(Type type, Map map) {
            if (!(type instanceof TypeVariable)) {
                return type;
            }
            Type type2 = (Type) map.get(type);
            if (type2 != null) {
                return type2;
            }
            throw new IllegalStateException("Could not resolve type " + type);
        }

        private static String q(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                String str3 = strArr[i11];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                char[] charArray = str.substring(str2.length()).toCharArray();
                while (i10 < charArray.length && Character.isUpperCase(charArray[i10])) {
                    charArray[i10] = Character.toLowerCase(charArray[i10]);
                    i10++;
                }
                return new String(charArray);
            }
            throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
        }

        private static boolean r(Field field) {
            return !field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(Exclude.class);
        }

        private static boolean s(Method method) {
            return (method.getName().startsWith("get") || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isAnnotationPresent(Exclude.class);
        }

        private static boolean t(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(Exclude.class);
        }

        /* access modifiers changed from: package-private */
        public Object h(Map map, b bVar) {
            return i(map, Collections.emptyMap(), bVar);
        }

        /* access modifiers changed from: package-private */
        public Object i(Map map, Map map2, b bVar) {
            Constructor constructor = this.f8252b;
            if (constructor != null) {
                Object newInstance = ApiUtil.newInstance(constructor);
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    c a10 = bVar.f8261a.a(str);
                    if (this.f8257g.containsKey(str)) {
                        Method method = (Method) this.f8257g.get(str);
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        if (genericParameterTypes.length == 1) {
                            ApiUtil.invoke(method, newInstance, CustomClassMapper.deserializeToType(entry.getValue(), o(genericParameterTypes[0], map2), bVar.a(a10)));
                        } else {
                            throw CustomClassMapper.deserializeError(a10, "Setter does not have exactly one parameter");
                        }
                    } else if (this.f8258h.containsKey(str)) {
                        Field field = (Field) this.f8258h.get(str);
                        try {
                            field.set(newInstance, CustomClassMapper.deserializeToType(entry.getValue(), o(field.getGenericType(), map2), bVar.a(a10)));
                        } catch (IllegalAccessException e10) {
                            throw new RuntimeException(e10);
                        }
                    } else {
                        String str2 = "No setter/field for " + str + " found on class " + this.f8251a.getName();
                        if (this.f8255e.containsKey(str.toLowerCase(Locale.US))) {
                            str2 = str2 + " (fields/setters are case sensitive!)";
                        }
                        if (this.f8253c) {
                            throw new RuntimeException(str2);
                        } else if (this.f8254d) {
                            Logger.warn(CustomClassMapper.class.getSimpleName(), "%s", str2);
                        }
                    }
                    hashSet.add(str);
                }
                l(map2, bVar, newInstance, hashSet);
                return newInstance;
            }
            throw CustomClassMapper.deserializeError(bVar.f8261a, "Class " + this.f8251a.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped");
        }

        /* access modifiers changed from: package-private */
        public Map p(Object obj, c cVar) {
            Object obj2;
            if (this.f8251a.isAssignableFrom(obj.getClass())) {
                HashMap hashMap = new HashMap();
                for (String str : this.f8255e.values()) {
                    if (!this.f8260j.contains(str)) {
                        if (this.f8256f.containsKey(str)) {
                            obj2 = ApiUtil.invoke((Method) this.f8256f.get(str), obj, new Object[0]);
                        } else {
                            Field field = (Field) this.f8258h.get(str);
                            if (field != null) {
                                try {
                                    obj2 = field.get(obj);
                                } catch (IllegalAccessException e10) {
                                    throw new RuntimeException(e10);
                                }
                            } else {
                                throw new IllegalStateException("Bean property without field or getter: " + str);
                            }
                        }
                        hashMap.put(str, (!this.f8259i.contains(str) || obj2 != null) ? CustomClassMapper.serialize(obj2, cVar.a(str)) : FieldValue.serverTimestamp());
                    }
                }
                return hashMap;
            }
            throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + this.f8251a);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final c f8261a;

        /* renamed from: b  reason: collision with root package name */
        final DocumentReference f8262b;

        b(c cVar, DocumentReference documentReference) {
            this.f8261a = cVar;
            this.f8262b = documentReference;
        }

        /* access modifiers changed from: package-private */
        public b a(c cVar) {
            return new b(cVar, this.f8262b);
        }
    }

    static class c {

        /* renamed from: d  reason: collision with root package name */
        static final c f8263d = new c((c) null, (String) null, 0);

        /* renamed from: a  reason: collision with root package name */
        private final int f8264a;

        /* renamed from: b  reason: collision with root package name */
        private final c f8265b;

        /* renamed from: c  reason: collision with root package name */
        private final String f8266c;

        c(c cVar, String str, int i10) {
            this.f8265b = cVar;
            this.f8266c = str;
            this.f8264a = i10;
        }

        /* access modifiers changed from: package-private */
        public c a(String str) {
            return new c(this, str, this.f8264a + 1);
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f8264a;
        }

        public String toString() {
            int i10 = this.f8264a;
            if (i10 == 0) {
                return "";
            }
            if (i10 == 1) {
                return this.f8266c;
            }
            return this.f8265b.toString() + "." + this.f8266c;
        }
    }

    private static <T> T convertBean(Object obj, Class<T> cls, b bVar) {
        a loadOrCreateBeanMapperForClass = loadOrCreateBeanMapperForClass(cls);
        if (obj instanceof Map) {
            return loadOrCreateBeanMapperForClass.h(expectMap(obj, bVar), bVar);
        }
        c cVar = bVar.f8261a;
        throw deserializeError(cVar, "Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
    }

    private static Blob convertBlob(Object obj, b bVar) {
        if (obj instanceof Blob) {
            return (Blob) obj;
        }
        c cVar = bVar.f8261a;
        throw deserializeError(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to Blob");
    }

    private static Boolean convertBoolean(Object obj, b bVar) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        c cVar = bVar.f8261a;
        throw deserializeError(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to boolean");
    }

    private static Date convertDate(Object obj, b bVar) {
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Timestamp) {
            return ((Timestamp) obj).toDate();
        }
        c cVar = bVar.f8261a;
        throw deserializeError(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to Date");
    }

    private static DocumentReference convertDocumentReference(Object obj, b bVar) {
        if (obj instanceof DocumentReference) {
            return (DocumentReference) obj;
        }
        c cVar = bVar.f8261a;
        throw deserializeError(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to DocumentReference");
    }

    private static Double convertDouble(Object obj, b bVar) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (obj instanceof Long) {
            Long l10 = (Long) obj;
            Double valueOf = Double.valueOf(l10.doubleValue());
            if (valueOf.longValue() == l10.longValue()) {
                return valueOf;
            }
            c cVar = bVar.f8261a;
            throw deserializeError(cVar, "Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
        } else if (obj instanceof Double) {
            return (Double) obj;
        } else {
            c cVar2 = bVar.f8261a;
            throw deserializeError(cVar2, "Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
    }

    private static GeoPoint convertGeoPoint(Object obj, b bVar) {
        if (obj instanceof GeoPoint) {
            return (GeoPoint) obj;
        }
        c cVar = bVar.f8261a;
        throw deserializeError(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to GeoPoint");
    }

    private static Integer convertInteger(Object obj, b bVar) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            Number number = (Number) obj;
            double doubleValue = number.doubleValue();
            if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                return Integer.valueOf(number.intValue());
            }
            c cVar = bVar.f8261a;
            throw deserializeError(cVar, "Numeric value out of 32-bit integer range: " + doubleValue + ". Did you mean to use a long or double instead of an int?");
        }
        c cVar2 = bVar.f8261a;
        throw deserializeError(cVar2, "Failed to convert a value of type " + obj.getClass().getName() + " to int");
    }

    private static Long convertLong(Object obj, b bVar) {
        long longValue;
        if (obj instanceof Integer) {
            longValue = ((Integer) obj).longValue();
        } else if (obj instanceof Long) {
            return (Long) obj;
        } else {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                if (d10.doubleValue() < -9.223372036854776E18d || d10.doubleValue() > 9.223372036854776E18d) {
                    c cVar = bVar.f8261a;
                    throw deserializeError(cVar, "Numeric value out of 64-bit long range: " + d10 + ". Did you mean to use a double instead of a long?");
                }
                longValue = d10.longValue();
            } else {
                c cVar2 = bVar.f8261a;
                throw deserializeError(cVar2, "Failed to convert a value of type " + obj.getClass().getName() + " to long");
            }
        }
        return Long.valueOf(longValue);
    }

    private static String convertString(Object obj, b bVar) {
        if (obj instanceof String) {
            return (String) obj;
        }
        c cVar = bVar.f8261a;
        throw deserializeError(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to String");
    }

    private static Timestamp convertTimestamp(Object obj, b bVar) {
        if (obj instanceof Timestamp) {
            return (Timestamp) obj;
        }
        if (obj instanceof Date) {
            return new Timestamp((Date) obj);
        }
        c cVar = bVar.f8261a;
        throw deserializeError(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to Timestamp");
    }

    public static <T> T convertToCustomClass(Object obj, Class<T> cls, DocumentReference documentReference) {
        return deserializeToClass(obj, cls, new b(c.f8263d, documentReference));
    }

    public static Object convertToPlainJavaTypes(Object obj) {
        return serialize(obj);
    }

    /* access modifiers changed from: private */
    public static RuntimeException deserializeError(c cVar, String str) {
        String str2 = "Could not deserialize object. " + str;
        if (cVar.b() > 0) {
            str2 = str2 + " (found in field '" + cVar.toString() + "')";
        }
        return new RuntimeException(str2);
    }

    private static <T> T deserializeToClass(Object obj, Class<T> cls, b bVar) {
        if (obj == null) {
            return null;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls) || Character.class.isAssignableFrom(cls)) {
            return deserializeToPrimitive(obj, cls, bVar);
        }
        if (String.class.isAssignableFrom(cls)) {
            return convertString(obj, bVar);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return convertDate(obj, bVar);
        }
        if (Timestamp.class.isAssignableFrom(cls)) {
            return convertTimestamp(obj, bVar);
        }
        if (Blob.class.isAssignableFrom(cls)) {
            return convertBlob(obj, bVar);
        }
        if (GeoPoint.class.isAssignableFrom(cls)) {
            return convertGeoPoint(obj, bVar);
        }
        if (DocumentReference.class.isAssignableFrom(cls)) {
            return convertDocumentReference(obj, bVar);
        }
        if (cls.isArray()) {
            throw deserializeError(bVar.f8261a, "Converting to Arrays is not supported, please use Lists instead");
        } else if (cls.getTypeParameters().length <= 0) {
            return cls.equals(Object.class) ? obj : cls.isEnum() ? deserializeToEnum(obj, cls, bVar) : convertBean(obj, cls, bVar);
        } else {
            c cVar = bVar.f8261a;
            throw deserializeError(cVar, "Class " + cls.getName() + " has generic type parameters, please use GenericTypeIndicator instead");
        }
    }

    private static <T> T deserializeToEnum(Object obj, Class<T> cls, b bVar) {
        if (obj instanceof String) {
            String str = (String) obj;
            Field[] fields = cls.getFields();
            int length = fields.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    Field field = fields[i10];
                    if (field.isEnumConstant() && str.equals(a.m(field))) {
                        str = field.getName();
                        break;
                    }
                    i10++;
                }
            }
            try {
                return Enum.valueOf(cls, str);
            } catch (IllegalArgumentException unused) {
                c cVar = bVar.f8261a;
                throw deserializeError(cVar, "Could not find enum value of " + cls.getName() + " for value \"" + str + "\"");
            }
        } else {
            c cVar2 = bVar.f8261a;
            throw deserializeError(cVar2, "Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
        }
    }

    private static <T> T deserializeToParameterizedType(Object obj, ParameterizedType parameterizedType, b bVar) {
        Class cls = (Class) parameterizedType.getRawType();
        int i10 = 0;
        if (List.class.isAssignableFrom(cls)) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List list = (List) obj;
                T arrayList = new ArrayList(list.size());
                while (i10 < list.size()) {
                    Object obj2 = list.get(i10);
                    c cVar = bVar.f8261a;
                    arrayList.add(deserializeToType(obj2, type, bVar.a(cVar.a("[" + i10 + "]"))));
                    i10++;
                }
                return arrayList;
            }
            c cVar2 = bVar.f8261a;
            throw deserializeError(cVar2, "Expected a List, but got a " + obj.getClass());
        } else if (Map.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (type2.equals(String.class)) {
                Map<String, Object> expectMap = expectMap(obj, bVar);
                T hashMap = new HashMap();
                for (Map.Entry next : expectMap.entrySet()) {
                    hashMap.put((String) next.getKey(), deserializeToType(next.getValue(), type3, bVar.a(bVar.f8261a.a((String) next.getKey()))));
                }
                return hashMap;
            }
            c cVar3 = bVar.f8261a;
            throw deserializeError(cVar3, "Only Maps with string keys are supported, but found Map with key type " + type2);
        } else if (!Collection.class.isAssignableFrom(cls)) {
            Map<String, Object> expectMap2 = expectMap(obj, bVar);
            a loadOrCreateBeanMapperForClass = loadOrCreateBeanMapperForClass(cls);
            HashMap hashMap2 = new HashMap();
            TypeVariable[] typeParameters = loadOrCreateBeanMapperForClass.f8251a.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == typeParameters.length) {
                while (i10 < typeParameters.length) {
                    hashMap2.put(typeParameters[i10], actualTypeArguments[i10]);
                    i10++;
                }
                return loadOrCreateBeanMapperForClass.i(expectMap2, hashMap2, bVar);
            }
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        } else {
            throw deserializeError(bVar.f8261a, "Collections are not supported, please use Lists instead");
        }
    }

    private static <T> T deserializeToPrimitive(Object obj, Class<T> cls, b bVar) {
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            return convertInteger(obj, bVar);
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            return convertBoolean(obj, bVar);
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return convertDouble(obj, bVar);
        }
        if (Long.class.isAssignableFrom(cls) || Long.TYPE.isAssignableFrom(cls)) {
            return convertLong(obj, bVar);
        }
        if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
            return Float.valueOf(convertDouble(obj, bVar).floatValue());
        }
        throw deserializeError(bVar.f8261a, String.format("Deserializing values to %s is not supported", new Object[]{cls.getSimpleName()}));
    }

    /* access modifiers changed from: private */
    public static <T> T deserializeToType(Object obj, Type type, b bVar) {
        if (obj == null) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return deserializeToParameterizedType(obj, (ParameterizedType) type, bVar);
        }
        if (type instanceof Class) {
            return deserializeToClass(obj, (Class) type, bVar);
        }
        boolean z10 = true;
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length <= 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length <= 0) {
                    z10 = false;
                }
                hardAssert(z10, "Unexpected type bounds on wildcard " + type);
                return deserializeToType(obj, upperBounds[0], bVar);
            }
            throw deserializeError(bVar.f8261a, "Generic lower-bounded wildcard types are not supported");
        } else if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            if (bounds.length <= 0) {
                z10 = false;
            }
            hardAssert(z10, "Unexpected type bounds on type variable " + type);
            return deserializeToType(obj, bounds[0], bVar);
        } else if (type instanceof GenericArrayType) {
            throw deserializeError(bVar.f8261a, "Generic Arrays are not supported, please use Lists instead");
        } else {
            c cVar = bVar.f8261a;
            throw deserializeError(cVar, "Unknown type encountered: " + type);
        }
    }

    private static Map<String, Object> expectMap(Object obj, b bVar) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        c cVar = bVar.f8261a;
        throw deserializeError(cVar, "Expected a Map while deserializing, but got a " + obj.getClass());
    }

    private static void hardAssert(boolean z10) {
        hardAssert(z10, "Internal inconsistency");
    }

    private static <T> a loadOrCreateBeanMapperForClass(Class<T> cls) {
        ConcurrentMap<Class<?>, a> concurrentMap = mappers;
        a aVar = concurrentMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(cls);
        concurrentMap.put(cls, aVar2);
        return aVar2;
    }

    private static <T> Object serialize(T t10) {
        return serialize(t10, c.f8263d);
    }

    private static IllegalArgumentException serializeError(c cVar, String str) {
        String str2 = "Could not serialize object. " + str;
        if (cVar.b() > 0) {
            str2 = str2 + " (found in field '" + cVar.toString() + "')";
        }
        return new IllegalArgumentException(str2);
    }

    public static Map<String, Object> convertToPlainJavaTypes(Map<?, Object> map) {
        Object serialize = serialize(map);
        hardAssert(serialize instanceof Map);
        return (Map) serialize;
    }

    /* access modifiers changed from: private */
    public static void hardAssert(boolean z10, String str) {
        if (!z10) {
            throw new RuntimeException("Hard assert failed: " + str);
        }
    }

    /* access modifiers changed from: private */
    public static <T> Object serialize(T t10, c cVar) {
        if (cVar.b() > 500) {
            throw serializeError(cVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        } else if (t10 == null) {
            return null;
        } else {
            if (t10 instanceof Number) {
                if ((t10 instanceof Long) || (t10 instanceof Integer) || (t10 instanceof Double) || (t10 instanceof Float)) {
                    return t10;
                }
                throw serializeError(cVar, String.format("Numbers of type %s are not supported, please use an int, long, float or double", new Object[]{t10.getClass().getSimpleName()}));
            } else if ((t10 instanceof String) || (t10 instanceof Boolean)) {
                return t10;
            } else {
                if (t10 instanceof Character) {
                    throw serializeError(cVar, "Characters are not supported, please use Strings");
                } else if (t10 instanceof Map) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) t10).entrySet()) {
                        Object key = entry.getKey();
                        if (key instanceof String) {
                            String str = (String) key;
                            hashMap.put(str, serialize(entry.getValue(), cVar.a(str)));
                        } else {
                            throw serializeError(cVar, "Maps with non-string keys are not supported");
                        }
                    }
                    return hashMap;
                } else if (t10 instanceof Collection) {
                    if (t10 instanceof List) {
                        List list = (List) t10;
                        ArrayList arrayList = new ArrayList(list.size());
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            Object obj = list.get(i10);
                            arrayList.add(serialize(obj, cVar.a("[" + i10 + "]")));
                        }
                        return arrayList;
                    }
                    throw serializeError(cVar, "Serializing Collections is not supported, please use Lists instead");
                } else if (t10.getClass().isArray()) {
                    throw serializeError(cVar, "Serializing Arrays is not supported, please use Lists instead");
                } else if (!(t10 instanceof Enum)) {
                    return ((t10 instanceof Date) || (t10 instanceof Timestamp) || (t10 instanceof GeoPoint) || (t10 instanceof Blob) || (t10 instanceof DocumentReference) || (t10 instanceof FieldValue)) ? t10 : loadOrCreateBeanMapperForClass(t10.getClass()).p(t10, cVar);
                } else {
                    String name = ((Enum) t10).name();
                    try {
                        return a.m(t10.getClass().getField(name));
                    } catch (NoSuchFieldException unused) {
                        return name;
                    }
                }
            }
        }
    }
}
