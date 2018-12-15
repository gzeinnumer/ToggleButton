package com.zein.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = findViewById(R.id.idToogleButton);
    }

    public void onToggleClick(View view) {
        if(toggleButton.isChecked()){
            Toast.makeText(getApplicationContext(), "Toggle On",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(),"Toggle Off", Toast.LENGTH_SHORT).show();
        }
    }
}
