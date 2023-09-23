package com.loginscreen.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView signin = findViewById(R.id.signin);
        TextView username = findViewById(R.id.usernam_input);
        TextView password = findViewById(R.id.password_input);
        Button loginbtn = (Button) findViewById(R.id.loginbtn);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo một Intent để chuyển đến SecondActivity
                Intent intent = new Intent(MainActivity.this, SigninActivity.class);
                startActivity(intent);
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("khanhbeo") && password.getText().toString().equals("khanhmap")){
                    //dang nhap thanh cong
                    Toast.makeText(MainActivity.this,"Đăng Nhập Thành Công", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Đăng Nhập Thất Bại",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}