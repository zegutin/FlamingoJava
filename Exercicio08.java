/*8) Escreva um algoritmo para ler as dimens�es de um tri�ngulo (base e altura), calcular e 
 * escrever a �rea do tri�ngulo. Dica a=b.h/2*/

package tarefa02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
System.out.println("Digite a base do tri�ngulo");
float base=sc.nextFloat();

System.out.println("Digite a altura do tri�ngulo");
float altura=sc.nextFloat();

float area=altura*base/2;

System.out.println("a area do tri�ngulo �: "+area);
		
		
		sc.close();
	}

}
