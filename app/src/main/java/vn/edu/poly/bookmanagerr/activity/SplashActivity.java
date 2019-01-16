package vn.edu.poly.bookmanagerr.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import vn.edu.poly.bookmanagerr.R;
import vn.edu.poly.bookmanagerr.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // chuyen man hinh tai day
                startNewActivity(LoginActivity.class);
                finish();

            }
        }, 1500);

        showMessage("Hello Guys, How are you ?");



    }


}
