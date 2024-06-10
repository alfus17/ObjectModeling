package _09_Observer;

public class ObserverB implements Observer {
	@Override
	public void update() {
		System.out.println("ObserverB에게 이번트 알림이 왔습니다.");		
	}
	@Override
	public String toString() {
		return "ObserverB";
	}
}
