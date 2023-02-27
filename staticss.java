package kus1;
import java.util.*;
class student{
	int rollno;
	String name;
	 String cname="XYZ college";
student(int x , String y){
	rollno=x;
	name=y;
}
void display() {
	System.out.println("name is "+name+ "\n Roll no ="+ rollno + "college name is " + cname);
	
}


public class staticss {

	public static void main(String[] args) {
		student aa=new student(101,"kushagra");
		student bb= new student (102,"ankit");
		aa.display();
		bb.display();
		
		
	}
	
}
}
