package loginEmprestimo.controle;

import java.text.SimpleDateFormat;
import java.util.Date;

import loginEmprestimo.DiretorProfessor;
import loginEmprestimo.Estagiario;
import loginEmprestimo.Login;
import loginEmprestimo.Login.TipoUsuario;
import loginEmprestimo.Pessoa;
import loginEmprestimo.view.ViewLogin;
import loginEmprestimo.dados.RepositorioLogin;
import loginEmprestimo.dados.RepositorioUsuarios;

public class Sistema {
    //private ControleLivro controleLivro;

	// private ViewAdmin viewAdmin;
	// private ViewAtendente viewAtendente;
	private ViewLogin viewLogin;

	private ControleLogin controleLogin;
	private RepositorioUsuarios repositorioUsuarios;
	private RepositorioLogin repositorioLogin;
	// private ControleVenda controleVenda;
	// private ControleCarrinho controleCarrinho;


	private static Sistema instance; // armazenar o (unico) objeto Sistema

	private Sistema() {
		
		// viewAdmin = new ViewAdmin();
		// viewAtendente = new ViewAtendente();
		viewLogin = new ViewLogin();

		//controleLivro = new ControleLivro();

		// controleVenda = new ControleVenda();
		controleLogin = new ControleLogin();
		repositorioUsuarios = new RepositorioUsuarios();
		repositorioLogin = RepositorioLogin.getInstance();
		// controleCarrinho = new ControleCarrinho(controleProduto, controleVenda);

		init();
		//controleLivro.init();
		// controleCarrinho.init(controleProduto.getRepoProduto().getProdutos());
	}

    //getInstance
	public static Sistema getInstance() {
		if (instance == null)
			return new Sistema();
		return instance;
	}

	public void menuPrincipal(){
        viewLogin.menuPrincipal();
        int opcao;

        do {
            opcao = viewLogin.escolhaMenu();

            switch (opcao) {
                case 1: // Logar
					Login login = controleLogin.fazerLogin();
                    if (login != null) {
                        // Busca a Pessoa correspondente ao login no repositório
                        Pessoa usuarioLogado = repositorioUsuarios.buscarUsuarioPorLogin(login);

                        if (usuarioLogado != null) {
							viewLogin.print("Login realizado com sucesso!" + usuarioLogado.getNome());
                            switch (login.getTipo()) {
                                case ESTAGIARIO:
									System.out.println("estagio");
                                    //menuEstagiario(usuarioLogado);
                                    break;
                                case DIRETORPROFESSOR:
									System.out.println("direto");
                                    //menuDiretorProfessor(usuarioLogado);
                                    break;
                                case ALUNO:
                                    //menuAluno(usuarioLogado);
                                    break;
                                default:
                                    viewLogin.print("Tipo de usuário inválido.");
                            }
                        } else {
                            viewLogin.print("Usuário não encontrado no repositório.");
                        }

                    } else {
                        viewLogin.print("Usuário ou senha incorretos.");
                    }
                    break;

                case 2: // Cadastrar Usuário
                    controleLogin.cadastrarUsuario();
                    break;

                case 0: // Sair
                    viewLogin.print("Programa encerrado.");
                    break;

                default:
                    viewLogin.print("Opção inválida.");
            }
        } while (opcao != 0);
    }
	

	// public void menuAtendente(){
	// 	int opcaoAtendente;
	// 	Carrinho carrinho = new Carrinho();
	// 	do {
	// 		opcaoAtendente = viewAtendente.menuPrincipal();

	// 		switch (opcaoAtendente) {

	// 			case 1:
	// 				addItemCarrinho(carrinho);

	// 				break;

	// 			case 2:
	// 				finalizarCarrinho(carrinho);
				  
	// 				break;

	// 			case 3:
	// 				viewLogin.print("VOLTANDO AO MENU");
	// 				viewLogin.print(" ");
	// 				viewLogin.print(" ");
	// 				break;

	// 			default:
	// 				viewLogin.print("Opção inválida");
	// 				break;

	// 		}
	// 	} while (opcaoAtendente != 3);

	// }

	// public void menuAdmin() {
	// 	// init(sistema);
	// 	int opcao;
	// 	//int tamCod = 10; // tamanho das colunas
	// 	//int tamNom = 10;
	// 	//int tamPre = 10;
	// 	//int tamEsto = 10;

	// 	do {
	// 		opcao = viewAdmin.menuPrincipal();

