package clase14;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("mirkpo",38,'H',90,1.80);
		
		
		
	
		
		System.out.println(persona1.toString());
		System.out.println("imc "+persona1.calcularIMC());
		System.out.println("edad "+persona1.esMayorDeEdad());

		
	}

}
