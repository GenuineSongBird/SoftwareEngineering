/*
 * InputHandler uses a hash map to connect string-based input of commands
 *  to classes which perform said commands.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/15/2019
 * 	
 */
package csce247.assignments.command;
//HashMap must be imported.
import java.util.HashMap;

public class InputHandler {

	//Creates a HashMap that connects a string to a command class.
	private HashMap<String, Command> map = new HashMap<>();
	//Each string is connected to its appropriate command class.
	public InputHandler(Player player)
	{
		Command JumpCommand = new JumpCommand(player);
		Command RunCommand = new RunCommand(player);
		Command FireCommand = new FireCommand(player);
		Command QuitCommand = new QuitCommand();
		map.put("jump", JumpCommand);
		map.put("run", RunCommand);
		map.put("fire", FireCommand);
		map.put("quit", QuitCommand);
	}
	/*/When a command is entered, this method executes the command.
	 * Use this command on repeat to enable reactions to user commands.
	*/
	public void buttonPressed(String button)
	{
		map.get(button).execute();
	}
	
}
