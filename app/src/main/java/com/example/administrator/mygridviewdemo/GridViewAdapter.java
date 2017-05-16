package com.example.administrator.mygridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/5/16.
 */
public class GridViewAdapter extends BaseAdapter{

    private List<GridViewEntry> list;
    private Context context;
    private LayoutInflater inflater;

    public GridViewAdapter(List<GridViewEntry> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.gridview_adapter , null);
            holder = new ViewHolder();
            holder.image = (ImageView) convertView.findViewById(R.id.gridview_adapter_image);
            holder.textView = (TextView) convertView.findViewById(R.id.gridview_adapter_name);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        GridViewEntry init = (GridViewEntry) getItem(position);
        holder.image.setImageResource(init.getImage());
        holder.textView.setText(init.getName());


        return convertView;
    }

    public class ViewHolder{
        private ImageView image;
        private TextView textView;
    }
}
