import java.util.ArrayList;

	public class Playlist implements IComponent {

		public String playlistName;
		
		public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

		public Playlist(String playlistName) {
			
			this.playlistName = playlistName;
		}

	  public void play() {
		  
		  for(IComponent song: this.playlist) {
			  
			  song.play();
		  }
	  }

	  public void setPlaybackSpeed(float speed) {
		  
		  for(IComponent song: this.playlist) {
			  
			  song.setBackbackSpeed(speed);
		  }
	  }
	  
	  public String getName() {
		  
		  return playlistName;
	  }
	  
	  
	  public void add(IComponent component) {
		  
		  playlist.add(component);
	  }
	  

	  public void remove(IComponent component){
			playlist.remove(component);
	  }

	@Override
	public void setBackbackSpeed(float speed) {
		// TODO Auto-generated method stub
		
	}
	  
	  

	}

