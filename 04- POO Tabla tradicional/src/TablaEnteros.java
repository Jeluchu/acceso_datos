
public class TablaEnteros {

	// DATOS
	
	public int[] tabla;
	
	// MÉTODOS
	public TablaEnteros()
	{
		tabla = new int[4];
		tabla[0] = 11;
		tabla[1] = 22;
		tabla[2] = 33;
		tabla[3] = 44;
	}
	
	public void imprimir() 
	{
		for(int i = 0; i < 4; i++)
			System.out.println(tabla[i]);
	}
	
}
