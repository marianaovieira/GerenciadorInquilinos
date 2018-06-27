package pooa20181.iff.br.gerenciadordeinquilino;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;
import pooa20181.iff.br.gerenciadordeinquilino.model.Gerenciador_Adm;

public class Cadastro_Adm extends AppCompatActivity {

    EditText username, password, conf_password, nome_adm, sobrenome_adm, email_adm, telefone_adm;
    Button cadastrar_adm;



    Gerenciador_Adm gerenciador_adm;
    private Realm realm;

    @RequiresApi(api = Build.VERSION_CODES.O)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro__adm);

        username = (EditText) findViewById(R.id.txtUsuario);
        password = (EditText) findViewById(R.id.txtSenha);
        conf_password = (EditText) findViewById(R.id.txtConfirmaSenha);
        nome_adm = (EditText) findViewById(R.id.txtNome);
        sobrenome_adm = (EditText) findViewById(R.id.txtSobrenome);
        email_adm = (EditText) findViewById(R.id.txtEmail);
        telefone_adm = (EditText) findViewById(R.id.txtTelefone);
        cadastrar_adm = (Button) findViewById(R.id.btnCadastrar);

        Intent intent    = getIntent();
        //realm = Realm.getDefaultInstance();

        cadastrar_adm.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                cadastrar();
            }

        });


}
    public void cadastrar() {


        realm.beginTransaction();
        Gerenciador_Adm gerenciador_adm = new Gerenciador_Adm();
        setEGrava(gerenciador_adm);

        realm.copyToRealm(gerenciador_adm);
        realm.commitTransaction();
        realm.close();

        Toast.makeText(this,"Usuário Cadastrado", Toast.LENGTH_LONG).show();
        this.finish();

    }

    private void setEGrava(Gerenciador_Adm gerenciador_adm){

        gerenciador_adm.setUsername(username.getText().toString());
        gerenciador_adm.setPassword(password.getText().toString());
        gerenciador_adm.setNome_adm(nome_adm.getText().toString());
        gerenciador_adm.setSobrenome_adm(sobrenome_adm.getText().toString());
        gerenciador_adm.setTelefone_adm((telefone_adm.getText().toString()));
        gerenciador_adm.setEmail_adm((email_adm.getText().toString()));

        }
}
