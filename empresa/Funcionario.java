package empresa;

public class Funcionario {
    private String nome;
    private String cpf;
    protected double salario;
    
    public String getnome() {
    	return nome;
    }
    
    public void setnome(String nome) {
    	this.nome=nome;
    }
    
    public String getcpf() {
    	return cpf;
    }
    
    public void setcpf(String cpf) {
    	this.cpf=cpf;
    }
    
    public double getsalario() {
    	return salario;
    }
    
    public void setsalario(double salario) {
    	this.salario=salario;
    }
    
    public double calculabonificacao() {
    	return salario*0.1;
    }
}
