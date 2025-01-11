package loginEmprestimo.controle;


import loginEmprestimo.Login;
import loginEmprestimo.Login.TipoUsuario;
import loginEmprestimo.dados.RepositorioLogin;
import loginEmprestimo.view.ViewLogin;
    

public class ControleLogin {
    private RepositorioLogin repoLogin;
	private ViewLogin viewLogin;

	public ControleLogin() {
		repoLogin = new RepositorioLogin();
		viewLogin = new ViewLogin();
	}

    //serve para pessoa realizar o login no sistema
    public Login fazerLogin() { // Retorna o objeto Login se sucesso, ou null se falha
        String usuario = viewLogin.lerUsuario();
        String senha = viewLogin.lerSenha();

        Login[] logins = repoLogin.getLogins();
        for (Login login : logins) {
            if (login != null && login.getUsuario().equalsIgnoreCase(usuario) && login.getSenha().equalsIgnoreCase(senha)) {
                return login; // Login bem-sucedido
            }
        }
        return null; // Login falhou
    }

    //cadastra um novo usuario no sistema
public void cadastroUsuario(){
        String nome = viewLogin.lerUsuario();
        String senha = viewLogin.lerSenha();
        int tipoInt = viewLogin.lerTipo();

        // Converte o tipo inteiro para o enum TipoUsuario
    TipoUsuario tipo = null;
    if (tipoInt == 1) {
        tipo = TipoUsuario.ESTAGIARIO;
    } else if (tipoInt == 2) {
        tipo = TipoUsuario.DIRETORPROFESSOR;
	} else if (tipoInt == 3){
		tipo = TipoUsuario.ALUNO;
	}

    if (tipo != null) { // Verifica se o tipo é válido
        Login login = Login.getInstance(nome, senha, tipo);
        if(repoLogin.add(login)){
            viewLogin.print("Usuário cadastrado com sucesso!");
        } else {
            viewLogin.print("Falha ao cadastrar usuário!");
        }
        
    } else {
        viewLogin.print("Tipo de usuário inválido.");
    }
    };

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

    public void init() {
        TipoUsuario tipo = TipoUsuario.valueOf("ESTAGIARIO");
        Login login = Login.getInstance("Daiana", "123", tipo);
        repoLogin.add(login);

        tipo = TipoUsuario.valueOf("DIRETORPROFESSOR");
        Login login2 = Login.getInstance("Cleide", "123", tipo);
        repoLogin.add(login2);
    }
}
