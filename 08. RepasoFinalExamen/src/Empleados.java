public class Empleados 
{
	// DECLARACI�N DE VARIABLES
	String nombre;
	int sueldo;
	String fecha;
	
	// CONSTRUCTOR VAC�O
	public Empleados()
	{
		nombre = "";
		sueldo = 0;
		fecha = "";
	}
	
	// CONSTRUCTOR CON PAR�METROS
	public Empleados(String nombre, int sueldo, String fecha)
	{
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.fecha = fecha;
	}
	
	// CREACI�N DE LOS GETTERS
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
	
	// DEVOLUCI�N PARA LA IMPRESI�N COMPLETA DE DATOS
	public String toString()
	{
		return "Nombre: " + getNombre() + "\n" +
			   "Sueldo: " + getSueldo() + "\n" +
			   "Fecha: " + getFecha() + "\n";
	}
}
