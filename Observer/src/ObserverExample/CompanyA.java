package ObserverExample;

public class CompanyA extends Subject {

	public void salePriceIncrease(String message) {
		System.out.println(message);
		notifyAllObserver(message);
	}
	
}
