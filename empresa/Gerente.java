package empresa;

public class Gerente extends Funcionario {
    private int senha;

	public void setsenha(int senha) {
    	this.senha=senha;
    }
    public boolean autentica(int senha) {
    	if(this.senha==senha) {
    		return true;
    	}
    	return false;
    }
    
    public double calculabonificacao() {
    	return this.salario;
    }
}
