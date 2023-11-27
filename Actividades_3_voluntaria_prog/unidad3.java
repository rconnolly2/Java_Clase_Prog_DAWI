/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Robert
 */
public class unidad3 {

    /**
     * @param args the command line arguments
     */
    public static void actividad1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la hora necesito horas, minutos y segundos");
        System.out.println("Introdueix les hores:");
        int horas = sc.nextInt();
        System.out.println("Introdueix els minuts:");
        int minutos = sc.nextInt();
        System.out.println("Introdueix els segons:");
        int segundos = sc.nextInt();
        System.out.println("Segons a incrementar:");
        int seg_incrementar = sc.nextInt();
        if (segundos < 0 || segundos > 60 || minutos < 0 || minutos > 60 || horas < 0 || horas > 23) {
            System.out.println("La hora que me as dado no es valido!");
        } else {
            for (int i=1;i<=seg_incrementar;i++) {
            segundos+=1; // incremento un segundo

            if (segundos==60) {
                segundos=0;
                minutos+=1;

                if (minutos==60) {
                    minutos = 0;
                    horas+=1;

                    if(horas==24) {
                        horas = 0;
                        System.out.println("Nuevo dia!"); // si horas es mayor que 23 es un nuevo dia
                        }
                    }
                }
            }
            // imprimo resultado:
            System.out.println("Resultat: " + horas + " horas, " + minutos + " minuts i " + segundos + " segons");
        }

        

    }

    public static void actividad2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero y te dire si del 1 a tu numero si es primo");
        int num = sc.nextInt();
        int ctd_prim = 0;

        for (int iter=1;iter<=num;iter++) {
            boolean n_primo = true;
            System.out.println(iter);

            if (iter<=1) {
                n_primo = false;
            }


            for (int j=2;j<iter;j++) {
                if (iter%j==0) {
                    n_primo = false;
                }
            }

            if (n_primo==true) {
                ctd_prim++;
            }
        }

        System.out.println("Entre 1 i " + num + " hi ha " + ctd_prim + " nombres primers.");
    }
    
    public static void actividad3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 2 números y te dare el mcd:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n_min = (n1<n2) ? n1 : n2;
        int mcd = 0;
        
        for (int i = n_min; i>=1; i--) {
            if (n1%i==0 && n2%i==0) {
                mcd = i;
                break; // si encuentro un divisor máximo (de arriba a abajo) entre los dos num salgo del bucle bucle
            }
        }

        System.out.println("El mcd entre los 2 números es: " + mcd);
    }

    public static void actividad4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 2 números y te dare el mcm:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n_min = (n1<n2) ? n1 : n2;
        int mcd = 0;
        
        for (int i = n_min; i>=1; i--) {
            if (n1%i==0 && n2%i==0) {
                mcd = i;
                break; // si encuentro un divisor máximo (de arriba a abajo) entre los dos num salgo del bucle bucle
            }
        }

        int mcm = n1*n2/mcd; // https://ca.wikipedia.org/wiki/M%C3%ADnim_com%C3%BA_m%C3%BAltiple

        System.out.println("El mcm entre los 2 números es: " + mcm);
    }

    public static void actividad5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero y te dare la raíz cuadrada:");
        int n = sc.nextInt();
        int raíz = 0;

        for (int i=1;i<=n;i++) {

            if (i*i>n) {
                break; // nos pasamos
            }

            raíz = i;
        }

        System.out.println("La raíz cuadrada es: " + raíz);
    }

    public static void actividad6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero decimal y te dare el numero en binario: ");
        int dividendo = sc.nextInt();

        System.out.print("El numero binario AL REVÉS: ");
        while (true) {

            if (dividendo%2 != 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }

            if (dividendo == 0 || dividendo == 1) {
                break;
            }

            dividendo = dividendo/2;
        }
    }
    
    public static void main(String[] args) {
        actividad6();
      
        System.exit(0); // fin del programa
    }
        
       
    
}


