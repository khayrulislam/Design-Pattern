package AdapterExample;

public class Main {

	public static void main(String[] args) {
		
		Mp3Player mp3 = new Mp3Player();
		Mp4Player mp4 = new Mp4Player();
		VlcPlayer vlc = new VlcPlayer();
		
		MediaPlayer mp = new Adapter(vlc);
		mp.play();
		
		mp = mp3;
		
		mp.play();
		
		
	}
	
}
