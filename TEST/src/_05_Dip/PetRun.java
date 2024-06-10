package _05_Dip;

public class PetRun {
	public static void main(String[] args) {
		Pets pets = new Pets();
	
		pets.setPet(new Cat());
		System.out.println(pets.getPet());

		
		pets.setPet(new Dog());
		System.out.println(pets.getPet());
	}
}
