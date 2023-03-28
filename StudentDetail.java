import java.util.Scanner;
class StudentDetail
{
 static void stuData()
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter Father Name - ");
  String str1 = input.next();
  System.out.println("Enter Mother Name - ");
   String str2 = input.next();
   System.out.println("Enter Student Age - ");
   int age = input.nextInt();
   System.out.println("Enter salary - ");
   double salary = input.nextDouble();
 System.out.println(" Enter Phone number - ");
  int num = input.nextInt();
 System.out.println(" Enter Address - ");
  String str3 = input.next();

 
System.out.println("Father name - "+str1);
 System.out.println("Mother name - "+str2);
 System.out.println(" Studend age - "+age);
 System.out.println(" salary - " +salary);
 System.out.println(" student phone number - " +num);
 System.out.println(" Address is - "+str3);
   
 }

 //static void showData()

public static void main(String arge[])
{
  stuData();
}
 
}