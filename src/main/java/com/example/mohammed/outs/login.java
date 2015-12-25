package com.example.mohammed.outs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {

    TextView textView_mail, textView_password;
    String mail, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView_mail= (TextView) findViewById(R.id.input_userName);
        textView_password= (TextView) findViewById(R.id.input_password);

        mail = textView_mail.getText().toString();
        password = textView_password.getText().toString();

    }

    public void next(View view){
        mail = textView_mail.getText().toString();
        password = textView_password.getText().toString();
        if(mail.equals("") ) {
            Snackbar.make(view, "email is empty!!", Snackbar.LENGTH_LONG).show();
        }
        else if (password.equals("")){
            Snackbar.make(view, "password is empty!!", Snackbar.LENGTH_LONG).show();
        }
        else{
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }
    }
}
