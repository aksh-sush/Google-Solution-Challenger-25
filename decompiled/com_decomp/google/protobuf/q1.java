package com.google.protobuf;

abstract class q1 {

    static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f8732a;

        a(j jVar) {
            this.f8732a = jVar;
        }

        public byte a(int i10) {
            return this.f8732a.f(i10);
        }

        public int size() {
            return this.f8732a.size();
        }
    }

    private interface b {
        byte a(int i10);

        int size();
    }

    static String a(j jVar) {
        return b(new a(jVar));
    }

    static String b(b bVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            int a10 = bVar.a(i10);
            if (a10 == 34) {
                str = "\\\"";
            } else if (a10 == 39) {
                str = "\\'";
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a10 < 32 || a10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a10 >>> 6) & 3) + 48));
                            sb2.append((char) (((a10 >>> 3) & 7) + 48));
                            a10 = (a10 & 7) + 48;
                        }
                        sb2.append((char) a10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    static String c(String str) {
        return a(j.q(str));
    }
}
