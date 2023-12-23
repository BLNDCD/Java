package quitarEspacios;

public class QuitarEspacios {
    public static String noSpace(final String x) {
        StringBuilder string = new StringBuilder();
      for(int i=0; i<x.length();i++){
        char ch = x.charAt(i);
        if(ch != ' '){
          string.append(ch);
        }
      }
        return string.toString();
    }
	public static void main(String[] args) {
		String x = "asldkasd fglsakd qwewq ";
		System.out.println(noSpace(x));
	}
}
