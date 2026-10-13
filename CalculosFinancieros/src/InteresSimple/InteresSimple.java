/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InteresSimple;

/**
 *
 * @author elena
 */
import java.util.Scanner;

public class InteresSimple {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca la cifra del Capital Inicial: ");
        double capitalInicial = Double.parseDouble(teclado.nextLine());
        
        System.out.print("Introduzca el tiempo (en años): ");
        int tiempo = Integer.parseInt(teclado.nextLine());
        
        System.out.print("Introduzca la tasa de interés (en decimales): ");
        double interes = Double.parseDouble(teclado.nextLine());
        
        double capitalFinal = capitalInicial*(1 + tiempo*interes);
        
        System.out.println("Capital inicial: " + capitalInicial + " euros.");
        System.out.println("Tiempo: " + tiempo + "años");
        System.out.println("Interés: " + interes);
        System.out.println("Capital Final: " + capitalFinal + " euros.");
        
        teclado.close();
    }
}
