import java.io.FileNotFoundException;

public class ClassePrincipal {

	static MenuSigno menu = new MenuSigno();
	
	public static void main(String[] args) throws FileNotFoundException {
//		menu.menuSignos();
//		menu.entradaSigno();
		
		System.out.println(menu.random());
	}

}
