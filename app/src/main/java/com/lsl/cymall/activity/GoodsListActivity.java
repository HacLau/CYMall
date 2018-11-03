package com.lsl.cymall.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;


import com.lsl.cymall.R;
import com.lsl.cymall.adapter.GoodsListClassifyAdapter;
import com.lsl.cymall.base.BaseActivity;
import com.lsl.cymall.base.Contants;
import com.lsl.cymall.databinding.ActivityGoodsListBinding;
import com.lsl.cymall.pojo.GoodsListBeanModel;


import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

public class GoodsListActivity extends BaseActivity {
    private ActivityGoodsListBinding mBinding;
    private List<GoodsListBeanModel> list = new ArrayList<>();
    private GoodsListClassifyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_goods_list);
        initView();
        initData();
    }

    private void initData() {
        adapter.setList(Contants.goodsList);
    }

    private void initView() {
        String title = getIntent().getExtras().getString("title");
        mBinding.tbTitle.setTitle(title);
        adapter = new GoodsListClassifyAdapter(this,list);
        mBinding.lvGoodsList.setAdapter(adapter);
        mBinding.lvGoodsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                gotoActivity(mContext,GoodsDetailActivity.class,null);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void getMessage(String message){

    }

    public static void start(){

    }
}
