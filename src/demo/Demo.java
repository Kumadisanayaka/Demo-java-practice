 package demo;
 class Customer /*compiler "extends Object" */{
     
 }
class Demo{
    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.getClass();  //Legal ?
        c1.hashCode();  //Legal ?
        c1.toString();  //Legal ?
        c1.equals(c1);  //Legal ?
    }   
}
