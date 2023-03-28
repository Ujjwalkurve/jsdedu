import java.util.Scanner;
class AdditionSum
{ 
  static int x,y,z;
 static void input()
 { System.out.println("Enter first Num");
   Scanner input = new Scanner(System.in);
   
   x = input.nextInt();
    System.out.println("Enter second Num");
   y = input.nextInt();
   
 
  }
 static void add()
{
 z = x+y;
}
static void result()
{
 System.out.println("The sum is = "+z);
}
public static void main(String args[])
 {
  input();
  add();
  result();
 }  

 } 
