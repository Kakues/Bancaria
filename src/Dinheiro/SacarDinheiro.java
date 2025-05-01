package Dinheiro;

public class SacarDinheiro {

    public static void sacar (Conta conta, int valorSaque) {
        if (valorSaque <= conta.consultarSaldo()) {
            conta.sacarSaldo(valorSaque);
            System.out.println("Saque de R$" + valorSaque+ " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para Saque.");
            System.out.println(conta.consultarSaldo());
        }
    }
}
