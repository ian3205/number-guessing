import java.util.Scanner;


public class GuessingGame {
	public static void main(String[] args) {
		//1.generate a random number between 1 and 10000
		int rando = (int)(Math.random()* 10000);
		
		Scanner input = new Scanner(System.in);
		
		
		int max = 10000;
				
		int min = 1;
		
		int count = 0;
		
		while ( 1 == 1) {
		
				
			System.out.println("Enter a guess between " + min + " and " + max +" : ");
			
				
			int guess = input.nextInt();
			
		
			if ( guess == rando)
				{System.out.print("You WIN!");
				System.out.println(" It took you " + count + " guesses!");
				}
			
			else if (guess > rando)
				{max = ( guess - 1);
				System.out.println("Lower" );
				count++;
			}
			else
				{System.out.println("Higher");
				min = (guess + 1);
				count++;
		}
		
		}
		}
	}
