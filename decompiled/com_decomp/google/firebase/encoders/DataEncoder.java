package com.google.firebase.encoders;

import java.io.Writer;

public interface DataEncoder {
    String encode(Object obj);

    void encode(Object obj, Writer writer);
}
