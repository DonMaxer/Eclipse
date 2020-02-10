package animales;

public class AnimalesTerrestres extends Animales{

	private byte cantidad_patas;
	private byte horas_sueno;
	private String alimentacion;
	
	public AnimalesTerrestres() {
		super();
		
	}
	public AnimalesTerrestres(String nombre, String pais, String fecha_ingreso, byte  cantidad_patas, byte horas_sueno, String alimentacion) {
		super(nombre, pais, fecha_ingreso);
		this.cantidad_patas=cantidad_patas;
		this.horas_sueno=horas_sueno;
		this.alimentacion=alimentacion;
		
	}
	@Override
	public String toString() {
		return super.toString() + " cantidad_patas=" + cantidad_patas + ", horas_sueno=" + horas_sueno
				+ ", alimentacion=" + alimentacion;
	}
	
	
	
	
	
}
