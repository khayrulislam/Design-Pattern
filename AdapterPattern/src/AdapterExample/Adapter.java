package AdapterExample;

public class Adapter implements MediaPlayer{

	AdvancedMediaPlayer amp;
	public Adapter(AdvancedMediaPlayer amp) {
		// TODO Auto-generated constructor stub
		this.amp =amp;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		amp.playFile();
	}

}
