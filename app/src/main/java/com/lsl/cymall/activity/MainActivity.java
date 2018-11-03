package com.lsl.cymall.activity;

import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.Toast;

import com.lsl.cymall.R;
import com.lsl.cymall.adapter.ViewPagerIndexAdapter;
import com.lsl.cymall.base.BaseActivity;
import com.lsl.cymall.databinding.ActivityMainBinding;
import com.lsl.cymall.fragment.MallCartFragment;
import com.lsl.cymall.fragment.MallClassifyFragment;
import com.lsl.cymall.fragment.MallIndexFragment;
import com.lsl.cymall.fragment.MallMineFragment;
import com.lsl.cymall.utils.BottomNavigationViewHelper;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements MallIndexFragment.OnFragmentInteractionListener,
        MallClassifyFragment.OnFragmentInteractionListener,
        MallCartFragment.OnFragmentInteractionListener,
        MallMineFragment.OnFragmentInteractionListener{
    ActivityMainBinding mBinding;
    private long CURRENT = 0l;
    private ViewPagerIndexAdapter viewPagerIndexAdapter;
    private MenuItem menuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        initView();
    }

    private void initView() {
        initNavigetion();
        initViewPager();
    }

    private void initViewPager() {
        mBinding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                selectPage(position,positionOffset,positionOffsetPixels);
            }
            @Override
            public void onPageSelected(int position) {
                selectPage(position,0,0);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPagerIndexAdapter = new ViewPagerIndexAdapter(getSupportFragmentManager());
        List<Fragment> list = new ArrayList<>();
        list.add(MallIndexFragment.newInstance("首页",""));
        list.add(MallClassifyFragment.newInstance("分类",""));
        list.add(MallCartFragment.newInstance("购物车",""));
        list.add(MallMineFragment.newInstance("我的",""));
        viewPagerIndexAdapter.setList(list);
        mBinding.viewPager.setAdapter(viewPagerIndexAdapter);
    }

    private void initNavigetion() {
        mBinding.bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        BottomNavigationViewHelper.disableShiftMode(mBinding.bottomNavigationView);
    }

    private void selectPage(int position, float positionOffset, int positionOffsetPixels) {
        if (positionOffset == 0 && positionOffsetPixels == 0){
            if (menuItem != null) {
                menuItem.setChecked(false);
            } else {
                mBinding.bottomNavigationView.getMenu().getItem(0).setChecked(false);
            }
            menuItem = mBinding.bottomNavigationView.getMenu().getItem(position);
            menuItem.setChecked(true);
        }else{

        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            menuItem = item;
            switch (item.getItemId()) {
                case R.id.index:
                    mBinding.viewPager.setCurrentItem(0);
                    return true;
                case R.id.classify:
                    mBinding.viewPager.setCurrentItem(1);
                    return true;
                case R.id.cart:
                    mBinding.viewPager.setCurrentItem(2);
                    return true;
                case R.id.mine:
                    mBinding.viewPager.setCurrentItem(3);
                    return true;
            }
            return false;
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis() - CURRENT < 3000) {
                finish();
            } else{
                CURRENT = System.currentTimeMillis();
                Toast.makeText(this, "再按一次返回键退出", Toast.LENGTH_SHORT).show();
            }
            return false;

        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void getMessage(String message){

    }
}
