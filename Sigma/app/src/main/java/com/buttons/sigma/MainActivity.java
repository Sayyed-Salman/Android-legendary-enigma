package com.buttons.sigma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        TextView display;

        btn = findViewById(R.id.button);
        display = findViewById(R.id.displayText);
        display.setText("Screen Orientation");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE == getRequestedOrientation()){


                }
                else{

                }
            }
        });



    }

}