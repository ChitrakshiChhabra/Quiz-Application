package com.example.englishgrammarquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button next;
    private RadioGroup radioGroup;
    boolean correct_answer = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity2.this, "for buying", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity2.this, "for buy", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(MainActivity2.this, "to buy", Toast.LENGTH_SHORT).show();
                        correct_answer = true;
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(MainActivity2.this, "buy", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


        next = findViewById(R.id.button2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                if (correct_answer == true)
                    intent.putExtra("one", 1);
                else
                    intent.putExtra("one", 0);

                startActivity(intent);
            }
        });




    }
}