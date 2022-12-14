package lista2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args){

        /*4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor
         e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os
         impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo
         final ao consumidor.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro: ");
        float custoCarro = sc.nextFloat();

        float dist = 28;
        float imposto = 45;

        float custoFinal = custoCarro + (dist/100*custoCarro) + (imposto/100*custoCarro);

        System.out.println("O custo final após os cálculos dos tributos corresponde a: R$" + custoFinal);
        sc.close();

    }

}
