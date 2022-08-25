package za.gov.saps.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdaptor extends RecyclerView.Adapter<MyViewHolder> {
    Context g;
    List<String> ndate;
    List<String> area;

    public MyAdaptor(Context c, List<String> ndate, List<String> area){
        this.g = c;
        this.ndate = ndate;
        this.area = area;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(g).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtName.setText(ndate.get(position));
        holder.txtName1.setText(area.get(position));
    }

    @Override
    public int getItemCount() {
        return ndate.size();
    }
}
