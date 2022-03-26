package com.buttons.notificationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("1001","Hello", NotificationManager.IMPORTANCE_HIGH);
            channel.setDescription("Hello Channel");

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

        NotificationManagerCompat nm;

        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newac = new Intent(MainActivity.this,MainActivity2.class);
                PendingIntent pi = PendingIntent.getActivity(MainActivity.this,0,newac,0);

                NotificationCompat.Builder builder = new
                        NotificationCompat.Builder(MainActivity.this,"1001");
                builder.setSmallIcon(R.drawable.ic_launcher_foreground);
                builder.setContentText("Hello");
                builder.setContentTitle("Click Me");
                builder.setPriority(4);
                builder.setContentIntent(pi);
                builder.setAutoCancel(true);

                NotificationManagerCompat nm = NotificationManagerCompat.from(MainActivity.this);
                nm.notify(1001,builder.build());


            }
        });




    }
}