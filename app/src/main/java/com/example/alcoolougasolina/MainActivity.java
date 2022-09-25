package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vai pegar o que o usuário digitar e salvar nas variáveis
        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);

    }

    //classe que vai calcular os valores que o usuário digitar
    public void calcularPreco(View view){

        //converter o texto que o usuário digitou de 'String' para 'Double'
        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

        /**
         * Segundo especialistas em motores, um veículo abastecido com Etanol rende,
         * em média 30% a menos do que se estivesse com gasolina.
         * Por isso, para valer a pena, o litro do Etanol deve custar até 70% do litro da Gasolina!
         */

        /**
         * O Calculo a ser realizado será o seguinte:
         * Dividir o valor do litro do Etanol pelo valor do litro da Gasolina,
         * Se o resultado for 0.70 ou mais, a Gasolina compensa, caso contrário, melhor utilizar Álcool.
         */

        Double resultado = precoAlcool / precoGasolina;

        if (resultado >= 0.7) {
            textResultado.setText("Melhor abastecer com Gasolina!");
        }
        else{
            textResultado.setText("Melhor abastecer com Alcool!");
        }

    }
}