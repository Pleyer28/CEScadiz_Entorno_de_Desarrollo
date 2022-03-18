
public class CadenasC {

	public static void main(String[] args) {
		String cadena1= "personas";
		String cadena2= "Importantes";
		cadena1.concat(cadena2);
		int cadena3=35;
		String cadena4="Hay";
		cadena4.concat(cadena1.concat(cadena2));
		
		System.out.println(cadena4.concat(cadena1.concat(cadena2))+cadena3);
		System.out.println(cadena4.concat(cadena2.concat(cadena3))+cadena1);
		System.out.println("Cambios Nuevos");

	}

}
