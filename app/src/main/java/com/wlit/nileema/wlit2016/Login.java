package com.wlit.nileema.wlit2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText login_edittext;
    EditText et_password,et_login;
    Button button_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_edittext=(EditText)findViewById(R.id.et_login);
        et_password=(EditText)findViewById(R.id.password);
        button_login=(Button)findViewById(R.id.button);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_login.getText().toString().equals("nileema")&& et_password.getText().toString().equals("password")) {
                    Intent intent = new Intent(Login.this, home.class);
                    startActivity(intent);
                }
                    else{
                    Toast.makeText(Login.this, "username and password not match",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
