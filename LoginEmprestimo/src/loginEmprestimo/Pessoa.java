package loginEmprestimo;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String cpf;
	private Date dtNasc;
	private String caminhoIdentidadeFrente; // So vai ser usada no oficial
	private String caminhoIdentidadeTras; // So vai ser usada no oficial

	private Login login; // A pessoa pode ter ou não login

	// restricao: ao criar precisa inicializar os atributos
	//uma pessoa podde ser criada com ou sem login
	public Pessoa(String nome, String cpf, Date dtNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
	}

	public Pessoa(String nome, String cpf, Date dtNasc, String usuario, String senha, int tipo) {
		this.nome = nome;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
	}

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
