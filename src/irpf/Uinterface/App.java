package irpf.Uinterface;
import irpf.negocio.Contribuinte;
import irpf.negocio.Impostometro;

public class App {
	public static void main(String[] args) {
		Contribuinte c1 = new Contribuinte("Teste", "025", 15000, 500);

		Impostometro ip = new Impostometro();
		ip.calculoBase(c1.getRendimentos(), c1.getContribuicaoPrev());
		System.out.println("Valor a pagar do imposto: R$" + ip.impostoSimplificado());

	}
}
