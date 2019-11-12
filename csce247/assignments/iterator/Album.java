/*
 * The Album class is a ArrayList database of Song classes. 
 * Album class can distribute its iterator to other classes through createIterator().
 * 
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 11/11/2019
 * 	
 */
package csce247.assignments.iterator;

import java.util.ArrayList;


public class Album {
	ArrayList<Song> songs = new ArrayList<Song>();
	private int count; //Number of songs
	private String name; //Name of album
	
	//Constructor requires the name of the album.
	public Album(String name)
	{
		this.name = name;
	}
	/* Used to add a single song to this album.
	 * @param String name, String artist, double length, String genre
	 */
	public void addSong(String name, String artist, double length, String genre)
	{
		Song song = new Song(name, artist, length, genre);
		songs.add(song);
		this.count = songs.size();
	}
	//Distributes the iterator of this album.
	public AlbumIterator createIterator()
	{
		Song[] song = songs.toArray(new Song[songs.size()]);
		AlbumIterator albumIterator = new AlbumIterator(song);
		return albumIterator;
	}
}
