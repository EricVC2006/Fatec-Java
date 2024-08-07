package conta;

public class ContaCorrente extends Conta {
    private static final double taxa = 0.20;

    public ContaCorrente(int numAgencia, int numConta, String tipo, String Titular) {
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

    @Override
    public boolean sacar(double valor) {
        if (valor > 0) {
            double valorComTaxa = valor + taxa;
            if (getSaldo() >= valorComTaxa) {
                setSaldo(getSaldo() - valorComTaxa);
                System.out.println("Saque de " + valor + " realizado com sucesso. Taxa de R$ 0,20 aplicada.");
                return true;
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
                return false;
            }
        } else {
            System.out.println("Valor de saque inválido.");
            return false;
        }
    }
}
