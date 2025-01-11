package loginEmprestimo.dados;

import java.util.ArrayList;
import java.util.List;

import loginEmprestimo.Livro;


public class RepositorioLivro {
	private Livro[] livros;
	private int numLivros;
	private int proxCodigo;

	public RepositorioLivro() {
		livros = new Livro[50];
		proxCodigo = 1;
	}

	public int getProxCodigo() {
		return proxCodigo;
	}


	public boolean add(Livro livro) {
		if (livro != null && numLivros < livros.length) {
			livros[numLivros] = livro;
			numLivros++;
			livro.setCodigoBarras(proxCodigo++);
			return true;
		} else
			return false;
	}

	public boolean excluir(int codigo) {
		for (int i = 0; i < numProdutos; i++) {
			if (produtos[i].getCodigo() == codigo) {

				if (produtos[i].getVendaRealizada() == true) {
					boolean excluido = true;
					produtos[i].setExcluido(excluido);
					return true;
				}

				if (produtos[i].getVendaRealizada() == false) {
					produtos[i] = produtos[--numProdutos]; // Move o último produto para a posição do produto excluído
					produtos[numProdutos] = null; // Limpa a última posição
					return true;
				}

			}
		}

		return false;

	}

	public boolean alterar(Produto p) {
		if (p != null && !verificarNomeProduto(p.getNome())) {
			for (int i = 0; i < numProdutos; i++) {
				if (p.getCodigo() == produtos[i].getCodigo()) {
					produtos[i] = p;
					return true;
				}
			}

		}
		return false;

	}

	public boolean verificarNomeProduto(String nome) {
		for (int i = 0; i < numProdutos; i++) {
			if (produtos[i].getNome().equalsIgnoreCase(nome)) {
				return true;
			}
		}
		return false;
	}

	public Produto buscar(int codigo) {
		for (int i = 0; i < numProdutos; i++) {
			if (produtos[i].getCodigo() == codigo) {
				copia = produtos[i];
				return copia;
			}
		}
		return null;
	}

	public Produto buscar(String nome) {
		if (nome != null) {
			for (int i = 0; i < numProdutos; i++) {
				if (produtos[i].getNome().equals(nome)) {
					copia = produtos[i];
					return copia;
				}
			}
		}
		return null;
	}

	public Produto[] listar() {
		Produto[] aux = new Produto[numProdutos];
		for (int i = 0; i < numProdutos; i++) {
			aux[i] = produtos[i];
		}
		return aux;
	}
	
	public List<Produto> getLista() {
		List<Produto> aux = new ArrayList<Produto>();
		for (int i = 0; i < numProdutos; i++) {
			aux.add(produtos[i]);
		}
		return aux;
	}

	public Produto[] listarEmOrdem() {
		Produto[] aux = new Produto[numProdutos];
		for (int i = 0; i < numProdutos; i++) {
			aux[i] = produtos[i];
		}

		for (int i = 0; i < numProdutos; i++) {
			for (int j = 0; j < numProdutos; j++) {
				if (aux[j].getNome().compareTo(aux[i].getNome()) > 0) {
					// trocando os produtos de posicao
					Produto guardar = aux[j];
					aux[j] = aux[i];
					aux[i] = guardar;
				}
			}
		}
		return aux;
	}

	public Produto puxarProduto(int codigo) {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null && produtos[i].getCodigo() == codigo) {
				return produtos[i];
			}
		}

		return null;
	}

	public Produto[] getProdutos() {
		return produtos;
	}

}

}
