class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
class Queue{
    private Node front;
    
    //add data
    public void add(int data){
        Node n1 = new Node(data);
        if(isEmpty()){
            front=n1;
        }else{
            Node lastNode = front;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
            }
            lastNode.next = n1;
        }
    }
    //remove data
    public void remove(){
        if(front!=null){
            front = front.next;
        }
    }
    //isEmpty
    public boolean isEmpty(){
        return front==null;
    }
    //peek
    public int peek(){
        return isEmpty()?-1:front.data;
    }
    
    //poll
    public int poll(){
        if(isEmpty()){
            return -1;
        }
        int topData = front.data;
        remove();
        return topData;
    }
    //printQueue
    public void printQueue(){
        Node temp = front;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.print(isEmpty()?"empty]":"\b\b]");
    }
    //size
    public int size(){
        int count = 0;
        Node temp = front;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    //indexOf
    public int indexOf(int data){
        int index = 0;
        Node temp = front;
        while(temp!=null){
            if(temp.data==data){
                return index;
            }
            index++;
            temp = temp.next;
        }
        return index;
    }
    
}
class Demo{
    public static void main(String args[]){
       Queue q1 = new Queue();
       q1.add(10);
       q1.add(20);
       q1.add(30);
       q1.add(40);
       q1.add(50);
       q1.printQueue();
        System.out.println("");
        System.out.println("size : "+q1.size());
       q1.printQueue();
        System.out.println("indexOf : "+q1.indexOf(20));
    }	
}
