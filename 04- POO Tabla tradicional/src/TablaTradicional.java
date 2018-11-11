
public class TablaTradicional {

	public static void imprimirTabla(int[] tabla)
	{
		for(int i = 0; i < 4; i++)
			System.out.println(tabla[i]);
	}
	
	
	public static void main(String[] args) 
	{

		// V1 - UTILIZANDO PROGRAMACIÓN ESTRUCTURADA
		int[] tabla = {11, 22, 33, 44};
		
		imprimirTabla(tabla);
		
		// V2 - UTILIZANDO POO
		TablaEnteros miTabla = new TablaEnteros();
		miTabla.tabla[0] = 99;
		miTabla.imprimir();
				
	}

}
