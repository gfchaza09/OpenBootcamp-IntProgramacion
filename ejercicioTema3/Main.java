package ejercicioTema3;

public class Main {

	public static void main(String[] args) {
		
		//Primera Parte de main
		
		int num1 = 25;
		int num2 = 3;
		int num3 = 94;
		System.out.println (suma(num1,num2,num3));
		
		System.out.println (suma(5,10,15));
		
		
		// Segunda Parte de main
		
		Coche miCoche = new Coche();
		miCoche.aumentarPuerta();
		
		System.out.println (miCoche.numPuertas);
	}
	
	public static int suma(int a, int b, int c) {
		return a + b + c;
	}
}

