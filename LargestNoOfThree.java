import java.util.Scanner;
public class LargestNoOfThree{
public static void main(String [ ] args){
Scanner sc = new Scanner (System.in);
int x,y,z;
System.out.println("Enter A value:");
x = sc.nextInt();
System.out.println("Enter B value:");
y = sc.nextInt();
System.out.println("Enter C value:");
z = sc.nextInt();
if(x>y && x>z){
System.out.println("A is Largest Number");
}
else if(y>x && y>z){
System.out.println("B is Largest Number");
}
else{
System.out.println("C is Largest Number");
}
}
}
