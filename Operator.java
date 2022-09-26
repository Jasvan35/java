// Name : S JASVAN SUNDAR               

// Batch : 2576

//All operator in java

public class operator
{
public static void main(String[] args){  //Main Method
int a=10;  // initializing a values and type as integer
int b=5;  // initializing b values and type as integer
System.out.println("Arithmetic operator:+,-,*,/,%"); // Displaying the assigned values
System.out.println(a+b);  // Addition Operator 
System.out.println(a-b);  // Subtraction Operator
System.out.println(a*b);  // Multiplication Operator
System.out.println(a/b);  // Division Operator
System.out.println(a%b);  // Modulus Operator
 
System.out.println("Assignment Operator:=,+=,-=,*=,/=");
int s=20;  // initializing s values and type as integer
s+=3;   // Adding & Assigning values
System.out.println(s);  // Displaying the assigned values
s-=4;   // Subtracting & Assigning values
System.out.println(s);  // Displaying the assigned values
s*=2;  // Multiplying & Assigning values
System.out.println(s);  // Displaying the assigned values
s/=2;  // Dividing & Assigning values
System.out.println(s);  // Displaying the assigned values
s%=2;   // Moduling & Assigning values
System.out.println(s);  // Displaying the assigned values

System.out.println("Camparison Operator:==,!=,<,>,<=,>=");
int x = 5;  // initializing x values and type as integer
int y = 3;  // initializing y values and type as integer
 System.out.println(x == y);  // Equal to Operator
 System.out.println(x != y);  // Not equal Operator
 System.out.println(x > y);   // Greater than Operator
 System.out.println(x < y);   // Less than Operator
 System.out.println(x >= y);  // Greater than or equal to Operator
 System.out.println(x <= y);  // Less than or equal to Operator

System.out.println("Logical Operator:&&,||,!");
System.out.println(x > 3 && x < 10);  // Logical and Operator
System.out.println(x < 5 || x < 4);   // Logical or Operator
System.out.println(!(x < 5 && x < 10)); // Logical not Operator

System.out.println("Ternary Operator:?!");
int c=2;  // initializing c values and type as integer
int d=5;  // initializing d values and type as integer
int hello=(c<d)?c:d;  // Performing ternary operation
System.out.println(hello); // Displaying the assigned values

System.out.println("Bitwise Operator:&,^|==");
int i=20;  // initializing i values and type as integer
int t=4;   // initializing t values and type as integer
System.out.println(i&t); // bitwise and
System.out.println(i|t); // bitwise or
System.out.println(i^t); // bitwise xor
   
System.out.println("Shift Operator:<<,>>");
System.out.println(10<<2);  //  Left Shifting   
System.out.println(20>>3);  //  Right Shifting 


    System.out.println("Unary Operator:++,--,+,-");
    int g=10;  // initializing g values and type as integer
    int k=10;  // initializing k values and type as integer
System.out.println(g++);  // postfix Increment Operator
System.out.println(g--);// postfix Decrement Operator
System.out.println(++g);// prefix Increment Operator
System.out.println(--g);// prefix Decrement Operator
System.out.println(g++ + ++g);//10+12=22  
System.out.println(k++ + k++);//10+11=21  
System.out.println(g-- - --g);//10+12=22  
System.out.println(k-- - k--);//10+11=21 
}
}
