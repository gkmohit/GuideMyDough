package com.mohitkishore.guidemydough.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mohitkishore.guidemydough.R;

import butterknife.ButterKnife;

public class DailyPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_plan);
        ButterKnife.bind(this);
    }
}
