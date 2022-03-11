/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_copia_objetos;

/**
 *
 * @author HP1000
 */
public class EVA1_10_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Prueba p = new Prueba();
        System.out.println("Direccion " + p);
        p.x=100;
        System.out.println("Valor de x = " + p.x);
        //PRUEBA RESPALDO = obj1
        Prueba respaldo = p;
        respaldo.x = p.x;
        System.out.println("Valor de x en respaldo = " + respaldo.x );
        //modifico el respaldo 
        respaldo.x = 0;
        System.out.println("Valor de x = " + p.x);
        System.out.println("Valor de x en respaldo = " + respaldo.x );
        //IMPRIMIR DIRECCIONES DE MEMORIA
        System.out.println("Objeto1 = " + p);
        System.out.println("Respaldo = " + respaldo);
        if(p == respaldo){
            System.out.println("SON EL MISMO OBJETO");
        }
        else{
            System.out.println("SON OBJETOS DIFERENTES");
        }
    }
    
}
class Prueba{
    public int x;
}