package loja;

public class Brinquedo extends Produto {
	public int FaixaEtaria;
	
	public Brinquedo(String nome, float preco, int FaixaEtaria) {
        super(nome, preco);
    }
	
	@Override
    public void excluir() {
        super.excluir();
        this.FaixaEtaria = 0;
    }
	@Override
    public void atualizar (int NovaFaixaEtaria) {
		this.FaixaEtaria = NovaFaixaEtaria;
    }
}
