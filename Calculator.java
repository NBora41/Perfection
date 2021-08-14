import java.util.*;
interface operators
{
void sum(int a,int b);
void sub(int a,int b);
void multi(int a,int b);
void div(int a,int b);
void mod(int a,int b);
}
public class Calculator implements operators{
public void sum(int x,int y)
{
System.out.println("Sum: "+(x+y));
}
public void sub(int x,int y)
{
System.out.println("Difference: "+(x-y));
}
public void multi(int x,int y)
{
System.out.println("Product: "+(x*y));
}

public void div(int x,int y)
{
System.out.println("division: "+(x/y));
}
public void mod(int x,int y)
{
System.out.println("modulus: "+(x%y));
}

public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
Calculator cal=new Calculator();
System.out.println("Enter 2 numbers:");
int x=sc.nextInt();
int y=sc.nextInt();

System.out.println("enter ur choice:+,-,*,/,%");

int c=sc.nextInt();
switch(c)
{
case 1:
cal.sum(x,y);
break;
case 2:
cal.sub(x,y);
break;
case 3:
cal.multi(x,y);
break;

case 4:
cal.div(x,y);
break;

case 5:
cal.mod(x,y);
break;

default:
System.out.println("Invalid choice");
break;
}

}
}

