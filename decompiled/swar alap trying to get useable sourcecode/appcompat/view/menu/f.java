package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    g f724e;

    /* renamed from: f, reason: collision with root package name */
    private int f725f = -1;

    /* renamed from: g, reason: collision with root package name */
    private boolean f726g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f727h;

    /* renamed from: i, reason: collision with root package name */
    private final LayoutInflater f728i;

    /* renamed from: j, reason: collision with root package name */
    private final int f729j;

    public f(g gVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f727h = z10;
        this.f728i = layoutInflater;
        this.f724e = gVar;
        this.f729j = i10;
        a();
    }

    void a() {
        i v10 = this.f724e.v();
        if (v10 != null) {
            ArrayList z10 = this.f724e.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((i) z10.get(i10)) == v10) {
                    this.f725f = i10;
                    return;
                }
            }
        }
        this.f725f = -1;
    }

    public g b() {
        return this.f724e;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i10) {
        ArrayList z10 = this.f727h ? this.f724e.z() : this.f724e.E();
        int i11 = this.f725f;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (i) z10.get(i10);
    }

    public void d(boolean z10) {
        this.f726g = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList z10 = this.f727h ? this.f724e.z() : this.f724e.E();
        int i10 = this.f725f;
        int size = z10.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f728i.inflate(this.f729j, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f724e.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f726g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}