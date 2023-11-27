/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Robert
 */
public class actividades2 {

    /**
     * @param args the command line arguments
     */
    public static void U2_Actividad_2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero y te dare el valor absoluto de ese numero: ");
        int n = sc.nextInt();
        int valor_abs = (n>=0) ? n : -n;
        System.out.println("El valor absoluto es: " + valor_abs);
    }

    public static void U2_Actividad_3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame la cantidad de animales que tienes, los kg de comida y kg de comida por animal: ");
        int cant_animales = sc.nextInt();
        float kg_comida = sc.nextFloat();
        float comida_animal_ud = sc.nextFloat();
        float comida_animal_necesaria = cant_animales*comida_animal_ud;

        if (kg_comida>=comida_animal_necesaria) {
            System.out.println("¡Hay suficiente comida!");
        } else {
            System.out.println("¡No hay suficiente comida!");
            System.out.println("Tendrás que dar a cada animal: " + (kg_comida/cant_animales) + "kg");
        }
        
    }

    public static void U2_Actividad_4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame los 8 números de tu DNI y adivinare tu letra: ");
        int n_dni = sc.nextInt();
        int index_letra = n_dni%23;

        switch (index_letra) {
            case 0 -> System.out.println("T");
            case 1 -> System.out.println("R");
            case 2 -> System.out.println("W");
            case 3 -> System.out.println("A");
            case 4 -> System.out.println("G");
            case 5 -> System.out.println("M");
            case 6 -> System.out.println("Y");
            case 7 -> System.out.println("F");
            case 8 -> System.out.println("P");
            case 9 -> System.out.println("D");
            case 10 -> System.out.println("X");
            case 11 -> System.out.println("B");
            case 12 -> System.out.println("N");
            case 13 -> System.out.println("J");
            case 14 -> System.out.println("Z");
            case 15 -> System.out.println("S");
            case 16 -> System.out.println("Q");
            case 17 -> System.out.println("V");
            case 18 -> System.out.println("H");
            case 19 -> System.out.println("L");
            case 20 -> System.out.println("C");
            case 21 -> System.out.println("K");
            case 22 -> System.out.println("E");
                
        }


    }

    public static void U2_Actividad_5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero y te dire si es capicúa: ");
        int num = sc.nextInt();
        int len_num = 0;

        if (num==0) {
            System.out.print("Es capicúa");
        } else {
             // credit: https://stackoverflow.com/a/10952773 :)
            len_num = (int) Math.log10(num);
            len_num++;

            int ultimo_num = num%10;
            int num_invertido = 

        }



        System.out.print(len_num);

    }
    
    public static void main(String[] args) {
        U2_Actividad_5();

        System.exit(0); // fin del programa
    }
        
       
    
}


