// program for reverse and sum of individual digit of number
import java.util.*;

class Revnumber{

public static void main(String args[])
{
 int digit,revno,sum=0,rev=0;
  Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
  int no =scan.nextInt();

while(no!=0){
digit=no%10;
no=no/10;
sum=sum+digit;
rev=rev*10+digit;
}
System.out.println(" sum "+sum+ " reverse number "+rev);
}
}



 
