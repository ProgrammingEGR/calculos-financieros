/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActualizacionSimple;

/**
 *
 * @author elena
 */
import java.util.Scanner;

public class ActualizacionSimpleNominal {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca el importe efectivo: ");
        double efectivo = Double.parseDouble(teclado.nextLine());
        
        System.out.print("Introduzca el tiempo (en días): ");
        double tiempo = Double.parseDouble(teclado.nextLine())/360;
        
        System.out.print("Introduzca la tasa de interés (en decimales): ");
        double interes = Double.parseDouble(teclado.nextLine());
        
        double nominal = efectivo/(1-(interes*tiempo));
        
        System.out.println("Importe Efectivo: " + efectivo + " euros.");
        System.out.println("Tiempo: " + tiempo + " días.");
        System.out.println("Tasa de interés: " + interes);
        System.out.println("Importe nominal: " + nominal + " euros.");
        
        teclado.close();
    }
}
