package com.mohitkishore.guidemydough.UI;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mohitkishore.guidemydough.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Dashboard extends AppCompatActivity {

    @Bind(R.id.balanceButton)
    Button mBalanceButton;

    @Bind(R.id.progressButton)
    Button mProgressButton;

    @Bind(R.id.scottyButton)
    Button mScottyButton;

    @Bind(R.id.profileButton)
    Button mSettingsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf"); //Fontawrsome
        ButterKnife.bind(this); //Butter knife

        mBalanceButton.setTypeface(font);
        mProgressButton.setTypeface(font);
        mScottyButton.setTypeface(font);
        mSettingsButton.setTypeface(font);


        mBalanceButton.setText(getResources().getString(R.string.fa_money) + "\n\nBALANCE");

        mProgressButton.setText(getResources().getString(R.string.fa_line_chart) + "\n" +
                "\nPROGRESS");

        mScottyButton.setText(getResources().getString(R.string.fa_user_secret) + "\n" +
                "\nSCOTTY'S PLAN");

        mSettingsButton.setText(getResources().getString(R.string.fa_gears) + "\n" +
                "\nSETTINGS");



        mBalanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dashboard = new Intent(Dashboard.this, BalanceActivity.class);
                Dashboard.this.startActivity(dashboard);
            }
        });

        mScottyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dashboard = new Intent(Dashboard.this, ScottyActvity.class);
                Dashboard.this.startActivity(dashboard);
            }
        });

        mProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent progress = new Intent(Dashboard.this, ProgressActivity.class);
                Dashboard.this.startActivity(progress);
            }
        });
        mSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settings = new Intent(Dashboard.this, SettingsActivity.class);
                Dashboard.this.startActivity(settings);
            }
        });
    }

}
