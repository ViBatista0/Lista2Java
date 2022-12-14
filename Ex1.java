package lista2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args){

        /*1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
        pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos anos você tem: ");
        int anos = sc.nextInt();

        System.out.println("Digite quantos meses você tem: ");
        int meses = sc.nextInt();

        System.out.println("Digite quantos dias você tem: ");
        int dias = sc.nextInt();

        int idade = (anos * 360) + (meses * 30) + dias;

        System.out.println("Sua idade expressa em dias é: " + idade);
        sc.close();
    }

}
