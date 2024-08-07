package conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numAgencia, int numConta, String tipo, String Titular) {
        super(numAgencia, numConta, tipo, Titular);
    }
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

}
