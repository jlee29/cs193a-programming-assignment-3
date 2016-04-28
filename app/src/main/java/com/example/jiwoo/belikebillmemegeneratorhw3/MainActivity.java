package com.example.jiwoo.belikebillmemegeneratorhw3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeActivity(View view) {
        String name = "";
        EditText nameField = (EditText) findViewById(R.id.nameField);
        if (nameField.getText() != null) {
            name = nameField.getText().toString();
        }
        Intent intent = new Intent(this, MemeActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
