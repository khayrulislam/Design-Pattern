package ProxyExample;

public class ProxyImage {

	RealImage ri = null;
	
	public void provideImage() {
		if(ri==null) ri = new RealImage();
		else ri.provideImage();
	}
	
}
