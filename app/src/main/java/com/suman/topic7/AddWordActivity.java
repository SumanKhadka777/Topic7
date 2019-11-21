package com.suman.topic7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class AddWordActivity extends AppCompatActivity {

   EditText etWord, etMeaning;
   Button btnAdd ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        etWord=findViewById(R.id.etWord);
        etMeaning = findViewById(R.id.etMeaning);
        btnAdd= findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });


    }

    private  void save (){
        try {
            PrintStream printStream = new PrintStream(openFileOutput("Words.txt", MODE_PRIVATE | MODE_APPEND));
            printStream.println(etWord.getText().toString() + ":-"+ etMeaning.getText().toString());
            Toast.makeText(this, "Saved to", Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            Log.d("Dictionary App","error" + e.toString());
            e.printStackTrace();
        }


    }
}
