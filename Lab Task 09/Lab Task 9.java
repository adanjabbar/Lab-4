Create a change-counting game that gets the user to enter the number of coins required to make exactly one dollar. The program should prompt the user to enter the number of pennies, nickels, dimes, and quarters. If the total value of the coins entered is equal to one dollar, the program should congratulate the user for winning the game.
Otherwise, the program should display a message indicating whether the amount entered was more than or less than one dollar.

  import java.util.Scanner;
public class L9{
    public static void main(String[]args){

	Scanner input=new Scanner(System.in);
	int p, n, d, q;
   System.out.print("Enter following to make exactly one dollar!");
  
	System.out.print("Enter the number of pennies: ");
        p=input.nextInt();
	System.out.println();

        System.out.print("Enter the number of nickels: ");
        n=input.nextInt();
	System.out.println();

        System.out.print("Enter the number of dimes: ");
        d=input.nextInt();
	System.out.println();
   
        System.out.print("Enter the number of quaters: ");
        q=input.nextInt();
	System.out.println();

        int cents= (q*25) + (d*10) + (n*5) + p; 

        if (cents==100)
		System.out.print(" Congradulations! You have won.");
        else if (cents<1)
		System.out.print(" The amount you entered is less than 1 dollar");
        else
                System.out.print(" The amount you entered is more than 1 dollar");

        input.close();
   }
}
