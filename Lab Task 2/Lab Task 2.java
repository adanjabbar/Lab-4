Suppose that x, y, z,and w are int variables and x = 3, y = 4, z = 7,and w =1. What is the output of the following statements? 
System.out.println("x == y: " + (x == y )); System.out.println("x != z: " + (x != z )); System.out.println("y == z – 3: " + (y == z – 3) );
System.out.println("!(z > w): " + ! (z > w)); System.out.println("x + y < z: " + (x + y < z));


public class L2{
  public static void main(String[]args){
 int x=3, y=4, z=7, w=1;

System.out.println(" ( x=3, y=4, z=7, w=1 ) ");
System.out.println("x==y: " +(x==y));
System.out.println("x!=z: " +(x!=z));
System.out.println("y==z-3: " +(y==z-3));
System.out.println("!(z>w): " +!(z>w));
System.out.println("x+y<z: "+(x+y<z));
}
}
