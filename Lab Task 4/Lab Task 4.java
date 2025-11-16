a) Minimum of two numbers: Given two integers, print the smaller value. b) Minimum of two numbers: Given two integers, print the smaller value. 
c) Sign function: For the given integer X print 1 if it's positive, -1 if it's negative, or 0 if it's equal to zero. d) Minimum of three numbers: Given three integers, print the smallest value.

  import java.util.Scanner;
public class L4{
    public static void main(String[]args){

	Scanner input=new Scanner(System.in);
	int a, b;
System.out.print("Enter 2 integers :");    // part a
a= input.nextInt();
System.out.println();
b = input.nextInt();
System.out.println();

if(a<b){
	System.out.println(a + " is smaller value"); }
else {
	System.out.println(b + " is smaller value"); }

System.out.print("Enter an integer : ");      //part c
int c = input.nextInt();

	if(c>0){
		System.out.println(" 1 (positive) "); }
	else if(c<0){
		System.out.println(" -1 (negative) "); }
	else {
		System.out.println(" 0 (zero) "); }

System.out.println("Enter 3 integers : ");
	int x = input.nextInt();
System.out.println();
	int y = input.nextInt();
System.out.println();
	int z = input.nextInt();
System.out.println();

if (x<y && x<z){
	System.out.print(x + " is smallest value"); }
else if (y<x && y<z){
	System.out.print(y + " is smallest value"); }
else {
	System.out.print(z + " is smallest value"); }


	input.close();
	}
}
