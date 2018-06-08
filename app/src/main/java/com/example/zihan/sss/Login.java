package com.example.zihan.sss;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    EditText ET_NAME, ET_PASS;
    String login_name, login_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ET_NAME=findViewById(R.id.user_name);
        ET_PASS=findViewById(R.id.user_pass);
    }


    public void userLogin(View view){
        login_name = ET_NAME.getText().toString();
        login_pass = ET_PASS.getText().toString();
        String method = "login";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, login_name, login_pass);
    }
    public void userReg(View view){
        //新增的activity要在清单中申报
        startActivity(new Intent(this, Register.class));
    }
}