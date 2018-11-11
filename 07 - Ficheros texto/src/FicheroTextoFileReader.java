import java.io.*;

public class FicheroTextoFileReader {

	public static void main(String[] args)
	{
		int resultado;
		try 
		{
	   	    // 1. Apertura
		    File fichero = new File("Primero.txt");
			FileReader fReader = new FileReader(fichero);
			
			// 2. Leer del fichero los caracteres
			char[] letras = new char[4]; 
			resultado = fReader.read(letras);
			while (resultado != -1)
			{
				// Tratar los datos leídos 
				for(int i=0;i<resultado;i++)
					System.out.print(letras[i]);
				// Lectura avanzada del fichero
				resultado = fReader.read(letras);
			}
		    // 3. Cierre 
		    fReader.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
        catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}