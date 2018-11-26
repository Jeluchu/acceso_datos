import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal 
{

	private static Empleados leerFichero(BufferedReader bfReader)
	{
		String linea = "";
		try 
		{		
			linea = bfReader.readLine();
			
		} 
		catch(Exception ex) {}
		
		if(linea == null)
			return null;
		
		String[] campoEmpleados = linea.split(", ");
		
		return new Empleados(campoEmpleados[0], Integer.parseInt(campoEmpleados[1]), campoEmpleados[2]);
	}
	
	private static void escribirSueldos(ArrayList<Empleados> listaEmpleados)
	{
		ArrayList<Empleados> sueldosOrdenados = new ArrayList<Empleados>(listaEmpleados);
		
		File fWriter = new File("Sueldos.txt");
		
		try 
		{
			BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fWriter));
			
			sueldosOrdenados.sort(Comparator.comparing((a)->a.getSueldo()));
	
			for(Empleados emp : sueldosOrdenados)
			{
				bfWriter.write(Integer.toString(emp.getSueldo()));
				bfWriter.newLine();
			}
			bfWriter.close();
		}
		catch(Exception ex) {}
	}
	
	private static void imprimirEmpleados(ArrayList<Empleados> listaEmpleados)
	{
		listaEmpleados.sort(Comparator.comparing((a)->a.getNombre()));
		
		for(Empleados fx : listaEmpleados)
			System.out.println(fx);
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Empleados> listaEmpleados = new ArrayList<Empleados>();
		
		File fLectura = new File("Empleados.txt");
		
		try 
		{
			Empleados empleado1;
			BufferedReader bfReader = new BufferedReader(new FileReader(fLectura));
			do
			{
				empleado1 = leerFichero(bfReader);
				
				if(empleado1 != null)
					listaEmpleados.add(empleado1);
			}while(empleado1 != null);
			
			try 
			{
				bfReader.close();
			}
			catch(Exception ex){}	
			
		}
		catch(Exception ex) {}
		
		escribirSueldos(listaEmpleados);
		imprimirEmpleados(listaEmpleados);
	}

}
