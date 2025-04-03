package com.onesignal.common;

import java.util.regex.Pattern;

public final class l {
    public static final l INSTANCE = new l();
    public static final String SDK_VERSION = "050100";

    private l() {
    }

    public final boolean isValidEmail(String str) {
        db.l.e(str, "email");
        if (str.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        db.l.d(compile, "compile(emRegex)");
        return compile.matcher(str).matches();
    }

    public final boolean isValidPhoneNumber(String str) {
        db.l.e(str, "number");
        if (str.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        db.l.d(compile, "compile(emRegex)");
        return compile.matcher(str).matches();
    }
}
