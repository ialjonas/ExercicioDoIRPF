package irpf.negocio;

public class Contribuinte {

	private String cpf;
	private String nome;
	private double contribuicaoPrev;
	private double rendimentos;

	public Contribuinte(String nome, String cpf, double rendimentos, double contribuicaoPrev) {
		this.nome = nome;
		this.cpf = cpf;
		this.rendimentos = rendimentos;
		this.contribuicaoPrev = contribuicaoPrev;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getContribuicaoPrev() {
		return contribuicaoPrev;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setCpf(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	public void setContribuicaoPrev(double contribuicaoPrev) {
		this.contribuicaoPrev = contribuicaoPrev;
	}

	@Override
	public String toString() {
		return "Contribuinte: " + "\nNome: " + nome + "\nCPF: " + cpf + "\nContribuicao Previcenciaria: "
				+ contribuicaoPrev + "\nTotal de Rendimentos: " + rendimentos;
	}

}
