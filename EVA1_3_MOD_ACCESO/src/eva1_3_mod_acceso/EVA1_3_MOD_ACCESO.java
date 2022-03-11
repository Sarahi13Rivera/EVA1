/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_mod_acceso;

/**
 *
 * @author HP1000
 */
public class EVA1_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona(); // instanciar un objeto
        per1.setId("21550867");
        per1.setNombre("Sarahi");
        per1.setEdad(19);
        System.out.println("Nombre:" + per1.getNombre());
        
        Persona per2 = new Persona();
        per2.setId("112233");
        per2.setNombre("Karen");
        per2.setEdad(18);
        System.out.println(per2.getNombre() + " , " + per2.getId());
    }
    
}
class Persona{
    //ATRIBUTOS
    private  String id;
    private String nombre;
    private int edad;
    //COMPORTAMIENTOS (METODOS)
    //PARA LEER Y MODIFICAR LOS ATRIBUTOS, USANDO METODOS DE LECTURA/ ESCRITURA
    //ASIGNAR-->SET
    //LEER --> GET
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
        
    }
      //ASIGNAR-->SET
    public void setId( String valor){
    id=valor;    
    }
     public void setNombre( String valor){
    nombre=valor;    
    }
    public void setEdad( int valor){
    edad=valor;    
    }
}