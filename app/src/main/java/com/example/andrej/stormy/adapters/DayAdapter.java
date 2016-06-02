package com.example.andrej.stormy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andrej.stormy.R;
import com.example.andrej.stormy.weather.Day;

/**
 * Created by Andrej on 14.11.2015..
 */
public class DayAdapter extends BaseAdapter {
    private Context mContext;
    private Day [] mDays;

    public DayAdapter(Context context, Day[] days){
        mContext= context;
        mDays= days;
    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int position) {
        return mDays[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView==null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);
            holder=new ViewHolder();
            holder.iconImageView=(ImageView)convertView.findViewById(R.id.iconImageView);
            holder.temperatureLabel=(TextView)convertView.findViewById(R.id.temperatureLabel);
            holder.daylabel=(TextView) convertView.findViewById(R.id.dayNameLabel);

            convertView.setTag(holder);
        }
        else {
            holder=(ViewHolder) convertView.getTag();
        }

        return null;
    }

    private static class ViewHolder {
        ImageView iconImageView; // public by default
        TextView temperatureLabel;
        TextView daylabel;
    }

}
