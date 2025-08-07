                    /////////////**** Assignment No:3****/////////////////
                 //program to demonstrate inheritance and method overloading//


//inheritance - access parent class propertise to child class

 class parent{                                                                //don't  use public here
   String Surname ="Pawar";
   int Balance =1000000;

  public void print(){
  System.out.println("Surname:"+ Surname+"\nBalance:"+Balance);
}
public static void main(String args[]){
parent p= new parent ();
p.print();
System.out.println("Hello!");
}


}
public class Child extends parent {

public static void main(String args[]){
   Child c=new Child();
c.print();

}
}



