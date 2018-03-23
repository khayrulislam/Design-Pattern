package AuctionBidderExample;

public interface Subject {

	public void addObserver(Observer newObserver);
	public void removeObserver(Observer newObserver);
	public void notifyAllObserver();
	
}
