/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VEHICULOS_SIN_MOTOR;

import eva1_13_access_modifiers.Coche;

/**
 *
 * @author HP1000
 */
public class Bicicleta {
    private int rodada;
    private String marca;
    private double precio;
    
 public int getRodada(){
         Coche micarro = new Coche();
        //micarro. no puedo usar un metodo default imprimirMensaje();
        //Carreta micarreta = new Carreta(); NO PODEMOS VER ESTA CLASE, ES DEFAULT, ESTA EN OTRO PAQUETE

return rodada;
}
public void setRodada(int rodad){
    this.rodada = rodada;
}
public String getMarca(){
return marca;
}
public void setMarca(String marca){
    this.marca = marca;
}
public double getPrecio(){
return precio;
}
public void setPrecio(double precio){
    this.precio = precio;
}
}