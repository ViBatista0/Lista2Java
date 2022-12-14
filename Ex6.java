package lista2;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args){

        /*6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
        A fórmula de conversão é C=(F-32) *(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit");
        float f = sc.nextFloat();

        float c = (float) ((f - 32) * 5/9);

        System.out.println("A temperatura informada em Celsius equivale a: " + c + "ºC");
        sc.close();

    }

}
