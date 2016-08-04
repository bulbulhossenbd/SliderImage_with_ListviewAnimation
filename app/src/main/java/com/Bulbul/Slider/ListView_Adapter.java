package com.javatechig.Slider;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ListView_Adapter extends BaseAdapter {


    String[] i;
    Context ctx;
    int[] img;


    public ListView_Adapter(Context ctx, String[] i, int[] img) {
        super();
        this.i = i;
        this.ctx = ctx;
        this.img = img;
    }


    static class ViewHolder {
        TextView tv1;
        ImageView iv1;
    }


    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return i.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return i[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        convertView = LayoutInflater.from(ctx).inflate(R.layout.custom_listview_adapter, parent, false);

        ViewHolder Holder = new ViewHolder();

        Holder.tv1 = (TextView) convertView.findViewById(R.id.textView1);
        Holder.tv1.setText(i[position]);
        Holder.iv1 = (ImageView) convertView.findViewById(R.id.imageView1);
        Holder.iv1.setImageResource(img[position]);

        return convertView;
    }


}




// ----->>> Another -Listview
/*




import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListView_Adapter extends BaseAdapter {

    String[] i;
    Context ctx;

    public ListView_Adapter(Context ctx, String[] i) {
        super();
        this.i = i;
        this.ctx = ctx;
    }


    static class ViewHolder {
        TextView tv1;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return i.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return i[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method s

        convertView = LayoutInflater.from(ctx).inflate(R.layout.listview_adapter, parent, false);
        ViewHolder Holder = new ViewHolder();
        Holder.tv1 = (TextView) convertView.findViewById(R.id.textView1);
        Holder.tv1.setText(i[position]);
        return convertView;
    }


}
*/
