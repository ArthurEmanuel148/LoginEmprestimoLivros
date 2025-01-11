package loginEmprestimo;

public class Login {
    private String usuario;
    private String senha;
    private int tipo; //tipo é oq o usuario é, professor, estagiario

    private Login(String usuario, String senha, int tipo) {
        this.usuario = usuario;
        this.senha = senha;
        this.tipo = tipo;
    }

    public static Login getInstance(String usuario, String senha, int tipo) {
        if (usuario != null && senha != null) {
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

    public int getTipo(){
        return tipo;
    }
}
