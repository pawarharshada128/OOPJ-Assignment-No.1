import java.util.*;
public class Swap2{
     public static void main(String args[]){
      Scanner input = new Scanner(System.in);
int a,b,c;
System.out.println("Enter the value of a: ");
a= input.nextInt();                                 //1
System.out.println("Enter the value of b: ");
b=input.nextInt();                                  //2

System.out.println("Before a,b :"+a +" " +b);

    a = a + b;                             //a=1+2=3   b=3-2=1  a=3-1=2
     b = a - b;                            
    a = a - b; 
System.out.println("After a,b : "+a+" "+b);

}

}