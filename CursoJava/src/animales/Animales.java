package animales;

public class Animales {

	private String nombre;
	private String pais;
	private String fecha_ingreso;
	
	
	public Animales(String nombre, String pais, String fecha_ingreso) {
		
		this.nombre = nombre;
		this.pais = pais;
		this.fecha_ingreso = fecha_ingreso;
	}


	public Animales() {
		
		
	}


	@Override
	public String toString() {
		return "nombre=" + nombre + ", pais=" + pais + ", fecha_ingreso=" + fecha_ingreso ;
	}
	
	
	
	
	
}
