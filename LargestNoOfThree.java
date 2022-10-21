import java.util.Scanner;
public class LargestNoOfThree{
public static void main(String [ ] args){
Scanner sc = new Scanner (System.in);//Scanner class object creation
int x,y,z;
System.out.println("Enter A value:");
x = sc.nextInt();//Reading input from user
System.out.println("Enter B value:");
y = sc.nextInt();//Reading input from user
System.out.println("Enter C value:");
z = sc.nextInt();//Reading input from user
if(x>y && x>z)//Condition to check the A value is greater or Not
{
System.out.println("A is Largest Number");//Printing the largest number 
}
else if(y>x && y>z)//Condition to check the B value is greater or Not
{
System.out.println("B is Largest Number");//Printing the largest number
}
else//If both condition are false then it will show C value is greater
{
System.out.println("C is Largest Number");//Printing the largest number
}
}
}
