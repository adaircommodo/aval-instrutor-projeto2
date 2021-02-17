package projeto2;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int quantidade; 
	private double precoPorItem;
	
	public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
		this.setNumero(numero);
		this.setDescricao(descricao);
		this.setQuantidade(quantidade);
		this.setPrecoPorItem(precoPorItem);
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoPorItem() {
		return precoPorItem;
	}

	public void setPrecoPorItem(double precoPorItem) {
		this.precoPorItem = (precoPorItem>0)?precoPorItem:0.0;
	}

	//TODO: ver o retorno de inteiro
	public double getTotalFatura() {
		
		double calculo = this.getPrecoPorItem()*this.getQuantidade();
		
		return calculo;
		
	}
	
}
