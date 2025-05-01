package Dinheiro;

public class PagarBoleto{

    public static void boleto (Conta conta, int pagarBoleto) {
        if (pagarBoleto <= conta.consultarSaldo()) {
            conta.sacarSaldo(pagarBoleto);
            System.out.println("Pagamento de boleto no valor de R$" + pagarBoleto + " feito com sucesso!");
        } else {
            System.out.println("Valor inválido para pagar o boleto, saldo em conta de R$" + conta.consultarSaldo());
        }
    }
}