package loginEmprestimo;

import java.util.Date;

public class Livro {
    
        private String nmLivro;
        private double codigoBarras;
        private String caminhoCapa; //nao sera usado agora
        private int numPaginas;
        private Date dataCompra;
    
        // construtor: herança: o construtor da subclasse é chamado primeiro
        public Livro(String nmLivro, double codigoBarras, String caminhoCapa, int numPaginas, Date dataCompra) {
            this.nmLivro = nmLivro;
            this.codigoBarras = codigoBarras;
            this.caminhoCapa = caminhoCapa;
            this.numPaginas = numPaginas;
            this.dataCompra = dataCompra;
        }

        //getters and setters
        public String getNmLivro() {
            return nmLivro;
        }

        public void setNmLivro(String nmLivro) {
            this.nmLivro = nmLivro;
        }

        public double getCodigoBarras() {
            return codigoBarras;
        }

        public void setCodigoBarras(double codigoBarras) {
            this.codigoBarras = codigoBarras;
        }

        public String getCaminhoCapa() {
            return caminhoCapa;
        }

        public void setCaminhoCapa(String caminhoCapa) {
            this.caminhoCapa = caminhoCapa;
        }

        public int getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(int numPaginas) {
            this.numPaginas = numPaginas;
        }

        public Date getDataCompra() {
            return dataCompra;
        }

        public void setDataCompra(Date dataCompra) {
            this.dataCompra = dataCompra;
        } 
    
    }