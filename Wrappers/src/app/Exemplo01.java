package app;

public class Exemplo01 {
    public static void main(String [] args) {
        // objeto da classe Integer que armazena um inteiro
        Integer valor = new Integer(10);
        int idade = Integer.parseInt("20");

        // autoboxing
        Integer qtde = 20; // Integer = int

        // unboxing
        int novoValor = qtde; //int = Integer

        char letra = '9';
        System.out.println(Character.isDigit(letra));
    }
}
