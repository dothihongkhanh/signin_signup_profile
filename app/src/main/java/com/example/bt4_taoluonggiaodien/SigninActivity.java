package com.example.bt4_taoluonggiaodien;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SigninActivity extends Activity {
    Button btnSignIn;
    TextView txtvSignUp;
    EditText edtxtUsername;
    EditText edtxtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        AnhXa();

        txtvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(SigninActivity.this, SignupActivity.class);
                startActivity(myIntent);
            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(SigninActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

    }
    public void AnhXa(){
        btnSignIn = (Button) findViewById(R.id.buttonLogin);
        txtvSignUp = (TextView) findViewById(R.id.txtViewCreateAccount);
        edtxtUsername = (EditText) findViewById(R.id.edittextUserName);
        edtxtPass = (EditText) findViewById(R.id.edittextPass);
    }


}