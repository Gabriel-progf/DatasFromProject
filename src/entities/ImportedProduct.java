package entities;

public class ImportedProduct extends Product {

	private Double customsFee;

	
	public ImportedProduct() {
		super();
	}


	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	public Double getCustomsFee() {
		return customsFee;
	}


	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return customsFee + price;
	}
	
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name
				+ " $ " + String.format("%.2f", totalPrice())
				+ " (Customs fee: $ ("
				+ String.format("%.2f", getCustomsFee())
				+ ")");
		
		return sb.toString();
	}
	
	
	
	
}
