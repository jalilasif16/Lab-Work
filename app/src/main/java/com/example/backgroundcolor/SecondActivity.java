package com.example.backgroundcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView get_data;
    Button receivedata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        get_data = findViewById(R.id.tv_getdata);
        receivedata = findViewById(R.id.buttonreceive);


        /*Intent data_get = getIntent();
        String received_data = data_get.getStringExtra("jj");
        get_data.setText(received_data);*/
    }

    public void receivedatafrommainactivity(View v)
    {
        Intent data_get = getIntent();
        String received_data = data_get.getStringExtra("jj");
        get_data.setText(received_data);
    }
}