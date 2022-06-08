package pt.upt.resolucaoexercicio20210401;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Refeicao> refeicoes;
    private ArrayList<Integer> diasSemana;
    private int diaSemana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textViewDiaSemana;

        setContentView(R.layout.activity_main);
        textViewDiaSemana = findViewById(R.id.textViewDataHoje);

        setDiaSemana();

        textViewDiaSemana.setText(String.valueOf(diaSemana));

        inicializaListaRefeicoes();
        diasSemana = getDiasSemana();
        mostraEmentaDia();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        MyAdapter myAdapter = new MyAdapter(this, diasSemana, refeicoes);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void mostraEmentaDia() {
        TextView textViewSopa;
        TextView textViewPratoCarne;
        TextView textViewPratoPeixe;
        TextView textViewSobremesa;

        textViewSopa = findViewById(R.id.textViewSopa);
        textViewPratoCarne = findViewById(R.id.textViewPratoCarne);
        textViewPratoPeixe = findViewById(R.id.textViewPratoPeixe);
        textViewSobremesa = findViewById(R.id.textViewSobremesa);

        for (Refeicao refeicao : refeicoes) {
            if (refeicao.getDiaDaSemana() == diaSemana) {
                textViewSopa.setText(refeicao.getSopa());
                textViewPratoCarne.setText(refeicao.getPratoDeCarne());
                textViewPratoPeixe.setText(refeicao.getPratoDePeixe());
                textViewSobremesa.setText(refeicao.getSobremesa());
            }
        }

    }

    private void inicializaListaRefeicoes() {
        this.refeicoes = new ArrayList<>();

        refeicoes.add(new Refeicao(2, "Caldo verde", "Bifes com batatas fritas", "Bacalhau", "Leite creme"));
        refeicoes.add(new Refeicao(3, "Feijão branco", "Fondue", "Pescada", "Arroz doce"));
        refeicoes.add(new Refeicao(4, "Hortaliça", "Lasanha de carne", "Atum", "Fruta"));
        refeicoes.add(new Refeicao(5, "Canja", "Francesina", "Polvo", "Rabanadas"));
        refeicoes.add(new Refeicao(6, "Vegetais", "Coelho", "Pataniscas", "Salada de fruta"));
    }

    private void setDiaSemana() {
        diaSemana = 3;
    }

    private ArrayList<Integer> getDiasSemana() {
        ArrayList<Integer> diasDaSemana = new ArrayList<>();
        for (int dia = 2; dia < 7; dia++) {
            if (dia != diaSemana)
                diasDaSemana.add(dia);
        }
        return diasDaSemana;
    }
}