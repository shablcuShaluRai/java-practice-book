
// java program for stack


import java.util.*;

 class Stack{

int s[]=new int[10];
int top;
final int max=10;

Stack(){
top=-1;

}


void push(int item){

if(top>=max)
System.out.println("stack is full");
else
{

s[top]=item;
top++;
}

}


void pop()
{
if(top==-1)
System.out.println("stack is empty ");

else
{
System.out.println("popped element from stack "+s[top]);
top--;
}
}

void display(){

for(int i=0;i<=top;i++)
{
System.out.printf(" %d " ,s[i]);
}

}
}

class Stackdemo{

public static void main (String args[])
{

Scanner scan = new Scanner(System.in);

Stack st=new Stack();

while(true){

System.out.println("enter the choice \n 1.push \n 2.pop \n 3.exit");
int opt=scan.nextInt();

switch(opt){
case 1:
   System.out.println("enter the item to push in stack");
    int node=scan.nextInt();
   st.push(node);
 System.out.println(" stack element after pushing");
 st.display();
break;

case 2:
st.pop();
System.out.println("after popped element ");
st.display();
break;


case 3:
System.exit(0);
break;

default:
System.out.println("Invalid option");
}
}
}
}






