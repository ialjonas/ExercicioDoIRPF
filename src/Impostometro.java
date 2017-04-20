
public class Impostometro {
	private double baseCalculo;
	private double desconto;
	private double imposto;

	public Impostometro() {

	}

	public void Desconto(double rendimentos, double contribuicao) {
		this.desconto = (rendimentos - contribuicao) * 0.05;
	}

	public void calculoBase(double rendimentos, double contribuicao) {
		this.baseCalculo = rendimentos - contribuicao - desconto;
	}

	public double impostoSimplificado() {
		if (baseCalculo <= 12.000) {
			this.imposto = 0;
		} else if ((baseCalculo > 12.000) && (baseCalculo < 24.000)) {
			double valor = baseCalculo - 12.000;
			this.imposto = valor * 0.15;
		} else if (baseCalculo >= 24.000) {
			double valor = baseCalculo - 24.000;
			this.imposto = imposto + (valor * 0.27);
		}
		return imposto;
	}
	
	public double impostoCompleto(){
		return 0;
	}
	
	public String toString(){
		return ""+impostoSimplificado();
	}

}
