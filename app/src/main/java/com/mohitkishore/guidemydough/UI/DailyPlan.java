package com.mohitkishore.guidemydough.UI;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mohitkishore.guidemydough.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DailyPlan extends AppCompatActivity {

    public static int dailyBudget = 45;


    @Bind(R.id.budgetTextTextView)
    TextView mBudgetTextTextView;

    @Bind(R.id.budgetAmountTextView)
    TextView mBudgetAmountTextView;

    @Bind(R.id.groceryStoreButton8)
    Button mGroceryStoreButton8;

    @Bind(R.id.timHortonsButtons3)
    Button mTimHortonsButtons3;

    @Bind(R.id.dennysButtons0)
    Button mDennysButtons0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_plan);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf"); //Fontawrsome
        ButterKnife.bind(this);

        mBudgetTextTextView.setTypeface(font);

        mBudgetTextTextView.setText(getResources().getString(R.string.fa_cutlery) + "\nBreakfast Budget");

        mBudgetAmountTextView.setText("$" + 14 + " of $" + dailyBudget);

        mGroceryStoreButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cost = 14 - 8;
                dailyBudget = dailyBudget - cost;
                Intent intent = new Intent(DailyPlan.this, DailyPlanGas.class);
                startActivity(intent);
                finish();
            }
        });

        mTimHortonsButtons3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cost = 14 - 3;
                dailyBudget = dailyBudget - cost;
                Intent intent = new Intent(DailyPlan.this, DailyPlanGas.class);
                startActivity(intent);
                finish();
            }
        });

        mDennysButtons0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cost = 14 - 14;
                dailyBudget = dailyBudget - cost;
                Intent intent = new Intent(DailyPlan.this, DailyPlanGas.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
