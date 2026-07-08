class List{
    private int[] dataArray;
    private int nextIndex;
    private int initSize;
    private double loadFact;

    public List(int initSize, double loadFact) {
        dataArray = new int[initSize];
        nextIndex = 0;
        this.initSize = initSize;
        this.loadFact = loadFact;
    }
    //add
    public void add(int data){
        if(isFull()){
            extendDataArray();
        }
        dataArray[nextIndex++]=data;
    }
    //add data for giver index
    public void add(int index, int data){
        if(index>=0 && index <= nextIndex){
            for (int i = nextIndex-1; i >= index; i--) {
                dataArray[i+1]=dataArray[i];
            }
            dataArray[index]=data;
            nextIndex++;
        }
    }
    //add First
    public void addFirst(int data){
        add(0,data);
    }
    //add Last
    public void addLast(int data){
        add(nextIndex,data);
    }
    //remove
    public void remove(int index){
        if(index>=0 && index < nextIndex){
            for (int i = index; i < nextIndex-1; i++) {
                dataArray[i] = dataArray[i+1];
            }
            --nextIndex;
            trimToSize();
        }
    }
    //remove First
    public void removeFirst(){
        remove(0);
    }
    //remove Last
    public void removeLast(){
        remove(nextIndex-1);
    }
    //set(replace data)
    public void set(int index, int data){
        if(index >= 0 && index < nextIndex){
            dataArray[index]=data;
        }
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
    //get Data
    public int get(int index){
        if(index>=0 && index<nextIndex){
            for (int i = 0; i < nextIndex; i++) {
                if(index==i){
                    return dataArray[i];
                }
            }
        }
        return -1;
    }
    //trimToSize
    public void trimToSize(){
        int[] tempDataArray = new int[nextIndex];
        for (int i = 0; i < tempDataArray.length; i++) {
            tempDataArray[i]=dataArray[i];
        }
        dataArray=tempDataArray;
    }
    //isFull
    public boolean isFull(){
        return nextIndex>=dataArray.length;
    }
    //extend Data Array
    public void extendDataArray(){
        int[]tempDataArray = new int[dataArray.length+(int)(dataArray.length*loadFact)];
        
        for (int i = 0; i < nextIndex; i++) {
            tempDataArray[i]=dataArray[i];
        }
        dataArray=tempDataArray;
    }
    //isEmpty
    public boolean isEmpty(){
        return nextIndex<=0;
    }
    //printList
    public void printList(){
        System.out.print("[");
        for (int i = 0; i < nextIndex; i++) {
            System.out.print(dataArray[i]+", ");
        }
        System.out.print(isEmpty()?"empty]":"\b\b]");
    }
     
}
class Demo{
    public static void main(String args[]){
        List listInit = new List(12, 0.25);
        listInit.add(10);
        listInit.add(20);
        listInit.add(30);
        listInit.add(40);
        listInit.add(50);
        listInit.add(60);
        listInit.printList();
        listInit.add(2, 25);
        System.out.println("");
        listInit.printList();
        listInit.addFirst(8);
        System.out.println("");
        listInit.printList();
        listInit.addLast(70);
        System.out.println("");
        listInit.printList();
        System.out.println("");
        listInit.remove(2);
        listInit.printList();
        System.out.println("");
        listInit.removeFirst();
        listInit.printList();
        System.out.println("");
        listInit.removeLast();
        listInit.printList();
        System.out.println("");
        listInit.set(1, 20);
        listInit.printList();
        System.out.println("");
        System.out.println("indexOf : "+listInit.indexOf(10));
        System.out.println("");
        System.out.println("Data : "+listInit.get(3));
    }
}
