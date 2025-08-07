public class Constractor{
 int roll;
 String name;
   public Constractor(int roll,String name ){
    roll=roll;
    name=name;
System.out.println(roll+","+name);
}
public static void main(String args[]){
    Constractor c=new Constractor(12,"Harshada");

}


}