package com.suman.topic7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        text = findViewById(R.id.text);


        Bundle bundle = getIntent().getExtras();

        if(bundle!=null) {
        String meaning = bundle.getString("meaning");
        text.setText(meaning);



        }
    }
}
