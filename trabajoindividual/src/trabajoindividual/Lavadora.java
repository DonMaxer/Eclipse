package trabajoindividual;


/**
 * Esta clase se encarga de contruir objetos de tipo lavadora
 * Hereda de electrodomestico
 * @author Mirko
 *
 */
public class Lavadora extends Electrodomestico{
	
	/**
	 * el atributo carga es determinante para calcular el precio final del objeto
	 * representa la capacidad de carga de la lavadora
	 */
	
	private final int carga;
	
	/**
	 * Constructor con todos los atributos
	 * @param preciobase
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param carga
	 */
	
	public Lavadora(double preciobase, String color, char consumo, int peso, int carga) {
		super(preciobase, color, consumo, peso);
		this.carga = carga;
	}
	
	/**
	 * Constructor con solo precio y peso
	 * @param preciobase
	 * @param peso
	 */
	
	public Lavadora(double preciobase,  int peso) {
		super(preciobase, peso);
		this.carga = 5;
	}
	
	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		super();
		this.carga = 5;
	}

	public int getCarga() {
		return carga;
	}
	
	/**
	 * El metodo calcular precio final de esta clase utiliza el de su clase padre
	 * pero ademas añade un valor extra si carga es superior a 30
	 * @return por defecto devuelve el valor entregado por el mimso metodo en la clase padre
	 * si carga es superior a 30 añade 50 al metodo heredado
	 */
	public double calcularPrecioFinal() {
		
		if (carga>30) {
			return super.calcularPrecioFinal()+50;
		}
		else {
			return super.calcularPrecioFinal();
		}
	}
	
}
