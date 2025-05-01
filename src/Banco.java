import Dinheiro.Conta;
import Dinheiro.DepositarDinheiro;
import Dinheiro.PagarBoleto;
import Dinheiro.SacarDinheiro;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Conta contaCliente = new Conta(); // Cria uma conta
        int valorDeposito = deposito();
        int valorSaque = saque();
        int valorBoleto = boleto();

        // Faz o depósito usando DepositarDinheiro
        DepositarDinheiro.depositar(contaCliente, valorDeposito);
        SacarDinheiro.sacar(contaCliente, valorSaque);
        PagarBoleto.boleto(contaCliente, valorBoleto);

        // Agora, consultar saldo pela Conta
        System.out.println("Saldo atual: R$" + contaCliente.consultarSaldo());

    }
    
    private static int deposito() {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Valor para depósito:");
        int valorDeposito = sc.nextInt();

        return valorDeposito;
    }

    private static int saque() {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Valor do saque :");
        int saque = sc.nextInt();

        return saque;
    }

    private static int boleto() {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Valor do boleto: ");
        int boleto = sc.nextInt();

        return boleto;
    }

}