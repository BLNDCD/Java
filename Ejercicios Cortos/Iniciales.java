public class Iniciales {
	static String devuelveIniciales(String s) {
		String [] divide = s.split(" ");
		StringBuilder iniciales = new StringBuilder();
		for(int i=0; i < divide.length; i++) {
			iniciales.append(divide[i].charAt(0));
			if(i < divide.length -1) {
				iniciales.append(".");
			}
			
		}
		
		return iniciales.toString().toUpperCase();
	}
	
	public static void main(String[] args) {
		String s = "Harry Kane tottenham hotspurs";
		System.out.println(devuelveIniciales(s)); //esperado H.K.T.H
	}
}
