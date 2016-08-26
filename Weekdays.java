import java.util.*;
class Weekdays{
public static void main(String args[])
{
 Scanner scan=new Scanner(System.in);
 System.out.println("enter the week code ");
 int d=scan.nextInt();

switch(d)
{
 case 1:
System.out.println("Day:MONDAY");
break;
 case 2:
System.out.println("Day:TUESDAY");
break;
 case 3:
System.out.println("Day:WEDNESDAY");
break;
 case 4:
System.out.println("Day:THURSDAY");
break;
case 5:
System.out.println("Day:FRIDAY");
break;
 case 6:
System.out.println("Day:SATURDAY");
break;
case 0:
System.out.println("Day:SUNDAY");
break;
default:
System.out.println("Invalid Daycode");
}
}
}

