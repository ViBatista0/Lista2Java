package lista2;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args){

        /*7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
         Volume = π*Raio2*Altura*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio da lata");
        float raio = sc.nextFloat();

        System.out.println("Digite a altura da lata");
        float altura = sc.nextFloat();

        float volume = (float) (Math.PI * Math.pow(raio, 2) * altura);

        System.out.printf("O volume da lata de óleo corresponde a: " + volume + "m³");
        sc.close();

    }

}
