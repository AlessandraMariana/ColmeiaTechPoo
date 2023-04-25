package Poo;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Alberto Carlos Silva", "R. das Flores, 154","(81) 99999-9999", "albertocs@gmail.com", 32);
		Cliente cliente2 = new Cliente("Agnes Vitorino", "Av. Brasil, 396", "(21) 88888-8888","agnesvito@outlook.com", 27);
		
		System.out.println("Dados do Cliente1:");
		cliente1.visualizar();
		
		System.out.println("Dados do Cliente2: ");
		cliente2.visualizar();
	}

}
