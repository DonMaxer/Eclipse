package animales;

public class AnimalesAcuaticos extends Animales {

	private String tipo_ambiente;
	private int nivel_agresividad;
	private int cantidad_aletas;
	
	public AnimalesAcuaticos() {
		super();
		
	}
	public AnimalesAcuaticos(String nombre, String pais, String fecha_ingreso, String tipo_ambiente, int nivel_agresividad, int cantidad_aletas) {
		super(nombre, pais, fecha_ingreso);
		this.tipo_ambiente=tipo_ambiente;
		this.nivel_agresividad=nivel_agresividad;
		this.cantidad_aletas=cantidad_aletas;
		
	}
	@Override
	public String toString() {
		return super.toString() + "tipo_ambiente=" + tipo_ambiente + ", nivel_agresividad=" + nivel_agresividad
				+ ", cantidad_aletas=" + cantidad_aletas;
	}
	
	
}
