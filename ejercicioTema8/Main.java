package ejercicioTema8;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.setEdad(25);
		persona.setNombre("Juan P�rez");
		persona.setTelefono("+55 555 555 5555");
		
		System.out.println("Nombre: "+persona.getNombre()+"; Edad: "+persona.getEdad()+"; Tel�fono: "+persona.getTelefono());
	}

}
