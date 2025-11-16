Equal numbers: Given three integers, determine how many of them are equal to each other. 
The program must print one of these numbers: 3 (if all are the same), 2 (if two of them are equal to each other and the third is different) or 0 (if all numbers are different).

  import java.util.Scanner;
public class L5{
    public static void main(String[]args){

	Scanner input=new Scanner(System.in);

	int a, b, c;
System.out.println("This prgram checks for same numbers: 3 if all are same, 2 if 2 are same, 1 if none is same.");
System.out.println("Enter 1st integer: ");
a=input.nextInt();
System.out.println();

System.out.println("Enter 2nd integer: ");
b=input.nextInt();
System.out.println();

System.out.println("Enter 3rd integer: ");
c=input.nextInt();
System.out.println();

if((a==b)&& (b==c))
	System.out.print("Output: 3");
else if((a==b) || (a==c))
	System.out.print("Output: 2");
else
	System.out.print("Output: 1");
  input.close();

}
}
