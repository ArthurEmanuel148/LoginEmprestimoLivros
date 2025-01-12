package loginEmprestimo.controle;

import loginEmprestimo.DiretorProfessor;
import loginEmprestimo.Estagiario;
import loginEmprestimo.Login.TipoUsuario;
import loginEmprestimo.Pessoa;
import loginEmprestimo.view.ViewFuncionario;
import loginEmprestimo.dados.RepositorioUsuarios; // Importe o RepositorioUsuarios
import java.util.List;


public class ControleFuncionario {
    private ViewFuncionario viewFuncionario;
    private RepositorioUsuarios repositorioUsuarios; // Use o RepositorioUsuarios existente
    private ControleLogin controleLogin;
    

    public ControleFuncionario(RepositorioUsuarios repositorioUsuarios) { // Recebe o repositório por injeção de dependências
        this.viewFuncionario = new ViewFuncionario();
        this.repositorioUsuarios = repositorioUsuarios;
        this.controleLogin = new ControleLogin(repositorioUsuarios); // Injeta o ControleLogin existente
    }

    public void menuFuncionario() {
        int opcao;
		do {
			viewFuncionario.menuFuncionario();
			opcao = viewFuncionario.getOpcao();

			switch (opcao) {
				case 1:
					cadastrarFuncionario();
					break;
				case 2:
					editarFuncionario();
					break;
				case 3:
					desligarFuncionario();
					break;
				case 0:
					System.out.println("Voltando ao menu anterior...");
					break;
				default:
					System.out.println("Opção inválida.");
			}
		} while (opcao != 0);
	}

    public void cadastrarFuncionario() {
        controleLogin.cadastrarUsuario();
    }

    public void editarFuncionario() {
        // ... (obtenha o funcionário a ser editado do repositorioUsuarios)
        // ... (edite os dados do funcionário)
        // ... (atualize o funcionário no repositorioUsuarios)
    }

    public void desligarFuncionario() {
        // ... (obtenha o funcionário a ser desligado do repositorioUsuarios)
        // ... (remova o funcionário do repositorioUsuarios ou marque como desligado)
    }

    public void listarDiretoresProfessores() {
        List<Pessoa> usuarios = repositorioUsuarios.getUsuarios();
		for (Pessoa usuario : usuarios) {
			if (usuario instanceof DiretorProfessor) {
				System.out.println("Nome: " + usuario.getNome() + ", CPF: " + usuario.getCpf());
			}
		}
    }

    public void listarEstagiarios() {
        List<Pessoa> usuarios = repositorioUsuarios.getUsuarios();
		for (Pessoa usuario : usuarios) {
			if (usuario instanceof Estagiario) {
				System.out.println("Nome: " + usuario.getNome() + ", CPF: " + usuario.getCpf());
			}
		}
    }
}
