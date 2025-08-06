import java.util.*;
public class Ass2_Area_of_circle{
   double r,a;
     public double area()
{
    a =3.14*r*r ;
       return a;
}

public static void main(String args[]){
      Scanner input = new Scanner (System.in);
      Ass2_Area_of_circle a1= new  Ass2_Area_of_circle();
    System.out.println("Enter the value of radius:");
     a1.r=input.nextDouble();
     System.out.println("Area of circle:"+a1.area());

}
}