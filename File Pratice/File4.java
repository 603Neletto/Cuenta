import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import javax.xml.stream.FactoryConfigurationError;
//Realiza un programa que lea un fichero "texto.txt" línea a línea con BufferedReader y
//cuente cuántas líneas contiene, mostrando el resultado en consola. Utiliza manejo de
//excepciones y cierre seguro del buffer.

public class File4{
    public static void main (String [] args){
        try 
          (BufferedReader reader= new BuffereReader(new FileReader ("texto.txt"))){
            

               } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

