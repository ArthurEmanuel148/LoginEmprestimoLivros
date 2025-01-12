package loginEmprestimo.view;

import java.util.Scanner;

import loginEmprestimo.Pessoa;

public class ViewDiretorProfessor {
    private Scanner scn;

	public ViewDiretorProfessor() {
		scn = new Scanner(System.in);
	}

    public void menuPrincipal(Pessoa usuarioLogado){
        System.out.println("BEM VINDO " + usuarioLogado.getNome() + "!");
    }

    public int menuDiretorProfessor(){
        System.out.println("MENU DIRETOR PROFESSOR");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Remover Livro");
        System.out.println("3 - Listar Livros");
        System.out.println("4 - Pesquisar Livro");
        System.out.println("5 - Listar Estudantes");
        System.out.println("6 - Listar Professores");
        System.out.println("7 - Listar Funcionarios");
        System.out.println("8 - Menu Funcionarios");
        System.out.println("0 - Voltar ao Menu Principal");
    
        System.out.print("Escolha uma opção: ");
    
        //Ler a opção escolhida pelo usuário
        int opcao = scn.nextInt();

        //Retornar a opção escolhida
        return opcao;
    
    }
}
