package anotacoes.EstruturasSequenciais;

public class ConversaoTiposCasting {
    public static void main(String[] args) {

        // Casting ( conversao de tipos)

        // Conversao Implicita - Ocorre automaticamente quando convertemos um tipo menor para um tipo maior:
        int i = 10;
        double d = i; // Convertido de forma implicita para double
        double i1 = (double)i; // Conversao explicita

        // Conversao Explicita - Precisamos fazer manualmente ao converter um tipo maior para um tipo menor
        // String -> int , int -> string , double -> int
        double d2 = 10.5;
        int i2 = (int) d2; // Forma de conversao chamada de casting, o tipo da variavel sempre é o tipo a ser convertido.
        System.out.println(i2);
        System.out.println(d);

        // Se quisermos converter do tipo int para string nao conseguimos, pois o tipo int ele é um tipo primitivo, pra fazer isso usamos o Integer que é uma classe wrapper java.

        // Integer encapsula o tipo primitivo int em um objeto.
        // Ele é o mesmo que o Int porem nao é um tipo primitivo permitindo mais coisas do que o int normal, como sua conversao.
        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString(); // Convertido int encapsulado no integer como string.
        System.out.println(numeroString + " " + numeroInteger); // Temos o mesmo resultado sendo um string e outro Integer

        //String para Int
        String numeroStringDois = "10";
        Integer numeroIntegerDois = Integer.parseInt(numeroStringDois); // Convertendo de String para Int atraves do parse
        System.out.println(numeroIntegerDois);



    }
}
