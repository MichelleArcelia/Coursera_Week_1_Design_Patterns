import java.util.ArrayList;



	public class Playlist implements IComponent {

		public String playlistName;
		
		public ArrayList<IComponent> playlist = new ArrayList();


//-----------------------PLAYLIST----------------------------
	
		public Playlist(String playlistName) {
			
			this.playlistName = playlistName;
		}

//-------------------------PLAY-------------------------------
		
	  public void play() {
		  
		  for(int i = 0; i < playlist.size(); i++) {
			  
			  playlist.get(i).play();
		  }
	  }
	  
//-------------------SET PLAYBACK SPEED-----------------------

	  public void setPlaybackSpeed(float slowSpeed) {
		  
		  
	  }

//-----------------------GET NAME----------------------------
	  
	  public String getName() {
		  
		  return playlistName;
	  }
	
//-------------------------ADD SONG---------------------------	  
	  
	  public void add(Song experimentalSong1) {
		  
		  playlist.add(experimentalSong1);
		  
	  }
	  
//----------------------ADD PLAYLIST---------------------------	  
	  
	  public void add(Playlist experimentalPlaylist) {
		  
		  playlist.add(experimentalPlaylist);
		  
	  }	  

	
//-------------------SET PLAY BACK SPEED-------------------

	@Override
	
	public void setBackbackSpeed(float speed) {
		
		for(int i = 0; i < playlist.size(); i++) {
			
			playlist.get(i).setBackbackSpeed(speed);
		}
	}
	  

	}

