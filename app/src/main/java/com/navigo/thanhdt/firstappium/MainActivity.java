package com.navigo.thanhdt.firstappium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText edtResult;
    private EditText edtName;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        edtResult = (EditText) findViewById(R.id.edtResult);
        edtName = (EditText) findViewById(R.id.edtName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = String.valueOf(edtName.getText());
                String password = String.valueOf(edtPassword.getText());
                if (username.equals("username") && password.equals("password")) {
                    edtResult.setText("success");
                } else {
                    edtResult.setText("error");
                }

            }
        });
    }
}
