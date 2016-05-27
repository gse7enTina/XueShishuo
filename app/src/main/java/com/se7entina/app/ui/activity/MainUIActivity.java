package com.se7entina.app.ui.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.se7entina.app.App;
import com.se7entina.app.R;
import com.se7entina.app.ui.fragment.ClassListFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Class:
 * Created by se7enTina on 2016/4/23.
 * Description:
 */
public class MainUIActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {
    private static final String TAG = "MainUIActivity";
    private Map<String, Fragment> map = new HashMap<>();
    private RelativeLayout rlMainFg;
    private Fragment fragment = null;
    private RadioButton rbMy, rbList;
    public Dialog dlg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main_ui);
        App.getInstance().addActivity(this);
//        ClassListFragment fragment = new ClassListFragment();
//        map.put(ClassListFragment.class.getName(), fragment);
//        getSupportFragmentManager().beginTransaction().add(R.id.main_ui_fg, fragment).commit();
//        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg_main_ui);
//        radioGroup.setOnCheckedChangeListener(this);
//        rbList = (RadioButton) findViewById(R.id.main_radioButton1);
//        rbMy = (RadioButton) findViewById(R.id.main_radioButton2);
//
//        rlMainFg = (RelativeLayout) findViewById(R.id.main_ui_fg);
//        rlMainFg.setLongClickable(true);
//        rlMainFg.setOnTouchListener(new LoginGestureListener(this));
//        Intent intent = getIntent();
//        if (intent != null) {
//            String toUrl = intent.getStringExtra(SystemConstant.LOGINED_TO_URL);
//            if (toUrl != null && toUrl.length() > 0) {
//                SharedPreferencesUtil.putString(this, SystemConstant.LOGINED_TO_URL, toUrl);
//            }
//        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
//
//        if (R.id.main_radioButton1 == checkedId) {
//            fragment = map.get(ClassListFragment.class.getName());
//        } else if (R.id.main_radioButton2 == checkedId) {
//            fragment = map.get(RegFragment.class.getName());
//        }
//        if (fragment == null) {
//            if (R.id.main_radioButton1 == checkedId) {
//                fragment = new ClassListFragment();
//                map.put(ClassListFragment.class.getName(), fragment);
//            } else if (R.id.main_radioButton2 == checkedId) {
//                fragment = new RegFragment();
//                map.put(RegFragment.class.getName(), fragment);
//            }
//        }
//        getSupportFragmentManager()
//                .beginTransaction().replace(R.id.main_fg, fragment).commit();
    }

//    private class LoginGestureListener extends GestureListener {
//        public LoginGestureListener(Context context) {
//            super(context);
//        }
//
//        @Override
//        public boolean left() {
//            rbMy.setChecked(false);
//            rbList.setChecked(true);
//            return super.left();
//        }
//
//        @Override
//        public boolean right() {
//            rbMy.setChecked(true);
//            rbList.setChecked(false);
//            return super.right();
//        }
//    }
//
//
//    @Override
//    protected void onPause() {
//        if (dlg != null) {
//            dlg.dismiss();
//        }
//        super.onPause();
//    }
//
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
