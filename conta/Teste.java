package conta;

import java.text.DecimalFormat;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1984, 1, "Conta Corrente", "Eric Chagas");
        ContaPoupanca contaPoupanca = new ContaPoupanca(1877, 2, "Conta Poupança", "Dinoel");
        
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Saldo inicial na Conta Corrente:");
        contaCorrente.depositar(1000);
        System.out.println("Saldo após o depósito na Conta Corrente: " + df.format(contaCorrente.getSaldo()));

        System.out.println("\nSaque na Conta Corrente:");
        double valor = 200;
        contaCorrente.sacar(valor);
        System.out.println("Saldo atualizado da Conta Corrente: " + df.format(contaCorrente.getSaldo()));
        
        System.out.println("\nSaque na Conta Corrente:");
        double valor2 = 800;
        contaCorrente.sacar(valor2);
        System.out.println("Saldo atualizado da Conta Corrente: " + df.format(contaCorrente.getSaldo()));

        System.out.println("\nTransferência da Conta Corrente para a Conta Poupança:");
        contaCorrente.transferir(contaPoupanca, 300);
        System.out.println("Saldo da Conta Corrente após a transferência: " + df.format(contaCorrente.getSaldo()));
        System.out.println("Saldo da Conta Poupança após a transferência: " + df.format(contaPoupanca.getSaldo()));

        System.out.println("\nDados da Conta Corrente:");
        System.out.println("Titular: " + contaCorrente.getNomeTitular());
        System.out.println("Número da Agência: " + contaCorrente.getNumeroAgencia());
        System.out.println("Número da Conta: " + contaCorrente.getNumeroConta());
        System.out.println("Tipo da Conta: " + contaCorrente.gettipoConta());
        System.out.println("Saldo: " + df.format(contaCorrente.getSaldo()));

        System.out.println("\nDados da Conta Poupança:");
        System.out.println("Titular: " + contaPoupanca.getNomeTitular());
        System.out.println("Número da Agência: " + contaPoupanca.getNumeroAgencia());
        System.out.println("Número da Conta: " + contaPoupanca.getNumeroConta());
        System.out.println("Tipo da Conta: " + contaPoupanca.gettipoConta());
        System.out.println("Saldo: " + df.format(contaPoupanca.getSaldo()));

        System.out.println("\nTotal de contas criadas: " + Conta.getQtdContas());
    }
}
