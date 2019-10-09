import java.io.File;

public class Ejercicio1 {
	
	public static void mostrarArchivos(){
		
		File carpeta = new File("C:\\Users\\josea");
		String[] listado = carpeta.list();
		
		 for (int i=0; i< listado.length; i++) {
		 System.out.println(listado[i]);
		 }
		}
	
	public static void main(String[] args) {
		
		mostrarArchivos();

	}

	
}
