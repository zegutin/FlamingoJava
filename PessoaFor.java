package oritacaoObjeto;

public class PessoaFor {

	String[] nome = { "Jailson", "Jos�", "Isaque" };
	int[] idade = { 37, 19, 30 };
	String[] profissao = { "Professor", "Administrador", "Pelezeiro" };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			

			Pessoa cadastro01 = new Pessoa();

			System.out.println("O nome da pessoa � :" + cadastro01.nome[i]);
			System.out.println("A idade da pessoa � :" + cadastro01.idade[i]);
			System.out.println("A profiss�o da pessoa � :" + cadastro01.profissao[i]);
		}
		
	}

}
