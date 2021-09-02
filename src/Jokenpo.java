import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		// Declaração das variáveis que serão usadas
		int escolhaJogador, escolhaPc;
		Scanner leitor = new Scanner(System.in);
		Random sorteio = new Random();
		
		// Apresentação do menu para o jogador
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		
		// Obter a escolha do jogador
		escolhaJogador = leitor.nextInt();
		leitor.close();
		
		// Obter a escolha do PC (aleatória)
		escolhaPc = sorteio.nextInt(3) + 1;
		
		// Determinar quem venceu
		if (escolhaJogador == 1) {
			if (escolhaPc == 1) {
				System.out.println("E M P A T E ! !");
			} else if (escolhaPc == 2) {
				System.out.println("COMPUTADOR V E N C E U ! !");
			} else {
				System.out.println("JOGADOR V E N C E U ! !");
			}
		} else if (escolhaJogador == 2 ) {
			if (escolhaPc == 2 ) {
				System.out.println("E M P A T E ! !");
			} else if (escolhaPc == 1) {
				System.out.println("JOGADOR V E N C E U ! !");
			} else {
				System.out.println("COMPUTADOR V E N C E U ! !");
			}
		} else {
			if (escolhaPc == 3) {
				System.out.println("E M P A T E ! !");
			} else if (escolhaPc == 1) {
				System.out.println("COMPUTADOR V E N C E U ! !");
			} else {
				System.out.println("JOGADOR V E N C E U ! !");
			}
		}

	}

}
