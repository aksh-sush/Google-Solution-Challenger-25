package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private TextView f1046a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f1047b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    a0(TextView textView) {
        this.f1046a = (TextView) androidx.core.util.h.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1047b;
        return textClassifier == null ? a.a(this.f1046a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1047b = textClassifier;
    }
}