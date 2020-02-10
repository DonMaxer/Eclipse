package clase14;

public class Test {

	public static void main(String[] args) {
		int generando_dni[]=new int[8];
		
		for (int i = 0; i < 8; i++) {
			generando_dni[i]=(int)Math.ceil(Math.floor(Math.random()*10));
			
			
		}
		
		int multiplicando=2;
		int suma=0;
		for (int i = 7; i >= 0; i--) {
			
			suma=suma+generando_dni[i]*multiplicando;
			
			
			
			multiplicando++;
			if (multiplicando>7) {
				
				multiplicando=2;
			}
		}
		
		System.out.println(suma);
		
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
		
		System.out.println(dni_generado +"-"+digito_verificador);

	}

}
