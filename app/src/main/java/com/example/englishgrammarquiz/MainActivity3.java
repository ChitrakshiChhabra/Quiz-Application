package com.example.englishgrammarquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private Button next;
    private RadioGroup radioGroup;
    boolean correct_answer = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        next = findViewById(R.id.button2);
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity3.this, "was flashed", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity3.this, "struck", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(MainActivity3.this, "was struck", Toast.LENGTH_SHORT).show();
                        correct_answer = true;
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(MainActivity3.this, "flashed", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                Bundle bundle = getIntent().getExtras();
                int n = bundle.getInt("one");
                if (correct_answer == true)
                {
                    intent.putExtra("two", n+1);
                }

                else
                    intent.putExtra("two", n);
                startActivity(intent);
            }
        });
    }
}