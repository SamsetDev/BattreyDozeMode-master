package com.samset.doze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.samset.doze.utils.DozeHelper;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton btncheck;
    private AppCompatTextView tvmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncheck=findViewById(R.id.btncheck);
        tvmsg=findViewById(R.id.tvmsg);


        tvmsg.setText("This app is " +DozeHelper.getisBatteryOptimizations(this,getPackageName().toString()));
        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= DozeHelper.prepareBatteryOptimization(MainActivity.this,getPackageName(),true);
                startActivity(intent);

            }
        });





    }
}
