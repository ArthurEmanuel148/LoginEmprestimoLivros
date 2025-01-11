package loginEmprestimo;

public class Login {
    public enum TipoUsuario {
		ALUNO, DIRETORPROFESSOR, ESTAGIARIO
		} 

	private TipoUsuario tipo;
    private String usuario;
    private String senha;
    //private int tipo; //tipo é oq o usuario é, professor, estagiario

    private Login(String usuario, String senha, TipoUsuario tipo) {
        this.usuario = usuario;
        this.senha = senha;
        this.tipo = tipo;
    }

    public static Login getInstance(String usuario, String senha, TipoUsuario tipo) {
        if (usuario != null && senha != null && tipo != null) {
            return new Login(usuario, senha, tipo);
        }
        return null;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha(){
        return senha;
    }

    public TipoUsuario getTipo(){
        return tipo;
    }
}
