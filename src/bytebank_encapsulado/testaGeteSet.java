package bytebank_encapsulado;

public class testaGeteSet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(33340, 33333);
		conta.setNumero(234500);
		
		Cliente paulo =new Cliente();
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular());
	}

}
