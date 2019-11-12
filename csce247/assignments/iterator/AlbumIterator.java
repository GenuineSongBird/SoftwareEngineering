/*
 * The AlbumIterator class implements the Iterator interface by defining the methods next() and hasNext()
 * This class performs iteration through Album classes that hold Songs.
 *  
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 11/11/2019
 * 	
 */
package csce247.assignments.iterator;

//Implements Iterator interface
public class AlbumIterator implements Iterator{
	private Song[] song;
	private int position = 0; //position in the album
	
	/*Constructor requires an array of Songs to iterate through
	 * @param Song[] songs
	 */
	public AlbumIterator(Song[] songs) {
		this.song = songs;
	}
	
	//Moves to the next song in the album
	public Song next() { 
		Song thisSong = song[position];
		position = position + 1;
		return thisSong;
	}
	
	//Verifies that a next song exists in the album.
	public boolean hasNext() {
		if(position >= song.length || song[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}

