class Queue{
    private int[] dataArray;
    private int nextIndex;
    private int initSize;
    private double loadFact;

    public Queue(int initSize, double loadFact) {
        dataArray = new int[initSize];
        nextIndex = 0;
        this.initSize = initSize;
        this.loadFact = loadFact;
    }
    
    //Add
    public void add(int data){
        if(isFull()){
            extendDataArray();
        }
        dataArray[nextIndex++]=data;
    }
    
    //isFull
    public boolean isFull(){
        return nextIndex >= dataArray.length;
    }
    //extend Data Array
    public void extendDataArray(){
        int[] tempDataArray = new int[dataArray.length+(int)(dataArray.length*loadFact)];
        
        for (int i = 0; i < nextIndex; i++) {
            tempDataArray[i]=dataArray[i];
        }
        dataArray=tempDataArray;
    }
    //isEmpty
    public boolean isEmpty(){
        return nextIndex<=0;
    }
    
    //remove
    public void remove(){
        if(!isEmpty()){
            for (int i = 0; i < nextIndex-1; i++) {
                dataArray[i]=dataArray[i+1];
            }
            nextIndex--;
            trimToSize();
        }
    }
    //trimToSize
    public void trimToSize(){
        int[] tempdataArray=new int[nextIndex];
        for (int i = 0; i < nextIndex; i++) {
            tempdataArray[i]=dataArray[i];
        }
        dataArray=tempdataArray;
    }
    //printQueue
    public void printQueue(){
        System.out.print("[");
        for (int i = 0; i < nextIndex; i++) {
            System.out.print(dataArray[i]+", ");
        }
        System.out.println(isEmpty()?"empty]":"\b\b]");
    }
    //indexOf
    public int indexOf(int data){
        if(!isEmpty()){
            for (int i = 0; i < nextIndex; i++) {
                if(dataArray[i]==data){
                    return i;
                }
            }
        }
        return -1;
    }
    //size
    public int size(){
        return nextIndex;
    }
    //peek
    public int peek(){
        return isEmpty()?-1:dataArray[0];
    }
    //poll
    public int poll(){
        if(isEmpty()){
            return -1;
        }
        int frontData = dataArray[0];
        remove();
        return frontData;
    }
    
    
}
class Demo{
    public static void main(String args[]){
        Queue queueInit = new Queue(12, 0.25);
        queueInit.add(10);
        queueInit.add(20);
        queueInit.add(30);
        queueInit.add(40);
        queueInit.printQueue();
        System.out.println("indexOf : "+queueInit.indexOf(50));//2
        queueInit.remove();
        queueInit.printQueue();
        System.out.println("top data : "+queueInit.peek());
        System.out.println("top data : "+queueInit.poll());
        queueInit.printQueue();
        
    }
}
