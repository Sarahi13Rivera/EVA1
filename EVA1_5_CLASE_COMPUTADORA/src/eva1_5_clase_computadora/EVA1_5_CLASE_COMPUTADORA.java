/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_clase_computadora;

/**
 *
 * @author HP1000
 */
public class EVA1_5_CLASE_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora com1 = new Computadora();
        com1.setProcesador("Intel");
        com1.setModelo("HP Desktop");
        com1.setGrafica("NVIDIA 1050ti");
        com1.setWindows(10);
        com1.setPrecio(13000.00);
        com1.setRam(12);
        System.out.println("Procesador: " + com1.getProcesador());
        System.out.println("Modelo: " + com1.getModelo());
        System.out.println("Grafica: " + com1.getGrafica());
        System.out.println("Windows: " + com1.getWindows());
        System.out.println("Precio:" + com1.getPrecio());
        System.out.println("Ram: " + com1.getRam() );
    }
    
}
class Computadora{
  private String procesador;
  private String modelo;
  private String grafica;
  private int windows;
  private double precio;
  private int ram;
  
  public void setProcesador(String valor){
      procesador = valor;
  }
  public String getProcesador(){
      return procesador;
  }
  public void setModelo(String valor){
      modelo = valor;
  }
  public String getModelo(){
      return modelo;
  }
  public void setGrafica(String valor){
      grafica = valor;
  }
  public String getGrafica(){
      return grafica;
  }
  public void setWindows(int valor){
      windows = valor;
  }
  public int getWindows(){
      return windows;
  }
  public void setPrecio(double valor){
      precio = valor;
  }
  public double getPrecio(){
      return precio;
  }
   public void setRam(int valor){
      ram = valor;
  }
  public int getRam(){
      return ram;
  }
}