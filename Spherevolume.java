// program for finding volume of sphere


import java.io.*;

class Sphere{
int r,h;
double area;

void getData(int radius ,int height)
{
 r=radius;
 h=height;
}

void calculate()
{
 area=(4.0/3.0)*Math.PI*r*r*h;
System.out.println(area);
}

}

class Spherevolume{

public static void main(String args[]){

Sphere s=new Sphere();

s.getData(6,4);
s.calculate();

//System.out.println("volume of sphere is="+s.calculate() );
}
}
