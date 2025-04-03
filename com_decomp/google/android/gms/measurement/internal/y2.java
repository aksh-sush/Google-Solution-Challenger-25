package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhk;
import com.google.firebase.firestore.util.ExponentialBackoff;
import h4.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class y2 {
    public static final x2 A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, e0.f5935a);
    public static final x2 A0;
    public static final x2 B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, f0.f5958a);
    public static final x2 B0;
    public static final x2 C = a("measurement.upload.retry_time", 1800000L, 1800000L, g0.f5983a);
    public static final x2 C0;
    public static final x2 D = a("measurement.upload.retry_count", 6, 6, i0.f6035a);
    public static final x2 E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, j0.f6091a);
    public static final x2 F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, k0.f6132a);
    public static final x2 G = a("measurement.audience.filter_result_max_count", 200, 200, m0.f6193a);
    public static final x2 H = a("measurement.upload.max_public_user_properties", 25, 25, (v2) null);
    public static final x2 I = a("measurement.upload.max_event_name_cardinality", 500, 500, (v2) null);
    public static final x2 J = a("measurement.upload.max_public_event_params", 25, 25, (v2) null);
    public static final x2 K = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, n0.f6224a);
    public static final x2 L;
    public static final x2 M = a("measurement.test.string_flag", "---", "---", p0.f6313a);
    public static final x2 N = a("measurement.test.long_flag", -1L, -1L, q0.f6342a);
    public static final x2 O = a("measurement.test.int_flag", -2, -2, r0.f6372a);
    public static final x2 P;
    public static final x2 Q = a("measurement.experiment.max_ids", 50, 50, u0.f6434a);
    public static final x2 R = a("measurement.max_bundles_per_iteration", 100, 100, v0.f6476a);
    public static final x2 S = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, w0.f6513a);
    public static final x2 T;
    public static final x2 U;
    public static final x2 V;
    public static final x2 W;
    public static final x2 X;
    public static final x2 Y;
    public static final x2 Z;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List f6612a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final x2 f6613a0;

    /* renamed from: b  reason: collision with root package name */
    private static final Set f6614b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0  reason: collision with root package name */
    public static final x2 f6615b0;

    /* renamed from: c  reason: collision with root package name */
    public static final x2 f6616c = a("measurement.ad_id_cache_time", 10000L, 10000L, v.f6475a);

    /* renamed from: c0  reason: collision with root package name */
    public static final x2 f6617c0;

    /* renamed from: d  reason: collision with root package name */
    public static final x2 f6618d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, h0.f6009a);

    /* renamed from: d0  reason: collision with root package name */
    public static final x2 f6619d0;

    /* renamed from: e  reason: collision with root package name */
    public static final x2 f6620e = a("measurement.config.cache_time", 86400000L, 3600000L, y.f6609a);

    /* renamed from: e0  reason: collision with root package name */
    public static final x2 f6621e0;

    /* renamed from: f  reason: collision with root package name */
    public static final x2 f6622f = a("measurement.config.url_scheme", "https", "https", l0.f6157a);

    /* renamed from: f0  reason: collision with root package name */
    public static final x2 f6623f0;

    /* renamed from: g  reason: collision with root package name */
    public static final x2 f6624g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", x0.f6586a);

    /* renamed from: g0  reason: collision with root package name */
    public static final x2 f6625g0;

    /* renamed from: h  reason: collision with root package name */
    public static final x2 f6626h = a("measurement.upload.max_bundles", 100, 100, k1.f6133a);

    /* renamed from: h0  reason: collision with root package name */
    public static final x2 f6627h0;

    /* renamed from: i  reason: collision with root package name */
    public static final x2 f6628i = a("measurement.upload.max_batch_size", 65536, 65536, w1.f6514a);

    /* renamed from: i0  reason: collision with root package name */
    public static final x2 f6629i0;

    /* renamed from: j  reason: collision with root package name */
    public static final x2 f6630j = a("measurement.upload.max_bundle_size", 65536, 65536, j2.f6093a);

    /* renamed from: j0  reason: collision with root package name */
    public static final x2 f6631j0;

    /* renamed from: k  reason: collision with root package name */
    public static final x2 f6632k = a("measurement.upload.max_events_per_bundle", 1000, 1000, q2.f6344a);

    /* renamed from: k0  reason: collision with root package name */
    public static final x2 f6633k0;

    /* renamed from: l  reason: collision with root package name */
    public static final x2 f6634l = a("measurement.upload.max_events_per_day", 100000, 100000, r2.f6374a);

    /* renamed from: l0  reason: collision with root package name */
    public static final x2 f6635l0;

    /* renamed from: m  reason: collision with root package name */
    public static final x2 f6636m = a("measurement.upload.max_error_events_per_day", 1000, 1000, s0.f6390a);

    /* renamed from: m0  reason: collision with root package name */
    public static final x2 f6637m0;

    /* renamed from: n  reason: collision with root package name */
    public static final x2 f6638n = a("measurement.upload.max_public_events_per_day", 50000, 50000, e1.f5936a);

    /* renamed from: n0  reason: collision with root package name */
    public static final x2 f6639n0;

    /* renamed from: o  reason: collision with root package name */
    public static final x2 f6640o = a("measurement.upload.max_conversions_per_day", 10000, 10000, p1.f6314a);

    /* renamed from: o0  reason: collision with root package name */
    public static final x2 f6641o0;

    /* renamed from: p  reason: collision with root package name */
    public static final x2 f6642p = a("measurement.upload.max_realtime_events_per_day", 10, 10, a2.f5831a);

    /* renamed from: p0  reason: collision with root package name */
    public static final x2 f6643p0;

    /* renamed from: q  reason: collision with root package name */
    public static final x2 f6644q = a("measurement.store.max_stored_events_per_app", 100000, 100000, m2.f6195a);

    /* renamed from: q0  reason: collision with root package name */
    public static final x2 f6645q0 = a("measurement.service.storage_consent_support_version", 203600, 203600, z1.f6676a);

    /* renamed from: r  reason: collision with root package name */
    public static final x2 f6646r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", s2.f6392a);

    /* renamed from: r0  reason: collision with root package name */
    public static final x2 f6647r0;

    /* renamed from: s  reason: collision with root package name */
    public static final x2 f6648s = a("measurement.upload.backoff_period", 43200000L, 43200000L, t2.f6414a);

    /* renamed from: s0  reason: collision with root package name */
    public static final x2 f6649s0;

    /* renamed from: t  reason: collision with root package name */
    public static final x2 f6650t = a("measurement.upload.window_interval", 3600000L, 3600000L, u2.f6436a);

    /* renamed from: t0  reason: collision with root package name */
    public static final x2 f6651t0;

    /* renamed from: u  reason: collision with root package name */
    public static final x2 f6652u = a("measurement.upload.interval", 3600000L, 3600000L, w.f6512a);

    /* renamed from: u0  reason: collision with root package name */
    public static final x2 f6653u0;

    /* renamed from: v  reason: collision with root package name */
    public static final x2 f6654v = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, x.f6585a);

    /* renamed from: v0  reason: collision with root package name */
    public static final x2 f6655v0;

    /* renamed from: w  reason: collision with root package name */
    public static final x2 f6656w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, z.f6674a);

    /* renamed from: w0  reason: collision with root package name */
    public static final x2 f6657w0;

    /* renamed from: x  reason: collision with root package name */
    public static final x2 f6658x = a("measurement.upload.minimum_delay", 500L, 500L, b0.f5843a);

    /* renamed from: x0  reason: collision with root package name */
    public static final x2 f6659x0;

    /* renamed from: y  reason: collision with root package name */
    public static final x2 f6660y;

    /* renamed from: y0  reason: collision with root package name */
    public static final x2 f6661y0;

    /* renamed from: z  reason: collision with root package name */
    public static final x2 f6662z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, d0.f5901a);

    /* renamed from: z0  reason: collision with root package name */
    public static final x2 f6663z0;

    static {
        Long valueOf = Long.valueOf(ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS);
        f6660y = a("measurement.alarm_manager.minimum_interval", valueOf, valueOf, c0.f5884a);
        Boolean bool = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", bool, bool, o0.f6275a);
        Double valueOf2 = Double.valueOf(-3.0d);
        P = a("measurement.test.double_flag", valueOf2, valueOf2, t0.f6412a);
        T = a("measurement.validation.internal_limits_internal_event_params", bool, bool, y0.f6610a);
        Boolean bool2 = Boolean.TRUE;
        U = a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, z0.f6675a);
        V = a("measurement.collection.redundant_engagement_removal_enabled", bool, bool, a1.f5830a);
        W = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, c1.f5885a);
        X = a("measurement.quality.checksum", bool, bool, (v2) null);
        Y = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, d1.f5902a);
        Z = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, f1.f5959a);
        f6613a0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, g1.f5984a);
        f6615b0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, h1.f6010a);
        f6617c0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, i1.f6036a);
        f6619d0 = a("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, j1.f6092a);
        f6621e0 = a("measurement.upload.file_lock_state_check", bool2, bool2, l1.f6158a);
        f6623f0 = a("measurement.ga.ga_app_id", bool, bool, m1.f6194a);
        f6625g0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, n1.f6225a);
        f6627h0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, o1.f6276a);
        f6629i0 = a("measurement.lifecycle.app_backgrounded_engagement", bool, bool, q1.f6343a);
        f6631j0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, r1.f6373a);
        f6633k0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, s1.f6391a);
        f6635l0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, t1.f6413a);
        f6637m0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, u1.f6435a);
        f6639n0 = a("measurement.upload.file_truncate_fix", bool, bool, v1.f6477a);
        f6641o0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, x1.f6587a);
        f6643p0 = a("measurement.androidId.delete_feature", bool2, bool2, y1.f6611a);
        f6647r0 = a("measurement.client.properties.non_null_origin", bool2, bool2, b2.f5846a);
        f6649s0 = a("measurement.client.click_identifier_control.dev", bool, bool, d2.f5903a);
        f6651t0 = a("measurement.service.click_identifier_control", bool, bool, e2.f5937a);
        f6653u0 = a("measurement.client.reject_blank_user_id", bool2, bool2, f2.f5960a);
        f6655v0 = a("measurement.config.persist_last_modified", bool2, bool2, g2.f5985a);
        f6657w0 = a("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, h2.f6011a);
        f6659x0 = a("measurement.module.pixie.ees", bool, bool, i2.f6037a);
        f6661y0 = a("measurement.euid.client.dev", bool, bool, k2.f6134a);
        f6663z0 = a("measurement.euid.service", bool, bool, l2.f6159a);
        A0 = a("measurement.adid_zero.service", bool, bool, n2.f6226a);
        B0 = a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, o2.f6277a);
        C0 = a("measurement.service.refactor.package_side_screen", bool2, bool2, p2.f6315a);
    }

    static x2 a(String str, Object obj, Object obj2, v2 v2Var) {
        x2 x2Var = new x2(str, obj, obj2, v2Var, (b) null);
        f6612a.add(x2Var);
        return x2Var;
    }

    public static Map c(Context context) {
        zzha zza = zzha.zza(context.getContentResolver(), zzhk.zza("com.google.android.gms.measurement"));
        return zza == null ? Collections.emptyMap() : zza.zzc();
    }
}
