package loginEmprestimo;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String cpf;
	private Date dtNasc;
	private String caminhoIdentidadeFrente; // So vai ser usada no oficial
	private String caminhoIdentidadeTras; // So vai ser usada no oficial

	

	// restricao: ao criar precisa inicializar os atributos
	//uma pessoa podde ser criada com ou sem login
	public Pessoa(String nome, String cpf, Date dtNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
	}

	// public Pessoa(String nome, String cpf, Date dtNasc, String usuario, String senha, TipoUsuario tipo) {
	// 	this(nome, cpf, dtNasc); // Chama o construtor da classe pai
	// 	this.setLogin(usuario, senha, tipo);
	// }

	// public void setLogin(String usuario, String senha, TipoUsuario tipo) {
	// 	this.login = Login.getInstance(usuario, senha, tipo);
	// }

	// public Login getLogin() {
	// 	return login;
	// }

	// Getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNAsc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getCaminhoIdentidadeFrente() {
		return caminhoIdentidadeFrente;
	}

	public void setCaminhoIdentidadeFrente(String caminhoIdentidadeFrente) {
		this.caminhoIdentidadeFrente = caminhoIdentidadeFrente;
	}

	public String getCaminhoIdentidadeTras() {
		return caminhoIdentidadeTras;
	}

	public void setCaminhoIdentidadeTras(String caminhoIdentidadeTras) {
		this.caminhoIdentidadeTras = caminhoIdentidadeTras;
	}
}
