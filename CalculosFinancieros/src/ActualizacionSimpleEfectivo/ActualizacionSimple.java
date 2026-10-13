/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActualizacionSimpleEfectivo;

/**
 *
 * @author elena
 */
import java.util.Scanner;

public class ActualizacionSimple {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca el importe nominal: ");
        double nominal = Double.parseDouble(teclado.nextLine());
        
        System.out.print("Introduzca el tiempo (en días): ");
        double tiempo = Double.parseDouble(teclado.nextLine())/360;
        
        System.out.print("Introduzca la tasa de interés: ");
        double interes = Double.parseDouble(teclado.nextLine());
        
        double efectivo = nominal*(1-tiempo*interes);
        
        System.out.println("Importe nominal: " + nominal + " euros.");
        System.out.println("Tiempo: " + tiempo + " días.");
        System.out.println("Interés: " + interes);
        System.out.println("Importe efectivo: " + efectivo);
        
        teclado.close();
    }
}
