package com.pear.rahulfakir.pear_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    //  Components
    private Button WelcomeActivity_btnRegister;
    private Button WelcomeActivity_btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        WelcomeActivity_btnRegister = (Button) findViewById(R.id.WelcomeActivity_btnRegister);
        WelcomeActivity_btnLogin = (Button) findViewById(R.id.WelcomeActivity_btnLogin);

        WelcomeActivity_btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRegisterActivityIntent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(toRegisterActivityIntent);
            }
        });

        WelcomeActivity_btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLoginActivity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(toLoginActivity);
            }
        });
    }
}
