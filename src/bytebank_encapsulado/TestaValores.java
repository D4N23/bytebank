package bytebank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(345657,576768);
		
		conta.setAgencia(3546);
		conta.setNumero(-330);
		
		System.out.println("Sua agencia é: " + conta.getAgencia());
		System.out.println(conta.getNumero());
	}

}
