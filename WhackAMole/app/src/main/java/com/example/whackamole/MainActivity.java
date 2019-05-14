package com.example.whackamole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);     // references the button id
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button);
        //button.setVisibility(View.INVISIBLE);

        Timer timer = new Timer();

        // timer.schedule() will execute the code in TimerTask after the delay
        timer.schedule(new TimerTask()
            {
            @Override
            public void run () {
                Log.d("otter", "inside timer task");
            }
            }, 5000);           // end of anonymous function     end of timer.schedule()

        // Schedules the specified task for repeated fixed-rate execution, beginning at the specified time.
        timer.scheduleAtFixedRate(new TimerTask()
            {
            @Override
            public void run() {
                Log.d("otter", "fixed rate");
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {

                    }
                });
            }
        }, 10000, 500);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view) {
                Log.d("otter", "button was clicked");
            }
        });

    }   // end of onCreate function
}   //end of class
