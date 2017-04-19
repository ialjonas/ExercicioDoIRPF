
public class Contribuinte {
	/**
	 * Um sistema é usado para o cadastramento de contribuintes (pessoas
	 * físicas) e cálculo do imposto de renda. O cálculo pode ser feito visando
	 * a declaração completa ou a declaração simplificada. Os dados necessários
	 * para a declaração completa são: • Nome* • CPF* • Idade** • Número de
	 * dependentes** • Contribuição previdenciária oficial*** • Total de
	 * rendimentos*** *Campos obrigatórios para todos os contribuintes Campos
	 * **obrigatórios para os contribuintes que fazem declaração completa
	 * ***Campos obrigatórios para permitir o cálculo do imposto (qualquer
	 * modalidade)
	 * 
	 */

	private String cpf;
	private String nome;

	public Contribuinte(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "Nome: " + getNome() + "\nCPF: " + getCpf();
	}
}
