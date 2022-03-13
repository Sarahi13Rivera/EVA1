/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author HP1000
 */
public class EVA1_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca los grados centigrados");
        double celsius = sc.nextDouble();
        double fahrenheit =Formulas.convertirCelaFar(celsius);
        double kelvin = Formulas.convertirCelaKel(celsius);
        System.out.println(celsius + "C, " + fahrenheit + "F, " + kelvin + "K ");
        System.out.println(fahrenheit + " F, " + kelvin + "K ");
        System.out.println(kelvin + "K" + fahrenheit + " F ");
    }
    
}
class Formulas{
    public static double convertirCelaFar(double celsius){
        return celsius *1.8 +32.0;
    }
    public static double convertitFaraCel(double fahrenheit){
        return (fahrenheit - 32.0) /1.8;
    }
    public static double convertirFaraKel(double fahrenheit){
     return 5.9 * (fahrenheit - 32.0) + 273.15;   
    }
    public static double convertirCelaKel(double celsius){
       return celsius + 273.15; 
    }
    public static double convertirKelaCel(double kelvin){
        return kelvin - 273.15;
    }
    public static double convertitKelaFar(double kelvin){
        return 1.8 * (kelvin - 273.15) + 32.0;
    }
}