package app;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

    public static Integer fatorial(Integer n){
        Integer fat = 1;

        for( Integer i = 1; i <= n; i++){
            fat = fat * i;
        }
        return fat;
    }

    public static BigInteger bigFatorial (Integer n){
        BigInteger fat = BigInteger.ONE;

        for(Integer i = 1; i <= n; i++){
            // fat = fat * i;
            fat = fat.multiply(BigInteger.valueOf(i));
        }
        return fat;
    }

    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite n: ");
        Integer n = teclado.nextInt();
        teclado.close();

        BigInteger  reultado = bigFatorial(n);
        System.out.println(n + "! = " + reultado);
    }
}
