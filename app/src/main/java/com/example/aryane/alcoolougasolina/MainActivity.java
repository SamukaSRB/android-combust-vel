package com.example.aryane.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button btnCalcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recuperando Itens
        precoAlcool =findViewById(R.id.tbxAlcool);
        precoGasolina =findViewById(R.id.tbxGasolina);
        btnCalcular = findViewById(R.id.btnCalcular);
        resultado = findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperação do valores digitados
                String txtPrecoAlcool = precoAlcool.getText().toString();
                String txtPrecoGasolina = precoGasolina.getText().toString();
                //Conversão para de dados digitados
                Double valorAlcool = Double.parseDouble(txtPrecoAlcool);
                Double valoGasolina = Double.parseDouble(txtPrecoGasolina);
                //Fazendo os calculos
                double res = valorAlcool/valoGasolina;
                if(res<=0.7) {
                    resultado.setText("Melhor abastecer com etanol");
                }else{
                    resultado.setText("Melhor abastecer com gasolina");
                }
            }
        });



    }
}
