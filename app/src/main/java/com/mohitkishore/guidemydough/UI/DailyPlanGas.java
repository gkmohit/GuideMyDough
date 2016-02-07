package com.mohitkishore.guidemydough.UI;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mohitkishore.guidemydough.R;

import java.util.Locale;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DailyPlanGas extends AppCompatActivity {

    @Bind(R.id.budgetTextTextView)
    TextView mBudgetTextTextView;

    @Bind(R.id.budgetAmountTextView)
    TextView mBudgetAmountTextView;

    @Bind(R.id.directionsButton5)
    Button mDirectionsButton5;

    @Bind(R.id.doneButton)
    Button mDoneButton;

    public static int dailyBudget = DailyPlan.dailyBudget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_plan_gas);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf"); //Fontawrsome
        ButterKnife.bind(this);

        mBudgetTextTextView.setTypeface(font);
        mDirectionsButton5.setTypeface(font);

        mBudgetTextTextView.setText(getResources().getString(R.string.fa_car) + "\n\nTravel Budget");

        mBudgetAmountTextView.setText("$" + 18 + " of $" + dailyBudget);

        mDirectionsButton5.setText(getResources().getString(R.string.fa_map_marker) + "  Directions >>");

        mDoneButton.setVisibility(View.INVISIBLE);

        mDirectionsButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int cost = 18 - 5;
                dailyBudget = dailyBudget - cost;
                double destinationLatitude = 44.108642;
                double destinationLongitude = -79.124247;
                double sourceLatitude = 43.768778;
                double sourceLongitude = -79.345760;
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f", sourceLatitude, sourceLongitude, destinationLatitude, destinationLongitude);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK & Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                startActivity(intent);
                mDoneButton.setVisibility(View.VISIBLE);
            }
        });

        mDoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DailyPlanGas.this, DoneActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
