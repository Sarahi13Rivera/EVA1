/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_clase_auto;

/**
 *
 * @author HP1000
 */
public class EVA1_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miAuto = new Automovil();
        miAuto.setMarca("Chevrolet");
        miAuto.setModelo("Impala");
        miAuto.setTipo("Muscle car");
        miAuto.setAño(1964);
        miAuto.setColor("Azul");
        miAuto.setPrecio(1000000);
        System.out.println("Marca: " + miAuto.getMarca());
        System.out.println("Modelo: " + miAuto.getModelo());
        System.out.println("Año: " + miAuto.getAño());
    }
}
    class Automovil{
        //ATRIBUTOS PRIVADOS
        private String marca;
        private String modelo;
        private String tipo;
        private int año;
        private String color;
        private double precio;
        //COMPORTAMIENTO
        //METODOS SET/GET
        public void setMarca(String valor){
        marca = valor;   
        }
        public String getMarca (){
            return marca;
        }
         public void setModelo(String valor){
        modelo = valor;   
        }
        public String getModelo (){
            return modelo;
        } 
         public void setTipo(String valor){
        tipo = valor;   
        }
        public String getTipo (){
            return tipo;
        } 
         public void setAño(int valor){
         año = valor;   
        } 
         public int getAño (){
            return año; 
    }
         public void setColor(String valor){
        color = valor;   
        } 
         public String getColor (){
            return color; 
    }
         public void setPrecio (double valor){
         precio = valor;    
         }
         
    }
