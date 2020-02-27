
package funcoes;


public class Funcoes {
    public  void imprimir(String texto1, String texto2){
    System.out.println(texto1);
    System.out.println(texto2);
    }
    public  int multiplicar(int [] array){
    int resultado = 1;
    for(int i : array){
         resultado *= i;
         
     }
     
        return resultado;
    }
}
