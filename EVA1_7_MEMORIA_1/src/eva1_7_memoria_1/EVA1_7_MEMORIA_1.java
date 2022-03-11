//
package eva1_7_memoria_1;

/**
 *
 * @author HP1000
 */
public class EVA1_7_MEMORIA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor =5;
        String cade ="Hola";
        Prueba obj = new Prueba();
        
        System.out.println("Valor =" + valor);
         System.out.println("Cadena  =" + cade);
          System.out.println("Objeto =" + obj);
    }
}
    class Prueba{
        public void saludar(){
            System.out.println("Hola Mundo !!");
        }
    }

