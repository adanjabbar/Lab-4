The date June 10, 1960, is special because when it is written in the following format, the month times the day equals the year: 6/10/60 
Design a program that asks the user to enter a month (in numeric form), a day, and a two-digit year.
The program should then determine whether the month times the day equals the year. If so, it should display a message saying the date is magic. Otherwise, it should display a message saying the date is not magic.

import java.util.Scanner;
public class L8{
    public static void main(String[]args){

	Scanner input=new Scanner(System.in);
System.out.print("Enter a month (digit) :");
int month = input.nextInt();
System.out.println();

System.out.print("Enter a day :");
int day = input.nextInt();
System.out.println();

System.out.print("Enter a year (in 2 digits) : ");
int year = input.nextInt();
System.out.println();

int ans = day * month;

	if(ans == year){
		System.out.print("The date is magic!");  }
	else {
		System.out.print("The date is not magic!");   }
input.close();
	}
}
  
