
public class Song implements IComponent {

//----------------------- VARIABLES ------------------------
	
	public String songName;
	
	public String artist;
	
	public float speed = 1; // Default playback speed
	
//-------------------------- SONG -------------------------	

	public Song(String songName, String artist ) {
		
		this.songName = songName;
		
		this.artist = artist; 
	}
	
//------------------------- PLAY ---------------------------	
	
	public void play() {
		
		System.out.println("Play the song: " + this.songName);
	}
	
//---------------------- GET NAME -------------------------	
	
	public String getName(){
		
		return this.songName;
	}
	
//--------------------- GET ARTIST -------------------------	

	public String getArtist(){
		
		return this.artist;
	}
	
//------------------ SET PLAYBACK SPEED -------------------	

	public void setPlaybackSpeed(float fasterSpeed) {
		
		this.speed = fasterSpeed;
	}
	
//------------------- SET BACK BACK SPEED -----------------	

	@Override
	public void setBackbackSpeed(float speed) {
		
		this.speed = speed;
		
	}

}




