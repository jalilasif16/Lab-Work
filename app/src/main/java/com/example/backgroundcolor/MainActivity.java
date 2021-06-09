package com.example.backgroundcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int x;
    Button myButton_1;
    TextView textView_1;
    Button open_activity;
    EditText et;
    androidx.constraintlayout.widget.ConstraintLayout ct1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton_1 = findViewById(R.id.btn_1);
        ct1 = findViewById(R.id.ct_1);
        open_activity = findViewById(R.id.btn_2);
        et = findViewById(R.id.editTextTextPersonName);

    }

    public void my_function(View v)
    {
        Toast.makeText(this, "Jalil Asif", Toast.LENGTH_SHORT).show();
        textView_1.setText("Asif Saeed");
        myButton_1.setText("Ahmad Bilal");
        myButton_1.setBackgroundColor(ContextCompat.getColor(this,R.color.green));
        textView_1.setTextColor(ContextCompat.getColor(this,R.color.red));
        ct1.setBackgroundColor(ContextCompat.getColor(this,R.color.black));
        myButton_1.setTextColor(ContextCompat.getColor(this,R.color.purple));
    }


    // Explicit Intent = Mostly used for moving for one user made activity to another user made activity.
    public void openSecond_activity(View v)
    {
        String text_to_send = et.getText().toString();
        Intent mainActivity_intent = new Intent(this,SecondActivity.class);
        mainActivity_intent.putExtra("jj",text_to_send);

        startActivity(mainActivity_intent);
    }

    // Implicit Intent = Mostly used for opening already present activities in other mobile applications
    // Implicit intents are also called action intents.

    public void searchInternet (View v)
    {
        String text_to_search = et.getText().toString();
        Intent search_intent = new Intent(Intent.ACTION_WEB_SEARCH);
        search_intent.putExtra(SearchManager.QUERY,text_to_search);
        startActivity(search_intent);
    }
}