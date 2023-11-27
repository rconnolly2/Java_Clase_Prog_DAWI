/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Robert
 */
public class unidad4 {

    /**
     * @param args the command line arguments
     */
    public static void actividad1(int radio) {
        System.out.println("La superficie es: " + (4*Math.PI*(Math.pow(radio, 2))));
        System.out.println("Y el volumen es: " + ((4*Math.PI)/3)*(Math.pow(radio, 3)));
    }

    public static double actividad2(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2)); // return distancia
    }

    public static void actividad3(int n) {
        for (int i=0; i<=n; i++) {
            if (i%2==0) {
                System.out.println(i + " Es par");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero y te dire sus números pares: ");
        actividad3(sc.nextInt());
      
        System.exit(0); // fin del programa
    }
        
       
    
}


