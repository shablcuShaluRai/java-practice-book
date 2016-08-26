//program for temprature converter
import java.io.*;
public class Temprature{

public static void main(String args[]) throws IOException
{
 
 double c,f;
 InputStreamReader ipr=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(ipr);
 System.out.println("Enter the farenhite temprature");
 f=Double.parseDouble(br.readLine());
 c=(5.0/9.0)*(f-32.0);
 System.out.println("Celsius Temprature"+c);
}
}
 

