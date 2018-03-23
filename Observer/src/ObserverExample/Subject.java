package ObserverExample;

import java.util.ArrayList;

public class Subject {

	ArrayList<ObserverClass> observerList = new ArrayList<ObserverClass>();
	
	public void register(ObserverClass oc) {
		observerList.add(oc);
	}
	
	public void unRegister(ObserverClass oc) {
		if(observerList.contains(oc)) observerList.remove(observerList.indexOf(oc));
	}
	
	public void notifyAllObserver(String message) {
		for(ObserverClass oc : observerList) {
			oc.getNotify(message);
		}
	}
}
