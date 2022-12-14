package lista2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args){

        /*3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
        Calcular e escrever o valor do novo salário. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário mensal do funcionário: ");
        float salario = sc.nextFloat();

        System.out.println("Digite o percentual de reajuste sofrido: ");
        float reajuste = sc.nextFloat();

        float novoSalario = (reajuste/100 * salario) + salario;

        System.out.println("O novo salário após o reajuste corresponde a: R$" + novoSalario);
        sc.close();


    }


}
