package Exercicios;

import java.util.ArrayList;

public class Estaistica {
    public static double media (double [] valores){
        double soma = 0.0;
        for (int i = 0; i < valores.length; i++){
           soma += valores[i];
        }

        return soma / valores.length;
    }

    public static double variancia (double[] valores){
        double mediaX = Estaistica.media(valores);

        double somaTotal = 0.0;
        for (int n = 0; n < valores.length; n++){
            somaTotal +=  Math.pow((valores[n] - mediaX), 2.0);
        }
        somaTotal /= (valores.length - 1);

        return somaTotal;
    }

    public static double desvioPadrao(double[] valores){
        return Math.sqrt(variancia(valores));
    }

    public static void main (String[] args){
        double[] valores = {1, 2};
        double mediaArray = Estaistica.media(valores);
        double varArray = Estaistica.variancia(valores);
        double desPadraoArray = Estaistica.desvioPadrao(valores);

        System.out.println("Media" + mediaArray);
        System.out.println("Variancia" + varArray);
        System.out.println("Desvio Padrão" + desPadraoArray);
    }
}
