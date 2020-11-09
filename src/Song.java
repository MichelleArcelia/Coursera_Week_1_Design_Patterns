
public class Song implements IComponent {
	
	public String songName;
	
	public String artist;
	
	public float speed = 1; // Default playback speed
	
	

	public Song(String songName, String artist ) {
		
		this.songName = songName;
		
		this.artist = artist; 
	}
	
	
	public void play() {
		
		System.out.println("Play the song: " + this.songName);
	}
	
	
	public String getName(){
		
		return this.songName;
	}

	public String getArtist(){
		
		return this.artist;
	}

	
	public void setPlaybackSpeed(float fasterSpeed) {
		
		this.speed = fasterSpeed;
	}

	@Override
	public void setBackbackSpeed(float speed) {
		
		this.speed = speed;
		
	}

}




