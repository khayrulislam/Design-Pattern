package ObserverExample;

public class UserB extends ObserverClass{

	@Override
	public void getNotify(String message) {
		// TODO Auto-generated method stub
		System.out.println("message from company "+message);
		System.out.println("ai ta ki hoi lo");
	}

	
}
