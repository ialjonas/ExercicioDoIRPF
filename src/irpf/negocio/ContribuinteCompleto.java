package irpf.negocio;

public class ContribuinteCompleto extends Contribuinte {

	private int idade;
	private int dependentes;

	public ContribuinteCompleto(String nome, String cpf, double totalRendimentos, double contribuicaoPrev, int idade,
			int dependentes) {
		super(nome, cpf, totalRendimentos, contribuicaoPrev);
		this.idade = idade;
		this.dependentes = dependentes;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	@Override
	public String toString() {
		return super.toString() + "\nIdade: " + getIdade() + "\nNúmero de dependentes: " + getDependentes();

	}

}