package com.fju.water;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


    private static final String TAG = ResultActivity.class.getSimpleName();
    private static final double DEFAULT_FEE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent =getIntent();
        double outcome =intent.getDoubleExtra(getString(R.string.extra_fee),DEFAULT_FEE);
        Log.d(TAG,outcome+"");
        TextView textfee =findViewById(R.id.fee);
        int n =(int) (outcome+0.5);
        textfee.setText(n+"");

    }
}
