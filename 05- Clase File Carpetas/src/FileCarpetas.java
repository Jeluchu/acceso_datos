import java.io.*;

public class FileCarpetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File carpeta = new File("DAM2"),
				fichero1 = new File("FicheroFuera.txt"),
				fichero2 = new File(carpeta,"FicheroDentro1.txt"),
				fichero3 = new File(carpeta,"FicheroDentro2.txt");
		
		carpeta.mkdir();
		try
		{
			fichero1.createNewFile();
			fichero2.createNewFile();
			fichero3.createNewFile();
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
