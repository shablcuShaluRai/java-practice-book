//dispalying working days and holidays

import java.util.*;

class Weekcode
{

public static void main(String args[]){

Scanner scan=new Scanner(System.in);
 System.out.println("enter the week code ");
 int d=scan.nextInt();

switch(d)
{
 case 1:
case 2:
case 3:
case 4:
case 5:
 case 6:
System.out.println("Working Days");
break;
case 0:
System.out.println("Holiday");
break;
default:
System.out.println("Invalid Daycode");
}
}
}

