package test;

public class Run {

	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		
		sp.setPlayInter(new PlayWave());
		sp.play();
		
		sp.setPlayInter(new PlayMp3());
		sp.play();
	}

}
