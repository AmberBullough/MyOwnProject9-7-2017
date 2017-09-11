package stupid.controller;

import java.util.Scanner;

public class StupidController {
	
	public void start()
		{
			System.out.println("What is the meaning of life? ");
			System.out.println("42.");
	
	}

	
	private void testScanner() 
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("Please type your favorite food?");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer);
	}
}