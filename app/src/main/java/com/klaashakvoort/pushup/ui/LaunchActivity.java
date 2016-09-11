package com.klaashakvoort.pushup.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LaunchActivity extends AppCompatActivity {

    private static final String TAG = LaunchActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
