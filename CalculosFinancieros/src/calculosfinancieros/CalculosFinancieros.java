/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculosfinancieros;

/**
 *
 * @author elena
 */
import java.util.Scanner;

public class CalculosFinancieros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        
        do{
            System.vprintln("\n==MENU PRINCIPAL===");
            System.out.println("1. Interés Simple");
            System.out.println("2. Interés Compuesto");
            System.out.println("3. Cálculo de Efectivo");
            System.out.println("4. Cálculo de Nominal");
            System.out.println("5. Cálculo de Descuento Comercial");
            System.out.println("6. Cálculo del Forfait");
            System.out.println("7. Cálculo de la TASC");
            System.out.println("8. Importe Líquido");
            System.out.print("Escoge una opción: ");
            
            if (Scanner.hasNextInt()){
                opcion = Scanner.nextInt();
                
                switch (opcion){
                    case 1:
                        System.out.println("Has elegido Interés simple.");
                        break;
                    case 2:
                        System.out.println("Has elegido Interés compuesto");
                        break;
                    case 3:
                        System.out.println("Has elegido Cálculo de Efectivo");
                        break;
                    case 4:
                        System.out.println("Has elegido Cálculo de Nominal");
                        break;
                    case 5:
                        System.out.println("Hs elegido Cálculo de Descuento Comercial");
                        break;
                    case 6:
                        System.out.println("Has elegido Cálculo del Forfait");
                        break;
                    case 7:
                        System.out.println("Has elegido Cálculo de la TASC");
                    case 8:
                        System.out.println("Has elegido Cálculo del Importe Líquido");
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            }else{
                System.out.println("Por favor, introduzca un número válido.");
                Scanner.next();
            }
        }while (opcion !=8);
        
        Scanner.close();
    }
    
}
