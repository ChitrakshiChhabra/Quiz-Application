package com.example.englishgrammarquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    private Button finish;
    private TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        finish = findViewById(R.id.button3);
        score = findViewById(R.id.textView4);

        Bundle bundle = getIntent().getExtras();
        int n1 = bundle.getInt("five");
        String value = String.valueOf(n1);
        score.setText(value);


        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}