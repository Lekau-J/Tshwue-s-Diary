package za.gov.saps.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView txtName, txtName1, txtName2;

    public MyViewHolder( View itemView){
        super(itemView);

        txtName = itemView.findViewById(R.id.name);
        txtName1 = itemView.findViewById(R.id.number);
        txtName2 = itemView.findViewById(R.id.place);
    }
}
