package com.apecat.shoppingadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.apecat.shoppingadvisor.scan.CaptureActivity;

public class LaunchActivity extends Activity {

    private static final String TAG = LaunchActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    processVoiceAction(null);
            }
        }, 100);
    }

    private void processVoiceAction(String command) {
        Log.v(TAG, "Voice command: " + command);
        startActivity(CaptureActivity.newIntent(this));
        finish();
    }
}
