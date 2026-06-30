/*
package demo;
public class VehicleQueue {
    private Node front;
    
    //Add Vehicle
    
    public void add(Vehicle data){
        Node n1 = new Node(data);
        if(isEmpty()){
            front=n1;
        }else{
            Node lastNode = front;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = n1;
        }
    }
   
    //PrintQueue
    
    public void printQueue(){
        System.out.print("[");
        Node temp = front;
        
        while(temp!=null){
            System.out.print(temp.data.Id+",");
            temp = temp.next;
        }
        System.out.print(isEmpty()?"empty]":"\b]");
    }
    
    public boolean isEmpty(){
        return front==null;
    }
    
    public void callPark(){
       Node temp = front;
       
       while(temp!=null){
           temp.data.park();
           temp = temp.next;
       }
    }
    public void remove(){
        if(front!=null){
            front = front.next;
        }
    }
}
class Node{
    Vehicle data;
    Node next;

    public Node(Vehicle data ) {
        this.data = data;
    }
    
}

class Vehicle{
    String Id;

    public Vehicle(String Id) {
        this.Id = Id;
    }
    
    public void park(){
        
    }
}

class Van extends Vehicle{
    
    public Van(String Id) {
        super(Id);
    }
    
     public void park(){
         System.out.println("VanParking "+Id);
    }
    
}

class Car extends Vehicle{
    
    public Car(String Id) {
        super(Id);
    }
    public void park(){
         System.out.println("CarParking "+Id);
    }
    
}

class Bus extends Vehicle{
    
    public Bus(String Id) {
        super(Id);
    }
    public void park(){
         System.out.println("BusParking "+Id);
    }
    
}

class Demo{
    public static void main(String[] args) {
        VehicleQueue queue = new VehicleQueue();
        queue.add(new Car("C001")); 
        queue.add(new Bus("B001")); 
        queue.add(new Bus("B002")); 
        queue.add(new Car("C002")); 
        queue.add(new Car("C003")); 
        queue.add(new Van("V001")); 
        queue.add(new Car("V002")); 
        queue.add(new Bus("B003"));
        
        queue.printQueue();
        System.out.println("");
        queue.callPark();
        queue.remove();
        queue.printQueue();
    }
}

*/

