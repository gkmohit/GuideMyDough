package com.mohitkishore.guidemydough.UI;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mohitkishore.guidemydough.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DailyPlan extends AppCompatActivity {

    public static int dailyBudget = 45;


    @Bind(R.id.breakfastTextView)
    TextView mBreakfastTextView;

    @Bind(R.id.budgetTextTextView)
    TextView mBudgetTextTextView;

    @Bind(R.id.budgetAmountTextView)
    TextView mBudgetAmountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_plan);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf"); //Fontawrsome
        ButterKnife.bind(this);

        mBudgetTextTextView.setTypeface(font);

        mBudgetTextTextView.setText(getResources().getString(R.string.fa_cutlery) + "\n\nBreakfast Budget");
        mBreakfastTextView.setText("Your daily total for breakfast is " + dailyBudget);
    }
}
