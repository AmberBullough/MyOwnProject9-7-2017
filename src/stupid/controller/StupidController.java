package stupid.controller;

import java.util.Scanner;

public class StupidController {
	
	public void start()
		{
			System.out.println("What is the meaning of life? ");
			System.out.println("42.");
			System.out.println("How much wood can a woodchuck chuck if a woodchuck could chuck wood? ");
			System.out.println("Blah I don't know. Ask the woodchuck.");
		}
	{
			System.out.println ("What is this feeling? I feel my heart hammering in my chest. Where has my breath gone?");
			System.out.println("Struggling to breathe. What is this feeling? I feel dizzy. Where is my mind? I cannot think.");
			System.out.println("What is this feeling? A sense of loneliness. Where is my sanity? Is this love or am I dying?");
			testScanner();
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