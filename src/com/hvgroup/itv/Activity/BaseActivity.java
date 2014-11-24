package com.hvgroup.itv.Activity;

import android.app.Activity;
import android.os.Bundle;
import com.lidroid.xutils.ViewUtils;

/**
 * Created by muqiang on 2014/11/24.
 */
public class BaseActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewUtils.inject(this);
    }
}