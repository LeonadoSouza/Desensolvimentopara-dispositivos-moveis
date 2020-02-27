/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaojava.revisaojava.newpackage;

import funcoes.Conta;

/*declar~ção de variavel
ti´po nome = atribuir um valor
*/
public class Exercicio3 {
    
    public static void main(String [] args){
       
    Conta objConta1 = new Conta();
    Conta objConta2 = new Conta();
    System.out.println("\nANTES\n");
    objConta1.agencia = 123;
    objConta1.conta = 444;
    objConta1.nome = "Cain";
    objConta1.saldo = 200.99;
    objConta1.cheque_especial = 500;
    
    objConta1.imprimir();
        
    
    objConta2.agencia = 123;
    objConta2.conta = 444;
    objConta2.nome = "Abel";
    objConta2.saldo = 980.65;
    objConta2.cheque_especial = 500;
    
    objConta2.imprimir();
    
    /*tranferencia de valor entre contas
    conta origem para a conta destino
    */
    // a conta de origem fica sendo a conta em si
    double valorTransf = 500.80;
    objConta1.tranferirValor(objConta2, valorTransf);
    
    System.out.println("\nDEPOIS\n");
    objConta1.imprimir();
    objConta2.imprimir();
    
   
    
    }
    
    
    
    
}
