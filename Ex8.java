package lista2;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

         /*8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que
        faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto (TEMPO) e a
        velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida com a
        fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da distância, basta calcular a quantidade de litros de
        combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTÂNCIA/12. Ao final, o programa deve apresentar
        os valores da velocidade média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distância percorrida (DISTÂNCIA)
        e a quantidade de litros (LITROS_USADOS) utilizada na viagem.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas horas foram gastas em média na viagem: ");
        float tempo = sc.nextFloat();

       System.out.println("Digite a velocidade média atingida durante a viagem");
       float velocidade = sc.nextFloat();

       float distancia = tempo * velocidade;

       float litros = distancia/12;

       System.out.println("A velocidade média da viagem foi: " + velocidade + "km/h");
       System.out.println("O tempo gasto na viagem foi: " + tempo + "km/h");
       System.out.println("A distância percorrida foi: " + distancia + "km");
       System.out.println("Foram consumidos: " + litros + "L");

       sc.close();


    }


}
