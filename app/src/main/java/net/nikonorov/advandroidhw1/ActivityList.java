package net.nikonorov.advandroidhw1;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewDebug;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitaly on 09.10.15.
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
            list.add(new ListItem(intToStr(i + 1), color));
        }
    }

    private String intToStr(int i){
        Resources res = getResources();
        String[] hundreds = res.getStringArray(R.array.its_hundreds);
        String[] decades = res.getStringArray(R.array.its_decades);
        String[] units = res.getStringArray(R.array.its_units);
        String[] firstDecade = res.getStringArray(R.array.its_first_decade);

        String result = "";
        String unit = "";
        String decade = "";
        String hundred = "";

        if (i / 1000 != 1){
            hundred = hundreds[i / 100] + " ";
        }else{
            result = getString(R.string.hundred);
        }

        if ( (i / 10) % 10 == 1 ){
            decade = firstDecade[i % 10];
        }else{
            decade = decades[(i / 10) % 10] + " ";
            unit = units[i % 10];
        }

        result = new StringBuilder()
                .append(result)
                .append(hundred)
                .append(decade)
                .append(unit)
                .toString();

        return result;
    }

}
