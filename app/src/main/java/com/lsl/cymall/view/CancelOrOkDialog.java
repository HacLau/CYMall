package com.lsl.cymall.view;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.lsl.cymall.R;


/**
 * 取消或者确认类型的Dialog
 * <p>
 * 作者： 周旭 on 2017/5/27/0027.
 * 邮箱：374952705@qq.com
 * 博客：http://www.jianshu.com/u/56db5d78044d
 */

public class CancelOrOkDialog extends Dialog {

    private TextView titleView;
    private TextView cancelView;
    private TextView okView;
    private int position = -1;

    public CancelOrOkDialog(Context context, String title) {
        //使用自定义Dialog样式
        super(context, R.style.custom_dialog);
        //指定布局
        setContentView(R.layout.dialog_wechat_login);
        //点击外部不可消失
        setCancelable(false);

        //设置标题
        titleView = (TextView) findViewById(R.id.dialog_title_tv);
        titleView.setText(title);

        cancelView = (TextView) findViewById(R.id.cancel_tv);
        cancelView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no();
                cancel();
            }
        });

        okView = (TextView) findViewById(R.id.ok_tv);
        okView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == -1){
                    ok();
                }
                if (position >= 0){
                    ok(position);
                }
                cancel();
            }
        });
    }


    public void setTitleView(String title) {
        this.titleView.setText(title);
    }

    public void setCancelView(String cancel) {
        this.cancelView.setText(cancel);
    }

    public void setOkView(String ok) {
        this.okView.setText(ok);
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void no(){}

    //确认
    public void ok() {
    }

    public void ok(int position) {
    }
}
