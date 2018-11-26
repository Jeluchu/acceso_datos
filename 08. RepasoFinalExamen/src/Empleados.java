public class Empleados 
{
	// DECLARACIÓN DE VARIABLES
	String nombre;
	int sueldo;
	String fecha;
	
	// CONSTRUCTOR VACÍO
	public Empleados()
	{
		nombre = "";
		sueldo = 0;
		fecha = "";
	}
	
	// CONSTRUCTOR CON PARÁMETROS
	public Empleados(String nombre, int sueldo, String fecha)
	{
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.fecha = fecha;
	}
	
	// CREACIÓN DE LOS GETTERS
	public String getNombre()
	{
		return nombre;
	}
	
	public int getSueldo()
	{
		return sueldo;
	}
	
	public String getFecha()
	{
		return fecha;
	}
	
	// DEVOLUCIÓN PARA LA IMPRESIÓN COMPLETA DE DATOS
	public String toString()
	{
		return "Nombre: " + getNombre() + "\n" +
			   "Sueldo: " + getSueldo() + "\n" +
			   "Fecha: " + getFecha() + "\n";
	}
}
