package pt.upt.resolucaoexercicio20210401;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> implements View.OnClickListener {

    ArrayList<Integer> diasDaSemana;
    ArrayList<Refeicao> refeicoes;
    MyViewHolder myViewHolder;
    MainActivity mainActivity;

    private int horaAtual;

    public MyAdapter(MainActivity mainActivity, ArrayList<Integer> diasSemana, ArrayList<Refeicao> refeicoes) {
        this.mainActivity = mainActivity;
        this.diasDaSemana = diasSemana;
        this.refeicoes = refeicoes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.linha_dia_semana, parent, false);
        view.setOnClickListener(this);
        myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textViewLinha1.setText(diasDaSemana.get(position).toString());
    }


    @Override
    public int getItemCount() {
        return diasDaSemana.size();
    }

    @Override
    public void onClick(View v) {
        int posicao;
        TextView textView;
        Bundle bundle;

        textView = v.findViewById(R.id.linha1);
        posicao = Integer.parseInt(textView.getText().toString());

        Intent intent;
        intent = new Intent(v.getContext(), MainActivity2.class);
        for (Refeicao refeicao : refeicoes) {
            if (refeicao.getDiaDaSemana() == posicao)
                intent.putExtra("chave", (Serializable) refeicao);
        }
        this.mainActivity.startActivity(intent);


    }
}
