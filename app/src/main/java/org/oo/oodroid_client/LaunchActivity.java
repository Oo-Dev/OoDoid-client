package org.oo.oodroid_client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LaunchActivity extends Activity{

    private final static int LAUNCH_ACTIVITY_DELAY = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent startMain = new Intent(LaunchActivity.this,MainActivity.class);
                startActivity(startMain);
                finish();
            }
        },LAUNCH_ACTIVITY_DELAY);
    }
}
