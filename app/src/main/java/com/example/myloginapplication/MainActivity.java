package com.example.myloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      public void OnClickButton(View view){
        EditText nameEditText=findViewById(R.id.nameEditText);
        EditText passwordEditText=findViewById(R.id.passwordEditText);
        Log.i("button","you are welcome");
        Log.i("button",nameEditText.getText().toString());
        Log.i("button",passwordEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}