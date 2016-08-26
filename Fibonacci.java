// program for fibonacci series

import java.util.*;

public class Fibonacci{

public static void main(String args[])
{
int f1=0,f2=1,f3;
Scanner scan =new Scanner(System.in);
System.out.println("enter the term to find fibonacci series");
int n=scan.nextInt();

if(n==1)
System.out.print("0");
 else if(n==2)
System.out.print("0 1");
else if(n>2){
System.out.print(" 0 1 ");
n=n-2;

do {
 f3=f1+f2;
 System.out.printf("%d "+f3);
 f1=f2;
 f2=f3;
n--;
}while(n>0);
}}}




