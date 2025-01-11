package loginEmprestimo;

import java.util.Date;

public class Emprestimo {
    private Date dataEMprestimo;
    private Date dataDevolucao;
    private int pagInicial;
    private int pagFinal;
    private int notaReconto; //talvez nao entre agora

    // construtor: herança: o construtor da subclasse é chamado primeiro
    public Emprestimo(Date dataEMprestimo, Date dataDevolucao, int pagInicial, int pagFinal) {
        this.dataEMprestimo = dataEMprestimo;
        this.dataDevolucao = dataDevolucao;
        this.pagInicial = pagInicial;
        this.pagFinal = pagFinal;
        //this.notaReconto = notaReconto;

    }

    // getters and setters
    public Date getDataEMprestimo() {
        return dataEMprestimo;
    }
    public void setDataEMprestimo(Date dataEMprestimo) {
        this.dataEMprestimo = dataEMprestimo;
    }
    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public int getPagInicial() {
        return pagInicial;
    }
    public void setPagInicial(int pagInicial) {
        this.pagInicial = pagInicial;
    }
    public int getPagFinal() {
        return pagFinal;
    }
    public void setPagFinal(int pagFinal) {
        this.pagFinal = pagFinal;
    }
    public int getNotaReconto() {
        return notaReconto;
    }
    public void setNotaReconto(int notaReconto) {
        this.notaReconto = notaReconto;
    }

}
