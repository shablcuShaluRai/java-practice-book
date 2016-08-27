
//swap two numbers in java


import java.util.*;

class Swap{

int a,b;

Swap(int x, int y){

a=x;
b=y;

}

Swap(Swap s){

a=s.a;
b=s.b;

}

void swap(int x,int y)
{
int t=x;
x=y;
y=t;

}

void swap(Swap s){

int t =s.a;
s.a=s.b;
s.b=s.a;
}

}

class Swapdemo{
public static void main(String args[]){

Swap s1=new Swap(10,25);
Swap s2=new Swap(s1);
s2.swap(s1.a,s1.b);
System.out.println(s1.a+" " +s1.b);
s2.swap(s1);
System.out.println(s1.a+" " +s1.b);



}}
