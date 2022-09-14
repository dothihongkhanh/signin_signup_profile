
package com.example.bt4_taoluonggiaodien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SignupActivity extends AppCompatActivity {
    Button btnSignUp;
    EditText edtxtUserName;
    EditText edtxtEmail;
    EditText edtxtPhone;
    EditText edtxtPass;
    ImageButton imbtnBackSU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        AnhXa();
        ControlButton();
    }
    private void AnhXa(){
        btnSignUp = (Button) findViewById(R.id.buttonSignUp);
        edtxtUserName = (EditText) findViewById(R.id.edittextUserName);
        edtxtEmail = (EditText) findViewById(R.id.edittextEmail);
        edtxtPhone = (EditText) findViewById(R.id.edittextPhone);
        edtxtPass = (EditText) findViewById(R.id.edittextPass);
        imbtnBackSU = (ImageButton) findViewById(R.id.imabuttonBackSignUp);
    }
    private void ControlButton(){
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(SignupActivity.this, SigninActivity.class);
                startActivity(myIntent);
            }
        });
        imbtnBackSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(SignupActivity.this, SigninActivity.class);
                startActivity(myIntent);
            }
        });
    }

}