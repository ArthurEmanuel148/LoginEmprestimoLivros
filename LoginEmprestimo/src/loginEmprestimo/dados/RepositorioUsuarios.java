package loginEmprestimo.dados;
    
import java.util.ArrayList;
import java.util.List;

import loginEmprestimo.Login;
import loginEmprestimo.Pessoa;
import loginEmprestimo.PessoaComLogin;

public class RepositorioUsuarios {
    private List<Pessoa> usuarios;

    public RepositorioUsuarios() {
        usuarios = new ArrayList<>();
    }

    public boolean add(Pessoa usuario) {
        if (usuario != null) {
            return usuarios.add(usuario); // Retorna true se a adição for bem-sucedida
        }

        return false;
    }

    // Outros métodos que você precisar (buscar, remover, listar, etc.)
    public List<Pessoa> getUsuarios() {
        return usuarios;
    }

    public Pessoa buscarUsuarioPorLogin(Login login) {
        for (Pessoa usuario : usuarios) { // Itera sobre Pessoa
            if (usuario instanceof PessoaComLogin) { // Verifica se o usuário é uma instância de PessoaComLogin
                PessoaComLogin pessoaComLogin = (PessoaComLogin) usuario; // Faz o cast para PessoaComLogin
                if (pessoaComLogin.getLogin() != null && pessoaComLogin.getLogin().equals(login)) { // Chama getLogin() na instância
                    return usuario;
                }
            }
        }
        return null; // Ou lance uma exceção se preferir
    }

}
