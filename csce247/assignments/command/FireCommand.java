/*
 * The FireCommand class is a Command class that, once connected to a player instance, 
 * will call the "fire" method from the player instance.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/15/2019
 * 	
 */
package csce247.assignments.command;

public class FireCommand implements Command {
	private Player player;
	/*Sets its player instance to the player from which FireCommand was initiated with.
	 * @param Player
	 */
	public FireCommand(Player player)
	{
		this.player = player;
	}
	//Calls the fire method from the player instance.
	public void execute()
	{
		player.fire();
	}
}
