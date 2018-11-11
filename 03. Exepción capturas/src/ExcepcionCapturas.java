import java.io.IOException;
import java.util.*;

public class ExcepcionCapturas {
	
	static public int leerNumero() throws IOException
	{
		try {
			Scanner scan = new Scanner(System.in);
			
			int numero;
			
			System.out.println("Introduce un número: ");
			numero = scan.nextInt();
			
			return numero;
		}
		catch(Exception ex)
		{
			throw new IOException("ERROR AL LEER");
		}
	}
	
	public static void main(String [] args) 
	{
		boolean leidoCorrecto = false;
		
		while(!leidoCorrecto)
		{
		
			try 
			{
				int numero = leerNumero();
				
				leidoCorrecto = true;
				
				System.out.printf("El cuadrado de tu número es %d", numero*numero);
			}

			catch(IOException ex)
			{
				System.out.println(ex.getMessage());
			}
			
		}
		
		
	}
	

}
