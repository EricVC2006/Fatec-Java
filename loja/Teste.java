package loja;

public class Teste {
	

	public static void main(String[] args) {
		Brinquedo brinquedo = new Brinquedo("hot whilis", 10.00f, 77);
		Bola bola = new Bola(null,0f,0);
		bola.incluir("Bola de tenis", 50f);
	
		System.out.println("Brinquedo:");
		System.out.println("Nome do brinquedo: " + brinquedo.nome);
		System.out.println("Preço do brinquedo: " + brinquedo.preco);
		
		System.out.println("\nAlterando o brinquedo:");
		brinquedo.alterar(30);
		System.out.println("Preço alterado para " + brinquedo.preco);
		
		brinquedo.atualizar(6);
		System.out.println("\nAtualizando o brinquedo com seu atributo especifico\nFaixa etaria: " + brinquedo.FaixaEtaria);
		
		
		System.out.println("\nExcluindo o brinquedo:");
		brinquedo.excluir();
		System.out.println(brinquedo.nome + "\n" + brinquedo.preco + "\n" + brinquedo.FaixaEtaria);
	
		System.out.println("\nBola:");
		System.out.println("Nome da bola: " + bola.nome);
		System.out.println("Preço da bola: " + bola.preco);
		
		System.out.println("\nAlterando a bola:");
		bola.alterar(80);
		System.out.println("Preço alterado para " + bola.preco);
		
		brinquedo.atualizar(6);
		System.out.println("\nAtualizando a bola com seu atributo especifico\ntamanho: " + bola.Tamanho);
		
		System.out.println("\nExcluindo a bola:");
		bola.excluir();
		System.out.println(bola.nome + "\n" + bola.preco + "\n" + bola.Tamanho);
		}
	}
	
