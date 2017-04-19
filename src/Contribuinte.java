
public class Contribuinte {
	/**
	 * Um sistema � usado para o cadastramento de contribuintes (pessoas
	 * f�sicas) e c�lculo do imposto de renda. O c�lculo pode ser feito visando
	 * a declara��o completa ou a declara��o simplificada. Os dados necess�rios
	 * para a declara��o completa s�o: � Nome* � CPF* � Idade** � N�mero de
	 * dependentes** � Contribui��o previdenci�ria oficial*** � Total de
	 * rendimentos*** *Campos obrigat�rios para todos os contribuintes Campos
	 * **obrigat�rios para os contribuintes que fazem declara��o completa
	 * ***Campos obrigat�rios para permitir o c�lculo do imposto (qualquer
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
