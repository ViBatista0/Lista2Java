package lista2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){

        /*2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos,
        nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de votos brancos");
        int vb = sc.nextInt();

        System.out.println("Digite o total de votos nulos");
        int vn = sc.nextInt();

        System.out.println("Digite o total de votos válidos");
        int vv = sc.nextInt();

        int totalEleitores = vb + vn + vv;

        int pv = vv/100 * totalEleitores;
        int pb = vb/100 * totalEleitores;
        int pn = vn/100 * totalEleitores;

        System.out.println("O percentual de votos válidos corresponde a: " + vv + "%");
        System.out.println("O percentual de votos em branco corresponde a: " + vb + "%");
        System.out.println("O percentual de votos nulos corresponde a: " + vn + "%");
        System.out.println("O total de eleitores corresponde a: " + totalEleitores + " eleitores");

        sc.close();


    }

}
