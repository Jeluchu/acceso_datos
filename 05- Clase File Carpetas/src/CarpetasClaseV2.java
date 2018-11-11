import java.io.File;

public class CarpetasClaseV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] rutas = { "nombre2",
				 		   "nombre2\\bin", 
						   "nombre2\\bin\\bytecode",
						   "nombre2\\bin\\objetos",
						   "nombre2\\src",
						   "nombre2\\src\\clases",
						   "nombre2\\doc",
						   "nombre2\\doc\\html",
						   "nombre2\\doc\\pdf"};
		
		for (int i = 0; i < rutas.length; i++) {
			String string = rutas[i];
			File daemon = new File(string);
			daemon.mkdir();
		}


	}

}
