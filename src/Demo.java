class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class List{
    Node first;
    
    //add(data)
    public void add(int data){
        Node n1 = new Node(data);
        if(isEmpty()){
            first=n1;
        }else{
            Node lastNode = first;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next=n1;
        } 
    }
    //add(index,data)
    public void add(int index,int data){
        Node n1 = new Node(data);
        if(index==0){
            n1.next = first;
            first = n1;
        }else{
            if(index>=0 && index <= size()){
                Node temp = first;
                int count = 0;
                while(count < index-1){
                    count++;
                    temp = temp.next;
                }
                n1.next = temp.next;
                temp.next = n1;
            }
        }
    }
    //addFirst
    public void addFirst(int data){
        add(0,data);
    }
    
    //addLast
    public void addLast(int data){
        add(size(),data);
    }
    
    //remove(index)
    public void remove(int index){
        if(index >=0 && index <size()){
            if(index==0){
                first=first.next;
            }else{
                int count = 0;
                Node temp = first;
                while(count < index-1){
                    count++;
                    temp=temp.next;
                }
                temp.next = temp.next.next;
            }
        }
    }
    //removeFirst
    public void removeFirst(){
        remove(0);
    }
    
    //removeLast
    public void removeLast(){
        remove(size()-1);
    }
    
    //size
    public int size(){
        int count = 0;
        Node temp = first;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    //isEmpty
    public boolean isEmpty(){
        return first==null;
    }
    
    //printList
    public void printList(){
        Node temp = first;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.print(isEmpty()?"empty]":"\b\b]");
    }
}
 
class Demo{
    public static void main(String args[]){
       List l1 = new List();
       l1.add(10);
       l1.add(20);
       l1.add(30);
       l1.add(40);
       l1.add(50);
       l1.add(60);
       l1.printList();
       l1.add(2, 25);
        System.out.println("");
       l1.addFirst(8);
       l1.printList();
       l1.remove(3);
        System.out.println("");
       l1.removeFirst();
       l1.removeLast();
       l1.printList();
       
    }	
}
