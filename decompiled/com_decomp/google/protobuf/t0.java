package com.google.protobuf;

import java.io.OutputStream;

public interface t0 extends u0 {

    public interface a extends u0, Cloneable {
        t0 build();

        t0 buildPartial();

        a mergeFrom(t0 t0Var);
    }

    d1 getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    void writeTo(m mVar);

    void writeTo(OutputStream outputStream);
}
