package com.mohitkishore.guidemydough.UI;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mohitkishore.guidemydough.R;

import Adaptors.ProgressAdaptor;
import Model.Goals;

public class ProgressActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        TextView progressItemNameTextView1 = new TextView(ProgressActivity.this);
        TextView progressDescriptionTextView1 = new TextView(ProgressActivity.this);
        ImageView progressItemImageView1 = new ImageView(this);

        TextView progressItemNameTextView2 = new TextView(this);
        TextView progressDescriptionTextView2 = new TextView(this);
        ImageView progressItemImageView2 = new ImageView(this);


        TextView progressItemNameTextView3 = new TextView(this);
        TextView progressDescriptionTextView3 = new TextView(this);
        ImageView progressItemImageView3 = new ImageView(this);

        int width = (int) getResources().getDimension(R.dimen.width);
        int height = (int) getResources().getDimension(R.dimen.height);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(width, height);

        progressItemNameTextView1.setLayoutParams(params);
        progressDescriptionTextView1.setLayoutParams(params);
        progressItemImageView1.setLayoutParams(params);

        progressItemNameTextView2.setLayoutParams(params);
        progressDescriptionTextView2.setLayoutParams(params);
        progressItemImageView2.setLayoutParams(params);

        progressItemNameTextView3.setLayoutParams(params);
        progressDescriptionTextView3.setLayoutParams(params);
        progressItemImageView3.setLayoutParams(params);

        progressItemNameTextView1.setText("Vacation");
        progressDescriptionTextView1.setText("Test 1");

        progressItemNameTextView2.setText("Home loan");
        progressDescriptionTextView2.setText("Test 2");

        progressItemNameTextView3.setText("Car loan");
        progressDescriptionTextView3.setText("Test 3");


        progressItemImageView1.setImageResource(R.drawable.goal_car);


        progressItemImageView2.setImageResource(R.drawable.goal_home);


        progressItemImageView3.setImageResource(R.drawable.goal_vaccation);

        Goals goal1 = new Goals( progressItemImageView1, progressItemNameTextView1, progressDescriptionTextView1);
        Goals goal2 = new Goals( progressItemImageView2, progressItemNameTextView2, progressDescriptionTextView2);
        Goals goal3 = new Goals( progressItemImageView3, progressItemNameTextView3, progressDescriptionTextView3);
        Goals[] goals = {goal1, goal2, goal3};

        ProgressAdaptor adaptor = new ProgressAdaptor(this, goals);
        setListAdapter(adaptor);
    }
}
