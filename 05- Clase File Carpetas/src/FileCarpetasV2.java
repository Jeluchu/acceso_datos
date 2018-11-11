import java.io.*;


public class FileCarpetasV2 {

	public static void crearCarpetas(String[] tabla)
	{
		for(int i=0;i<tabla.length;i++)
		{
			File carpeta = new File(tabla[i]);
		
			carpeta.mkdir();
			carpeta.mkdirs();
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		File carpeta = new File("DAM2"),
			 fichero1 = new File("FicheroFuera.txt"),
			 fichero2 = new File(carpeta,"FicheroDentro1.txt"),
			 fichero3 = new File(carpeta,"FicheroDentro2.txt");
		
		String[] rutas = 
			{
			   "Proyecto",
			   "Proyecto\\bin",
			   "Proyecto\\bin\\bytecode",
			   "Proyecto\\bin\\objetos",
			   "Proyecto\\src",
			   "Proyecto\\src\\clases",
			   "Proyecto\\doc",
			   "Proyecto\\doc\\html",
			   "Proyecto\\doc\\pdf"
			};
		
		String[] rutasTerminal = 
			{
			   "Proyecto2\\bin\\bytecode",
			   "Proyecto2\\bin\\objetos",
			   "Proyecto2\\src\\clases",
			   "Proyecto2\\doc\\html",
			   "Proyecto2\\doc\\pdf"
			};

		// crearCarpetas(rutas);
		crearCarpetas(rutasTerminal);
					
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