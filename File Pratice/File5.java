import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Desarrolla un programa que lea el contenido de "origen.txt" (FileReader) y lo copie en
//destino.txt" (FileWriter). Incluye gestión de excepciones y asegura el cierre de ambos
//flujos

public class File5 {
    public static void main(String[] args) {
        try (BufferedReader Reader = new BufferedReader(new FileReader("Origen.txt")))){
            (BufferedWriter Writer = new BufferedWriter(new FileWriter("Destino.txt")));
             
            
            
            
        } catch (Exception e) {
              System.out.println("An error occurred: " + e.getMessage());
            // TODO: handle exception
        }

    }
}