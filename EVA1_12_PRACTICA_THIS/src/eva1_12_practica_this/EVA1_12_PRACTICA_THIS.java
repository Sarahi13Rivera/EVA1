/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_practica_this;

/**
 *
 * @author HP1000
 */
public class EVA1_12_PRACTICA_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class Automovil{
private String modelo;
private String marca;
private int año;
private double precio;

public String getModelo(){
return modelo;
}
public void setModelo(String modelo){
    this.modelo=modelo;
}
public String getMarca(){
return marca;
}
public void setMarcao(String marca){
    this.marca=marca;
}
public int getAño(){
return año;
}
public void setAño(int año){
    this.año = año;
}
 public double getPrecio(){
return precio;
}
public void setPrecio(double precio){
    this.precio = precio;
}
}