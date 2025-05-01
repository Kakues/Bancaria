package Dinheiro;

public class ChequeEspecial {

    Conta conta = new Conta();

    int valorChequeEspecial = 0;

    private int cheque(int valor){
        this.valorChequeEspecial = conta.consultarSaldo() + valorChequeEspecial;
        return valorChequeEspecial;
    }

    

}