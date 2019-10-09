import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio6 {

	public static void directorioPasado(){
		Date myDate = new Date();

		try { 

			File f = new File("C:\\Users\\josea\\Documents\\2DAM\\"+ new SimpleDateFormat("dd-MM-yyyy").format(myDate).toString()); 
			f.mkdir();
		} 
		catch (Exception e) { 
			System.err.println(e); 
		} 
	} 


	public static void main(String[] args) {

		directorioPasado();

	}
}
