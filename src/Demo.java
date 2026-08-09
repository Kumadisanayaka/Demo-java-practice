import java.util.*;
class Customer{
	int code;
	String name;
	Customer(int code, String name){
		this.code=code;
		this.name=name;
	}
	public String toString(){
		return code+"-"+name;
	}
	public boolean equals(Object obj){
		Customer c1=(Customer)obj;
		return this.code==c1.code;
	}
}

class Demo{	
	public static void main(String args[]){
		ArrayList <Customer>customerList=new ArrayList<>();
		customerList.add(new Customer(1001,"Nimal")); 
		customerList.add(new Customer(1002,"Bimal"));
		customerList.add(new Customer(1003,"Amal")); 
		
		ArrayList objectList=customerList;
		objectList.add("Niroth"); //Object type
		objectList.add(100); //Object type
		
		System.out.println(customerList);
	}
}
