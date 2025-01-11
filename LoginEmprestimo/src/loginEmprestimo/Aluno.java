package loginEmprestimo;
import java.util.Date;

public class Aluno extends Pessoa{
	private String caminhoFichaInscricao;
	private double renda;

	// construtor: herança: o construtor da subclasse é chamado primeiro
	public Aluno(String nome, String cpf, Date dtNasc, String caminhoFichaInscricao, double renda) {
		super(nome, cpf, dtNasc);

		this.caminhoFichaInscricao = caminhoFichaInscricao;
		this.renda = renda;
		
	}

	//getters and setters
	public String getCaminhoFichaInscricao() {
        return caminhoFichaInscricao;
    }

    public void setCaminhoFichaInscricao(String caminhoFichaInscricao) {
        this.caminhoFichaInscricao = caminhoFichaInscricao;
    }

    public double getRenda() {
        return renda;
    }
	public void setRenda(double renda) {
        this.renda = renda;
    }

}