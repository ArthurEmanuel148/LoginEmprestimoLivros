package loginEmprestimo;

import java.util.Date;

import loginEmprestimo.Login.TipoUsuario;

public class Estagiario extends PessoaComLogin{
    
    private Estagiario(String nome, String cpf, Date dtNasc, String usuarioLogin, String senhaLogin, TipoUsuario tipo) {
        super(nome, cpf, dtNasc, usuarioLogin, senhaLogin, tipo);
        // ... inicialização de outros atributos ...
    }

    public static Estagiario getInstance(String nome, String cpf, Date dtNasc,String usuarioLogin, String senhaLogin, TipoUsuario tipo) {
        return new Estagiario(nome, cpf, dtNasc, usuarioLogin, senhaLogin, tipo);
    }
}
