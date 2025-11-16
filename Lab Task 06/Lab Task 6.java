Write a program that prompts the user to enter a number within the range of 1 through 10. The program should display the Roman numeral version of that number. 
If the number is outside the range of 1 through 10, the program should display an error message. The following table shows the Roman numerals for the numbers 1 through 10

  import java.util.Scanner;
public class L6{
    public static void main(String[]args){

	Scanner input=new Scanner(System.in);
	int n;
	System.out.println("Enter an integer from 1 to 10: ");
	n=input.nextInt();
switch (n){
	case 1:
		{
		System.out.print("you entered I");
		break;
		}
	case 2:
		{
		System.out.print("You entered II");
		break;
		}
	case 3:
		{
		System.out.print("You entered III");
		break;
		}
	case 4:
		{
		System.out.print("you entered IV");
		break;
		}
	case 5:
		{
		System.out.print("you entered V");
		break;
		}
	case 6:
		{
		System.out.print("you entered VI");
		break;
		}
	case 7:
		{
		System.out.print("you entered VII");
		break;
		}
	case 8:
		{
		System.out.print("you entered VIII");
		break;
		}
	case 9:
		{
		System.out.print("you entered IX");
		break;
		}
	case 10:
		{
		System.out.print("you entered X");
		break;
		}
	default:
		{
		System.out.print("out of range");
		break;
		}

	}

		input.close();
	}
}
