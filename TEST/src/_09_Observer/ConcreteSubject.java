package _09_Observer;

import java.util.*;

public class ConcreteSubject implements Subject {
	// 감시자를 담을 리스트
	List <Observer> observers = new ArrayList<>();
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		System.out.println(observer + " 구독완료");
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		System.out.println(observer + " 구독취소완료");
	}

	@Override
	public void notifyObservers() {
		for(Observer o :  observers) {
			o.update();  // 위임
 		}
	
	}

}
