
package revisaojava.revisaojava.newpackage;

/**
 *
 * @author leonardo.souza1
 */
public class RevisaoJava {

    public static void main(String[] args) {
      imprimir("ola mundo 1");
      imprimir("ola mundo 2");
      imprimir("ola mundo 3");
      
      int x = 2;
      int y = 3;
      double z = somar (x, y, y);
        imprimir("soma = " + z);
      
    }
    
    private static double somar(int x, int y, int z){
        
        return x+y+z;
        
    }
    private static void imprimir(String texto){
        System.out.println(texto);
    }
}
