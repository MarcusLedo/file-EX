package fileEX;

public class Product {
	private String name;
	private Double price;
	private Integer qnty;
	
	
	public Product(String name, Double price, Integer qnty) {
		this.name = name;
		this.price = price;
		this.qnty = qnty;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getQnty() {
		return qnty;
	}


	public void setQnty(Integer qnty) {
		this.qnty = qnty;
	}
	
	public double totalValue() {
		return price * qnty;
	}
	
	
}
