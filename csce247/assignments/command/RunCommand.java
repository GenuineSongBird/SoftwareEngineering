/*
 * The RunCommand class is a Command class that, once connected to a player instance, 
 * will call the "runForward" method from the player instance.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/15/2019
 * 	
 */
package csce247.assignments.command;

public class RunCommand implements Command {
	private Player player;
	/*Sets its player instance to the player from which RunCommand was initiated with.
	 * @param Player
	 */
	public RunCommand(Player player)
	{
		this.player = player;
	}
	//Calls the runForward method from the player instance.
	public void execute()
	{
		player.runForward();
	}
}
