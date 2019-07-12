import java.util.regex.*;


public class Auxiliar  {

	public Auxiliar (){
		
	}
	
	public static boolean contiene (String a , String b) {
		Matcher m = obtenerM(a ,b);
		return m.find();
	}

	private static Matcher obtenerM( String a, String b) {
		Pattern pattern = Pattern.compile(a);
		return pattern.matcher(b);
	}
}
