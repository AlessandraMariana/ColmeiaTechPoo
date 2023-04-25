package Poo;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("GTA V","É um jogo eletrônico de ação-aventura desenvolvido pela Rockstar North e publicado pela Rockstar Games","Steam", 100.89, 100 );
		Produto produto2 = new Produto("Resident Evil 7","Medo e isolamento se infiltram nas paredes de uma casa de campo abandonada", "Xbox Series X|S",14.90, 30);
		
		System.out.println("Dados do Produto1:");
		produto1.visualizar();
		
		System.out.println("Dados do Produto2: ");
		produto2.visualizar();

	}

}
