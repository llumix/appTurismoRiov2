package com.riobamba.appturismorio.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.riobamba.appturismorio.MainActivity;
import com.riobamba.appturismorio.R;

public class SplashScreenActivity extends Activity {

    private static long SPLASH_MILLIS = 800;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LayoutInflater inflater= LayoutInflater.from(this);
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.activity_splash_screen, null, false);
        addContentView(layout, new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT));

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run()
            {
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, SPLASH_MILLIS);
    }
}
