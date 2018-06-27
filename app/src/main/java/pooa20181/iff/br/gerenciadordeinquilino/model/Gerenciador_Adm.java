package pooa20181.iff.br.gerenciadordeinquilino.model;

import java.io.Serializable;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Gerenciador_Adm extends RealmObject implements Serializable{

    @PrimaryKey
    private String username;
    private String password;
    private String email_adm;
    private String nome_adm;
    private String sobrenome_adm;
    private String telefone_adm;


    public Gerenciador_Adm(){}

    public Gerenciador_Adm(String username, String password, String email_adm, String nome_adm, String sobrenome_adm, String telefone_adm) {
        this.username = username;
        this.password = password;
        this.email_adm = email_adm;
        this.nome_adm = nome_adm;
        this.sobrenome_adm = sobrenome_adm;
        this.telefone_adm = telefone_adm;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail_adm() {
        return email_adm;
    }

    public void setEmail_adm(String email_adm) {
        this.email_adm = email_adm;
    }

    public String getNome_adm() {
        return nome_adm;
    }

    public void setNome_adm(String nome_adm) {
        this.nome_adm = nome_adm;
    }

    public String getSobrenome_adm() {
        return sobrenome_adm;
    }

    public void setSobrenome_adm(String sobrenome_adm) {
        this.sobrenome_adm = sobrenome_adm;
    }

    public String getTelefone_adm() {
        return telefone_adm;
    }

    public void setTelefone_adm(String telefone_adm) {
        this.telefone_adm = telefone_adm;
    }

}
