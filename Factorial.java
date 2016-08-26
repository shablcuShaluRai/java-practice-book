// program for factorial


import java.util.*;

class Factorial
{

public static void main(String args[])
{
  int fact=1,n;
 Scanner scan=new Scanner(System.in);
 System.out.println("enter the number ");
 n=scan.nextInt();

for(int i=1;i<n;i++)
{
 fact=fact*i;
}
System.out.println(fact);
}
}
 
