package com.example.homework_2_2_month;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      getSupportFragmentManager().beginTransaction().add(R.id.ln_fragment,new MainFragment()).commit();
    }
}