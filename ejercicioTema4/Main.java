package ejercicioTema4;

public class Main {

	public static void main(String[] args) {
		// Sentencia if
		int numeroIf = -23;
		if (numeroIf == 0) {
			System.out.println("El número es 0.");
		} else if (numeroIf<0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
		
		// Bucle While
		
		int numeroWhile = 0;
		
		while (numeroWhile < 3) {
			numeroWhile++;
			System.out.println(numeroWhile);
		}
		
		// Bucle Do-While
		
		do {
			numeroWhile++;
			System.out.println(numeroWhile);
			break;
		} while (numeroWhile < 3);
		
		//Bucle For
		
		for (int numeroFor = 0; numeroFor <= 3; numeroFor++ ) {
			System.out.println(numeroFor);
		}
		
		// sentencia switch
		
		String estacion = "PRIMAVERA";
		
		switch (estacion) {
			case "VERANO":
				System.out.println("Estamos en "+estacion);
				break;
			case "OTOÑO":
				System.out.println("Estamos en "+estacion);
				break;
			case "INVIERNO":
				System.out.println("Estamos en "+estacion);
				break;
			case "PRIMAVERA":
				System.out.println("Estamos en "+estacion);
				break;
			default:
				System.out.println("La variable no es una estación");
		}

	}

}
