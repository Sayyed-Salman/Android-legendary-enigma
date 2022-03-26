package com.buttons.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText username, password, confirmPassword,email;
        Button register;

        username = findViewById(R.id.Rusername);
        password = findViewById(R.id.RPassword);
        confirmPassword = findViewById(R.id.RConfirmPassword);
        email = findViewById(R.id.REmail);
        register = findViewById(R.id.Rregister);





        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validate v = new Validate();
                boolean uvalid,pvalid,cpvalid,rvalid;
                uvalid = v.isValid(username,"Enter",true);
                pvalid = v.isValid(password,"EnterPassword",true);
                cpvalid = v.isValid(confirmPassword,"Confirm Password",true);

                if(uvalid && pvalid && cpvalid){
                    Toast.makeText(Register.this, "Registered Succesfully", Toast.LENGTH_SHORT).show();
                    Intent home = new Intent(Register.this,HomeScreen.class);
                    startActivity(home);
                }else{
                    Toast.makeText(Register.this, "Do it again", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
}