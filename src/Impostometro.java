
public class Impostometro {
	private double baseCalculo;
	private double desconto;

	public Impostometro() {

	}

	public void Desconto(double rendimentos, double contribuicao) {
		this.desconto = (rendimentos - contribuicao) * 0.05;
	}

	public void calculoBase(double rendimentos, double contribuicao) {
		this.baseCalculo = rendimentos - contribuicao - desconto;
	}

}
