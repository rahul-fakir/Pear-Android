package com.pear.rahulfakir.pear_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    //  Components
    private Button btnWelcomeActivity_Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnWelcomeActivity_Register = (Button) findViewById(R.id.btnWelcomeActivity_Register);

        btnWelcomeActivity_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRegisterActivityIntent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(toRegisterActivityIntent);
            }
        });
    }
}
