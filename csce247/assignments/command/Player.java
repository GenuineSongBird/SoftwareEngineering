/*
 * The player class has methods which act as the executable sections of the command classes.
 * Each command class, except for quit, has an appropriate method inside player to call.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/15/2019
 * 	
 */
package csce247.assignments.command;

public class Player {
	//Outputs a message upon initiation.
	public Player() {System.out.println("Our hero is born");}
	//Each command-connected method outputs a message as its response.
	public void jump()
	{
		System.out.println("Our hero jumps over a tall building");
	}
	
	public void fire()
	{
		System.out.println("Our hero squirts his water gun, far into the sky");
	}
	
	public void runForward()
	{	
		System.out.println("Our hero sprints faster than all the cars");
	}
	
}
