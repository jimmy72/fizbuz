package be.vdab.main;
import java.util.Scanner;

import be.vdab.valueobjects.FizBuz;
public class FizBuzApp {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
            int number;
            do{
                System.out.println("Type a number (-1 to terminate the program): ");
                while (!scanner.hasNextInt()) {
                    String input = scanner.next();
                    System.out.printf("\"%s\" is not a number! Please type a number.\n", input);
                    System.out.println();
                }
	            number = scanner.nextInt();
				if(number != -1) {
					FizBuz fizBuz = new FizBuz(number);
					System.out.println(fizBuz.whoAmI());
				}else {
					System.out.println("Program has stopped!");
				}
	        }while (number != -1);
		}
	}
}