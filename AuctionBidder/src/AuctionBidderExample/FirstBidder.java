package AuctionBidderExample;

public class FirstBidder implements Observer {

	private int observerId;
	
	public FirstBidder(Subject newSubject) {	
		newSubject.addObserver(this);		
	}
	
	@Override
	public void receiveNotice(double currentBid) {
		
		System.out.println("observer "+observerId+" receive notification from auction organizer current bid is = "+currentBid);
		
	}
	
	public void setObserverId(int newID) {
		this.observerId = newID;
	}

}
