package com.google.common.collect;

abstract class k {
    static int a(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * -862048943), 15)) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
