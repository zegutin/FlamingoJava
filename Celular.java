package orientacaoObjeto;

public class Celular {
	
	
	//Caracter�sticas gerais
	String [] marca = {"Apple","Samsung"};
	String [] linha = {"Iphone"};
	String []nomeModelo = {" 13 Pro Max"};
	String []cor = {"Cinza Chumbo"};
	
	//M�moria
	int [] memoriaInterna = {128};
	int [] memoriaRam = {6};
	String[] entradaCartaoSD = {"N�o"};
		
	//Precifica��o
	String [] preco = {"R$9.000"};
	
	//Cart�o SIM
	String [] operadora = {"Oi"};
	float [] quantidadeSIM = {1};
	String [] dualSIM = {"N�o"};
	String [] tamanhoCartaoSIM = {"Nano-Chip"};
	
	//C�mera
	String []contemCamera = {"Sim"};
	//C�mera Traseira
	int [] quantidadeCamerasTraseiras = {3};
	int [] resolusaoCamerasTraseiras = {12};
	
	//Resist�ncia
	int [] classificacaoIP = {68};
	
	
	//C�mera Frontal
	int [] quantidadeCamerasFrontais = {1};
	int [] resolusaoCamerasFrontais = {12};
	
	//conectividade
	String []wifi = {"Sim"};
	String []gps = {"Sim"};
	String []bluetooth = {"Sim"};
	String []nfc = {"Sim"};
	String []radio = {"N�o"};
	
	//Espesifica��o Tela
	double []tela = {6.7};
	String [] tecnologiaTela = {"OLED"};
	String []telaTatil = {"Sim"};
	int []taxaDeQuadros = {120};
	
	//espesifica��o da bateria
	String []carregamentoSemFio = {"Sim"};
	String []carregamentoRapido = {"Sim"};
	int []bateria = {4325};
	
	
	//Processador
	String[] modeloGPU = {"Apple GPU"};
	int [] quantidadeNucleos = {6};
	String[] modeloCPU = {"Apple A15 Bionic"};
	
	//Seguran�a
	String []faceID = {"Sim"};
	String []touchID = {"Sim"};
	
	//peso do celular
	int [] peso = {238};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Celular celular = new Celular();
		
		
		System.out.println("Caracter�sticas gerais");
		System.out.println("Marca: "+celular.marca[0]);
		System.out.println("Linha: "+celular.linha[0]);
		System.out.println("Modelo:"+celular.nomeModelo[0]);
		System.out.println("Cor: "+celular.cor[0]);
		
		System.out.println("\nEspesifica��o da bateria");
		System.out.println("Carregamento Rapido: "+celular.carregamentoRapido[0]);
		System.out.println("Carregamento Sem Fio: "+celular.carregamentoSemFio[0]);
		System.out.println("Bateria: "+celular.bateria[0]+" mAh");
		
		
		
		System.out.println("\nTipo de tela");
		System.out.println("Tamanho Tela: "+celular.tela[0]);
	}
}
