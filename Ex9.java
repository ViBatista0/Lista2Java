package lista2;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        /*9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
        PRESTACAO=VALOR+(VALOR*TAXA/100) *TEMPO).*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da prestação: ");
        float v = sc.nextFloat();

        System.out.println("Digite o percentual da taxa aplicada por dia: ");
        float t = sc.nextFloat();

        System.out.println("Digite quantos dias a prestação esá atrasada: ");
        float d = sc.nextFloat();

        float p = v + ((v * t / 100) * d);

        System.out.println("O valor da prestação mudou de: R$" + v);
        System.out.println("Para : R$" + p);

        sc.close();


    }

}
