import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Ejercicio4 {
	
	public static String fechaModificado(File fichero){
		long ms = fichero.lastModified();
		Date d = new Date(ms);
		Calendar c = new GregorianCalendar();
		c.setTime(d);
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString((c.get(Calendar.MONTH) + 1)) ;
		String annio = Integer.toString(c.get(Calendar.YEAR));
		String hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
		String minuto = Integer.toString(c.get(Calendar.MINUTE));
		String segundo = Integer.toString(c.get(Calendar.SECOND));
		
		return annio+"-"+mes+"-"+ dia +"-"+hora+":"+ minuto+":"+ segundo;
		
		}

	public static void dir(String pathname) {
		File filePathname = new File(pathname);
		File[] files = filePathname.listFiles();
		List<File> listTotal = Arrays.asList(files);
		List<File> listFiles = new ArrayList<File>();
		List<File> listDirectories = new ArrayList<File>();
		for (File element : listTotal) {
			if (element.isDirectory()) {
				listDirectories.add(element);
			} else {
				listFiles.add(element);
			}
		}
		System.out.println(" Contenido de la carpeta " + filePathname.getAbsolutePath() + "\n");
		for (File element : listDirectories) {
			String name = element.getName();
			System.out.print("<DIR>\t");
			System.out.println(name);
		}
		for (File element : listFiles) {
			String name = element.getName();
			System.out.print("\t");
			System.out.println(name);
		}
		System.out.println("\t\tHay " + listFiles.size() + " archivos");
		System.out.println("\t\tHay " + listDirectories.size() + " carpetas");
	}

	public static void main(String[] args) {
		
		dir();
		fechaModificado();

	}
}