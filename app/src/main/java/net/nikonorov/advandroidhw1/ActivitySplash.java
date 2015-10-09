package net.nikonorov.advandroidhw1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by vitaly on 09.10.15.
 */
public class ActivitySplash extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(this, ActivityList.class);
        startActivity(intent);
    }
}
