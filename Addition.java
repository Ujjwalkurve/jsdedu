import java.util.Scanner;
class Addition
{ 
  static int x,y,z;
 static void input()
 { System.out.println("Enter first Num");
   Scanner input = new Scanner(System.in);
   
   x = input.nextInt();
   
   y = input.nextInt();
   
 
  }
 static void add()
{
 z = x+y;
}
static void result()
{
 System.out.println(z);
}
public static void main(String args[])
 {
  input();
  add();
  result();
 }

 } 
