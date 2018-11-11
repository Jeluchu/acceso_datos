public class EjercicioPersona {

	public static void main(String[] args)
	{
		// 1. Construcci�n de objetos 
		Persona p1 = new Persona(),
				p2 = new Persona("Juan","Mart�n",22),
				p3 = new Persona("Laura","Romo",21);

		Persona[] tablaPersonas = new Persona[3]; 
		
		tablaPersonas[0] = new Persona();
		tablaPersonas[1] = new Persona("Juan","Mart�n",22);
		tablaPersonas[2] = new Persona("Laura","Romo",21);
		
		Persona[] tablaPersonas2 = 
			{
					new Persona(),
					new Persona("Juan","Mart�n",22),
					new Persona("Laura","Romo",21)
			};
					
		// 2. Llamada a m�todos
		System.out.println("Los nombres son");
		System.out.println(p1.getNombre());
		System.out.println(p2.getNombre());
		System.out.println(p3.getNombre());
		
		System.out.println("Datos completos: ");
		System.out.println(p1.escribir());
		System.out.println(p2.escribir());
		System.out.println(p3.escribir());
		
		if ( p3.esMayorEdad() )
			System.out.println(p3.getNombre() +
					" es mayor de edad");
		else
			System.out.println(p3.getNombre() +
					" no es mayor de edad");
			
	}

}