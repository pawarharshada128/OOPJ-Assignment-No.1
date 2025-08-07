//this keyword is used to differtiate between global(member)variable and local variable
import java.util.*;
class employee{
int emp_id;
String name;
int salary;
public employee(int emp_id,String name,int salary)
{
	this.emp_id=emp_id;
	this.name=name;
	this.salary=salary;
	//System.out.println("Employee ID:"+emp_id+" \nEmployee Name:"+name+" \nEmployee Price:"+salary);
	
}
public void display()
{
	System.out.println("Employee ID:"+emp_id+" \nEmployee Name:"+name+" \nEmployee Price:"+salary);


}

public static void main(String args[])
{
	employee b=new employee(1001,"Chava",250);
	b.display();

}



}