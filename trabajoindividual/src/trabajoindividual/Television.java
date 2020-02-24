package trabajoindividual;

/**
 * Esta clase de encarga d econtruir objetos de tipo television 
 * Hereda de electrodomestico
 * @author Mirko
 *
 */
public class Television extends Electrodomestico{

	/**
	 * Los atributos resolucion y sintonizadorTDT son usados para determinar el precio final
	 * de un objeto de esta clase
	 * precio finaltele sirve para almacenar ese calculo
	 */
	private double resolucion;
	private boolean sintonizadorTDT;
	private double preciofinaltele;
	
	
	/**
	 * Contructor con todos los atributos
	 * @param preciobase
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param resolucion
	 * @param sintonizadorTDT
	 */
	
	public Television(double preciobase, String color, char consumo, int peso, double resolucion,
			boolean sintonizadorTDT) {
		super(preciobase, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	/**
	 * Contructor solo con precio y peso
	 * @param preciobase
	 * @param peso
	 */
	
	public Television(double preciobase,int peso) {
		super(preciobase, peso);
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	
	/**
	 * Contructor por defecto
	 */
	
	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	
	
	/**
	 * El metodo calcularPrecioFinal en esta clase ustiliza el metodo heredado del mimso nombre
	 * pero puede aumentar su valor dependieno de los atributos resolucion y sintonizadorTDT
	 * @return Aumenta el precio final un 30% si la resolucion es mayor a 40 y a esto se le
	 * agregan 50 si el vlaor de sintonizadorTDT es true
	 */
	public double calcularPrecioFinal() {
		
		preciofinaltele=super.calcularPrecioFinal();
		if (resolucion>40) {
			preciofinaltele+=this.getPreciobase()*0.3;
		}
		if(sintonizadorTDT) {
			preciofinaltele+=50;
		}
		
		return preciofinaltele;
	}
	
}
