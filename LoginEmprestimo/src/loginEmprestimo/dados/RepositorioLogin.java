package loginEmprestimo.dados;

import loginEmprestimo.Login;

public class RepositorioLogin {
    private Login[] logins = new Login[10];
    private int numLogins;

    public boolean add(Login login) {

        if (login != null && numLogins < logins.length) {
            logins[numLogins] = login;
            numLogins++;
            return true;
        } else
            return false;
    }

    public Login[] listarLogin() {
        Login[] aux = new Login[numLogins];
        for (int i = 0; i < numLogins; i++) {
            aux[i] = logins[i];
            System.out.println(logins[i].getUsuario() + " " + logins[i].getSenha() + " " + logins[i].getTipo());
        }

        return aux;

    }

    public Login verificarLogin(String usuario, String senha) {
        listarLogin();
        for (int i = 0; i < logins.length; i++) {
            if (logins[i] != null) {
                System.out.println(logins[i].getUsuario() + " " + logins[i].getSenha());
                System.out.println(usuario + " " + senha);
                String testeUsuario = logins[i].getUsuario();
                String testeSenha = logins[i].getSenha();
                if (testeUsuario == usuario && testeSenha == senha) {
                    return logins[i];
                }
            }

        }
        
        return null;
    }

    public Login[] getLogins(){
        return logins;
    }
}

