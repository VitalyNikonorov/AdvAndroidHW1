package net.nikonorov.advandroidhw1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by vitaly on 09.10.15.
 */
public class ActivityList extends AppCompatActivity {

    private RecyclerView rv;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle(R.string.titleListActivity);
        rv = (RecyclerView) findViewById(R.id.al_rv);
        rv.setHasFixedSize(true);
    }


}
