package loja;

public abstract class Produto {
	public String nome;
	public float preco;
	
	public Produto (String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void incluir (String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public void alterar (float novopreco) {
		this.preco = novopreco;
	}
	
	public void excluir () {
			this.nome = null;
            this.preco = 0;
	}
	
	public abstract void atualizar(int NovoValor);
		
}
