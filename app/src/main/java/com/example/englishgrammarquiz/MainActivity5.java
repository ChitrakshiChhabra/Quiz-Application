package com.example.englishgrammarquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    private Button next;
    private RadioGroup radioGroup;
    boolean correct_answer = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        next = findViewById(R.id.button2);
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity5.this, "True", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity5.this, "False", Toast.LENGTH_SHORT).show();
                        correct_answer = true;
                        break;

                }
            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                Bundle bundle = getIntent().getExtras();
                int n = bundle.getInt("three");
                if (correct_answer == true)
                    intent.putExtra("four", n+1);
                else
                    intent.putExtra("four",n);
                startActivity(intent);
            }
        });

    }
}