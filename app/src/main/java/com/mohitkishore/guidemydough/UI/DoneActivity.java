package com.mohitkishore.guidemydough.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mohitkishore.guidemydough.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DoneActivity extends AppCompatActivity {

    @Bind(R.id.yayText)
    TextView mYayText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        ButterKnife.bind(this);
        Typewriter writer = new Typewriter(this);

        //Add a character every 150ms
        writer.setCharacterDelay(150);
        writer.animateText(mYayText.getText().toString());
    }

}
