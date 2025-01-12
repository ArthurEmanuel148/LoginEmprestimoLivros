package loginEmprestimo.view;

import java.util.Scanner;

public class ViewFuncionario {
    private Scanner scn;

    public ViewFuncionario() {
        scn = new Scanner(System.in);
    }

    public void menuFuncionario() {
        System.out.println("\n--- Menu Funcionário ---");
        System.out.println("1. Cadastrar Funcionário");
        System.out.println("2. Editar Funcionário");
        System.out.println("3. Desligar Funcionário");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
    }

    public int getOpcao() {
        return scn.nextInt();
    }

    // ... (Outros métodos para ler dados do funcionário, exibir mensagens, etc.)
}