	// 		switch (opcao) {
	// 		case 1: // inserir
	// 			addProduto();
	// 			break;
	// 		case 2: // excluir
	// 			excluirProduto();
	// 			break;

	// 		case 3: // alterar
	// 			alterarProduto();
	// 			break;

	// 		case 4: // listar produtos por codigo
    //             listarProdutos();
	// 			break;

	// 		case 5: // listar vendas
	// 			listarVendas();
	// 			break;

	// 		case 6: // listar vendas em data
	// 			listarDiaVendas();
	// 			break;

	// 		case 7: // detalhar venda
	// 			detalharVenda();
	// 			break;
            
    //         case 8: // configurar tabela
	// 			configurarTabela();
    //             break;
	// 		case 9:
	// 			cadastroUsuario();
	// 			break;

    //         case 0: // sair

    //             break;
	// 		default:
	// 			// break;
	// 		}

	// 	} while (opcao != 0);

	// }

	// public void addProduto() {
	// 	// repassando para o controle
	// 	controleProduto.add();
	// }

	// public void alterarProduto() {
	// 	controleProduto.alterar();
	// }

	// public void excluirProduto() {
	// 	controleProduto.excluir();
	// }

    // public void buscarProduto() {
    //     controleProduto.buscarProduto();
    // }

	// public void listarProdutos() {
	// 	controleProduto.listar();
	// }

	// public void listarProdutosEmOrdem() {
	// 	controleProduto.listarEmOrdem();
	// }

	// public void listarVendas(){
	// 	controleVenda.listarVendas();
	// }

	// public void listarDiaVendas() {
	// 	controleVenda.listarDiaVendas();
	// }

	// public void detalharVenda(){
	// 	controleVenda.detalharVenda();
	// }



	// public void configurarTabela(){
	// 	controleProduto.configurarTabela();
	// }

	// public void addItemCarrinho(Carrinho carrinho){
	// 	controleCarrinho.addItemCarrinho(carrinho);
	// }

	// public void finalizarCarrinho(Carrinho carrinho){
	// 	controleCarrinho.finalizarCarrinho(carrinho);
	// }



	// public int fazerLogin(){
	// 	return controleLogin.fazerLogin();
	// }

	// public void cadastroUsuario(){
	// 	controleLogin.cadastroUsuario();
	// };
	public void init() {


		

		try {

// Exemplo de criação de um estagiário com login
		String nomeEstagiario = "Daiana";
		String cpfEstagiario = "123.456.789-00";
		 SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato da data
		 Date dataNascEstagiario = formatoData.parse("11/11/2021"); // Analisa a string no formato correto
		String usuarioEstagiario = "daiana1";
		String senhaEstagiario = "123"; // Armazene a senha de forma segura (hashing)

			Estagiario estagiario = Estagiario.getInstance(nomeEstagiario, cpfEstagiario, dataNascEstagiario, usuarioEstagiario, senhaEstagiario);
			repositorioUsuarios.add(estagiario);
			repositorioLogin.add(estagiario.getLogin());
			// if (estagiario != null) {
			// 	Login loginEstagiario = Login.getInstance(usuarioEstagiario, senhaEstagiario, TipoUsuario.ESTAGIARIO); // Crie o login associado
			// 	estagiario.setLogin(loginEstagiario);
			// }




			// Exemplo de criação de um diretor/professor com login
			String nomeDiretor = "Cleide";
			String cpfDiretor = "987.654.321-11";
        Date dataNascDiretor = formatoData.parse("11/11/2021"); // Analisa a string no formato correto
			String usuarioDiretor = "cleide1";
			String senhaDiretor = "123"; // Armazene a senha de forma segura (hashing)


			DiretorProfessor diretor = DiretorProfessor.getInstance(nomeDiretor, cpfDiretor, dataNascDiretor, usuarioDiretor, senhaDiretor);
			repositorioUsuarios.add(diretor);
			System.out.println("add");
			repositorioLogin.add(diretor.getLogin());
			System.out.println("add");
			// if (diretor != null) {
			// 	Login loginDiretor = Login.getInstance(usuarioDiretor, senhaDiretor, TipoUsuario.DIRETORPROFESSOR); // Crie o login associado
			// 	diretor.setLogin(loginDiretor);
			// }


		} catch (Exception e){
			System.out.println(e.getMessage());
		}




	}
}


