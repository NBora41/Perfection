import java.util.Scanner;
public class Accounts{
static int accno;
double balance;
 static Scanner sc =new Scanner(System.in);

  public static void main(String args[]){

  System.out.print("Enter account number:");

 accno = sc.nextInt();
 System.out.print("Enter balance:");

 Accounts ac =new Accounts();
 ac.balance = sc.nextDouble();

  if(ac.balance==0.0){
   ac.deposit(ac.balance);
  }
  else
   {  System.out.println("1.WITHDRAW   2.DEPOSIT");

   int choice = sc.nextInt();
  //switch()

  switch(choice)
  {
 case 1:
   ac.withdraw(ac.balance);
  break;
 case 2:
 ac.deposit(ac.balance);
 break;
 default:
 System.out.println("invalid input");

 }
}

}
 void withdraw(double balance){
 System.out.print("Enter Amount you want to withdraw :");
 double witdrw = sc.nextDouble();

if( witdrw<=balance){
   System.out.println("Balance:"+(balance - witdrw)); 
}
else
 System.out.println("Required Amount can not be withdrawal");

}
void deposit(double balance){
System.out.print("Amount to be deposit:");
 double deposit=sc.nextDouble();
 System.out.println("Balance:"+(deposit + balance));

}
}