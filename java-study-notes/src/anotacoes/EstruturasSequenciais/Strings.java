package anotacoes.EstruturasSequenciais;

public class Strings {
    public static void main(String[] args) {

        // O que é uma String?
        // String em java é uma sequencia de caracteres. Strings sao usadas para armazenar e manipular texto.
        // Ela nao é um tipo e sim uma classe.

        // Concatenando Strings
        // Usamos o operador "+" para concatenar strings:
        String nome1 = "Joana"; // Toda string está dentro de aspas duplas.
        String saudacao = "Olá, " + nome1 + "!"; // Operadores aritimeticos só se usam pra operacoes, no caso aqui ele apenas concatena.
        System.out.println(saudacao);

        // Também podemos verificar o tamanho da string
        int tamanhoString = nome1.length(); // Sempre adicionando em uma variavel pra obtermos o resultado, pois estamos chamando o metodo.
        System.out.println(tamanhoString);
        System.out.println("Olá, " + nome1 + " Seu nome tem " + tamanhoString + " caracteres");

        // Comparando se as strings sao iguais
        String nome2 = "Matheus";
        boolean nomesIguais = nome2.equals(nome1); // Compara as duas strings para um valor booleano
        System.out.println(nomesIguais);

        // Alterar para maisuculo ou minusculo
        System.out.println(nome1.toUpperCase()); // Maiusculo
        System.out.println(nome2.toLowerCase()); // Minusculo
        System.out.println(nome1.getBytes());

    }
}
