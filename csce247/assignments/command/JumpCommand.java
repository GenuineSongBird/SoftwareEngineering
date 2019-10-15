/*
 * The JumpCommand class is a Command class that, once connected to a player instance, 
 * will call the "jump" method from the player instance.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/15/2019
 * 	
 */
package csce247.assignments.command;

public class JumpCommand implements Command {
	private Player player;
	/*Sets its player instance to the player from which JumpCommand was initiated with.
	 * @param Player
	 */
	public JumpCommand(Player player)
	{
		this.player = player;
	}
	//Calls the jump method from the player instance.
	public void execute()
	{
		player.jump();
	}
}
