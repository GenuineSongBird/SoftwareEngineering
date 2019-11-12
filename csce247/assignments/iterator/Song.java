/*
 * The Song class represents a single song by storing and distributing common song information for a single song.
 *  
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 11/11/2019
 * 	
 */
package csce247.assignments.iterator;

public class Song {
	private String name;
	private String artist;
	private double length;
	private String genre;
	/* Constructor for a Song.
	 * @Param String name, String artist, double length, String genre
	 */
	public Song(String name, String artist, double length, String genre)
	{
		this.name = name;
		this.artist = artist;
		this.length = length;
		this.genre = genre;
	}
	//Prints all information on this single Song object.
	public void print()
	{
		System.out.println(this.name + " by " + this.artist + " category: " + this.genre + " length: " + this.length + " min");
	}
}
