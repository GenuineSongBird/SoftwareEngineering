/*
 * The QuitCommand class is a Command class that
 * will output a quitting message.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/15/2019
 * 	
 */
package csce247.assignments.command;

public class QuitCommand implements Command {
	//Outputs a quitting message
	public void execute()
	{
		System.out.println("Game over :(");
	}
}
