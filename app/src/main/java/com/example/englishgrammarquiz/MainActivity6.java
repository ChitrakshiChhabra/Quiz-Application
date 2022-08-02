package com.example.englishgrammarquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    private Button end;
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    boolean correct_answer_part_one = false;
    boolean correct_answer_part_two = false;
    boolean wrong_answer_part_one = true;
    boolean wrong_answer_part_two = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        end = findViewById(R.id.button2);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox1.isChecked()){
                    Toast.makeText(MainActivity6.this, "is", Toast.LENGTH_SHORT).show();
                    wrong_answer_part_one = false;
                }

            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox2.isChecked()) {
                    Toast.makeText(MainActivity6.this, "are", Toast.LENGTH_SHORT).show();
                    correct_answer_part_one = true;
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox1.isChecked()){
                    Toast.makeText(MainActivity6.this, "were", Toast.LENGTH_SHORT).show();
                    wrong_answer_part_two = false;
                }

            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity6.this, "were", Toast.LENGTH_SHORT).show();
                correct_answer_part_two = true;
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity6.this, MainActivity7.class);
                Bundle bundle = getIntent().getExtras();
                int n = bundle.getInt("four");
                if (correct_answer_part_one == true && correct_answer_part_two == true && wrong_answer_part_one == true && wrong_answer_part_two == true)
                    intent.putExtra("five", n+1);
                else
                    intent.putExtra("five",n);
                startActivity(intent);
            }
        });






    }
}