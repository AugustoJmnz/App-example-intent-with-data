package com.example.appexampleintentwithdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText PersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PersonName =(EditText)findViewById(R.id.PersonName);
    }
    //Btn enviar o Login
    public void Login (View view){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("data", PersonName.getText().toString());
        startActivity(intent);
    }
}