package com.lsl.cymall.fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.lsl.cymall.R;
import com.lsl.cymall.activity.GoodsDetailActivity;
import com.lsl.cymall.adapter.GoodsListCartAdapter;
import com.lsl.cymall.base.BaseFragment;
import com.lsl.cymall.base.Contants;
import com.lsl.cymall.databinding.FragmentMallCartBinding;
import com.lsl.cymall.pojo.CartListBeanModel;
import com.lsl.cymall.view.CancelOrOkDialog;
import com.lsl.cymall.view.TitleBar;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MallCartFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MallCartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MallCartFragment extends BaseFragment implements GoodsListCartAdapter.OnGoodsClickListener, TitleBar.TitleBarListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private FragmentMallCartBinding mBinding;
    private OnFragmentInteractionListener mListener;
    private List<CartListBeanModel> list = new ArrayList<>();
    private GoodsListCartAdapter adapter;
    private boolean edit = false;
    private List<Boolean> selectBoolean = new ArrayList<>();
    private CancelOrOkDialog dialog;
    public MallCartFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MallCartFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MallCartFragment newInstance(String param1, String param2) {
        MallCartFragment fragment = new MallCartFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_mall_cart, container, false);
        return mBinding.getRoot();
    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        loadData();
    }

    private void loadData() {
        adapter = new GoodsListCartAdapter(getActivity(),list);
        mBinding.lvCart.setAdapter(adapter);
        list.clear();
        list.addAll(Contants.cartList);
        setSelectBooean(false);
        adapter.setBoolean(selectBoolean);
        adapter.setList(list);
        if (list.size() < 1){
            mBinding.rlNoData.setVisibility(View.VISIBLE);
        }else{
            mBinding.rlNoData.setVisibility(View.GONE);
        }
        adapter.setOnGoodsClickListener(this);
        mBinding.barTitle.setTitleBarListener(this);
        mBinding.rbAllSelect.setOnClickListener(v -> {
            if (mBinding.rbAllSelect.isChecked()){
                setSelectBooean(true);
            }else{
                setSelectBooean(false);
            }
            adapter.setBoolean(selectBoolean);
            calculatePrice();
        });
        initOkDialog();
    }

    private void setSelectBooean(boolean b) {
        selectBoolean.clear();
        for (int i = 0; i < list.size(); i++) {
            selectBoolean.add(b);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void iconClick(int position) {
        gotoActivity(mContext, GoodsDetailActivity.class,null);
    }

    @Override
    public void titleClick(int position) {
        gotoActivity(mContext, GoodsDetailActivity.class,null);
    }

    @Override
    public void buttonClick(int position,boolean select) {
        selectBoolean.set(position,select);
        calculatePrice();
        varSelectAll();
    }

    private void varSelectAll() {
        int type = 0;
        boolean t = selectBoolean.get(0);
        for (int i = 0; i < selectBoolean.size(); i++) {
            if (selectBoolean.get(i) == t){
                continue;
            }else{
                type = 1;
                break;
            }
        }
        if (type == 0){
            mBinding.rbAllSelect.setChecked(t);
        }else{
            mBinding.rbAllSelect.setChecked(false);
        }

    }

    @Override
    public void deleteClick(int position) {
        showDialog(position);
        /*list.remove(position);
        selectBoolean.remove(position);
        adapter.setList(list);
        calculatePrice();*/
    }

    @Override
    public void subClick(int position) {
        if (list.get(position).getNumber() > 1) {
            list.get(position).setNumber(list.get(position).getNumber() - 1);
            adapter.setList(list);
            calculatePrice();
        }else{
            //弹窗选择删除
            //showDialog(position);
        }
    }

    private void initOkDialog() {
        dialog = new CancelOrOkDialog(this.getActivity(),"确定要将此物品从购物车\n删除吗？"){
            @Override
            public void ok(int position) {
                super.ok();
                list.remove(position);
                selectBoolean.remove(position);
                adapter.setList(list);
                calculatePrice();
            }

            @Override
            public void no() {
                super.no();
                dialog.setPosition(-1);
            }
        };
    }
    public void showDialog(int position){
        dialog.setOkView("确定");
        dialog.setCancelView("取消");
        dialog.setPosition(position);
        dialog.show();
    }

    @Override
    public void addClick(int position) {
        list.get(position).setNumber(list.get(position).getNumber() + 1);
        adapter.setList(list);
        calculatePrice();
    }

    @Override
    public void onLeftClick() {

    }

    @Override
    public void onRightClick() {
        if (edit) {
            edit = false;
            mBinding.barTitle.setTv_right("编辑");
        }else{
            edit = true;
            mBinding.barTitle.setTv_right("完成");
        }
        adapter.setEdit(edit);
    }

    @Override
    public boolean onClickBack() {
        return false;
    }

    @Override
    public boolean onRightImageClick() {
        return false;
    }

    public void calculatePrice(){
        int price = 0;
        for (int i = 0; i < list.size(); i++) {
            CartListBeanModel cartListBeanModel = list.get(i);
            if (selectBoolean.get(i)){
                price += cartListBeanModel.getNumber() * Integer.valueOf(cartListBeanModel.getPrice());
            }
        }
        Integer integer = Integer.valueOf(price);

        int money = integer / 100;
        mBinding.tvPrice.setText(money + "");
        int point = integer % 100;
        if (point < 10){
            mBinding.tvPoint.setText("0" + point);
        }else{
            mBinding.tvPoint.setText("" + point);
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
