/*7) Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e 
 * escrever a �rea do ret�ngulo. Dica a=b.h*/

package tarefa02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("Digite o altura do ret�ngulo:");
float altura=sc.nextFloat();

System.out.println("Digite a medida da base do ret�ngulo:");
float base=sc.nextFloat();

float area=base*altura;

System.out.println("A area do seu ret�ngulo "+area);
		
sc.close();		
	}

}
