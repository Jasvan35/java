//Practical 2 All operatos in java
public class operator
{
public static void main(String[] args){  //Main Method
int a=10;  // initializing a values and type as integer
int b=5;  // initializing b values and type as integer
System.out.println("Arithmetic operator:+,-,*,/,%");
System.out.println(a+b);  
System.out.println(a-b);
System.out.println(a*b);  
System.out.println(a/b);  
System.out.println(a%b);

System.out.println("Assignment Operator:=,+=,-=,*=,/=");
int s=20;  // initializing s values and type as integer
s+=3;  
System.out.println(s);  
s-=4;  
System.out.println(s);  
s*=2;  
System.out.println(s);  
s/=2;  
System.out.println(s);  
s%=2;
System.out.println(s);  

System.out.println("Camparison Operator:==,!=,<,>,<=,>=");
int x = 5;  // initializing x values and type as integer
int y = 3;  // initializing y values and type as integer
 System.out.println(x == y);
 System.out.println(x != y);
 System.out.println(x > y);
 System.out.println(x < y);
 System.out.println(x >= y);
 System.out.println(x <= y);

System.out.println("Logical Operator:&&,||,!");
System.out.println(x > 3 && x < 10);
System.out.println(x < 5 || x < 4);
System.out.println(!(x < 5 && x < 10));

System.out.println("Ternary Operator:?!");
int c=2;  // initializing c values and type as integer
int d=5;  // initializing d values and type as integer
int hello=(c<d)?c:d;  
System.out.println(hello); 

System.out.println("Bitwise Operator:&,^|==");
		int i=20;  // initializing i values and type as integer
		int t=4;   // initializing t values and type as integer
   System.out.println(i&t);
   System.out.println(i|t);
   System.out.println(i^t);
   
System.out.println("Shift Operator:<<,>>");
System.out.println(10<<2);//10*2^2=10*4=40  
System.out.println(20>>3);//20/2^3=20/8=2 


    System.out.println("Unary Operator:++,--,+,-");
    int g=10;  // initializing g values and type as integer
    int k=10;  // initializing k values and type as integer
System.out.println(g++);//10 (11)  
System.out.println(g--);//12 (11)  
System.out.println(++g);//12 
System.out.println(--g);//10  
System.out.println(g++ + ++g);//10+12=22  
System.out.println(k++ + k++);//10+11=21  
System.out.println(g-- - --g);//10+12=22  
System.out.println(k-- - k--);//10+11=21 
}
}
