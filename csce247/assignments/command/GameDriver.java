/*
 * This driver tests that the Command design pattern correctly takes an input and calls an appropriate class.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/15/2019
 * 	
 */
package csce247.assignments.command;

import java.util.Scanner;

public class GameDriver {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String command = "";
		
		Player player = new Player();
		InputHandler inHandler = new InputHandler(player);

		while(!command.contentEquals("quit")) {
			System.out.print("Enter command: ");
			command = in.next().toLowerCase().trim();
			inHandler.buttonPressed(command);
		}
	}
}
