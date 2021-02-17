package projeto2;

public class FaturaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fatura fatura1 = new Fatura("1", "Fatura 1", 2, 2.99);
		System.out.println("Total da Fatura ("+fatura1.getDescricao()+"): "+fatura1.getTotalFatura());
		
		Fatura fatura2 = new Fatura("2", "Fatura 2", 3, -2.99);
		System.out.println("Total da Fatura ("+fatura2.getDescricao()+"): "+fatura2.getTotalFatura());
	}

}
