/*
 * MusicDriver ensures proper functionality of the JukeBox class through testing.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/2/2019
 * 	
 */
package csce247.assignments.singelton; //singleton is spelled incorrectly as according to customer request.

public class MusicDriver {

	public static void main(String[] args) {
		JukeBox jukeBox = JukeBox.getInstance();
		
		System.out.println();
		
		jukeBox.requestSong("The ABCs");
		jukeBox.requestSong("Head Sholders Knees and Toes");
		jukeBox.requestSong("Twinkle Twinkle Little Star");
		jukeBox.requestSong("If you're happy and you know it");
		
		System.out.println();
		
		while(jukeBox.hasMoreSongs()) {
			jukeBox.playNextSong();
		}
	}
}
