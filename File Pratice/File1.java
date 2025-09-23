import java.io.FileWriter;
import java.io.IOException;
//Crea un programa que escriba los 100 primeros números naturales (uno por línea) en 
//un fichero llamado "numeros.txt" usando FileWriter. Aplica manejo de excepciones y
//asegúrate de cerrar el flujo correctamente

public class File1 {
    public static void main(String[] args) {

        try {
            FileWriter Writer = new FileWriter ("Numeros.txt");
            for (int i = 1; i <= 100; i++) {
                Writer.write(i + "\n");
            }
            Writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}