package com.example.mytest07_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //test 2023/07/04 for first commit
        setContentView(R.layout.activity_main);
        welcome();
        Button button = findViewById(R.id.bt_android);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"button",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void welcome(){
        Toast.makeText(this, "欢迎来到我的世界", Toast.LENGTH_LONG).show();
    }


}