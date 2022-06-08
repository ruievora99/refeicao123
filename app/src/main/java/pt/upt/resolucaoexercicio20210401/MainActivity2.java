package pt.upt.resolucaoexercicio20210401;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewSopa = findViewById(R.id.textViewSopa2);
        TextView textViewPratoCarne = findViewById(R.id.textViewPratoCarne2);
        TextView textViewPratoPeixe = findViewById(R.id.textViewPratoPeixe2);
        TextView textViewSobremesa = findViewById(R.id.textViewSobremesa2);

        Intent intent = getIntent();
        Refeicao refeicao;

        refeicao = (Refeicao) intent.getExtras().getSerializable("chave");

        textViewSopa.setText(refeicao.getSopa());
        textViewPratoCarne.setText(refeicao.getPratoDeCarne());
        textViewPratoPeixe.setText(refeicao.getPratoDePeixe());
        textViewSobremesa.setText(refeicao.getSobremesa());
    }

    public void onClick (View view) {
        finish();

    }
}