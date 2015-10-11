package net.nikonorov.advandroidhw1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by vitaly on 09.10.15.
 */
public class ActivitySplash extends Activity {
    private final int PAUSE = 2000;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Launcher launcher = new Launcher();
        launcher.start();
    }

    private class Launcher extends Thread{

        public void run(){
            try {
                Thread.sleep(PAUSE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(ActivitySplash.this, ActivityList.class);
            startActivity(intent);
            ActivitySplash.this.finish();
        }
    }
}
