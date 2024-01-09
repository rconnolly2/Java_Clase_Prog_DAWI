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
        for (int i=0;i<=5;i++) {
            System.out.println(i);
        }
    }

    public static void ej10repaso(int numero) {
        for (int i = 1; i<=(numero); i++) {
            if (numero%i == 0) {
                System.out.println("El divisor exacto de " + numero + " es: " + i);
            }
            
        }
    }

    public static void ej13repaso(int n1, int n2) {
        for (int i = n1; i<=n2; i++) {
            if (i%2==0) {
                System.out.println(i + " ES PAR");
            }
        }
    }

    public static void ej9repaso(int altura_triangulo) {
        for (int i = 1; i<=altura_triangulo; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = altura_triangulo-1; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ej13repaso(sc.nextInt(), sc.nextInt());
        ej9repaso(sc.nextInt());
        System.exit(0); // fin del programa
    }
        
       
    
}


