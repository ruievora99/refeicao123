package pt.upt.resolucaoexercicio20210401;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView textViewLinha1;
    TextView textViewLinha2;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewLinha1 = itemView.findViewById(R.id.linha1);
    }
}
