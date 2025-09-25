import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//Haz un programa que solicite al usuario escribir cinco frases y guarde cada una en
//una línea de "frases_usuario.txt" usando BufferedWriter. Maneja excepciones y cierra
//correctamente el flujo


public class File3 {
    public static void main(String[] args) {
        
        try 
        (BufferedWriter writer = new BufferedWriter(new FileWriter ("frases_usuarios.txt"))){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escribe cinco frases:");
             String frase = scanner.nextLine();
             
            for (int i = 0; i < 5; i++) {
                writer.write(frase + "\n");
                
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

