import java.util.*;
public class Ass2_Area_of_Triangle {
   double base,height,a;
     public double area()
{
    a =(0.5)*base *height ;
       return a;


}

public static void main(String args[]){
      Scanner input = new Scanner (System.in);
      Ass2_Area_of_Triangle a1= new  Ass2_Area_of_Triangle();
      System.out.println("Enter the value of base and Height:");
     a1.base=input.nextFloat();
     a1.height=input.nextFloat();
     System.out.println("Area of Triangle:"+a1.area());

}
}