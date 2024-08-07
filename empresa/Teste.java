package empresa;

public class Teste {
	public static void main(String[]Args) {
		Gerente gerente1 = new Gerente();
		gerente1.setnome("Carlos");
		gerente1.setcpf("42327317");
		gerente1.setsalario(3000.0);
		
		System.out.println(gerente1.getnome());
		System.out.println(gerente1.getcpf());
		System.out.println(gerente1.getsalario());
		System.out.println(gerente1.calculabonificacao());
		
		gerente1.setsenha(42327317);
		boolean autentica = gerente1.autentica(42327317);
		System.out.println(autentica);
	}
}
