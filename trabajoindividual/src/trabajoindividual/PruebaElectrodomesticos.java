package trabajoindividual;

/**
 * Clase principal del proyecto
 * El ojetivo de esta clase es, a partir de una lista de 10 objetos pertenecientes a 
 * television y lavadora, calcular la suma de precios finales por clase y en total
 * @author Alumno
 *
 */
public class PruebaElectrodomesticos {

	
	
	
	public static void main(String[] args) {
		
		/**
		 * lista contiene los objetos creados
		 * lavadora y tele sirven para evaluar la clase de los elementos de la lista
		 * con el metodo getClass
		 * 
		 * precioteles, preciolavadoras y total es donde se guardaran las sumas que seran
		 * mostradas al final
		 */
		Electrodomestico lista[]= new Electrodomestico[10];
		Lavadora lavadora = new Lavadora();
		Television tele = new Television();
		double precioteles=0;
		double preciolavadoras=0;
		double total=0;
		
		
		/**
		 * se llena a mano la lista
		 */
		lista[0]=new Television();
		lista[1]=new Television();
		lista[2]=new Television();
		lista[3]=new Television();
		lista[4]=new Television();
		lista[5]=new Lavadora();
		lista[6]=new Lavadora();
		lista[7]=new Lavadora();
		lista[8]=new Lavadora();
		lista[9]=new Lavadora();
		
		
		/**
		 * Se recorre lista y se evalua a que clase pertenecen los objetos
		 * si son lavadoras se calcula el precio final y se suma a preciolavadoras
		 * si son televisiones se suma a precioteles
		 * independiente de su clase se suma a total
		 */
		for (int i = 0; i < lista.length; i++) {
			
			if(lista[i].getClass()==tele.getClass()) {
			precioteles+=lista[i].calcularPrecioFinal();
			}

			if(lista[i].getClass()==lavadora.getClass()) {
			preciolavadoras+=lista[i].calcularPrecioFinal();
			}
			
			total+=lista[i].calcularPrecioFinal();
		}
		
		/**
		 * se imprimen las sumas de lavadorar, televisiones y el total
		 */
		System.out.println("Precio de televisiones " + precioteles);
		System.out.println("Precio de lavadoras " + preciolavadoras);
		System.out.println("Precio total " + total);
		

	}

}
