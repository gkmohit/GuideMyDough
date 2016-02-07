package com.mohitkishore.guidemydough.UI;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    @Bind(R.id.dennysButtons0)
    Button mDennysButtons0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_plan);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf"); //Fontawrsome
        ButterKnife.bind(this);

        mBudgetTextTextView.setTypeface(font);

        mBudgetTextTextView.setText(getResources().getString(R.string.fa_cutlery) + "\n\nBreakfast Budget");

        mBudgetAmountTextView.setText("$" + 14 + " of $" + dailyBudget);
    }
}
