package _03_lsp;
class Cat{
	void speak() {
		System.out.println("야옹");
	}
}
class whiteCat extends Cat{
	String color = "white";
	@Override
	void speak() {
		System.out.println("white 야옹");
	}
}
class blackCat extends Cat{
	String color = "black";
	@Override
	void speak() {
		System.out.println("black 야옹");
	}
}

public class CatRun {

	public static void main(String[] args) {
		Cat cat = new whiteCat();
		cat.speak(); // 무엇으로 형변환 하든 오버라이딩 한값이 호출됨
		whiteCat whiteCat = (whiteCat) cat;
		whiteCat.speak();
		
		Cat cat1 = new blackCat();
		cat1.speak(); // 무엇으로 형변환 하든 오버라이딩 한값이 호출됨
		blackCat blackCat = (blackCat) cat1;
		blackCat.speak();
		
	}

}
