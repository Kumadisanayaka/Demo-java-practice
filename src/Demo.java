interface Vehicle{
	default public void park(){  //Legal, since JDK1.8
		System.out.println("default implementation..");
	}
	public void start();//abstract
}
class Car implements Vehicle{
	public void start(){
		System.out.println("Car start...");
	}
        
        public void park(){
            System.out.println("car parking...");
        }
}
class Demo{	
	public static void main(String args[]){
		Vehicle v1=new Car();
		v1.park();
		v1.start();
	}
}
