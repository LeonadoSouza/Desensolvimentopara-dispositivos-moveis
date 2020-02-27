
package revisaojava.revisaojava.newpackage;
import funcoes.*;
//LEMBRETE:
//- nome de variavel sempre minusculo
//- nome de classe primeira letra maiusculo
//- nome de variavel sempre minusculo
//- nunca utilizar espaço
//- nunca utilizar caracteres especiais e acentuação na declaração de variavel, classe, etc
//- nome do metodo semrpe minusculo e se tiver 2 nomes escrever tudo junto e a primeira letra da segunda palavra em maiunculo
public class Exercicio2 {


    public static void main(String[] args) {
        String t1 = "texto 1";
        String t2 = "texto 2";
        
        //instanciar um objeto da classe funçoes para poder utilizar os metodos inerente
        
        Funcoes objFunc = new Funcoes();
        objFunc.imprimir(t1, t2);
        
        int[] numero = {1,2,3,4,};
        objFunc.multiplicar(numero);
        
    }

}

     //criando um array cpom varios numeros que retorna o resu  
   
    
//para chamar a classe static 
//Funcoes.imprimir(t1, t2);