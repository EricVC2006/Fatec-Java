package conta;
public abstract class Conta {
    private static int QtdContas = 0;
    private int numAgencia;
    private int numConta;
    private String tipo;
    protected double saldo;
    private String titular;

    public Conta(int numeroAgencia, int numeroConta, String tipoConta,String nomeTitular) {
        this.numAgencia = numeroAgencia;
        this.numConta = numeroConta;
        this.tipo = tipoConta;
        this.titular = nomeTitular;
        QtdContas++;
    }

    public abstract void depositar(double valor);
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public static int getQtdContas() {
        return QtdContas;
    }

    public int getNumeroAgencia() {
        return numAgencia;
    }
    
    public void setNumeroAgencia(int NumeroAgencia) {
    	this.numAgencia=NumeroAgencia;
    }

    public int getNumeroConta() {
        return numConta;
    }
    
    public void setNumeroConta(int NumeroConta) {
    	this.numConta=NumeroConta;
    }
    
    public String gettipoConta() {
        return tipo;
    }
    
    public void setTipoconta(String Tipoconta) {
    	this.tipo=Tipoconta;
    }

    public String getNomeTitular() {
        return titular;
    }
    
    public void setNomeTitular(String NomeTitular) {
    	this.titular=NomeTitular;
    }
}