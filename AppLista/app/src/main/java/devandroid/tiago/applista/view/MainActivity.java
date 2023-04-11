package devandroid.tiago.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.tiago.applista.R;
import devandroid.tiago.applista.model.Pessoa;


public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa = new Pessoa();
        //Atribuir conteido ao objeto(pessoa)
        //conforme model
        pessoa.setPrimeiroNome("Tiago");
        pessoa.setSobreNome("Oliveira");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("51-992751912");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobreNome("Silva");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefoneContato("51-99999999");

        int parada = 0;
    }
}