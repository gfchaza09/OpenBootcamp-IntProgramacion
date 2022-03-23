package ejercicioTema9;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Juan Pérez");
		cliente.setEdad(25);
		cliente.setTelefono("+1 11 1111 1111");
		cliente.setCredito(5000);
		
		System.out.println("CLIENTE) Nombre: "+cliente.getNombre()+"; Edad: "+cliente.getEdad()+"; Teléfono: "+cliente.getTelefono()+"; Crédito: $"+cliente.getCredito());
	
		Trabajador trabajador = new Trabajador();
		trabajador.setNombre("Pedro Molina");
		trabajador.setEdad(43);
		trabajador.setTelefono("+1 35 3588 4556");
		trabajador.setSalario(10000);
		
		System.out.println("TRABAJADOR) Nombre: "+trabajador.getNombre()+"; Edad: "+trabajador.getEdad()+"; Teléfono: "+trabajador.getTelefono()+"; Salario: $"+trabajador.getSalario());
	}

}
