import java.util.Scanner;
class Calculat
{
  static int x,y,z;
 static void get()
{
 Scanner input = new Scanner(System.in);
 System.out.println("Enter First Number");
 x = input.nextInt();
 System.out.println("Enter Second Number");
 y = input.nextInt();
}
 public static void main(String args[])
{
 get();
 System.out.println("The First Number is = "+x);
 System.out.println("The Second Number is = "+y);
 System.out.println( x+" and "+y+"Subtract is ="+(x-y));
 System.out.println( x+" and "+y+"division is ="+(x/y));
 System.out.println( x+"multiple"+y+ "is ="+(x*y));

}

}