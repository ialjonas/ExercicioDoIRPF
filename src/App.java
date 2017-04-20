
public class App {
	public static void main(String[] args) {
		Contribuinte c=new ContribuinteCompleto("Ial", "015", 100, 5, 25, 2);
		Contribuinte c1=new Contribuinte("Teste", "025", 15000, 500);
		
		Impostometro ip=new Impostometro();
		ip.calculoBase(c1.getRendimentos(), c1.getContribuicaoPrev());
		System.out.println("Valor a pagar do imposto: R$"+ip.impostoSimplificado());
		
		
		
	}
}
