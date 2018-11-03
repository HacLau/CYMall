package com.lsl.cymall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import com.lsl.cymall.R;
import com.lsl.cymall.pojo.CartListBeanModel;

import java.util.List;

/**
 * Created by Administrator on 2018/10/23.
 */

public class GoodsListCartAdapter extends BaseAdapter {
    private Context mContext;
    private List<CartListBeanModel> list;

    private OnGoodsClickListener onGoodsClickListener;
    private boolean edit;
    private List<Boolean> selectBoolean;
    public GoodsListCartAdapter(Context mContext, List<CartListBeanModel> list) {
        this.mContext = mContext;
        this.list = list;

    }

    public void setEdit(boolean edit) {
        this.edit = edit;
        notifyDataSetChanged();
    }

    public void setList(List<CartListBeanModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public void setOnGoodsClickListener(OnGoodsClickListener onGoodsClickListener) {
        this.onGoodsClickListener = onGoodsClickListener;
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_goods_cart,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.setData(position);
        return convertView;
    }

    public void setBoolean(List<Boolean> selectBoolean) {
        this.selectBoolean = selectBoolean;
        notifyDataSetChanged();
    }

    class ViewHolder{
        private ImageView icon;
        private TextView title;
        private TextView currency;
        private TextView price;
        private TextView point;
        private CheckBox select;
        private TextView delete;
        private ImageView sub;
        private ImageView add;
        private TextView number;

        public ViewHolder(View itemView) {
            this.icon = (ImageView) itemView.findViewById(R.id.iv_icon);
            this.title = (TextView) itemView.findViewById(R.id.tv_title);
            this.currency = (TextView) itemView.findViewById(R.id.tv_currency);
            this.price = (TextView) itemView.findViewById(R.id.tv_price);
            this.point = (TextView) itemView.findViewById(R.id.tv_point);
            this.select = (CheckBox) itemView.findViewById(R.id.rb_select);
            this.delete = (TextView) itemView.findViewById(R.id.tv_delete);
            this.sub = (ImageView) itemView.findViewById(R.id.iv_sub);
            this.add = (ImageView) itemView.findViewById(R.id.iv_add);
            this.number = (TextView) itemView.findViewById(R.id.tv_number);
        }

        public void setData(int position){
            CartListBeanModel data = list.get(position);
            if (data == null){
                return;
            }
            if (edit){
                delete.setVisibility(View.VISIBLE);
            }else{
                delete.setVisibility(View.GONE);
            }
            select.setChecked(selectBoolean.get(position));
            Glide.with(mContext).load(data.getIcon()).into(icon);

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
            number.setText(list.get(position).getNumber() + "");
            icon.setOnClickListener(v -> {
                onGoodsClickListener.iconClick(position);
            });
            title.setOnClickListener(v -> {
                onGoodsClickListener.titleClick(position);
            });
            select.setOnClickListener(v -> {
                onGoodsClickListener.buttonClick(position,select.isChecked());
            });

            delete.setOnClickListener(v -> {
                onGoodsClickListener.deleteClick(position);
            });
            sub.setOnClickListener(v -> {
                onGoodsClickListener.subClick(position);
            });
            add.setOnClickListener(v -> {
                onGoodsClickListener.addClick(position);
            });

        }
    }

    public interface OnGoodsClickListener{
        void iconClick(int position);
        void titleClick(int position);
        void buttonClick(int position, boolean select);
        void deleteClick(int position);
        void subClick(int position);
        void addClick(int position);
    }
}
