Serendipity Booksellers has a book club that awards points to its customers based on the number of books purchased each month. The points are awarded as follows: 
• If a customer purchases 0 books, he or she earns 0 points. • If a customer purchases 1 book, he or she earns 5 points.
• If a customer purchases 2 books, he or she earns 15 points. • If a customer purchases 3 books, he or she earns 30 points. •
If a customer purchases 4 or more books, he or she earns 60 points. Write a program that asks the user to enter the number of books that he or she has purchased this month and displays the number of points awarded.

import java.util.Scanner;
public class L10{
    public static void main(String[]args){

	Scanner input=new Scanner(System.in);
int b, p;

System.out.println("\t AWARDS \n 0 Books = 0 points \n 1 book = 5 points 
\n 2 books = 15 points \n 3 books = 30 points \n 4 books = 60 points");

System.out.print("Enter the books purchased : ");
b = input.nextInt();
System.out.println();

if(b == 0){
	System.out.print("You earned zero points"); }
else if(b == 1){
	System.out.print("You earned 5 points"); }
else if(b == 2){
	System.out.print("You earned 15 points"); }
else if(b == 3){
	System.out.print("You earned 30 points"); }
else {
	System.out.print("You earned 60 points"); }

	input.close();
	}
}
  
