
package funcoes;

public class Conta {
    
    public int agencia;
    public int conta;
    public String nome;
    public double saldo;
    public double cheque_especial;
    
    public void imprimir(){
    System.out.println("Conta: " + conta + "\nSaldo: " + saldo + "\nNome: " + nome + "\nAgência: " + agencia + "\nCheque Especial: " + cheque_especial + "\n-----------------" );
    }
    //tranferir o valor de uma conta para outra
    public void tranferirValor(Conta contaDestino,double valorTranf) {
        if(this.saldo >= valorTranf){
            //passar valor transferencia da conta origem para a conta destino
            this.saldo -= valorTranf; // tira o saldo da conta origem
            //encrementar o saldo da conta de destino
            contaDestino.saldo += valorTranf; 
        } else {
            System.out.println("Não foi possivel efetuar esta transferência");
        }
   
   
        
    }
}
