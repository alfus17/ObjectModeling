package _06_FactoryPattern;

public class ProductFactory {
	
	// .으로  method 실행가능하게 static으로 
	public static Product getInstance(String name) {
		Product product = new Product();
		
		// equalsIgnoreCase 대소문자 비교안함
		if(name.equalsIgnoreCase("TV")) {
			product.setName("TV");
			product.setPrice(300);
		}else if(name.equalsIgnoreCase("computer")){
			product.setName("Coumputer");
			product.setPrice(100);
		}
		return product;
		
	}
	
}
