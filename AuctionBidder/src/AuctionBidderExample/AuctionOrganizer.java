package AuctionBidderExample;

import java.util.ArrayList;

public class AuctionOrganizer implements Subject {

	private static AuctionOrganizer auctionOrganizerInstance = null;
	private ArrayList<Observer> listOfObserver;
	private double currentBid;
	private int observerId;
	
	private AuctionOrganizer() {
		listOfObserver = new ArrayList<Observer>();
		this.observerId = 0;
	}
	
	public static AuctionOrganizer getInstance() {
		if(auctionOrganizerInstance==null) {
			auctionOrganizerInstance = new AuctionOrganizer();
		}
		return auctionOrganizerInstance;
	}
	
	
	
	@Override
	public void addObserver(Observer newObserver) {
		
		if(newObserver!=null) {
			((FirstBidder) newObserver).setObserverId(observerId++);
			listOfObserver.add(newObserver);
		}
		System.out.println("new observer is added in the auction");
	}

	@Override
	public void removeObserver(Observer newObserver) {
		
		if(listOfObserver.contains(newObserver)) {
			int index = listOfObserver.indexOf(newObserver);
			listOfObserver.remove(index);
			System.out.println("remove one observer from auction ");
		}	
	}

	@Override
	public void notifyAllObserver() {
		
		for(Observer ob: listOfObserver) {
			ob.receiveNotice(currentBid);
		}
		
	}
	
	public void setCurrentBid(double newBid) {
		if(newBid > 0) this.currentBid += newBid;
		notifyAllObserver();
	}

}
