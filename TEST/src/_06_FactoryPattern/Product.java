package _06_FactoryPattern;

public class Product {
	private String name;
	private int price;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "name : " + name + ", price : " + price;
	}
}
