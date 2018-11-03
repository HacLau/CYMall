package com.lsl.cymall.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.lsl.cymall.R;
import com.lsl.cymall.pojo.GoodsListBeanModel;

import java.util.List;


/**
 * Created by Administrator on 2018/10/23.
 */

public class GoodsListClassifyAdapter extends BaseAdapter {
    private Context mContext;
    private List<GoodsListBeanModel> list;
    public GoodsListClassifyAdapter(Context mContext, List<GoodsListBeanModel> list) {
        this.mContext = mContext;
        this.list = list;
    }

    public void setList(List<GoodsListBeanModel> list) {
        this.list = list;
        notifyDataSetChanged();
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
        ViewHolder holder;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_goods_classify,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.setData(position);
        return convertView;
    }

    class ViewHolder{
        private ImageView icon;
        private TextView title;
        private TextView currency;
        private TextView price;
        private TextView point;

        public ViewHolder(View itemView) {
            this.icon = (ImageView) itemView.findViewById(R.id.iv_icon);
            this.title = (TextView) itemView.findViewById(R.id.tv_title);
            this.currency = (TextView) itemView.findViewById(R.id.tv_currency);
            this.price = (TextView) itemView.findViewById(R.id.tv_price);
            this.point = (TextView) itemView.findViewById(R.id.tv_point);
        }

        public void setData(int position){
            GoodsListBeanModel data = list.get(position);
            if (data == null){
                return;
            }

           // mAppAction.displayImage(icon,data.getIcon(),R.mipmap.ic_launcher);
            Glide.with(mContext)
                    .load(data.getIcon())
                    .into(icon);
            title.setText(data.getTitle());
            Integer integer = Integer.valueOf(data.getPrice());
            int money1 = integer / 100;
            price.setText(money1 + "");
            int money2 = integer % 100;
            if (money2 < 10){
                point.setText("0" + money2);
            }else{
                point.setText("" + money2);
            }

        }

    }
}
