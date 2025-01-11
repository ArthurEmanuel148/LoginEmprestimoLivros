package loginEmprestimo;

import java.util.Date;

import loginEmprestimo.Login.TipoUsuario;

public class DiretorProfessor extends PessoaComLogin {

    private DiretorProfessor(String nome, String cpf, Date dtNasc, String usuarioLogin, String senhaLogin, TipoUsuario tipo) {
        super(nome, cpf, dtNasc, usuarioLogin, senhaLogin, tipo);
    }


    public static DiretorProfessor getInstance(String nome, String cpf, Date dtNasc, String usuarioLogin, String senhaLogin) {
        return new DiretorProfessor(nome, cpf, dtNasc, usuarioLogin, senhaLogin, TipoUsuario.DIRETORPROFESSOR); // Passa o tipo aqui
    }
}

