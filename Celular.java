package orientacaoObjetos;

public class Celular {
	
	
	//Características gerais
	String [] marca = {"Apple","Samsung"};
	String [] linha = {"Iphone"};
	String []nomeModelo = {" 13 Pro Max"};
	String []cor = {"Cinza Chumbo"};
	
	//Mémoria
	int [] memoriaInterna = {128};
	int [] memoriaRam = {6};
	String[] entradaCartaoSD = {"Não"};
		
	//Precificação
	String [] preco = {"8.500"};
	
	//Cartão SIM
	String [] operadora = {"Oi"};
	float [] quantidadeSIM = {1};
	String [] dualSIM = {"Não"};
	String [] tamanhoCartaoSIM = {"Nano-Chip"};
	
	//Câmera
	String []contemCamera = {"Sim"};
	//Câmera Traseira
	int [] quantidadeCamerasTraseiras = {3};
	int [] resolusaoCamerasTraseiras = {12};
	
	//Resistência
	int [] classificacaoIP = {68};
	
	
	//Câmera Frontal
	int [] quantidadeCamerasFrontais = {1};
	int [] resolusaoCamerasFrontais = {12};
	
	//conectividade
	String []wifi = {"Sim"};
	String []gps = {"Sim"};
	String []bluetooth = {"Sim"};
	String []nfc = {"Sim"};
	String []radio = {"Não"};
	
	//Espesificação Tela
	double []tela = {6.7};
	String [] tecnologiaTela = {"OLED"};
	String []telaTatil = {"Sim"};
	int []taxaDeQuadros = {120};
	
	//espesificação da bateria
	String []carregamentoSemFio = {"Sim"};
	String []carregamentoRapido = {"Sim"};
	int []bateria = {4325};
	
	
	//Processador
	String[] modeloGPU = {"Apple GPU"};
	int [] quantidadeNucleos = {6};
	String[] modeloCPU = {"Apple A15 Bionic"};
	
	//Segurança
	String []faceID = {"Sim"};
	String []touchID = {"Sim"};
	
	//peso do celular
	int [] peso = {238};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Celular celular = new Celular();
		
		
		System.out.println("FICHA TÉCNICA");
		
		System.out.println("\nCaracterísticas gerais");
		System.out.println("Marca: "+celular.marca[0]);
		System.out.println("Linha: "+celular.linha[0]);
		System.out.println("Modelo:"+celular.nomeModelo[0]);
		System.out.println("Cor: "+celular.cor[0]);
		System.out.println("Preço medio: R$"+celular.preco[0]);
		
		System.out.println("\nMémoria");
		System.out.println("Mémoria interna: "+celular.memoriaInterna[0]+" GB");
		System.out.println("Mémoria Ram: "+celular.memoriaRam[0]+" GB");
		System.out.println("Entrada Cartão SD: "+celular.entradaCartaoSD[0]);
		
		System.out.println("\nCartão SIM");
		System.out.println("Operadora: "+celular.operadora[0]);
		System.out.println("Quantidade de entrada SIM"+celular.quantidadeSIM[0]);
		System.out.println("Dual SIM: "+celular.dualSIM[0]);
		System.out.println("Tamanho do Cartão SIM: "+celular.tamanhoCartaoSIM[0]);
		
		System.out.println("\nEspesificação da Câmera");
		System.out.println("Contem Câmera: "+celular.contemCamera[0]);
		System.out.println("Câmera Frontal");
		System.out.println("Quantidade de Câmera Frontal: "+celular.quantidadeCamerasFrontais[0]);
		System.out.println("Resolusão da Câmera Frontal: "+celular.resolusaoCamerasFrontais[0]);
		System.out.println("Câmera Traseira");
		System.out.println("Quantidade de Câmerda Traseira"+celular.quantidadeCamerasTraseiras[0]);
		System.out.println("Resolusão da Câmerda Traseira"+celular.resolusaoCamerasTraseiras[0]);
		
		System.out.println("\nBateria");
		System.out.println("Carregamento Rapido: "+celular.carregamentoRapido[0]);
		System.out.println("Carregamento Sem Fio: "+celular.carregamentoSemFio[0]);
		System.out.println("Bateria: "+celular.bateria[0]+" mAh");
		
		
		
		System.out.println("\nTipo de tela");
		System.out.println("Tamanho da Tela: "+celular.tela[0]+" Polegada");
	}
}

