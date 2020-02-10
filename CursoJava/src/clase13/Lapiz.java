package clase13;

public class Lapiz {
	
	
	
	private int largo;
	private String color_tinta, tipo, marca;
	
	public Lapiz () {
		
		this.largo=10;
		this.color_tinta="Azul";
		this.tipo="fijo";
		this.marca="bic";
	}
	
	public Lapiz(int l, String ct, String tipo, String m) {
		this.largo=l;
		this.color_tinta=ct;
		this.tipo=tipo;
		this.marca=m;
		
		
	}
	
	@Override
	public String toString() {
		return "Lapiz [largo=" + largo + ", color_tinta=" + color_tinta + ", tipo=" + tipo + ", marca=" + marca + "]";
	}

	public void escribir(String palabra) {
		
		System.out.println(palabra);
	}
	
	public String tapa() {
		
		if (tipo=="mecanico"){
				return "apreta";
		}else {
			
			return "se saca";
		}
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public String getColor_tinta() {
		return color_tinta;
	}

	public void setColor_tinta(String color_tinta) {
		this.color_tinta = color_tinta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
