
public class Metodos {

	
	public static int sumar(int n1, int n2) {
		
		n1 = n1 + n2;
		
		return n1;
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int miNumero1 = 4,
			miNumero2 = 5,
			resultados;
		
		resultados = sumar(miNumero1, miNumero2);
		
		System.out.println(miNumero1);
		System.out.println(miNumero2);
		System.out.println(resultados);

	}


	
}
