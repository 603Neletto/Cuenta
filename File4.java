import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Realiza un programa que lea un fichero "texto.txt" línea a línea con BufferedReader y
//cuente cuántas líneas contiene, mostrando el resultado en consola. Utiliza manejo de
//excepciones y cierre seguro del buffer.

public class File4{
    public static void main (String [] args){
        try 
          (BufferedReader reader= new BufferedReader(new FileReader ("Texto.txt"))){
            String linea;
            int cuentoLinea= 0;
            while ((linea = reader.readLine()) != null) {
                cuentoLinea++;
            }
            System.out.println("El archivo contiene " + cuentoLinea+ " lineas.");
          
               } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

