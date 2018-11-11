import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FicheroTextoNumeros {

	public static void main(String[] args) throws IOException {
		
		int opcion = 0;
		Scanner reader = new Scanner(System.in);
		int[] numeros = {10, 25, 38, 42, 56, 62, 71, 89, 93, 100};
		List<Integer> list = new ArrayList<>(numeros.length);
		
		System.out.println("¿Que opción deseas realizar?");
		System.out.println("\tPulsa 1: Escribir Fichero");
		System.out.println("\tPulsa 2: Leer Fichero");
		System.out.println("\tPulsa 3: Escribir por consola");
		System.out.println("\tPulsa 4: Modificar la tabla");
		System.out.println("\tPulsa 5: Actualizar la tabla");
		System.out.println("\tPulsa 6: Salir");
		System.out.println("------------------------------");
		System.out.print("Introduce la opción deseeada: ");
		opcion = reader.nextInt();
		
		switch(opcion)
		{
			case 1: 
				
    		    try 
				{
					
					
					
					// 1. Apertura
					File fichero = new File("tercero.txt");
					FileWriter fNumeros = new FileWriter(fichero);
					
					//List<Integer> list = new ArrayList<>(numeros.length);

					for (int i : numeros) {
						list.add(Integer.valueOf(i));
					}
					
				    for (int i = 0; i < list.size(); i++) 
				    {
				    	fNumeros.write(list.get(i).toString());
				    }
						
					// 3. Cierre
					fNumeros.close();
					
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				
			break;
			
			case 2: 
				
				FileReader fr;
				try {
					fr = new FileReader("tercero.txt");
					BufferedReader bf = new BufferedReader(fr);
					
					String sCadena;
					while ((sCadena = bf.readLine())!=null) 
					{
							sCadena = sCadena.trim();
							sCadena = sCadena.replaceAll("/t", "");
							sCadena = sCadena.toLowerCase();

							
						    String[] tokens = sCadena.split(" ");
						    list.add(Integer.valueOf(tokens[1]));
						   
						}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			break;
			
			case 3: 
				
			break;
			
			case 4: 
				
			break;
			
			case 5: 
				
			break;
			
			case 0: 
				System.exit(0);
			break;
			
		}
		
	}

}
