package net.nikonorov.advandroidhw1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewDebug;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitaly on 09.10.15.
 */
public class ActivityList extends AppCompatActivity {

    private RecyclerView rv;
    private List<ListItem> list;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle(R.string.titleListActivity);
        rv = (RecyclerView) findViewById(R.id.al_rv);
        rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        initList();

        RVAdapter rvAdapter = new RVAdapter(list);
        rv.setAdapter(rvAdapter);
    }

    private void initList(){
        list = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            int color = (i%2 == 1) ? Color.parseColor("#aaaaaa") : Color.parseColor("#ffffff");
            list.add(new ListItem(new Integer(i + 1).toString(), color));
        }
    }


}
