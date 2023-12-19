public class Test {

	static void separarEnPares(String letras) {
	
		char guion = '_';
//si la palabra no es par, se agrega un guion bajo para volverla par.
		if(letras.length() %2 != 0) {
			letras= letras+guion;
		}
		for (int i = 0; i < letras.length(); i += 2) {
			String par = letras.substring(i, i + 2);
			System.out.print(par + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letras = "ABC";
		separarEnPares(letras);
	}

}
