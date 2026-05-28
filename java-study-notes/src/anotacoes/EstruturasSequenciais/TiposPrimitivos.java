package anotacoes.EstruturasSequenciais;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // Tipos Primitivos Inteiros - (Byte, short, int , long)
        // Importante salientar que os tipos byte e short no desenvolvimento web sao praticamente inuteis e nao sao utilizados.

        // Byte
        byte numeroPequeno = 0;

        // Short
        short numeroMenorAinda = 23;

        // Int
        int idade = 15;
        System.out.println("Idade: " + idade);

        //Long
        long idadeVampiro = 1231231312121L; // Long deve ser usado com o sufixo L pro compilador entender que a variavel é long

        // Tipos Primitivos Ponto Flutuante - Numeros de casas decimais (Float e Double)

        // Float
        float pagamentoRecebido = 2543.21F; // Float tambem deve ser acompanhado do sufixo F.

        // Double
        double pagamentoCompleto = 4500.00; // Permite entrada de numeros maior assim como no Int

        // Tipo Char - Um unico caractere unicode
        char genero = 'M'; // Apenas usado com um caractere
        char genero2 = 'F';

        // Tipo Booleano - Representa verdadeiro ou falso
        boolean provaRealizada = true;
        boolean maiorDeIdade = false;
        System.out.println("A prova foi realizada? : " + provaRealizada);
        System.out.println("Já pode dirigir? : " + maiorDeIdade);







    }
}
