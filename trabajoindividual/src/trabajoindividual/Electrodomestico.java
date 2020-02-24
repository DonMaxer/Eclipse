package trabajoindividual;

/**
 * Esta es la clase padre de Lavadora y Television
 * @author Mirko
 *
 */
public class Electrodomestico {

	/**
	 * Todos los atributos de esta clase excepto preciofinal son constantes
	 * preciofinal debe ser variable para poder trabajar con el metodo calcular precio final
	 */
	
	private final double preciobase;
	private final String color;
	private final char consumo;
	private final int peso;
	private double preciofinal;
	
	
	/**
	 * Constructor con todos los atributos pedidos por parametros
	 */
	
	public Electrodomestico(double preciobase, String color, char consumo, int peso) {
		
		this.preciobase = preciobase;
		this.color = comprobarColor(color);
		this.consumo = comprobarConsumo(consumo);;
		this.peso = peso;
	}
	
	/**
	 *Constructor con solo el peso y el preciobase 
	 */
	
	public Electrodomestico(double preciobase, int peso) {
		
		this.preciobase = preciobase;
		this.peso = peso;
		this.color= "blanco";
		this.consumo='f';
	}
	
	/**
	 * Constructor por defecto
	 */
	
	public Electrodomestico () {
		this.preciobase = 10000;
		this.color = "blanco";
		this.consumo = 'f';
		this.peso = 5;
	}
	/**
	 * El metodo comprobar color se encarga de validar el color del electrodomestico
	 * 
	 * @param color de tipo string sera capturado mediante el contructor de la clase, 
	 * para forzar que el atributo sea valido
	 * @return devuelve "blanco" por defecto y devuelve el parametro en 
	 * caso de que cumpla las condiciones
	 */
	public String comprobarColor(String color) {
		if (color=="blanco" || color=="negro" || color=="rojo" || color=="azul" || color=="gris") {
			return color;
		}
		else {
			return "blanco";
		}
	}
	
	/**
	 * El metodo comprobarConsumo se encarga de validar el consumo del electrodomestico
	 * @param cosumo de tipo char sera entregdo por el constructor
	 * @return entregara 'f' por defecto y el parametro en caso de cumplir las condiciones
	 */
	
	public char comprobarConsumo(char cosumo) {
		
		if (consumo=='a' || consumo=='b' || consumo=='c'|| 
				consumo=='d'|| consumo=='e'|| consumo=='f') {
			return consumo;
		}else {
			
			return 'f';
		}
	}
	
	/**
	 * El metodo calcular precio final se encarga de aumentar el precio base del electrodomestico 
	 * en base a su peso y consumo
	 * @return devuelve el precio final del electrodomestico despues de 
	 * haber sido aumentado segun las condiciones
	 */
	public double calcularPrecioFinal() {
		
		preciofinal=preciobase;
		
		if (consumo=='a') {
			preciofinal+=100;
		}
		if (consumo=='b') {
			preciofinal+=80;
		}
		if (consumo=='c') {
			preciofinal+=60;
		}
		if (consumo=='d') {
			preciofinal+=50;
		}
		if (consumo=='e') {
			preciofinal+=30;
		}
		if (consumo=='f') {
			preciofinal+=10;
		}
		//----------------------------
		if (peso >= 0 && peso < 20) {
			preciofinal+=10;
		}
		if (peso >= 20 && peso < 50) {
			preciofinal+=10;
		}
		if (peso >= 50 && peso < 80) {
			preciofinal+=10;
		}
		if (peso > 80 ) {
			preciofinal+=10;
		}
		
		return preciofinal;
		
	}

	public double getPreciobase() {
		return preciobase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public int getPeso() {
		return peso;
	}
	
	
}
