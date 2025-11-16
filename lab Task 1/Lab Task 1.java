Suppose that x, y, and z are int variables and x = 10 , y = 15 , and z = 2 0. Determine whether the following expressions evaluates to true or false . 

  public class L1{
   public static void main(String[]args){

	int x=10, y=15, z=20;
System.out.println(" ( x=10, y=15, z=20 )");
System.out.println("The expression '!x>10' is: "+( !(x>10)? "True":"False") );
System.out.println("The expression 'x<=5||y<15' is: "+( (x<=5||y<15)? "True":"false") );
System.out.println("The expression '(x!=5)&&(y!=z)' is: "+( (x!=5)&&(y!=z)? "True":"false") );
System.out.println("The expression 'x>=z||(x+y>=z)' is: "+( (x>=z||(x+y>=z))? "True":"False") ); 
System.out.println("The expression '(x<=y-2)&&(y>=z)||(z-2!=20)' is: "+((x<=y-2)&&(y>=z)||(z-2!=20)? "True":"False") );
}
}
