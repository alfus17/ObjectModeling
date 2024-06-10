package _06_Factory;

public class Product {
	private String name;
	private int price;
	
	private Product p1 = new Product();

	
	
	public void setName(String name) {
		this.name = name;

		if(name.equalsIgnoreCase("tv")) {
			price = 300;
		}else if(name.equalsIgnoreCase("computer")) {
			price = 200;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "name : " + name + ", price : " + price;
	}
}
