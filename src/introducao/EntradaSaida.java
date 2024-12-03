package introducao;

import java.util.Scanner; // Importando Scanner para dentro da clase

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		// Construindo o leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados = Pedir/Inserir o nome, temperatura
		System.out.println("Insira seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
		
		
		// Processamento
		fahrenheit = temperatura * 1.8f + 32;
		
		// Saída dos dados
		System.out.println("Bom dia, " + nome);
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		
		System.out.printf("A temperatura em Fahrenheit é: %.1f.", fahrenheit);
		
		System.out.println("\nA temperatura em Fahrenheit é: " + fahrenheit); // Usar no texto \n para pular a linha antes do printf



	}

}
