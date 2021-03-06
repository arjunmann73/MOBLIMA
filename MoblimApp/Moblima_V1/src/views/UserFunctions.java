package views;

import java.util.*;
import java.io.*;

/**
 * Displays the user interface for the user module
 * @author Anon
 *
 */
public class UserFunctions {
	
	/**
	 * The main function for this view
	 * @param args for the main function
	 * @throws Exception to throw the exception
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		/**
		 * to keep track of when to exit the used module
		 */
		int exit = 0;
		while(exit != 1) {
			
			int choice = -1;
			while(choice > 7 || choice < 0) {
				System.out.println("-----------------------------------");
				System.out.println("User Module");
				System.out.println("-----------------------------------");
				System.out.println("1. Search all movies");
				System.out.println("2. Movie details");
				System.out.println("3. Book seats");
				System.out.println("4. History");
				System.out.println("5. Top movies");
				System.out.println("6. Movie review");
				System.out.println("7. Go Back");
				System.out.println("8. Exit");
				System.out.print("Please enter your choice: ");
				choice = sc.nextInt();
				System.out.println();
			}
			
			if(choice == 1) {
				SearchMovie.main(null);
			}else if (choice == 2) {
				MovieDetails.main(null);
			}else if(choice == 3) {
				ScreenCRUD_user.main(null);
			}else if(choice == 4) {
				BookingHistory.main(null);
			}else if(choice == 5) {
				Top5List.main(null);
			}else if(choice == 6) {
				Review.main(null);
			}else if(choice == 7){
				Main.main(null);
			}else if(choice == 8) {
				System.out.println("Thanks for using MOBLIMA!");
				System.exit(0);
			}
		}
		
	}

}

