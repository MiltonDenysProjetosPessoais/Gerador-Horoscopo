import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MenuSigno {

	String path="";
	
	//metodo para imprimir na tela os signos para o usuario inserir o numero desejado
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
		System.out.println("\nSelecione o número do signo desejado:");
		
	}
	
	//metodo para gerar número aleatório
	public int random() {
		Random aleatorio = new Random();
		int random = aleatorio.nextInt(5);
		return random;
	}
	
	//metodo que recebe entrada do usuario 
	public void entradaSigno() throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//recebe input do usuario
		int inputSigno = scan.nextInt(); 
		//valida que usuario não digitou um numero maior que 12 e menor que 1
		//caso o usuario digite um numero incorreto é apresentado o menu novamente solicitandpo um novo input
		while(inputSigno>12 || inputSigno <1) {
			menuSignos();
			inputSigno = scan.nextInt(); 					
		}
		
		//com o input do usuario recebe em uma variavel o caminho do signo correto
		switch(inputSigno) {
		
		case 1:
			//neste caso por exemplo a variavel recebe este caminho -  E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Aries 
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
		case 6:
			path = ListaCaminhoTXT.menu(5).toString();
			break;
		case 7:
			path = ListaCaminhoTXT.menu(6).toString();
			break;
		case 8:
			path = ListaCaminhoTXT.menu(7).toString();
			break;
		case 9:
			path = ListaCaminhoTXT.menu(8).toString();
			break;
		case 10:
			path = ListaCaminhoTXT.menu(9).toString();
			break;
		case 11:
			path = ListaCaminhoTXT.menu(10).toString();
			break;
		case 12:
			path = ListaCaminhoTXT.menu(11).toString();
			break;
	}
				
	}
	//metodo que recebe o caminho pela variavel path 
	public void resposta() {
		try {
			//recebe caminho do arquivo e armazena na variavel s
			Scanner s = new Scanner(new File(path));
			//cria lista de String
			ArrayList<String> list = new ArrayList<String>();
			//percorre as frases dentro do txt 
			while (s.hasNext()){
				//adiciona dentro da lista cada frase
			   list.add(s.nextLine());
			}
			//imprime para o usuario uma das frases dentro do txt de forma randomica
			System.out.println(list.get(random()));
		} catch (Exception e) {	
		}	
	}
}
