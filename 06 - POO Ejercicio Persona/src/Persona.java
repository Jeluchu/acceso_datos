public class Persona
{
	// Atributos 
	private String nombre;
	private String apellido;
	private int    edad;
	
	// Métodos 
	public Persona()
	{
		nombre = "NINGUNO";
		apellido = "NADIE";
		edad = 0;
	}
	
	public Persona(String n,String a,int e)
	{
		nombre = n;
		apellido = a;
		edad = e;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String escribir()
	{
		return  " Nombre: " + nombre + 
				" Apellido: " + apellido +
				" Edad: " + edad;
	}
	
	public boolean esMayorEdad()
	{
		return (edad >=18); 
	}
	
	public int longitudNombre()
	{
		return  nombre.length();
	}

	public int longitudApellido()
	{
		return  apellido.length();
	}

}