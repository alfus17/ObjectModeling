package _09_Observer;

public class ObserverRun {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		ObserverA oa = new ObserverA();
		ObserverB ob = new ObserverB();
		
		// 구독 (감시자)를 등록
		subject.registerObserver(oa);
		subject.registerObserver(ob);
		
		subject.notifyObservers();
	}

}
