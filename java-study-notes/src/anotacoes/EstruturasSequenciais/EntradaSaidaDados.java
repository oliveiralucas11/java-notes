package anotacoes.EstruturasSequenciais;

import java.util.Scanner;

public class EntradaSaidaDados {
    public static void main(String[] args) {

        // Saida de dados
        // Usamos o System.out.print(), System.out.println() e System.out.printf() para imprimir dados na tela
        // System.out.print() - Imprime sem pular a linha
        System.out.println("Olá eu faco impressao e pulo a linha");
        // System.out.println() - Imprime e pula pra proxima linha
        System.out.print("Eu faco a impressao na mesma linha");
        // System.out.printf() - Imprime formatado
        System.out.printf("Eu faco a impressao formatado");

        // Entrada de dados
        // Usamos a classe Scanner para ler dados do teclado.

        Scanner scanner = new Scanner(System.in); // Estamos instanciando um novo objeto scanner na nossa classe scanner
        // Scanner permite atribuirmos valores em tempo de execucao
        System.out.println("Olá, digite o seu nome: " );
        String nome3 = scanner.nextLine(); // A variavel tem um valor atribuido em tempo de execucao e nao estatico.
        System.out.println("Nome: " + nome3);

        System.out.println("Digite sua idade: ");
        int idade4 = scanner.nextInt(); // Se for int nextint
        System.out.println("Idade: " + idade4);

        System.out.println("Digite se voce esta empregado sim ou nao");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Esta empregado: " + empregado);


    }
}
