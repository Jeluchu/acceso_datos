import java.io.*;

public class FicheroTextoFileWriter {

	public static void main(String[] args) 
	{
		try
		{
	   	    // 1. Apertura
		    File fichero = new File("Segundo.txt");
			FileWriter fWriter = new FileWriter(fichero,true);
			
			// 2. Escribir array de letras
			String letras = "Y ANA TAMBIEN";
			fWriter.write(letras);
 
		    // 3. Cierre 
		    fWriter.close();
		} 
        catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}