package _08_BuilderPatern.builderConstructor;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder()
				.setBread("허니오트")
				.build();
		System.out.println(menu1);
		
//		menu1.setBread("통밀");
//		menu1.setSize(15);
//		menu1.setCheese("모짜렐라");
//		menu1.setSource("핫칠리");
//		menu1.setExtraTopping("베이컨");
//		menu1.setVagetable(true);
//		System.out.println(menu1);
	}

}
