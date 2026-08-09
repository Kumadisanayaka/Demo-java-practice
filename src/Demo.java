class Stack{
	private Node top;
	
	public void push(int data){
		Node n1=new Node(data);
		n1.next=top;
		top=n1;
	}
	public void pop(){
		if(top!=null){
			top=top.next;
		}
	}
	public void printStack(){
		Node temp=top;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println("\b\b]");
	}
        
        @Override
        public String toString(){
            Node temp=top;
            String dataArray = "[";
            
            while(temp!=null){
                dataArray += temp.data+", ";
                temp=temp.next;
            }
            dataArray += "\b\b]";
            
            return dataArray;
            
        }
	class Node{
		int data;
		Node next;
		Node(int data){this.data=data;}
	}	
}
class Demo{	
	public static void main(String args[]){
		Stack intStack=new Stack();
		intStack.push(10);
		intStack.push(20);
		intStack.push(30);
		intStack.push(40);
		intStack.push(50);
		intStack.printStack(); //[50,40,30,20,10]
                System.out.println(intStack); //[50,40,30,20,10]
	}
}
