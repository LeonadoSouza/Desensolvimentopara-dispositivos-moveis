
package revisaojava.revisaojava.newpackage;

/**
 *Crie um metodo que some N números inteiros e apresente o resultado da soma entre eles
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        //criando um array cpom varios numeros que retorna o resutado
        int[] array = {1,2,3,4,5,6,7,8,9};
        int resultado = soma(array);
        System.out.println("soma: " + resultado);
    }
    private static int soma(int [] numeros){
     int resultado = 0;
     for(int i = 0; i< numeros.length; i++){
         resultado += numeros[i];
         
     }
         for(int i : numeros){
         resultado += i;
         
     }
        return resultado;
    }
    
}
