package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {
		// Variaveis
		float media;

		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// Processamento
		if (media >= 6) {
			System.out.println("Parabéns, você foi aprovado !");
		} else if(media >= 5){
			
			System.out.println("Participante de exame !");
			
		}else {
			System.out.println("Infelizmente, você foi reprovado !");
		}

		leia.close();
	}

}
