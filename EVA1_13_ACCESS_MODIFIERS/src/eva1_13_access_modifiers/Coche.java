/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_access_modifiers;

/**
 *
 * @author HP1000
 */
public class Coche {
private String modelo;
private String marca;
private int año;

public String getModelo(){
return modelo;
}
public void setModelo(String modelo){
    this.modelo=modelo;
}
public String getMarca(){
return marca;
}
public void setMarca(String marca){
    this.marca=marca;
}
public int getAño(){
return año;
}
public void setAño(int año){
    this.año = año;
}
void imprimirMensaje(){//METODO CON MODIFICADOR default
    System.out.println("Hola Mundo");
}
}
class Carreta{//Modificador de acceso -->default
    private String marca;
            public String getMarca(){
return marca;
}
public void setMarca(String marca){
    this.marca=marca;
}

}