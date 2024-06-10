package _06_FactoryPattern;

public class ProductRun {
	public static void main(String[] args) {
		Product p1 = ProductFactory.getInstance("tv");
		System.out.println(p1);

		p1 = ProductFactory.getInstance("computer");
		System.out.println(p1);

		p1 = ProductFactory.getInstance("Computer");
		System.out.println(p1);
		
//		clanedar => 팩토리 타입
	}


}
