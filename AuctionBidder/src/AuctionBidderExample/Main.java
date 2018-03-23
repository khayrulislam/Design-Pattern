package AuctionBidderExample;

public class Main {

	public static void main(String[] args) {
		
		AuctionOrganizer ao = AuctionOrganizer.getInstance();
		
		Observer o1 = new FirstBidder(ao);
		Observer o2 = new FirstBidder(ao);
		Observer o3 = new FirstBidder(ao);
		Observer o4 = new FirstBidder(ao);
		
		ao.setCurrentBid(200);
		
		ao.removeObserver(o2);
		
		ao.setCurrentBid(100);
		
	}
	
}
