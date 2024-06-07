package test;

public class SoundPlayer {
	private PlayInterface playInter;
	
	void setPlayInter(PlayInterface playInter) {
		this.playInter = playInter;
	}
	
	void play() {
		playInter.play();
	}

}
