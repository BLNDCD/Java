public class Test {

	static String[] separarEnPares(String letras) {
		ArrayList<String> pares = new ArrayList<>();
		char guion = '_';
		if(letras.length() %2 != 0) {
			letras= letras+guion;
		}
		for (int i = 0; i < letras.length(); i += 2) {
			String par = letras.substring(i, i + 2);
			pares.add(par);
		}
		return pares.toArray(new String[0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letras = "LovePizza";
		@SuppressWarnings("unused")
		String[] resultado = separarEnPares(letras);
		for (String par : separarEnPares(letras) ) {
			System.out.println(par);
		}
	}

}
