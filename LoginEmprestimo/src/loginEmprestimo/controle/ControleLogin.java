package loginEmprestimo.controle;


import java.util.Date;
import java.util.List;

import loginEmprestimo.DiretorProfessor;
import loginEmprestimo.Estagiario;
import loginEmprestimo.Login;
import loginEmprestimo.Login.TipoUsuario;
import loginEmprestimo.Pessoa;
import loginEmprestimo.PessoaComLogin;
import loginEmprestimo.dados.RepositorioLogin;
import loginEmprestimo.dados.RepositorioUsuarios;
import loginEmprestimo.view.ViewLogin;
    

public class ControleLogin {
    private RepositorioLogin repoLogin;
	private ViewLogin viewLogin;
    private RepositorioUsuarios repositorioUsuarios;

	public ControleLogin( RepositorioUsuarios repositorioUsuarios) {
        this.repositorioUsuarios = repositorioUsuarios;
        viewLogin = new ViewLogin();
    //repoLogin = RepositorioLogin.getInstance(); // Obtém a instância única

	}

    // //serve para pessoa realizar o login no sistema
    // public Login fazerLogin() { // Retorna o objeto Login se sucesso, ou null se falha
    //     String usuario = viewLogin.lerUsuario();
    //     String senha = viewLogin.lerSenha();

    //     Login[] logins = repoLogin.getLogins();
    //     for (Login login : logins) {
    //         if (login != null && login.getUsuario().equalsIgnoreCase(usuario) && login.getSenha().equalsIgnoreCase(senha)) {
    //             return login; // Login bem-sucedido
    //         }
    //     }
    //     return null; // Login falhou
    // }

    //serve para pessoa realizar o login no sistema
    public Login fazerLogin() { // Retorna o objeto Login se sucesso, ou null se falha
        String usuario = viewLogin.lerUsuario();
        String senha = viewLogin.lerSenha();

        List<Login> logins = repositorioUsuarios.getLogins();
        for (Login login : logins) {
            if (login != null && login.getUsuario().equalsIgnoreCase(usuario) && login.getSenha().equalsIgnoreCase(senha)) {
                return login; // Login bem-sucedido
            }
        }
        return null; // Login falhou
    }

    //cadastra um novo usuario no sistema
    public void cadastrarUsuario() {

        String nome = viewLogin.lerNome();
        String cpf = viewLogin.lerCpf();
        Date dtNasc = viewLogin.lerDataNasc();
    
        String usuario = viewLogin.lerUsuario();
        String senha = viewLogin.lerSenha();
        TipoUsuario tipo = viewLogin.lerTipo();

    
        if (tipo != null && nome != null && cpf != null && dtNasc != null && usuario != null && senha != null) {
        //     // Cria o login
        //     Login login = Login.getInstance(usuario, senha, tipo);
    
             // Cria o usuário com o login associado usando getInstance
             
             if (tipo == TipoUsuario.ESTAGIARIO) {
                Estagiario novoEstagiario = Estagiario.getInstance(nome, cpf, dtNasc, usuario, senha, tipo);
                repositorioUsuarios.add(novoEstagiario);
                    //repoLogin.add(novoEstagiario.getLogin());
                viewLogin.print("Usuário cadastrado com sucesso!");
             } else if (tipo == TipoUsuario.DIRETORPROFESSOR) {
                DiretorProfessor novoDiretorProfessor = DiretorProfessor.getInstance(nome, cpf, dtNasc, usuario, senha, tipo);
                repositorioUsuarios.add(novoDiretorProfessor);
                    //repoLogin.add(novoDiretorProfessor.getLogin());
                viewLogin.print("Usuário cadastrado com sucesso!");
             } else {
                viewLogin.print("Falha ao adicionar o usuário ao repositório.");
             }
        } else {
            viewLogin.print("Informações inválidas. Certifique-se de preencher todos os campos corretamente.");
        }
    }

    // //ve se o login bate
    // public int verificarLogin(){
    //     String usuario = viewLogin.lerUsuario();
    //     String teste = viewLogin.lerSenha();

    //     Login aux[] = repoLogin.getLogins();
    //     for(int i = 0; i < aux.length; i++){
    //         if (aux[i] != null && aux[i].getUsuario().equalsIgnoreCase(usuario) && aux[i].getSenha().equalsIgnoreCase(teste)) {
                
    //             return aux[i].getTipo();
    //         }
    //     }

    //     return 0;
    // }

    // public void init() {
    //     Login login = Login.getInstance("Daiana", "123", TipoUsuario.ESTAGIARIO);
    //     repoLogin.add(login);

    //     Login login2 = Login.getInstance("Cleide", "123", TipoUsuario.DIRETORPROFESSOR);
    //     repoLogin.add(login2);
    // }
}
