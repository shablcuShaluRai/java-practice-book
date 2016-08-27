// program for employee salary report

import java.util.*;

class Employeedata{

Scanner scan=new Scanner(System.in);
double hra,da,pf,bs,totalsalary;
int eno;
String ename,dname;




void readData(){

System.out.println("enter the employee number");
 eno=scan.nextInt();
System.out.println("enter the employee name");
scan.nextLine();
 ename=scan.nextLine();
System.out.println("enter the department name");
dname=scan.nextLine();
System.out.prinln("enter the basic salary");
bs=scan.nextInt();

}

void calculate(){
if(dname.equals("computer")){
hra=bs*0.40;
da=bs*0.30;
pf=bs*0.20;
}
else if(dname.equals("personal")){

hra=bs*0.35;
da=bs*0.25;
pf=bs*0.10;
}

else
{

hra=bs*0.05;
da=bs*0.03;
pf=bs*0.02;
}


 totalsalary=bs+hra+da-pf;
}

void diaplay(){

System.out.println("Empolyee no "+eno);
System.out.println("Empolyee name "+ename);
System.out.println("Department name "+dname);
System.out.println("Basic salary "+bs);
System.out.println("TOtal salary "+totalsalary);


}





class Employee{


public static void main(String args[])
{

Scanner scan=new scanner(System.in);

Emloyeedata ed[]=new Employeedata[10];

for(int i=0;i<n;i++){

ed[i]=new Employeedata();
System.out.println("enter the employee detail ");

ed[i].readData();
}

for(int i=0;i<n;i++){

emp[i].calculate();
emp[i].display();
}
}

}







