package loginEmprestimo.controle;

import loginEmprestimo.view.ViewLogin;

public class Sistema {
    private ControleLivro controleLivro;
	// private ViewAdmin viewAdmin;
	// private ViewAtendente viewAtendente;
	private ViewLogin viewLogin;

	private ControleLogin controleLogin;
	// private ControleVenda controleVenda;
	// private ControleCarrinho controleCarrinho;


	private static Sistema instance; // armazenar o (unico) objeto Sistema

	private Sistema() {
		
		// viewAdmin = new ViewAdmin();
		// viewAtendente = new ViewAtendente();
		viewLogin = new ViewLogin();

		controleLivro = new ControleLivro();
		// controleVenda = new ControleVenda();
		controleLogin = new ControleLogin();
		// controleCarrinho = new ControleCarrinho(controleProduto, controleVenda);

		controleLogin.init();
		controleLivro.init();
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

                case 1:
                    int menu = verificarLogin();
					if (menu == 1) {
						
						menuAtendente();
					} else {
						if (menu == 2) {
							
							menuAdmin();
						}
					}
					
                    break;

                case 0:
                    viewLogin.print("Programa encerrado");
                    break;

                default:
					viewLogin.print("Opção Inválida");
                    break;
            }

        } while (opcao != 0);
		
	}

	public void menuAtendente(){
		int opcaoAtendente;
		Carrinho carrinho = new Carrinho();
		do {
			opcaoAtendente = viewAtendente.menuPrincipal();

			switch (opcaoAtendente) {

				case 1:
					addItemCarrinho(carrinho);

					break;

				case 2:
					finalizarCarrinho(carrinho);
				  
					break;

				case 3:
					viewLogin.print("VOLTANDO AO MENU");
					viewLogin.print(" ");
					viewLogin.print(" ");
					break;

				default:
					viewLogin.print("Opção inválida");
					break;

			}
		} while (opcaoAtendente != 3);

	}

	public void menuAdmin() {
		// init(sistema);
		int opcao;
		//int tamCod = 10; // tamanho das colunas
		//int tamNom = 10;
		//int tamPre = 10;
		//int tamEsto = 10;

		do {
			opcao = viewAdmin.menuPrincipal();

			switch (opcao) {
			case 1: // inserir
				addProduto();
				break;
			case 2: // excluir
				excluirProduto();
				break;

			case 3: // alterar
				alterarProduto();
				break;

			case 4: // listar produtos por codigo
                listarProdutos();
				break;

			case 5: // listar vendas
				listarVendas();
				break;

			case 6: // listar vendas em data
				listarDiaVendas();
				break;

			case 7: // detalhar venda
				detalharVenda();
				break;
            
            case 8: // configurar tabela
				configurarTabela();
                break;
			case 9:
				cadastroUsuario();
				break;

            case 0: // sair

                break;
			default:
				// break;
			}

		} while (opcao != 0);

	}

	public void addProduto() {
		// repassando para o controle
		controleProduto.add();
	}

	public void alterarProduto() {
		controleProduto.alterar();
	}

	public void excluirProduto() {
		controleProduto.excluir();
	}

    public void buscarProduto() {
        controleProduto.buscarProduto();
    }

	public void listarProdutos() {
		controleProduto.listar();
	}

	public void listarProdutosEmOrdem() {
		controleProduto.listarEmOrdem();
	}

	public void listarVendas(){
		controleVenda.listarVendas();
	}

	public void listarDiaVendas() {
		controleVenda.listarDiaVendas();
	}

	public void detalharVenda(){
		controleVenda.detalharVenda();
	}



	public void configurarTabela(){
		controleProduto.configurarTabela();
	}

	public void addItemCarrinho(Carrinho carrinho){
		controleCarrinho.addItemCarrinho(carrinho);
	}

	public void finalizarCarrinho(Carrinho carrinho){
		controleCarrinho.finalizarCarrinho(carrinho);
	}



	public int verificarLogin(){
		return controleLogin.verificarLogin();
	}

	public void cadastroUsuario(){
		controleLogin.cadastroUsuario();
	};
}


