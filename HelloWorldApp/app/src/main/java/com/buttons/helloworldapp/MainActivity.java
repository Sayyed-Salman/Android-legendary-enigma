 package com.buttons.helloworldapp;

 import android.content.DialogInterface;
 import android.os.Bundle;
 import android.widget.Button;
 import  android.app.AlertDialog;
 import android.widget.Toast;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

     AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alert = findViewById(R.id.button);
        alert.setOnClickListener(view -> {
            builder = new AlertDialog.Builder(this);
            builder.setMessage("Fire ?");
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "yes", Toast.LENGTH_SHORT).show();
                }
            });

            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "no", Toast.LENGTH_SHORT).show();
                }
            });

            AlertDialog a = builder.create();
            a.setTitle("Fire ?");
            a.show();
        });

        
    }
    
     

 }