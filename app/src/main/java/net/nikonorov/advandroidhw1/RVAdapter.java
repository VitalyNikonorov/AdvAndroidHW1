package net.nikonorov.advandroidhw1;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vitaly on 10.10.15.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CardViewHolder> {

    List<ListItem> list;

    public static class CardViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView tv;
        CardViewHolder(View item){
            super(item);
            cv = (CardView) item.findViewById(R.id.cv);
            tv = (TextView) item.findViewById(R.id.cv_tv);
        }
    }


    RVAdapter(List<ListItem> listItem){
        this.list = listItem;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        CardViewHolder cvh = new CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.tv.setText(list.get(position).getCaption());
        holder.cv.setBackgroundColor(list.get(position).getColor());
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
