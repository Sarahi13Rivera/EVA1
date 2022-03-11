/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_constructores;

/**
 *
 * @author HP1000
 */
public class EVA1_17_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
       System.out.println("Nombre: "+ persona.getNombre());
       System.out.println("Edad: "+ persona.getEdad());
       
        Persona persona2 = new Persona();
       System.out.println("Nombre2: "+ persona2.getNombre());
       System.out.println("Edad2: "+ persona2.getEdad());    
       
       Persona persona3 = new Persona("Sarahi", 19 );
       System.out.println("Nombre3: "+ persona3.getNombre());
       System.out.println("Edad3: "+ persona3.getEdad());  
       
       Persona persona4 = new Persona(0.24 );
       System.out.println("Nombre4: "+ persona4.getNombre());
       System.out.println("Edad4: "+ persona4.getEdad());  
    }
    
}
class Persona{
    private String nombre;
    private int edad;
    
    //CONSTRUCTOR DEFAUL <-- 
    //INICIALIZAR VALORES
    public Persona(){
        System.out.println("CREANDO EL OBJETO");
        nombre ="Sarahi Rivera";
        edad = 19;
    
}
    //SOBRECARGA DE METODOS
    public Persona(String nombre, int edad){
        System.out.println("CREANDO EL OBJETO CON CONSTRUCTOR QUE ACEPTA VALORES");
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(double valor){
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
      public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }        
}