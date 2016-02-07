package com.mohitkishore.guidemydough.UI;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.mohitkishore.guidemydough.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HomePage extends AppCompatActivity {

    @Bind(R.id.cardNumberEditText)
    EditText mCardNumberEditText;

    @Bind(R.id.passwordEditText)
    EditText mPasswordEditText;

    @Bind(R.id.signInButton)
    Button mSignInButton;

    @Bind(R.id.bottomTextView)
    TextView mBottomTextView;

    @Bind(R.id.errorTextView)
    TextView mErrorTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf"); //Fontawrsome
        Firebase.setAndroidContext(this); //Firebase
        ButterKnife.bind(this); //Butter knife

        mErrorTextView.setVisibility(View.INVISIBLE);
        final Firebase myFirebaseRef = new Firebase("https://guide-my-dough.firebaseio.com/");

        mCardNumberEditText.setTypeface(font);
        mPasswordEditText.setTypeface(font);
        mBottomTextView.setTypeface(font);

        mCardNumberEditText.setHint(getResources().getString(R.string.fa_credit_card) + "   Card Number");
        mPasswordEditText.setHint(getResources().getString(R.string.fa_lock) + "   Password");
        mBottomTextView.setText("Made with " + getResources().getString(R.string.fa_heart) + " in #ScotiabankHackIT");


        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cardNumber = mCardNumberEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();

                if (cardNumber.length() > 0 && password.length() > 0) {
                    Intent dashboard = new Intent(HomePage.this, Dashboard.class);
                    HomePage.this.startActivity(dashboard);
                    finish();
                } else {
                    mErrorTextView.setText("Enter your card number and password");
                    mErrorTextView.setVisibility(View.VISIBLE);
                }
            }
        });

    }

}
