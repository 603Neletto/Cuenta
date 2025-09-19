import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Introduce la ruta que desea buscar");
        String Deseo = scanner.nextLine();
        
       File Directory = new File(Deseo);

        if(Directory.exists()){
            System.out.println("El fichero existe compa");
        }else{
            System.out.println("Acuestate no hay nada de esos directorio aqui");
        }
    }
}

       