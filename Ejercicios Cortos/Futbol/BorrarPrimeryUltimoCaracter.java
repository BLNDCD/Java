package primerYultimoCaracter;

public class BorrarPrimeryUltimoCaracter {
    public static String remove(String str) {
        str  = str.substring(1,str.length()-1);
      return str;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Eloquent";
		System.out.println(remove(x));
	}

}
