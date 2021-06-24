import java.util.HashMap;
import java.util.Map;

public class ListaCaminhoTXT {

	public static String menu(int indice) {
		
		Map<Integer,String> signos = new HashMap<Integer,String>();		
		signos.put(0, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Aries"));
		signos.put(1, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Cancer"));
		signos.put(2, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Gemeos"));
		signos.put(3, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Leao"));
		signos.put(4, new String("E:\\workplace_eclipse\\Gerador de Horoscopo\\src\\resources\\Touro"));
		return signos.get(indice).toString();
	}
}
