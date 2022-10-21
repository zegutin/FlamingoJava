package orientacaoObjetos;

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
	String [] preco = {"8.500"};
	
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
		
		
		System.out.println("FICHA T�CNICA");
		
		System.out.println("\nCaracter�sticas gerais");
		System.out.println("Marca: "+celular.marca[0]);
		System.out.println("Linha: "+celular.linha[0]);
		System.out.println("Modelo:"+celular.nomeModelo[0]);
		System.out.println("Cor: "+celular.cor[0]);
		System.out.println("Pre�o medio: R$"+celular.preco[0]);
		
		System.out.println("\nM�moria");
		System.out.println("M�moria interna: "+celular.memoriaInterna[0]+" GB");
		System.out.println("M�moria Ram: "+celular.memoriaRam[0]+" GB");
		System.out.println("Entrada Cart�o SD: "+celular.entradaCartaoSD[0]);
		
		System.out.println("\nCart�o SIM");
		System.out.println("Operadora: "+celular.operadora[0]);
		System.out.println("Quantidade de entrada SIM"+celular.quantidadeSIM[0]);
		System.out.println("Dual SIM: "+celular.dualSIM[0]);
		System.out.println("Tamanho do Cart�o SIM: "+celular.tamanhoCartaoSIM[0]);
		
		System.out.println("\nEspesifica��o da C�mera");
		System.out.println("Contem C�mera: "+celular.contemCamera[0]);
		System.out.println("C�mera Frontal");
		System.out.println("Quantidade de C�mera Frontal: "+celular.quantidadeCamerasFrontais[0]);
		System.out.println("Resolus�o da C�mera Frontal: "+celular.resolusaoCamerasFrontais[0]);
		System.out.println("C�mera Traseira");
		System.out.println("Quantidade de C�merda Traseira"+celular.quantidadeCamerasTraseiras[0]);
		System.out.println("Resolus�o da C�merda Traseira"+celular.resolusaoCamerasTraseiras[0]);
		
		System.out.println("\nBateria");
		System.out.println("Carregamento Rapido: "+celular.carregamentoRapido[0]);
		System.out.println("Carregamento Sem Fio: "+celular.carregamentoSemFio[0]);
		System.out.println("Bateria: "+celular.bateria[0]+" mAh");
		
		
		
		System.out.println("\nTipo de tela");
		System.out.println("Tamanho da Tela: "+celular.tela[0]+" Polegada");
	}
}

