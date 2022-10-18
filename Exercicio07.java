/*7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e 
 * escrever a área do retângulo. Dica a=b.h*/

package tarefa02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("Digite o altura do retângulo:");
float altura=sc.nextFloat();

System.out.println("Digite a medida da base do retângulo:");
float base=sc.nextFloat();

float area=base*altura;

System.out.println("A area do seu retângulo "+area);
		
sc.close();		
	}

}
