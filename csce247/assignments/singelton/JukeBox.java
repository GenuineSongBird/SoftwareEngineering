/*
 * JukeBox implements the singleton design pattern and is tested for functionality 
 * through the MusicDriver class.
 * 
 * The singleton design pattern restricts the instantiation of a class to a single object
 * meaning that multiples of this class cannot exist during runtime.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/2/2019
 * 	
 */
package csce247.assignments.singelton; //spelled incorrectly on purpose.
//java.util Queue and LinkedList are imported for the creation of a string queue, called songQueue.
import java.util.Queue;
import java.util.LinkedList;

public class JukeBox {
	//songQueue holds the names of each song in the order opposite of which the songs were added.
	private Queue<String> songQueue = new LinkedList<String>();
	// initializes itself to be referred to from inside itself
	private static JukeBox jukeBox;
	//private constructor forces use of getInstance() to create a single Singleton object.
	private JukeBox() {}
	/* Calling getInstance() will create the only instance of JukeBox. 
	 *  There cannot be more than one due to singleton design pattern.
	 */
	public static JukeBox getInstance()
	{
		if( jukeBox == null )
		{
			System.out.println("Initializing the JukeBox!!! Let's get Dancing");
			jukeBox = new JukeBox();
		}
		return jukeBox;
	}
	//Announces string(song) at front of queue, then removes it.
	public void playNextSong()
	{
		System.out.println("Let's jam to " + songQueue.peek());
		songQueue.remove();
	}
	/* @param string (the name of a song to be requested)
	 * Adds string(song) to back of the queue, and announces the successful addition of that song.
	 */
	public void requestSong(String song)
	{
		songQueue.add(song);
		System.out.println(song + " is now number " + songQueue.size() + " on the list");
	}
	//Determines if the songQueue is empty or not, and returns a matching boolean condition.
	public boolean hasMoreSongs()
	{
		if(songQueue.isEmpty())
			return false;
		else
			return true;
	}
	
}
