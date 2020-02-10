package clase13;

public class Tiempo {

	int hora, minuto, segundo;
	

	public Tiempo(int hora, int minuto, int segundo) {
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Tiempo(int hora, int minuto) {
		
		this.hora = hora;
		this.minuto = minuto;
		
	}

	public Tiempo(int hora) {
	
	this.hora = hora;
	
	}
	//metodos propios--------------------------
	
	public void devolverHora() {
		
		if (hora< 24 && hora >= 0) {
			if (minuto< 60 && minuto >= 0) {
				
				if (segundo< 60 && segundo >= 0) {
					
					System.out.print("La hora es: " + hora + " | ");
					System.out.print("El minuto es: " + minuto + " | ");
					System.out.print("El segundo es: " + segundo + " | ");
					System.out.println(" " );
				}else {
					
					System.out.println("Hora mala");
				}
			}else {
				
				System.out.println("Hora mala");
			}
			
		}
		else {
			
			System.out.println("Hora mala");
		}
			
		
	}
	
	
	//------------------------------------------------
	
	
	// seters y geter---------------------------------

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	//-----------------------------------------------
	
}
