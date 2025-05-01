package Dinheiro;
 public class Conta {
    private int saldo;
    
    // Construtor
    public Conta() {
        this.saldo = 0;
    }
    
    // Método para adicionar saldo
    void adicionarSaldo(int valor) {
            this.saldo += valor;
    }

    // Método para sacar saldo
    void sacarSaldo(int valor) {
        this.saldo -= valor;
    }

    void pagarBoleto(int valor) {
        this.saldo -= valor;
    }
    
    // Método para consultar saldo
    public int consultarSaldo() {
        return saldo;
    }
}