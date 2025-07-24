import java.util.*;
public class SumOfOddEven{
     public static void main(String[] args){
        int n,sumO=0,sumE=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size:");
        n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the numbers:");

        for (int i=0;i<n;i++){
        
             arr[i]=s.nextInt();
                   if(arr[i]%2==0){
                      sumE+=arr[i];
                    }
                   else{
                      sumO+=arr[i];
                      }
                 }
        System.out.println("Sum of odd numbers: "+sumO);
         System.out.println("Sum of even numbers: "+sumE);

         }


        }