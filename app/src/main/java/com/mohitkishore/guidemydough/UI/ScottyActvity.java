package com.mohitkishore.guidemydough.UI;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mohitkishore.guidemydough.R;

import Static.Numbers;
import butterknife.Bind;
import butterknife.ButterKnife;

public class ScottyActvity extends AppCompatActivity {


    @Bind(R.id.dailyPlanButton)
    Button mDailyPlanButton;

    @Bind(R.id.weeklyPlanButton)
    Button mWeeklyPlanButton;

    @Bind(R.id.monthlyPlanButton)
    Button mMonthlyPlanButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scotty_actvity);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf"); //Fontawrsome
        ButterKnife.bind(this); //Butter knife

        mDailyPlanButton.setTypeface(font);
        mWeeklyPlanButton.setTypeface(font);
        mMonthlyPlanButton.setTypeface(font);

        mDailyPlanButton.setText(getResources().getString(R.string.fa_newspaper_o) + "\nDaily Budget : $" + Numbers.dailyBudget);
        mWeeklyPlanButton.setText(getResources().getString(R.string.fa_calendar) + "\n" +
                "\nWeekly Budget : $" + Numbers.weekly);
        mMonthlyPlanButton.setText(getResources().getString(R.string.fa_calendar_o) + "\n" +
                "\nMonthly Budget : $" +Numbers.monthly);

        mDailyPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent progress = new Intent(ScottyActvity.this, DailyPlan.class);
                ScottyActvity.this.startActivity(progress);
            }
        });
    }

}
