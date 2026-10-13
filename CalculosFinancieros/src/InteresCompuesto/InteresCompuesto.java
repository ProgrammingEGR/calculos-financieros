/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InteresCompuesto;

/**
 *
 * @author elena
 */
import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca el Capital Inicial: ");
        double capitalInicial = Double.parseDouble(teclado.nextLine());
        
        System.out.print("Introduzca el tiempo (en años): ");
        double tiempo = Double.parseDouble(teclado.nextLine());
        
        System.out.print("Introduzca la tasa de interés (en decimales): ");
        double interes = Double.parseDouble(teclado.nextLine());
        
        double capitalFinal = capitalInicial*Math.pow(1 + interes, tiempo);
        
        System.out.println("Capital Inicial: " + capitalInicial + " euros");
        System.out.println("Tiempo: " + tiempo);
        System.out.println("Interés: " + interes);
        System.out.println("Capital Final: " + capitalFinal + " euros.");
        
        teclado.close();
    }
}
