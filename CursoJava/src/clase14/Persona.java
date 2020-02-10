package clase14;



public class Persona {

	private String nombre;
	private int edad;
	private char sexo;
	private String Dni;
	private double peso;
	private double altura;
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.Dni=generarDNI();
	}

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.Dni = generarDNI();
	}
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'h';
		this.peso = 0;
		this.altura = 0;
		this.Dni = generarDNI();
		
	}
	
	public int  calcularIMC() {
		
		double imc = peso/(altura*altura);
		
		if (imc<20) {
			return -1;
		}
		else {
			
			if (imc>=20 && imc<=25) {
				return 0;
			}
			else  {
				return 1;
			}
		}
		
	}
	
	public boolean esMayorDeEdad() {
		
		if (edad>=18) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", Dni=" + Dni + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	private String generarDNI() {
		
		int generando_dni[]=new int[8];
		for (int i = 0; i < 8; i++) {
			generando_dni[i]=(int)Math.ceil(Math.floor(Math.random()*10));
		}
		
		int multiplicando=2;
		int suma=0;
		for (int i = generando_dni.length-1; i >= 0; i--) {
			
			suma=suma+generando_dni[i]*multiplicando;
			
			
			multiplicando++;
			if (multiplicando>7) {
				
				multiplicando=2;
			}
		}
		
		
		int numero3=11-suma%11;
		
		String digito_verificador="";
		if (numero3==11) {
			digito_verificador="0";
		}else {
			
			if (numero3==10) {
				digito_verificador="k";
			}else {
				
				digito_verificador=""+numero3;
			}
		}
		
		String dni_generado="";
		for (int i = 0; i < generando_dni.length; i++) {
			dni_generado=dni_generado + generando_dni[i];
		}
		
		return dni_generado +"-"+digito_verificador;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getDni() {
		return Dni;
	}
	
	
	
	
	
	
	
	
}
