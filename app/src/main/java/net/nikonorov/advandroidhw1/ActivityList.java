package net.nikonorov.advandroidhw1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by vitaly on 09.10.15.
 */
public class ActivityList extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle(R.string.titleListActivity);
    }
}
