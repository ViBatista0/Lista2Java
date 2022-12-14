package lista2;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args){

        /*5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão
         é F = (9*C + 160) /5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        float c = sc.nextFloat();

        float f = (9*c + 160) / 5;

        System.out.printf("A temperatura digitada em Fahrenheit equivale a: " + f + "ºF");
        sc.close();


    }

}
