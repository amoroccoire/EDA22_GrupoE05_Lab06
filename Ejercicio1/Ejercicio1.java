import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String arga[]){
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> tabla = new HashMap<String, ArrayList<String>>();
        System.out.println("Para salir escriba: 0");
        While(true) {
            System.out.print("Sitio Web");
            String direccion = sc.next();
            if (direccion.equals("0"))
                break;
            System.out.print("IP: ");
            String ip = sc.next();
        }
    }
}
