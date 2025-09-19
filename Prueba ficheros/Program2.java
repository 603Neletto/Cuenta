import java.io.File;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del fichero");
        String fichero = scanner.nextLine();

        System.out.println("Introduce ruta del directorio que necesitas:");
        String rutaDirectorio = scanner.nextLine();

        File file = new File(rutaDirectorio, fichero);
        
        if (file.exists()) {
            System.out.println("Sí existe el fichero: " + file.getAbsolutePath());
        } else {
            System.out.println("No existe ningún fichero con ese nombre");
        }
        scanner.close();
    }
}