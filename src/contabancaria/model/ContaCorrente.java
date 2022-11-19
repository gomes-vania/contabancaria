package contabancaria.model;

public class ContaCorrente extends Conta {
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		
		// Polimorfismo: sobrecarga e sobreescrista de métodos.
		// metodo super busca os atributos da classe Conta
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
		
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public boolean sacar(float valor) { 
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
			
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	//sobescrita do método visualizar, onde esta pegando o mesmo método da classe mãe e reescrevendo ele aqui.
	//sobreescrita: mesmo nome e assinatura, em classes diferentes.
	@Override
	public void visualizar() {
		super.visualizar();
		
		System.out.println("Limite de crédito " + this.limite);
	}
}
