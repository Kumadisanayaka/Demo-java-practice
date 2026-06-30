
package demo;
public class CustomerStack {
    Node top;
    //add Customer
    public void push(Customer data){
        Node n1 = new Node(data);
        n1.next = top;
        top = n1;
    }
    //remover Customer
    public void pop(){
        if(top!=null){
            top = top.next;
        }
    }
    //isEmpty check
    public boolean isEmpty(){
        return top==null;
    }
    //print Customer Stack
    public void printStack(){
        System.out.print("[");
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data.getCode()+"-"+temp.data.getName()+",");
            temp = temp.next;
        }
        System.out.print(isEmpty()?"empty]":"\b]");
    }
    
}
class Node{
    Customer data;
    Node next;

    public Node(Customer data) {
        this.data = data;
    }
    
}

class Customer{
    private int code;
    private String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public int getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    
}

class Demo{
    public static void main(String[] args) {
        CustomerStack stack = new CustomerStack();
        stack.push(new Customer(1001,"Danapala")); 
        stack.push(new Customer(1002,"Gunapala")); 
        stack.push(new Customer(1003,"Somapala")); 
        stack.push(new Customer(1004,"Siripala"));
        stack.printStack();
        System.out.println("");
        stack.pop();
        stack.printStack();
    }
}