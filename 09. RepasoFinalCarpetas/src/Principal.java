import java.io.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int[] tabla = new int[21];
		int numero;
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Introduce un número: ");
			numero = scan.nextInt();
			tabla[numero] = tabla[numero] + 1;
		}
		scan.close();
		
		for(int i = 0; i < tabla.length; i++)
		{
			if(tabla[i] != 0)
			{
				try
				{
					File carpeta = new File(Integer.toString(i));
					carpeta.mkdir();
					File fichero = new File(Integer.toString(i) + "\\" + 
											Integer.toString(tabla[i]) +
											".free");
					fichero.createNewFile();
				}
				catch(Exception e) {}
			}
		}
		
	}

}
