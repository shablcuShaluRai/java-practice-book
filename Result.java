import java.util.*;
public class Result
{
 public static void main(String args[])
{
 Scanner scan=new Scanner(System.in);
 int rollno,hindi,english,math,science,sst,result,percentage;
   String sname;
 
System.out.println("enter the roll no ");
rollno=scan.nextInt();
scan.nextLine();
System.out.println("enter student name "); 
sname=scan.nextLine();
System.out.println("enter marks of hindi "); 
hindi=scan.nextInt();
System.out.println("enter marks of english "); 
english=scan.nextInt();
System.out.println("enter marks of math"); 
math=scan.nextInt();
System.out.println("enter marks of science "); 
science=scan.nextInt();
System.out.println("enter marks of sst "); 
sst=scan.nextInt();
result=hindi+english+math+science+sst;
percentage=(result/5);

//System.out.println("your marks of enlish "+english+ " hindi "+hindi+ "\n math " +math+ "\n science "+science+ "\n sst "+sst);


System.out.println("your roll no "+rollno+" your name is "+sname+" result "+result+" percentage " +percentage);


if(percentage>=60)
 System.out.println("first division");
else 
if(percentage>60 && percentage>=50)
System.out.println("second division");
else 
System.out.println("third division");

}
}

