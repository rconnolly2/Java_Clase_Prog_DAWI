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

    public static int actividad4(int horas, int minutos, int segundos) {
        int seg  = segundos + minutos*60 + ((horas*60)*60);
        return seg;
    }

    public static int actividad5(int hora1, int minutos1, int hora2, int minutos2) {
        int diferencia = (hora1*60)-(hora2*60) + (minutos1-minutos2);
        if (diferencia<0) {
            diferencia = diferencia*-1; // si es negativo lo convierto en positivo
        }

        return diferencia;
    }

    public static void actividad6(int val_min, int val_max, int ctd_n) {
        for (int i=1; i<=ctd_n; i++) {
            int n_rand = (int) (Math.random() * (val_max - val_min)) + val_min;
            System.out.println("Numero aleatorio " + i + " : " + n_rand);
        }
    }

    public static void actividad6(int ctd_n) {
        for (int i=1; i<=ctd_n; i++) {
            int n_rand = (int) (Math.random() * (10 - 1)) + 1;
            System.out.println("Numero aleatorio " + i + " : " + n_rand);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la cantidad de números aleatorios que quieres: ");
        actividad6(sc.nextInt());
      
        System.exit(0); // fin del programa
    }
        
       
    
}


