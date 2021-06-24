import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MenuSigno {

	String path="";
	String sig="";
	public void menuSignos() {
		System.out.println("######## SORTEADOR DE FRASES DE SIGNOS ########\n");
		System.out.println("1.Áries");
		System.out.println("2.Touro");
		System.out.println("3.Gêmeos");
		System.out.println("4.Câncer");
		System.out.println("5.Leão");
		System.out.println("6.Virgem");
		System.out.println("7.Libra");
		System.out.println("8.Escorpião");
		System.out.println("9.Sagitário");
		System.out.println("10.Capricórnio");
		System.out.println("11.Aquário");
		System.out.println("12.Peixes");		
		System.out.println("\nSelecione a opção do signo desejado:");
		
	}
	
	
	public int random() {
		Random aleatorio = new Random();
		int random = aleatorio.nextInt(6);
		return random;
	
	}
	
	
	public void entradaSigno() throws FileNotFoundException {
		int[] signo = new int[12];
		Scanner scan = new Scanner(System.in);
		
		int inputSigno = scan.nextInt(); 		
		while(inputSigno>12 || inputSigno <1) {
			System.out.println(true);
			menuSignos();
			inputSigno = scan.nextInt(); 		
			
		}
		
		switch(inputSigno) {
		
		case 1:
			path = ListaCaminhoTXT.menu(0).toString();
			break;		
		
		case 2:
			path = ListaCaminhoTXT.menu(1).toString();
			break;
		case 3:
			path = ListaCaminhoTXT.menu(2).toString();
			break;
		case 4:
			path = ListaCaminhoTXT.menu(3).toString();
			break;
		case 5:
			path = ListaCaminhoTXT.menu(4).toString();
			break;
	}
		
		//Scanner s= new Scanner(new File("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Touro.txt"));
		Scanner s = new Scanner(new File(path));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
		   list.add(s.nextLine());
		  // sig = s.nextLine();
		}
		
		
		
		
		
		
		
		System.out.println(list.get(0));
		//System.out.println(path);
		System.out.println(sig);


//		System.out.println(signos.get(1));
//		System.out.println(signos.get(2));
//		System.out.println(signos.get(3));
//		System.out.println(signos.get(4));
//		System.out.println(signos.get(5));


//		
//		while(inputSigno>12 || inputSigno <1) {
//			System.out.println(true);
//			break;
//		}
//		
//		char[] nome_arquivo= new char[50];
//		String[] diretorio_arquivo = {"/Gerador de Horoscopo/src/resources"} ;
//
//		switch(inputSigno) {
//		
//		case 1:
//			String result = "%s:%s".formatted(nome_arquivo, "touro.txt");
//			break;		
//		}
		
		//System.out.println(inputSigno);
//		signo[1] = 36;
//		System.out.println(signo[1]);
	}
	
//	 while ( (signo > 12) || (signo < 1) ){
//	       printf("\nEssa opção que você escolheu não existe. Tente novamente.\n");
//	       imprimir_menu();
//	       gets(entrada);
//	       signo = atoi(entrada);
//	   }
	
	
	
}
