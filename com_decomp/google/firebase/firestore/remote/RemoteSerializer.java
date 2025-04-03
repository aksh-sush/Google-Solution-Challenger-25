package com.google.firebase.firestore.remote;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.model.mutation.ArrayTransformOperation;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.model.mutation.FieldTransform;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.model.mutation.NumericIncrementTransformOperation;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.model.mutation.ServerTimestampOperation;
import com.google.firebase.firestore.model.mutation.SetMutation;
import com.google.firebase.firestore.model.mutation.TransformOperation;
import com.google.firebase.firestore.model.mutation.VerifyMutation;
import com.google.firebase.firestore.remote.WatchChange;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.a0;
import com.google.protobuf.r1;
import fa.d1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import t5.c0;
import t5.d;
import t5.g;
import t5.h;
import t5.i;
import t5.j;
import t5.k;
import t5.l;
import t5.m;
import t5.n;
import t5.q;
import t5.s;
import t5.t;
import t5.u;
import t5.v;
import t5.x;
import t5.y;

public final class RemoteSerializer {
    private final DatabaseId databaseId;
    private final String databaseName;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8163a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f8164b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f8165c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f8166d;

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ int[] f8167e;

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ int[] f8168f;

        /* renamed from: g  reason: collision with root package name */
        static final /* synthetic */ int[] f8169g;

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ int[] f8170h;

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ int[] f8171i;

        /* renamed from: j  reason: collision with root package name */
        static final /* synthetic */ int[] f8172j;

        /* renamed from: k  reason: collision with root package name */
        static final /* synthetic */ int[] f8173k;

