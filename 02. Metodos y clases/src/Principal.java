
public class Principal {
	
	public static void cambiarFecha(Fecha f) 
	{
		f.dia = f.dia + 1;
		f.mes = 4;
		f.anio = 2000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha miFecha = new Fecha();
		
		System.out.println(miFecha.dia);
		System.out.println(miFecha.mes);
		System.out.println(miFecha.anio);
		
		cambiarFecha(miFecha);
		
		System.out.println();
		System.out.println(miFecha.dia);
		System.out.println(miFecha.mes);
		System.out.println(miFecha.anio);
		
		miFecha.cambiarMes(12);
		
		System.out.println();
		System.out.println(miFecha.dia);
		System.out.println(miFecha.mes);
		System.out.println(miFecha.anio);
	}

}
