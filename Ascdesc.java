//program for ascending order and descending number


import java.util.*;

class Ascdesc
{

public static void main(String args[])
{
  int n,i;
int a[]=new int[10];
 Scanner scan=new Scanner(System.in);
 System.out.println("how many number ");
 n=scan.nextInt();
 
System.out.println("enter the number");
for( i=0;i<n;i++){
a[i]=scan.nextInt();
}
for(i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("Ascending order \n");
for( i=0;i<=n;i++)
System.out.println(a[i]);
}
}


 
