/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_clase_persona;

/**
 *
 * @author HP1000
 */
public class EVA_2_CLASE_PERSONA {//DECLARACION

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//DECLARACION
        // TODO code application logic here
        //IMPLEMENTACION {}
        System.out.println("Hola Mundo");
    //COMO CREAR UN OBJETO EN JAVA.
    //INSTANCIA: CREAR UN OBJETO
    //DAR MEMORIA --> new
    //declarar     //construir
    Persona estudiante = new Persona ();// DECLARO UN IDENTIFICADOR (OBJETO) TIPO PERSONA
   estudiante.id= "00112233";
   estudiante.nombre ="Sarahi Rivera Castillo";
   estudiante.edad=19;
   estudiante.imprimirDatos();
   estudiante.calcularAñoNacimiento();
   
   Persona estudiante2= new Persona ();
   estudiante2.nombre= "Sarahi ";
   estudiante2.id="21550867";
   estudiante2.edad=19;
    estudiante2.imprimirDatos();
    estudiante2.calcularAñoNacimiento();
    
     Persona estudiante3= new Persona ();
   estudiante3.nombre= "Rubi";
   estudiante3.id="7777";
   estudiante3.edad=19;
    estudiante3.imprimirDatos();
    estudiante3.calcularAñoNacimiento();
     
    }
    
}
//UNA CLASE ES UN TIPO DE DATO ABSTRACTO
 class Persona//DECLARACION
 {//IMPLEMENTACION 
     //ATRIBUTOS DE LA CLASE
     String id;
     String nombre;
     int edad;
     //COMPORTAMIENTO
     //metodo imprimir datos -->datos --> metodo/funcion
     //valor de retorno + nombre de la funcion (argumenttos);
     void imprimirDatos(){//no regresa el valor,el nombre es imprimirDatos (no resibe valores)
         System.out.println("El nombre es:" + nombre);  
        System.out.println("El id es:" + id);    
       System.out.println("La edad  es:" + edad);    
     }
    int calcularAñoNacimiento(){
int añoNac = 2022 -edad;
    return añoNac;
    }
}