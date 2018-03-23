package ObserverExample;

public class UserA extends ObserverClass{

	@Override
	public void getNotify(String message) {
		// TODO Auto-generated method stub
		System.out.println("Message from company is "+message);
		System.out.println("akon ami ki korbo");
	}

}
