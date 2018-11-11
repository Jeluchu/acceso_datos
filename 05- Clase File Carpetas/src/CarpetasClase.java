import java.io.File;

public class CarpetasClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File carpeta = new File("Nombre"),
				carpeta1 = new File(carpeta,"bin"),
				carpeta2 = new File(carpeta1,"bytecode"),
				carpeta3 = new File(carpeta1,"objetos"),
				carpeta4 = new File(carpeta,"src"),
				carpeta5 = new File(carpeta4,"clases"),
				carpeta6 = new File(carpeta,"doc"),
				carpeta7 = new File(carpeta6,"html"),
				carpeta8 = new File(carpeta6,"pdf");

		carpeta.mkdir();
		carpeta1.mkdir();
		carpeta2.mkdir();
		carpeta3.mkdir();
		carpeta4.mkdir();
		carpeta5.mkdir();
		carpeta6.mkdir();
		carpeta7.mkdir();
		carpeta8.mkdir();

	}
	
}
