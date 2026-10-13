/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImporteLiquido;

/**
 *
 * @author elena
 */
import java.util.Scanner;
public class ImporteLiquido {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca el importe del Valor Nominal: ");
        double nominal = Double.parseDouble(teclado.nextLine());
        
        System.out.print("Introduzca el tiempo (en días): ");
        double tiempo = Double.parseDouble(teclado.nextLine())/360;
        
        System.out.print("Introduzca la tasa de interés (en decimales): ");
        double porcentajeDescuento = Double.parseDouble(teclado.nextLine());
        
        double descuento = nominal*tiempo*porcentajeDescuento;
        
        System.out.print("Introduzca el porcentaje de la comisión (en decimales): ");
        double comision = Double.parseDouble(teclado.nextLine());
        
        System.out.print("Introduzca el importe de todos los gastos añadidos: ");
        double gastos = Double.parseDouble(teclado.nextLine());
        
        double importeLiquido = nominal-descuento-comision-gastos;
        
        System.out.println("Valor Nominal: " + nominal + " euros.");
        System.out.println("Descuento: " + descuento + " euros.");
        System.out.println("Comision: " + comision);
        System.out.println("Gastos: " + gastos + " euros.");
        System.out.println("Importe Líquido: " + importeLiquido + " euros.");
        
        teclado.close();
    }
}