        /* JADX WARNING: Can't wrap try/catch for region: R(111:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|(2:63|64)|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|(2:119|120)|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|(3:145|146|148)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(112:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|(2:63|64)|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|(2:119|120)|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|(3:145|146|148)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(114:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|(2:119|120)|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|(3:145|146|148)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(115:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|(3:145|146|148)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(118:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(119:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(120:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(122:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(123:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(124:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(125:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(126:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(127:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|137|138|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(129:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|67|68|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|137|138|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x019f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x01e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x01f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x020e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x0218 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0222 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x023d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x0247 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0262 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x026c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x012a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0134 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x013e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0148 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0152 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0166 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0170 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x017a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0195 */
        static {
            /*
                t5.q$c[] r0 = t5.q.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8173k = r0
                r1 = 1
                t5.q$c r2 = t5.q.c.TARGET_CHANGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8173k     // Catch:{ NoSuchFieldError -> 0x001d }
                t5.q$c r3 = t5.q.c.DOCUMENT_CHANGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f8173k     // Catch:{ NoSuchFieldError -> 0x0028 }
                t5.q$c r4 = t5.q.c.DOCUMENT_DELETE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f8173k     // Catch:{ NoSuchFieldError -> 0x0033 }
                t5.q$c r5 = t5.q.c.DOCUMENT_REMOVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f8173k     // Catch:{ NoSuchFieldError -> 0x003e }
                t5.q$c r6 = t5.q.c.FILTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f8173k     // Catch:{ NoSuchFieldError -> 0x0049 }
                t5.q$c r7 = t5.q.c.RESPONSETYPE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                t5.v$c[] r6 = t5.v.c.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f8172j = r6
                t5.v$c r7 = t5.v.c.NO_CHANGE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r6 = f8172j     // Catch:{ NoSuchFieldError -> 0x0064 }
                t5.v$c r7 = t5.v.c.ADD     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r6 = f8172j     // Catch:{ NoSuchFieldError -> 0x006e }
                t5.v$c r7 = t5.v.c.REMOVE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r6 = f8172j     // Catch:{ NoSuchFieldError -> 0x0078 }
                t5.v$c r7 = t5.v.c.CURRENT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r6 = f8172j     // Catch:{ NoSuchFieldError -> 0x0082 }
                t5.v$c r7 = t5.v.c.RESET     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r6 = f8172j     // Catch:{ NoSuchFieldError -> 0x008c }
                t5.v$c r7 = t5.v.c.UNRECOGNIZED     // Catch:{ NoSuchFieldError -> 0x008c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                t5.t$e[] r6 = t5.t.e.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f8171i = r6
                t5.t$e r7 = t5.t.e.ASCENDING     // Catch:{ NoSuchFieldError -> 0x009d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r6 = f8171i     // Catch:{ NoSuchFieldError -> 0x00a7 }
                t5.t$e r7 = t5.t.e.DESCENDING     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                t5.t$f$b[] r6 = t5.t.f.b.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f8170h = r6
                t5.t$f$b r7 = t5.t.f.b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                int[] r6 = f8170h     // Catch:{ NoSuchFieldError -> 0x00c2 }
                t5.t$f$b r7 = t5.t.f.b.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r6 = f8170h     // Catch:{ NoSuchFieldError -> 0x00cc }
                t5.t$f$b r7 = t5.t.f.b.EQUAL     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r6 = f8170h     // Catch:{ NoSuchFieldError -> 0x00d6 }
                t5.t$f$b r7 = t5.t.f.b.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x00d6 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d6 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x00d6 }
            L_0x00d6:
                int[] r6 = f8170h     // Catch:{ NoSuchFieldError -> 0x00e0 }
                t5.t$f$b r7 = t5.t.f.b.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x00e0 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e0 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x00e0 }
            L_0x00e0:
                int[] r6 = f8170h     // Catch:{ NoSuchFieldError -> 0x00ea }
                t5.t$f$b r7 = t5.t.f.b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x00ea }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ea }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x00ea }
            L_0x00ea:
                r6 = 7
                int[] r7 = f8170h     // Catch:{ NoSuchFieldError -> 0x00f5 }
                t5.t$f$b r8 = t5.t.f.b.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                r7 = 8
                int[] r8 = f8170h     // Catch:{ NoSuchFieldError -> 0x0101 }
                t5.t$f$b r9 = t5.t.f.b.IN     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                r8 = 9
                int[] r9 = f8170h     // Catch:{ NoSuchFieldError -> 0x010d }
                t5.t$f$b r10 = t5.t.f.b.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x010d }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x010d }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x010d }
            L_0x010d:
                r9 = 10
                int[] r10 = f8170h     // Catch:{ NoSuchFieldError -> 0x0119 }
                t5.t$f$b r11 = t5.t.f.b.NOT_IN     // Catch:{ NoSuchFieldError -> 0x0119 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0119 }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x0119 }
            L_0x0119:
                com.google.firebase.firestore.core.Filter$Operator[] r10 = com.google.firebase.firestore.core.Filter.Operator.values()
                int r10 = r10.length
                int[] r10 = new int[r10]
                f8169g = r10
                com.google.firebase.firestore.core.Filter$Operator r11 = com.google.firebase.firestore.core.Filter.Operator.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x012a }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x012a }
                r10[r11] = r1     // Catch:{ NoSuchFieldError -> 0x012a }
            L_0x012a:
                int[] r10 = f8169g     // Catch:{ NoSuchFieldError -> 0x0134 }
                com.google.firebase.firestore.core.Filter$Operator r11 = com.google.firebase.firestore.core.Filter.Operator.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x0134 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0134 }
                r10[r11] = r0     // Catch:{ NoSuchFieldError -> 0x0134 }
            L_0x0134:
                int[] r10 = f8169g     // Catch:{ NoSuchFieldError -> 0x013e }
                com.google.firebase.firestore.core.Filter$Operator r11 = com.google.firebase.firestore.core.Filter.Operator.EQUAL     // Catch:{ NoSuchFieldError -> 0x013e }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x013e }
                r10[r11] = r2     // Catch:{ NoSuchFieldError -> 0x013e }
            L_0x013e:
                int[] r10 = f8169g     // Catch:{ NoSuchFieldError -> 0x0148 }
                com.google.firebase.firestore.core.Filter$Operator r11 = com.google.firebase.firestore.core.Filter.Operator.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0148 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0148 }
                r10[r11] = r3     // Catch:{ NoSuchFieldError -> 0x0148 }
            L_0x0148:
                int[] r10 = f8169g     // Catch:{ NoSuchFieldError -> 0x0152 }
                com.google.firebase.firestore.core.Filter$Operator r11 = com.google.firebase.firestore.core.Filter.Operator.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0152 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0152 }
                r10[r11] = r4     // Catch:{ NoSuchFieldError -> 0x0152 }
            L_0x0152:
                int[] r4 = f8169g     // Catch:{ NoSuchFieldError -> 0x015c }
                com.google.firebase.firestore.core.Filter$Operator r10 = com.google.firebase.firestore.core.Filter.Operator.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x015c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r4[r10] = r5     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r4 = f8169g     // Catch:{ NoSuchFieldError -> 0x0166 }
                com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x0166 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0166 }
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0166 }
            L_0x0166:
                int[] r4 = f8169g     // Catch:{ NoSuchFieldError -> 0x0170 }
                com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.IN     // Catch:{ NoSuchFieldError -> 0x0170 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0170 }
                r4[r5] = r7     // Catch:{ NoSuchFieldError -> 0x0170 }
            L_0x0170:
                int[] r4 = f8169g     // Catch:{ NoSuchFieldError -> 0x017a }
                com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x017a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x017a }
                r4[r5] = r8     // Catch:{ NoSuchFieldError -> 0x017a }
            L_0x017a:
                int[] r4 = f8169g     // Catch:{ NoSuchFieldError -> 0x0184 }
                com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.NOT_IN     // Catch:{ NoSuchFieldError -> 0x0184 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0184 }
                r4[r5] = r9     // Catch:{ NoSuchFieldError -> 0x0184 }
            L_0x0184:
                t5.t$k$b[] r4 = t5.t.k.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f8168f = r4
                t5.t$k$b r5 = t5.t.k.b.IS_NAN     // Catch:{ NoSuchFieldError -> 0x0195 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0195 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0195 }
            L_0x0195:
                int[] r4 = f8168f     // Catch:{ NoSuchFieldError -> 0x019f }
                t5.t$k$b r5 = t5.t.k.b.IS_NULL     // Catch:{ NoSuchFieldError -> 0x019f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x019f }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x019f }
            L_0x019f:
                int[] r4 = f8168f     // Catch:{ NoSuchFieldError -> 0x01a9 }
                t5.t$k$b r5 = t5.t.k.b.IS_NOT_NAN     // Catch:{ NoSuchFieldError -> 0x01a9 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a9 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x01a9 }
            L_0x01a9:
                int[] r4 = f8168f     // Catch:{ NoSuchFieldError -> 0x01b3 }
                t5.t$k$b r5 = t5.t.k.b.IS_NOT_NULL     // Catch:{ NoSuchFieldError -> 0x01b3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b3 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x01b3 }
            L_0x01b3:
                t5.t$h$b[] r4 = t5.t.h.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f8167e = r4
                t5.t$h$b r5 = t5.t.h.b.COMPOSITE_FILTER     // Catch:{ NoSuchFieldError -> 0x01c4 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c4 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x01c4 }
            L_0x01c4:
                int[] r4 = f8167e     // Catch:{ NoSuchFieldError -> 0x01ce }
                t5.t$h$b r5 = t5.t.h.b.FIELD_FILTER     // Catch:{ NoSuchFieldError -> 0x01ce }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ce }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x01ce }
            L_0x01ce:
                int[] r4 = f8167e     // Catch:{ NoSuchFieldError -> 0x01d8 }
                t5.t$h$b r5 = t5.t.h.b.UNARY_FILTER     // Catch:{ NoSuchFieldError -> 0x01d8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d8 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x01d8 }
            L_0x01d8:
                com.google.firebase.firestore.local.QueryPurpose[] r4 = com.google.firebase.firestore.local.QueryPurpose.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f8166d = r4
                com.google.firebase.firestore.local.QueryPurpose r5 = com.google.firebase.firestore.local.QueryPurpose.LISTEN     // Catch:{ NoSuchFieldError -> 0x01e9 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e9 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x01e9 }
            L_0x01e9:
                int[] r4 = f8166d     // Catch:{ NoSuchFieldError -> 0x01f3 }
                com.google.firebase.firestore.local.QueryPurpose r5 = com.google.firebase.firestore.local.QueryPurpose.EXISTENCE_FILTER_MISMATCH     // Catch:{ NoSuchFieldError -> 0x01f3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f3 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x01f3 }
            L_0x01f3:
                int[] r4 = f8166d     // Catch:{ NoSuchFieldError -> 0x01fd }
                com.google.firebase.firestore.local.QueryPurpose r5 = com.google.firebase.firestore.local.QueryPurpose.LIMBO_RESOLUTION     // Catch:{ NoSuchFieldError -> 0x01fd }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01fd }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x01fd }
            L_0x01fd:
                t5.m$c$c[] r4 = t5.m.c.C0299c.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f8165c = r4
                t5.m$c$c r5 = t5.m.c.C0299c.SET_TO_SERVER_VALUE     // Catch:{ NoSuchFieldError -> 0x020e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x020e }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x020e }
            L_0x020e:
                int[] r4 = f8165c     // Catch:{ NoSuchFieldError -> 0x0218 }
                t5.m$c$c r5 = t5.m.c.C0299c.APPEND_MISSING_ELEMENTS     // Catch:{ NoSuchFieldError -> 0x0218 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0218 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0218 }
            L_0x0218:
                int[] r4 = f8165c     // Catch:{ NoSuchFieldError -> 0x0222 }
                t5.m$c$c r5 = t5.m.c.C0299c.REMOVE_ALL_FROM_ARRAY     // Catch:{ NoSuchFieldError -> 0x0222 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0222 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0222 }
            L_0x0222:
                int[] r4 = f8165c     // Catch:{ NoSuchFieldError -> 0x022c }
                t5.m$c$c r5 = t5.m.c.C0299c.INCREMENT     // Catch:{ NoSuchFieldError -> 0x022c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x022c }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x022c }
            L_0x022c:
                t5.s$c[] r3 = t5.s.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f8164b = r3
                t5.s$c r4 = t5.s.c.UPDATE_TIME     // Catch:{ NoSuchFieldError -> 0x023d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x023d }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x023d }
            L_0x023d:
                int[] r3 = f8164b     // Catch:{ NoSuchFieldError -> 0x0247 }
                t5.s$c r4 = t5.s.c.EXISTS     // Catch:{ NoSuchFieldError -> 0x0247 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0247 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0247 }
            L_0x0247:
                int[] r3 = f8164b     // Catch:{ NoSuchFieldError -> 0x0251 }
                t5.s$c r4 = t5.s.c.CONDITIONTYPE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0251 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0251 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0251 }
            L_0x0251:
                t5.y$c[] r3 = t5.y.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f8163a = r3
                t5.y$c r4 = t5.y.c.UPDATE     // Catch:{ NoSuchFieldError -> 0x0262 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0262 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0262 }
            L_0x0262:
                int[] r1 = f8163a     // Catch:{ NoSuchFieldError -> 0x026c }
                t5.y$c r3 = t5.y.c.DELETE     // Catch:{ NoSuchFieldError -> 0x026c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x026c }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x026c }
            L_0x026c:
                int[] r0 = f8163a     // Catch:{ NoSuchFieldError -> 0x0276 }
                t5.y$c r1 = t5.y.c.VERIFY     // Catch:{ NoSuchFieldError -> 0x0276 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0276 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0276 }
            L_0x0276:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.RemoteSerializer.a.<clinit>():void");
        }
    }

    public RemoteSerializer(DatabaseId databaseId2) {
        this.databaseId = databaseId2;
        this.databaseName = encodedDatabaseId(databaseId2).canonicalString();
    }

    private Bound decodeBound(g gVar) {
        return new Bound(gVar.a(), gVar.m());
    }

    private FieldMask decodeDocumentMask(k kVar) {
        int n10 = kVar.n();
        HashSet hashSet = new HashSet(n10);
        for (int i10 = 0; i10 < n10; i10++) {
            hashSet.add(FieldPath.fromServerFormat(kVar.m(i10)));
        }
        return FieldMask.fromSet(hashSet);
    }

    private Filter.Operator decodeFieldFilterOperator(t.f.b bVar) {
        switch (a.f8170h[bVar.ordinal()]) {
            case 1:
                return Filter.Operator.LESS_THAN;
            case 2:
                return Filter.Operator.LESS_THAN_OR_EQUAL;
            case 3:
                return Filter.Operator.EQUAL;
            case 4:
                return Filter.Operator.NOT_EQUAL;
            case 5:
                return Filter.Operator.GREATER_THAN_OR_EQUAL;
            case 6:
                return Filter.Operator.GREATER_THAN;
            case 7:
                return Filter.Operator.ARRAY_CONTAINS;
            case 8:
                return Filter.Operator.IN;
            case 9:
                return Filter.Operator.ARRAY_CONTAINS_ANY;
            case 10:
                return Filter.Operator.NOT_IN;
            default:
                throw Assert.fail("Unhandled FieldFilter.operator %d", bVar);
        }
    }

    private FieldTransform decodeFieldTransform(m.c cVar) {
        int i10 = a.f8165c[cVar.s().ordinal()];
        if (i10 == 1) {
            Assert.hardAssert(cVar.r() == m.c.b.REQUEST_TIME, "Unknown transform setToServerValue: %s", cVar.r());
            return new FieldTransform(FieldPath.fromServerFormat(cVar.o()), ServerTimestampOperation.getInstance());
        } else if (i10 == 2) {
            return new FieldTransform(FieldPath.fromServerFormat(cVar.o()), new ArrayTransformOperation.Union(cVar.n().a()));
        } else {
            if (i10 == 3) {
                return new FieldTransform(FieldPath.fromServerFormat(cVar.o()), new ArrayTransformOperation.Remove(cVar.q().a()));
            }
            if (i10 == 4) {
                return new FieldTransform(FieldPath.fromServerFormat(cVar.o()), new NumericIncrementTransformOperation(cVar.p()));
            }
            throw Assert.fail("Unknown FieldTransform proto: %s", cVar);
        }
    }

    private List<Filter> decodeFilters(t.h hVar) {
        List<t.h> list;
        Object obj;
        if (hVar.o() == t.h.b.COMPOSITE_FILTER) {
            Assert.hardAssert(hVar.l().o() == t.d.b.AND, "Only AND-type composite filters are supported, got %d", hVar.l().o());
            list = hVar.l().n();
        } else {
            list = Collections.singletonList(hVar);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (t.h hVar2 : list) {
            int i10 = a.f8167e[hVar2.o().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    obj = decodeFieldFilter(hVar2.n());
                } else if (i10 == 3) {
                    obj = decodeUnaryFilter(hVar2.p());
                } else {
                    throw Assert.fail("Unrecognized Filter.filterType %d", hVar2.o());
                }
                arrayList.add(obj);
            } else {
                throw Assert.fail("Nested composite filters are not supported.", new Object[0]);
            }
        }
        return arrayList;
    }

    private MutableDocument decodeFoundDocument(d dVar) {
        Assert.hardAssert(dVar.l().equals(d.c.FOUND), "Tried to deserialize a found document from a missing document.", new Object[0]);
        DocumentKey decodeKey = decodeKey(dVar.j().getName());
        ObjectValue fromMap = ObjectValue.fromMap(dVar.j().m());
        SnapshotVersion decodeVersion = decodeVersion(dVar.j().o());
        Assert.hardAssert(!decodeVersion.equals(SnapshotVersion.NONE), "Got a document response with no snapshot version", new Object[0]);
        return MutableDocument.newFoundDocument(decodeKey, decodeVersion, fromMap);
    }

    private MutableDocument decodeMissingDocument(d dVar) {
        Assert.hardAssert(dVar.l().equals(d.c.MISSING), "Tried to deserialize a missing document from a found document.", new Object[0]);
        DocumentKey decodeKey = decodeKey(dVar.k());
        SnapshotVersion decodeVersion = decodeVersion(dVar.getReadTime());
        Assert.hardAssert(!decodeVersion.equals(SnapshotVersion.NONE), "Got a no document response with no snapshot version", new Object[0]);
        return MutableDocument.newNoDocument(decodeKey, decodeVersion);
    }

    private OrderBy decodeOrderBy(t.i iVar) {
        OrderBy.Direction direction;
        FieldPath fromServerFormat = FieldPath.fromServerFormat(iVar.l().k());
        int i10 = a.f8171i[iVar.k().ordinal()];
        if (i10 == 1) {
            direction = OrderBy.Direction.ASCENDING;
        } else if (i10 == 2) {
            direction = OrderBy.Direction.DESCENDING;
        } else {
            throw Assert.fail("Unrecognized direction %d", iVar.k());
        }
        return OrderBy.getInstance(direction, fromServerFormat);
    }

    private Precondition decodePrecondition(s sVar) {
        int i10 = a.f8164b[sVar.k().ordinal()];
        if (i10 == 1) {
            return Precondition.updateTime(decodeVersion(sVar.n()));
        }
        if (i10 == 2) {
            return Precondition.exists(sVar.m());
        }
        if (i10 == 3) {
            return Precondition.NONE;
        }
        throw Assert.fail("Unknown precondition", new Object[0]);
    }

    private ResourcePath decodeQueryPath(String str) {
        ResourcePath decodeResourceName = decodeResourceName(str);
        return decodeResourceName.length() == 4 ? ResourcePath.EMPTY : extractLocalPathFromResourceName(decodeResourceName);
    }

    private ResourcePath decodeResourceName(String str) {
        ResourcePath fromString = ResourcePath.fromString(str);
        Assert.hardAssert(isValidResourceName(fromString), "Tried to deserialize invalid key %s", fromString);
        return fromString;
    }

    private Filter decodeUnaryFilter(t.k kVar) {
        Filter.Operator operator;
        Filter.Operator operator2;
        x xVar;
        FieldPath fromServerFormat = FieldPath.fromServerFormat(kVar.l().k());
        int i10 = a.f8168f[kVar.m().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                operator2 = Filter.Operator.EQUAL;
            } else if (i10 == 3) {
                operator = Filter.Operator.NOT_EQUAL;
                xVar = Values.NAN_VALUE;
            } else if (i10 == 4) {
                operator2 = Filter.Operator.NOT_EQUAL;
            } else {
                throw Assert.fail("Unrecognized UnaryFilter.operator %d", kVar.m());
            }
            xVar = Values.NULL_VALUE;
        } else {
            operator = Filter.Operator.EQUAL;
            xVar = Values.NAN_VALUE;
        }
        return FieldFilter.create(fromServerFormat, operator2, xVar);
    }

    private g encodeBound(Bound bound) {
        g.b o10 = g.o();
        o10.e(bound.getPosition());
        o10.f(bound.isBefore());
        return (g) o10.build();
    }

    private k encodeDocumentMask(FieldMask fieldMask) {
        k.b o10 = k.o();
        for (FieldPath canonicalString : fieldMask.getMask()) {
            o10.e(canonicalString.canonicalString());
        }
        return (k) o10.build();
    }

    private t.f.b encodeFieldFilterOperator(Filter.Operator operator) {
        switch (a.f8169g[operator.ordinal()]) {
            case 1:
                return t.f.b.LESS_THAN;
            case 2:
                return t.f.b.LESS_THAN_OR_EQUAL;
            case 3:
                return t.f.b.EQUAL;
            case 4:
                return t.f.b.NOT_EQUAL;
            case 5:
                return t.f.b.GREATER_THAN;
            case 6:
                return t.f.b.GREATER_THAN_OR_EQUAL;
            case 7:
                return t.f.b.ARRAY_CONTAINS;
            case 8:
                return t.f.b.IN;
            case 9:
                return t.f.b.ARRAY_CONTAINS_ANY;
            case 10:
                return t.f.b.NOT_IN;
            default:
                throw Assert.fail("Unknown operator %d", operator);
        }
    }

    private t.g encodeFieldPath(FieldPath fieldPath) {
        return (t.g) t.g.l().e(fieldPath.canonicalString()).build();
    }

    private m.c encodeFieldTransform(FieldTransform fieldTransform) {
        m.c.a g10;
        TransformOperation operation = fieldTransform.getOperation();
        if (operation instanceof ServerTimestampOperation) {
            g10 = m.c.t().f(fieldTransform.getFieldPath().canonicalString()).i(m.c.b.REQUEST_TIME);
        } else if (operation instanceof ArrayTransformOperation.Union) {
            g10 = m.c.t().f(fieldTransform.getFieldPath().canonicalString()).e(t5.a.r().e(((ArrayTransformOperation.Union) operation).getElements()));
        } else if (operation instanceof ArrayTransformOperation.Remove) {
            g10 = m.c.t().f(fieldTransform.getFieldPath().canonicalString()).h(t5.a.r().e(((ArrayTransformOperation.Remove) operation).getElements()));
        } else if (operation instanceof NumericIncrementTransformOperation) {
            g10 = m.c.t().f(fieldTransform.getFieldPath().canonicalString()).g(((NumericIncrementTransformOperation) operation).getOperand());
        } else {
            throw Assert.fail("Unknown transform: %s", operation);
        }
        return (m.c) g10.build();
    }

    private t.h encodeFilters(List<Filter> list) {
        Object build;
        ArrayList arrayList = new ArrayList(list.size());
        for (Filter next : list) {
            if (next instanceof FieldFilter) {
                arrayList.add(encodeUnaryOrFieldFilter((FieldFilter) next));
            }
        }
        if (list.size() == 1) {
            build = arrayList.get(0);
        } else {
            t.d.a p10 = t.d.p();
            p10.f(t.d.b.AND);
            p10.e(arrayList);
            build = t.h.q().e(p10).build();
        }
        return (t.h) build;
    }

    private String encodeLabel(QueryPurpose queryPurpose) {
        int i10 = a.f8166d[queryPurpose.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return "existence-filter-mismatch";
        }
        if (i10 == 3) {
            return "limbo-document";
        }
        throw Assert.fail("Unrecognized query purpose: %s", queryPurpose);
    }

    private t.i encodeOrderBy(OrderBy orderBy) {
        t.i.a m10 = t.i.m();
        m10.e(orderBy.getDirection().equals(OrderBy.Direction.ASCENDING) ? t.e.ASCENDING : t.e.DESCENDING);
        m10.f(encodeFieldPath(orderBy.getField()));
        return (t.i) m10.build();
    }

    private s encodePrecondition(Precondition precondition) {
        s.b e10;
        Assert.hardAssert(!precondition.isNone(), "Can't serialize an empty precondition", new Object[0]);
        s.b o10 = s.o();
        if (precondition.getUpdateTime() != null) {
            e10 = o10.f(encodeVersion(precondition.getUpdateTime()));
        } else if (precondition.getExists() != null) {
            e10 = o10.e(precondition.getExists().booleanValue());
        } else {
            throw Assert.fail("Unknown Precondition", new Object[0]);
        }
        return (s) e10.build();
    }

    private String encodeQueryPath(ResourcePath resourcePath) {
        return encodeResourceName(this.databaseId, resourcePath);
    }

    private String encodeResourceName(DatabaseId databaseId2, ResourcePath resourcePath) {
        return ((ResourcePath) ((ResourcePath) encodedDatabaseId(databaseId2).append("documents")).append(resourcePath)).canonicalString();
    }

    private static ResourcePath encodedDatabaseId(DatabaseId databaseId2) {
        return ResourcePath.fromSegments(Arrays.asList(new String[]{"projects", databaseId2.getProjectId(), "databases", databaseId2.getDatabaseId()}));
    }

    private static ResourcePath extractLocalPathFromResourceName(ResourcePath resourcePath) {
        Assert.hardAssert(resourcePath.length() > 4 && resourcePath.getSegment(4).equals("documents"), "Tried to deserialize invalid key %s", resourcePath);
        return (ResourcePath) resourcePath.popFirst(5);
    }

    private d1 fromStatus(v5.a aVar) {
        return d1.h(aVar.i()).q(aVar.k());
    }

    private static boolean isValidResourceName(ResourcePath resourcePath) {
        return resourcePath.length() >= 4 && resourcePath.getSegment(0).equals("projects") && resourcePath.getSegment(2).equals("databases");
    }

    public String databaseName() {
        return this.databaseName;
    }

    public Target decodeDocumentsTarget(u.c cVar) {
        int n10 = cVar.n();
        Assert.hardAssert(n10 == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(n10));
        return Query.atPath(decodeQueryPath(cVar.m(0))).toTarget();
    }

    /* access modifiers changed from: package-private */
    public FieldFilter decodeFieldFilter(t.f fVar) {
        return FieldFilter.create(FieldPath.fromServerFormat(fVar.m().k()), decodeFieldFilterOperator(fVar.n()), fVar.o());
    }

    public DocumentKey decodeKey(String str) {
        ResourcePath decodeResourceName = decodeResourceName(str);
        Assert.hardAssert(decodeResourceName.getSegment(1).equals(this.databaseId.getProjectId()), "Tried to deserialize key from different project.", new Object[0]);
        Assert.hardAssert(decodeResourceName.getSegment(3).equals(this.databaseId.getDatabaseId()), "Tried to deserialize key from different database.", new Object[0]);
        return DocumentKey.fromPath(extractLocalPathFromResourceName(decodeResourceName));
    }

    public MutableDocument decodeMaybeDocument(d dVar) {
        if (dVar.l().equals(d.c.FOUND)) {
            return decodeFoundDocument(dVar);
        }
        if (dVar.l().equals(d.c.MISSING)) {
            return decodeMissingDocument(dVar);
        }
        throw new IllegalArgumentException("Unknown result case: " + dVar.l());
    }

    public Mutation decodeMutation(y yVar) {
        Precondition decodePrecondition = yVar.y() ? decodePrecondition(yVar.q()) : Precondition.NONE;
        ArrayList arrayList = new ArrayList();
        for (m.c decodeFieldTransform : yVar.w()) {
            arrayList.add(decodeFieldTransform(decodeFieldTransform));
        }
        int i10 = a.f8163a[yVar.s().ordinal()];
        if (i10 == 1) {
            return yVar.B() ? new PatchMutation(decodeKey(yVar.u().getName()), ObjectValue.fromMap(yVar.u().m()), decodeDocumentMask(yVar.v()), decodePrecondition, arrayList) : new SetMutation(decodeKey(yVar.u().getName()), ObjectValue.fromMap(yVar.u().m()), decodePrecondition, arrayList);
        }
        if (i10 == 2) {
            return new DeleteMutation(decodeKey(yVar.r()), decodePrecondition);
        }
        if (i10 == 3) {
            return new VerifyMutation(decodeKey(yVar.x()), decodePrecondition);
        }
        throw Assert.fail("Unknown mutation operation: %d", yVar.s());
    }

    public MutationResult decodeMutationResult(c0 c0Var, SnapshotVersion snapshotVersion) {
        SnapshotVersion decodeVersion = decodeVersion(c0Var.k());
        if (!SnapshotVersion.NONE.equals(decodeVersion)) {
            snapshotVersion = decodeVersion;
        }
        int j10 = c0Var.j();
        ArrayList arrayList = new ArrayList(j10);
        for (int i10 = 0; i10 < j10; i10++) {
            arrayList.add(c0Var.i(i10));
        }
        return new MutationResult(snapshotVersion, arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.firestore.core.Target decodeQueryTarget(java.lang.String r13, t5.t r14) {
        /*
            r12 = this;
            com.google.firebase.firestore.model.ResourcePath r13 = r12.decodeQueryPath(r13)
            int r0 = r14.v()
            r1 = 0
            r2 = 0
            if (r0 <= 0) goto L_0x002f
            r3 = 1
            if (r0 != r3) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            java.lang.String r0 = "StructuredQuery.from with more than one collection is not supported."
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.google.firebase.firestore.util.Assert.hardAssert(r3, r0, r4)
            t5.t$c r0 = r14.u(r1)
            boolean r3 = r0.k()
            java.lang.String r0 = r0.l()
            if (r3 == 0) goto L_0x0029
            r4 = r13
            r5 = r0
            goto L_0x0031
        L_0x0029:
            com.google.firebase.firestore.model.BasePath r13 = r13.append((java.lang.String) r0)
            com.google.firebase.firestore.model.ResourcePath r13 = (com.google.firebase.firestore.model.ResourcePath) r13
        L_0x002f:
            r4 = r13
            r5 = r2
        L_0x0031:
            boolean r13 = r14.E()
            if (r13 == 0) goto L_0x0040
            t5.t$h r13 = r14.A()
            java.util.List r13 = r12.decodeFilters(r13)
            goto L_0x0044
        L_0x0040:
            java.util.List r13 = java.util.Collections.emptyList()
        L_0x0044:
            r6 = r13
            int r13 = r14.y()
            if (r13 <= 0) goto L_0x0062
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r13)
        L_0x0050:
            if (r1 >= r13) goto L_0x0060
            t5.t$i r3 = r14.x(r1)
            com.google.firebase.firestore.core.OrderBy r3 = r12.decodeOrderBy(r3)
            r0.add(r3)
            int r1 = r1 + 1
            goto L_0x0050
        L_0x0060:
            r7 = r0
            goto L_0x0067
        L_0x0062:
            java.util.List r13 = java.util.Collections.emptyList()
            r7 = r13
        L_0x0067:
            boolean r13 = r14.C()
            if (r13 == 0) goto L_0x0077
            com.google.protobuf.a0 r13 = r14.w()
            int r13 = r13.k()
            long r0 = (long) r13
            goto L_0x0079
        L_0x0077:
            r0 = -1
        L_0x0079:
            r8 = r0
            boolean r13 = r14.D()
            if (r13 == 0) goto L_0x008a
            t5.g r13 = r14.z()
            com.google.firebase.firestore.core.Bound r13 = r12.decodeBound(r13)
            r10 = r13
            goto L_0x008b
        L_0x008a:
            r10 = r2
        L_0x008b:
            boolean r13 = r14.B()
            if (r13 == 0) goto L_0x0099
            t5.g r13 = r14.t()
            com.google.firebase.firestore.core.Bound r2 = r12.decodeBound(r13)
        L_0x0099:
            r11 = r2
            com.google.firebase.firestore.core.Target r13 = new com.google.firebase.firestore.core.Target
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.RemoteSerializer.decodeQueryTarget(java.lang.String, t5.t):com.google.firebase.firestore.core.Target");
    }

    public Timestamp decodeTimestamp(r1 r1Var) {
        return new Timestamp(r1Var.m(), r1Var.l());
    }

    public SnapshotVersion decodeVersion(r1 r1Var) {
        return (r1Var.m() == 0 && r1Var.l() == 0) ? SnapshotVersion.NONE : new SnapshotVersion(decodeTimestamp(r1Var));
    }

    public SnapshotVersion decodeVersionFromListenResponse(q qVar) {
        if (qVar.n() != q.c.TARGET_CHANGE) {
            return SnapshotVersion.NONE;
        }
        return qVar.o().l() != 0 ? SnapshotVersion.NONE : decodeVersion(qVar.o().getReadTime());
    }

    public WatchChange decodeWatchChange(q qVar) {
        WatchChange.WatchTargetChangeType watchTargetChangeType;
        WatchChange watchTargetChange;
        int i10 = a.f8173k[qVar.n().ordinal()];
        d1 d1Var = null;
        if (i10 == 1) {
            v o10 = qVar.o();
            int i11 = a.f8172j[o10.k().ordinal()];
            if (i11 == 1) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.NoChange;
            } else if (i11 == 2) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Added;
            } else if (i11 == 3) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Removed;
                d1Var = fromStatus(o10.i());
            } else if (i11 == 4) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Current;
            } else if (i11 == 5) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Reset;
            } else {
                throw new IllegalArgumentException("Unknown target change type");
            }
            watchTargetChange = new WatchChange.WatchTargetChange(watchTargetChangeType, o10.m(), o10.getResumeToken(), d1Var);
        } else if (i10 == 2) {
            i j10 = qVar.j();
            List k10 = j10.k();
            List j11 = j10.j();
            DocumentKey decodeKey = decodeKey(j10.getDocument().getName());
            SnapshotVersion decodeVersion = decodeVersion(j10.getDocument().o());
            Assert.hardAssert(!decodeVersion.equals(SnapshotVersion.NONE), "Got a document change without an update time", new Object[0]);
            MutableDocument newFoundDocument = MutableDocument.newFoundDocument(decodeKey, decodeVersion, ObjectValue.fromMap(j10.getDocument().m()));
            watchTargetChange = new WatchChange.DocumentChange(k10, j11, newFoundDocument.getKey(), newFoundDocument);
        } else if (i10 == 3) {
            j k11 = qVar.k();
            List k12 = k11.k();
            MutableDocument newNoDocument = MutableDocument.newNoDocument(decodeKey(k11.j()), decodeVersion(k11.getReadTime()));
            return new WatchChange.DocumentChange(Collections.emptyList(), k12, newNoDocument.getKey(), newNoDocument);
        } else if (i10 == 4) {
            l l10 = qVar.l();
            watchTargetChange = new WatchChange.DocumentChange(Collections.emptyList(), l10.k(), decodeKey(l10.j()), (MutableDocument) null);
        } else if (i10 == 5) {
            n m10 = qVar.m();
            return new WatchChange.ExistenceFilterWatchChange(m10.getTargetId(), new ExistenceFilter(m10.i()));
        } else {
            throw new IllegalArgumentException("Unknown change type set");
        }
        return watchTargetChange;
    }

    public h encodeDocument(DocumentKey documentKey, ObjectValue objectValue) {
        h.b r10 = h.r();
        r10.f(encodeKey(documentKey));
        r10.e(objectValue.getFieldsMap());
        return (h) r10.build();
    }

    public u.c encodeDocumentsTarget(Target target) {
        u.c.a o10 = u.c.o();
        o10.e(encodeQueryPath(target.getPath()));
        return (u.c) o10.build();
    }

    public String encodeKey(DocumentKey documentKey) {
        return encodeResourceName(this.databaseId, documentKey.getPath());
    }

    public Map<String, String> encodeListenRequestLabels(TargetData targetData) {
        String encodeLabel = encodeLabel(targetData.getPurpose());
        if (encodeLabel == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("goog-listen-tags", encodeLabel);
        return hashMap;
    }

    public y encodeMutation(Mutation mutation) {
        y.b C = y.C();
        if (mutation instanceof SetMutation) {
            C.h(encodeDocument(mutation.getKey(), ((SetMutation) mutation).getValue()));
        } else if (mutation instanceof PatchMutation) {
            PatchMutation patchMutation = (PatchMutation) mutation;
            C.h(encodeDocument(mutation.getKey(), patchMutation.getValue()));
            C.i(encodeDocumentMask(patchMutation.getMask()));
        } else if (mutation instanceof DeleteMutation) {
            C.g(encodeKey(mutation.getKey()));
        } else if (mutation instanceof VerifyMutation) {
            C.j(encodeKey(mutation.getKey()));
        } else {
            throw Assert.fail("unknown mutation type %s", mutation.getClass());
        }
        for (FieldTransform encodeFieldTransform : mutation.getFieldTransforms()) {
            C.e(encodeFieldTransform(encodeFieldTransform));
        }
        if (!mutation.getPrecondition().isNone()) {
            C.f(encodePrecondition(mutation.getPrecondition()));
        }
        return (y) C.build();
    }

    public u.d encodeQueryTarget(Target target) {
        u.d.a n10 = u.d.n();
        t.b F = t.F();
        ResourcePath path = target.getPath();
        boolean z10 = true;
        if (target.getCollectionGroup() != null) {
            Assert.hardAssert(path.length() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            n10.e(encodeQueryPath(path));
            t.c.a m10 = t.c.m();
            m10.f(target.getCollectionGroup());
            m10.e(true);
            F.e(m10);
        } else {
            if (path.length() % 2 == 0) {
                z10 = false;
            }
            Assert.hardAssert(z10, "Document queries with filters are not supported.", new Object[0]);
            n10.e(encodeQueryPath((ResourcePath) path.popLast()));
            t.c.a m11 = t.c.m();
            m11.f(path.getLastSegment());
            F.e(m11);
        }
        if (target.getFilters().size() > 0) {
            F.j(encodeFilters(target.getFilters()));
        }
        for (OrderBy encodeOrderBy : target.getOrderBy()) {
            F.f(encodeOrderBy(encodeOrderBy));
        }
        if (target.hasLimit()) {
            F.h(a0.l().e((int) target.getLimit()));
        }
        if (target.getStartAt() != null) {
            F.i(encodeBound(target.getStartAt()));
        }
        if (target.getEndAt() != null) {
            F.g(encodeBound(target.getEndAt()));
        }
        n10.f(F);
        return (u.d) n10.build();
    }

    public u encodeTarget(TargetData targetData) {
        u.b n10 = u.n();
        Target target = targetData.getTarget();
        if (target.isDocumentQuery()) {
            n10.e(encodeDocumentsTarget(target));
        } else {
            n10.f(encodeQueryTarget(target));
        }
        n10.i(targetData.getTargetId());
        if (!targetData.getResumeToken().isEmpty() || targetData.getSnapshotVersion().compareTo(SnapshotVersion.NONE) <= 0) {
            n10.h(targetData.getResumeToken());
        } else {
            n10.g(encodeTimestamp(targetData.getSnapshotVersion().getTimestamp()));
        }
        return (u) n10.build();
    }

    public r1 encodeTimestamp(Timestamp timestamp) {
        r1.b n10 = r1.n();
        n10.f(timestamp.getSeconds());
        n10.e(timestamp.getNanoseconds());
        return (r1) n10.build();
    }

    /* access modifiers changed from: package-private */
    public t.h encodeUnaryOrFieldFilter(FieldFilter fieldFilter) {
        t.h.a f10;
        t.k.b bVar;
        Filter.Operator operator = fieldFilter.getOperator();
        Filter.Operator operator2 = Filter.Operator.EQUAL;
        if (operator == operator2 || fieldFilter.getOperator() == Filter.Operator.NOT_EQUAL) {
            t.k.a n10 = t.k.n();
            n10.e(encodeFieldPath(fieldFilter.getField()));
            if (Values.isNanValue(fieldFilter.getValue())) {
                bVar = fieldFilter.getOperator() == operator2 ? t.k.b.IS_NAN : t.k.b.IS_NOT_NAN;
            } else if (Values.isNullValue(fieldFilter.getValue())) {
                bVar = fieldFilter.getOperator() == operator2 ? t.k.b.IS_NULL : t.k.b.IS_NOT_NULL;
            }
            n10.f(bVar);
            f10 = t.h.q().g(n10);
            return (t.h) f10.build();
        }
        t.f.a p10 = t.f.p();
        p10.e(encodeFieldPath(fieldFilter.getField()));
        p10.f(encodeFieldFilterOperator(fieldFilter.getOperator()));
        p10.g(fieldFilter.getValue());
        f10 = t.h.q().f(p10);
        return (t.h) f10.build();
    }

    public r1 encodeVersion(SnapshotVersion snapshotVersion) {
        return encodeTimestamp(snapshotVersion.getTimestamp());
    }

    public boolean isLocalResourceName(ResourcePath resourcePath) {
        return isValidResourceName(resourcePath) && resourcePath.getSegment(1).equals(this.databaseId.getProjectId()) && resourcePath.getSegment(3).equals(this.databaseId.getDatabaseId());
    }

    public Target decodeQueryTarget(u.d dVar) {
        return decodeQueryTarget(dVar.l(), dVar.m());
    }
}
