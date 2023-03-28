import java.util.Scanner;
class FriendsName
{
static void getFriendName()
{
Scanner input = new Scanner(System.in);
System.out.println("Enter First Friend Name - ");
String str1 = input.next();
System.out.println("Enter Second Friend Name - ");
String str2 = input.next();
System.out.println("Enter third Friend Name - ");
String str3 = input.next();

System.out.println("First Friend Name - "+str1);
System.out.println("Second Friend Name - "+str2);
System.out.println("Third Friend Name - "+str3);

}
public static void main(String args[]){
getFriendName();
}
}
