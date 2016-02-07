package com.mohitkishore.guidemydough.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mohitkishore.guidemydough.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BalanceActivity extends AppCompatActivity {

    @Bind(R.id.accountListViews)
    ListView mAccountListViews;
    

    private ArrayAdapter mArrayAdapter = null;
    private ArrayList mArrayList = new ArrayList();
    private String[] accountNames = {"Banking Advantage Plans - $300", "Money Master - $3452", "Scene VISA Card - $3223"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);
        ButterKnife.bind(this); //Butter knife

        for(String account : accountNames){
            mArrayList.add(account);
        }

        mArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mArrayList);
        mAccountListViews.setAdapter(mArrayAdapter);
    }
}
