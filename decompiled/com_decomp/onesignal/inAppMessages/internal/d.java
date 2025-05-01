package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.display.impl.i;
import db.g;

public class d {
    public static final a Companion = new a((g) null);
    public static final String DISPLAY_DURATION = "display_duration";
    public static final String HTML = "html";
    public static final String REMOVE_HEIGHT_MARGIN = "remove_height_margin";
    public static final String REMOVE_WIDTH_MARGIN = "remove_width_margin";
    public static final String STYLES = "styles";
    private String contentHtml;
    private Double displayDuration;
    private i.c displayLocation;
    private boolean isFullBleed;
    private int pageHeight;
    private boolean useHeightMargin = true;
    private boolean useWidthMargin = true;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        r2 = com.onesignal.common.i.safeBool(r4, REMOVE_HEIGHT_MARGIN);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.String r0 = "jsonObject"
            db.l.e(r4, r0)
            r3.<init>()
            r0 = 1
            r3.useHeightMargin = r0
            r3.useWidthMargin = r0
            java.lang.String r1 = "html"
            java.lang.String r1 = com.onesignal.common.i.safeString(r4, r1)
            r3.contentHtml = r1
            java.lang.String r1 = "display_duration"
            java.lang.Double r1 = com.onesignal.common.i.safeDouble(r4, r1)
            r3.displayDuration = r1
            java.lang.String r1 = "styles"
            org.json.JSONObject r4 = com.onesignal.common.i.safeJSONObject(r4, r1)
            r1 = 0
            if (r4 == 0) goto L_0x0033
            java.lang.String r2 = "remove_height_margin"
            java.lang.Boolean r2 = com.onesignal.common.i.safeBool(r4, r2)
            if (r2 == 0) goto L_0x0033
            boolean r2 = r2.booleanValue()
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r2 = r2 ^ r0
            r3.useHeightMargin = r2
            if (r4 == 0) goto L_0x0045
            java.lang.String r2 = "remove_width_margin"
            java.lang.Boolean r4 = com.onesignal.common.i.safeBool(r4, r2)
            if (r4 == 0) goto L_0x0045
            boolean r1 = r4.booleanValue()
        L_0x0045:
            r4 = r1 ^ 1
            r3.useWidthMargin = r4
            boolean r4 = r3.useHeightMargin
            r4 = r4 ^ r0
            r3.isFullBleed = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.d.<init>(org.json.JSONObject):void");
    }

    public final String getContentHtml() {
        return this.contentHtml;
    }

    public final Double getDisplayDuration() {
        return this.displayDuration;
    }

    public final i.c getDisplayLocation() {
        return this.displayLocation;
    }

    public final int getPageHeight() {
        return this.pageHeight;
    }

    public final boolean getUseHeightMargin() {
        return this.useHeightMargin;
    }

    public final boolean getUseWidthMargin() {
        return this.useWidthMargin;
    }

    public final boolean isFullBleed() {
        return this.isFullBleed;
    }

    public final void setContentHtml(String str) {
        this.contentHtml = str;
    }

    public final void setDisplayDuration(Double d10) {
        this.displayDuration = d10;
    }

    public final void setDisplayLocation(i.c cVar) {
        this.displayLocation = cVar;
    }

    public final void setFullBleed(boolean z10) {
        this.isFullBleed = z10;
    }

    public final void setPageHeight(int i10) {
        this.pageHeight = i10;
    }

    public final void setUseHeightMargin(boolean z10) {
        this.useHeightMargin = z10;
    }

    public final void setUseWidthMargin(boolean z10) {
        this.useWidthMargin = z10;
    }
}
