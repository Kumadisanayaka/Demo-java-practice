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
        
        @Override
        public  boolean equals(Object obj){
            Customer c1 = (Customer)obj;
            return this.code == c1.code;
        }

}
class Item{
	private String itemCode;
	private double price;
	Item(String itemCode, double price){
		this.itemCode=itemCode;
		this.price=price;
	}
	public String toString(){
		return itemCode+"-"+price;
	}
        
        @Override
        public  boolean equals(Object obj){
            Item i1 = (Item)obj;
            return this.itemCode == i1.itemCode;
        }
}
class Stack{
	private Node top;
	public void push(Object obj){
		Node n1=new Node(obj);
		n1.next=top;
		top=n1;
	}
	public void pop(){
		if(top!=null){
			top=top.next;
		}
	}
	public void printStack(){
		System.out.println(toString());
	}
	public String toString(){
		String list="[";
		Node temp=top;
		while(temp!=null){
			list+=temp.obj+", "; //temp.obj.toString()
			temp=temp.next;
		}
		return top==null ? "[empty]":list+"\b\b]";
	}
        
        public int search(Object obj){
            Node temp = top;
            int index = 0;
            
            while(temp!=null){
                if(temp.obj.equals(obj)){
                    return index;
                }
                index++;
                temp = temp.next;
            }
            return -1;
        }
	class Node{
		Object obj;
		Node next;
		Node(Object obj){this.obj=obj;}
	}	
}
class Demo{	
	public static void main(String args[]){
		Stack customerStack=new Stack();
		customerStack.push(new Customer(1001,"Nimal"));
		customerStack.push(new Customer(1002,"Bimal"));
		customerStack.push(new Customer(1003,"Amal"));
		System.out.println(customerStack);//{1003-Amal, 1002-Bimal, 1001-Nimal}
		System.out.println();
		System.out.println("Index of 1002-Bimal : "+customerStack.search(new Customer(1002,"Bimal")));//1
		
		Stack itemStack=new Stack();
		itemStack.push(new Item("P001",50.0));
		itemStack.push(new Item("P002",10.0));
		itemStack.push(new Item("P003",60.0));
		System.out.println(itemStack);//{P003-60.0, P002-10.0, P001-50}
		System.out.println("Index of P002-10.0 : "+itemStack.search(new Item("P002",10.0))); //1
	}
}

