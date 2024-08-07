package loja;

public class Bola extends Produto {
	public int Tamanho;
	
	public Bola (String nome, float preco, int Tamanho) {
        super(nome, preco);
    }
	
	@Override
    public void excluir() {
        super.excluir();
        this.Tamanho = 0;
    }

    public void atualizar(int  NovoTamanho) {
		this.Tamanho = NovoTamanho;
    }
}
