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

    @Bind(R.id.goalsButton)
    Button mGoalsButton;

    @Bind(R.id.scottyButton)
    Button mScottyButton;

    @Bind(R.id.profileButton)
    Button mProfileButton;

    @Bind(R.id.helpButton)
    Button mHelpButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf"); //Fontawrsome
        ButterKnife.bind(this); //Butter knife

        mBalanceButton.setTypeface(font);
        mGoalsButton.setTypeface(font);
        mScottyButton.setTypeface(font);
        mProfileButton.setTypeface(font);
        mHelpButtons.setTypeface(font);

        mBalanceButton.setText(getResources().getString(R.string.fa_money) + "\n\nBALANCE");
        mGoalsButton.setText(getResources().getString(R.string.fa_line_chart) + "\n" +
                "\nGROWTH");
        mScottyButton.setText(getResources().getString(R.string.fa_user_secret) + "\n" +
                "\nSCOTTY");
        mProfileButton.setText(getResources().getString(R.string.fa_user) + "\n" +
                "\nPROFILE");
        mHelpButtons.setText(getResources().getString(R.string.fa_life_saver) + "\n" +
                "\nHELP");

        mBalanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dashboard = new Intent(Dashboard.this, BalanceActivity.class);
                Dashboard.this.startActivity(dashboard);
            }
        });
    }

}
