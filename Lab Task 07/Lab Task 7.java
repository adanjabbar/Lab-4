The area of a rectangle is the rectangle’s length times its width.
Write a program that asks for the length and width of two rectangles. The program should tell the user which rectangle has the greater area, or if the areas are the same.

  import java.util.Scanner;
public class L7{
   public static void main(String[]args){

	Scanner input=new Scanner(System.in);
	
    int a, b, c, d;
    System.out.print("Enter the length of 1st rectangle ");
    a=input.nextInt();
    System.out.println();

    System.out.print("Enter the width of 1st rectangle ");
    b=input.nextInt();
    System.out.println();

    System.out.print("Enter the length of 2nd rectangle ");
    c=input.nextInt();
    System.out.println();

    System.out.print("Enter the width of 2nd rectangle ");
    d=input.nextInt();
    System.out.println();

	int rec1=a*b;
        int rec2=c*d;

	if(rec1>rec2)
		System.out.print(" First Rectangle has greater area: "+rec1);
	else
		System.out.print(" Second Rectangle has greater area: "+rec2);
input.close();
}
} 
