/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DescuencoComercial;

/**
 *
 * @author elena
 */
import java.util.Scanner;

public class DescuentoComercial {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el importe nominal: ");
        double nominal = Double.parseDouble(teclado.nextLine());
        
        System.out.println("Introduce el tiempo (en días): ");
        double tiempo = Double.parseDouble(teclado.nextLine())/360;
        
        System.out.println("Introduce la tasa de interés (en decimales): ");
        double interes = Double.parseDouble(teclado.nextLine());
        
        double descuento = nominal*tiempo*interes;
        
        System.out.println("Importe Nominal: " + nominal + " euros.");
        System.out.println("Tiempo: " + tiempo + " días.");
        System.out.println("Interés: " + interes);
        System.out.println("Descuento: " + descuento + " euros.");
        
        teclado.close();
    }
}
