import java.io.FileReader;
import java.io.IOException;
//Crea un programa que lea el fichero "frases.txt" usando FileReader y muestre su contenido por consola.
public class File2 {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("frases.txt");
            int frase = reader.read();

            while (frase != -1){
                System.out.print((char) frase);
                frase = reader.read();
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
