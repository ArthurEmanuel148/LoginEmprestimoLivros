package loginEmprestimo.view;

import java.util.Scanner;

public class ViewLogin {
    private Scanner scn;

	public ViewLogin() {
		scn = new Scanner(System.in);
	}

    public String lerUsuario(){
        System.out.println("Digite o usuário: ");
        return scn.next();
    }

    public String lerSenha(){
        System.out.println("Digite a senha: ");
        return scn.next();
    }

    public int lerTipo(){
        System.out.println("Insira o tipo de usuário (1- Atendente, 2- Admin): ");
        return scn.nextInt();
    }

    public void menuPrincipal(){
        System.out.println("--- SEJA BEM-VINDO! ---");
        System.out.println("Faça o login para continuar!");
        
    }

    public int escolhaMenu(){
        System.out.println("\n-----> 1- Logar <-----");
        System.out.println("\n-----> 0- Encerrar Programa <-----");

        return scn.nextInt();
    }

    public void print(String msg){
        System.out.println(msg);
    }
}
