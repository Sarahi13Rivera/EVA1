/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_sobrecarga;

/**
 *
 * @author HP1000
 */
public class EVA1_18_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        Prueba obj = new Prueba ();
        System.out.println(obj);
        System.out.println(100);
        System.out.println("Area de un rectangulo 15 x 20 " + calcularArea(15, 20));
        System.out.println("Area de un rectangulo 15 x 20 " + calcularArea(15.0, 20.0, 1));
        System.out.println("Area de un circulo 100 " + calcularArea(100));
        System.out.println("Area de un circulo 100 " + calcularArea(100.0));
    }
    //CALCULAR AREA DEL Reacrangulo
    public static double calcularArea(double largo, double ancho){
        return largo * ancho;
    }
    
    //CALCULAR AREA DEL TRIANGULO
    public static double calcularArea(double base, double altura, int esTriangulo){
        return (base * altura) / 2;
    }
    //CALCULAR AREA DEL TRIANGULO
    public static double calcularArea( int esTriangulo, double base, double altura){
        return (base * altura) / 2;
    }
    //CALCULAR AREA DE UN CIRCULO
    public static double calcularArea (double radio){
        return Math.PI * Math.pow(radio, 2);
    }
     //CALCULAR AREA DE UN CIRCULO con Enteros
    public static double calcularArea (int radio){
        System.out.println("Entero");
        return Math.PI * Math.pow(radio, 2);
    }
}
class Prueba{
    
}