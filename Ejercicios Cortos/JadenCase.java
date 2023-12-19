public class Test {
	static String jadenCase(String frase) {
		StringBuilder resultado = new StringBuilder();
		String[] palabras = frase.split(" ");
		for (String string : palabras) {
			string = string.toUpperCase().charAt(0) + string.substring(1, string.length());
			resultado.append(string).append(" ");
		}

		return resultado.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "soy una frase en jadencase";
		System.out.println(jadenCase(frase));
	}
