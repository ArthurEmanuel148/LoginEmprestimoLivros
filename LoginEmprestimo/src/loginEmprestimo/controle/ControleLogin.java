package loginEmprestimo.controle;


import loginEmprestimo.Login;
import loginEmprestimo.dados.RepositorioLogin;
import loginEmprestimo.view.ViewLogin;
    

public class ControleLogin {
    private RepositorioLogin repoLogin;
	private ViewLogin viewLogin;

	public ControleLogin() {
		repoLogin = new RepositorioLogin();
		viewLogin = new ViewLogin();
	}

    //ve se o login bate
    public int verificarLogin(){
        String usuario = viewLogin.lerUsuario();
        String teste = viewLogin.lerSenha();

        Login aux[] = repoLogin.getLogins();
        for(int i = 0; i < aux.length; i++){
            if (aux[i] != null && aux[i].getUsuario().equalsIgnoreCase(usuario) && aux[i].getSenha().equalsIgnoreCase(teste)) {
                
                return aux[i].getTipo();
            }
        }

        return 0;
    }

    public void cadastroUsuario(){
        String nome = viewLogin.lerUsuario();
        String senha = viewLogin.lerSenha();
        int tipo = viewLogin.lerTipo();

        Login login = Login.getInstance(nome, senha, tipo);
        repoLogin.add(login);
    };



    public void init() {
   
        Login login = Login.getInstance("at", "123", 1);
        repoLogin.add(login);

        Login login2 = Login.getInstance("ad", "123", 2);
        repoLogin.add(login2);
    }
}

}
