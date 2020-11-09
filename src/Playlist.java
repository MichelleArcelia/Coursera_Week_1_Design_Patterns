import java.util.ArrayList;

//-----------------------PLAYLIST----------------------------

	public class Playlist implements IComponent {

		public String playlistName;
		
		public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

		public Playlist(String playlistName) {
			
			this.playlistName = playlistName;
		}

//-------------------------PLAY-------------------------------
		
	  public void play() {
		  
		  for(IComponent song: this.playlist) {
			  
			  song.play();
		  }
	  }
	  
//-------------------SET PLAYBACK SPEED-----------------------

	  public void setPlaybackSpeed(float speed) {
		  
		  for(IComponent song: this.playlist) {
			  
			  song.setBackbackSpeed(speed);
		  }
	  }

//-----------------------GET NAME----------------------------
	  
	  public String getName() {
		  
		  return playlistName;
	  }
	
//-------------------------ADD-------------------------------	  
	  
	  public void add(IComponent component) {
		  
		  playlist.add(component);
	  }
	  
//-----------------------REMOVE----------------------------
	  
	  public void remove(IComponent component){
			playlist.remove(component);
	  }


	


	  //---------------- ADDED TO FIX ERROR IN PLAYLIST---------------
//The type Playlist must implement the inherited abstract method IComponent.setBackbackSpeed(float)
	  

	@Override
	public void setBackbackSpeed(float speed) {
		// TODO Auto-generated method stub
	}
	  

	}

