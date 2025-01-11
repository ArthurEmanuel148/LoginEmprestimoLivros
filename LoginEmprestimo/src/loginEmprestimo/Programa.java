package loginEmprestimo;

import loginEmprestimo.controle.Sistema;

public class Programa {
    public static void main(String[] args) {
		
		Sistema sistema = Sistema.getInstance();
        
        sistema.menuPrincipal();
	}
}
