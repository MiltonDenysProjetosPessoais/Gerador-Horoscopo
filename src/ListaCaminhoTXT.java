import java.util.HashMap;
import java.util.Map;

//classe que auxilia a captura do path do txt selecionado
public class ListaCaminhoTXT {

	//metodo que recebe um indice e baseado nele retorna o caminho escolhido
	public static String menu(int indice) {
		
		Map<Integer,String> signos = new HashMap<Integer,String>();		
		signos.put(0, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Aries"));
		signos.put(1, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Touro"));
		signos.put(2, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Gemeos"));
		signos.put(3, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Cancer"));
		signos.put(4, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Leao"));
		signos.put(5, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Virgem"));
		signos.put(6, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Libra"));
		signos.put(7, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Escorpiao"));
		signos.put(8, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Sagitario"));
		signos.put(9, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Capricornio"));
		signos.put(10, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Aquario"));
		signos.put(11, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Peixes"));
		return signos.get(indice).toString();
	}
}
