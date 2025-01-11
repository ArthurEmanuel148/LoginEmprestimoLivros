package loginEmprestimo;

import java.util.Date;

import loginEmprestimo.Login.TipoUsuario;


public abstract class PessoaComLogin extends Pessoa{
    private Login login;

    public PessoaComLogin(String nome, String cpf, Date dtNasc, String usuario, String senha, TipoUsuario tipo) {
        super(nome, cpf, dtNasc);
        this.login = Login.getInstance(usuario, senha, tipo);
    }

    // Getters and setters para login
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    
}