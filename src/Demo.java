
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
class Demo{
    public static void main(String args[]){
        Node n1 = new Node(100);
        n1.next = new Node(200);
        n1.next.next = new Node(300);
        n1.next.next.next = n1;
        
        //System.out.println(n1.data+"\n"+n1.next.data+"\n"+n1.next.next.data+"\n"+n1.next.next.next.data);
        
        System.out.print("[");
        while(n1!=null){
            System.out.print(n1.data+", ");
            n1 = n1.next;
        }
        System.out.print("\b\b]");
                
    }	
}

