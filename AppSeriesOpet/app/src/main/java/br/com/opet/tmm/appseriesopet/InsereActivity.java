package br.com.opet.tmm.appseriesopet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsereActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insere);

        Button botao = (Button)findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText nome = (EditText)findViewById(R.id.editText);
                EditText telefone = (EditText)findViewById((R.id.editText2));
                EditText email = (EditText)findViewById(R.id.editText3);
                String nomeString = nome.getText().toString();
                String telefoneString = telefone.getText().toString();
                String emailString = email.getText().toString();
                String resultado;

                resultado = crud.insereDado(nomeString,telefoneString,emailString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
    }
}
