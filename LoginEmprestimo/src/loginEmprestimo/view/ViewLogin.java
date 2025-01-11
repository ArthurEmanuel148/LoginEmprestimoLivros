package loginEmprestimo.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import loginEmprestimo.Login.TipoUsuario;

public class ViewLogin {
    private Scanner scn;

	public ViewLogin() {
		scn = new Scanner(System.in);
	}

    public String lerNome(){
        System.out.println("Digite o nome: ");
        return scn.next();
    }

    public String lerCpf(){
        System.out.println("Digite o CPF: ");
        return scn.next();
    }

    public Date lerDataNasc() {
    Scanner scn = new Scanner(System.in);
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato da data
    formato.setLenient(false); // Impede datas inválidas (ex: 32/12/2024)


    while (true) { // Loop para ler a data até que um formato válido seja fornecido
        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        String dataString = scn.next();

        try {
            Date data = formato.parse(dataString); // Analisa a string de data
            return data; // Retorna o objeto Date se a análise for bem-sucedida
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Digite novamente.");
        }
    }

}

    public String lerUsuario(){
        System.out.println("Digite o usuário: ");
        return scn.next();
    }

    public String lerSenha(){
        System.out.println("Digite a senha: ");
        return scn.next();
    }

    public TipoUsuario lerTipo() {
    System.out.println("Digite o tipo de usuário (1 - Estagiário, 2 - Diretor/Professor):");
    int tipoInt = scn.nextInt();

    switch (tipoInt) {
        case 1:
            return TipoUsuario.ESTAGIARIO;
        case 2:
            return TipoUsuario.DIRETORPROFESSOR;
        default:
            System.out.println("Tipo de usuário inválido.");
            return null; // Ou lance uma exceção
    }
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
