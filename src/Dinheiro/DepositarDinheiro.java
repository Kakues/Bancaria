package Dinheiro;

public class DepositarDinheiro {

    
    public static void depositar(Conta conta, int valor) {
        if (valor > 0) {
            conta.adicionarSaldo(valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
}