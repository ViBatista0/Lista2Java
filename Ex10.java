package lista2;

import java.util.Scanner;

public class Ex10 {


    public static void main(String[] args){

        /*10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de
    forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A.
    Apresentar os valores trocados.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite algo");
        String v1 = sc.next();

        System.out.println("Outra coisa");
        String v2 = sc.next();

        String mediador = v1;

        v1 = v2;

        System.out.println("Os valores foram trocados: " + v1 + " e " + mediador);
        sc.close();

    }




}
