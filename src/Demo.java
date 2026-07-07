class MyClass{
	long[] ar=new long[1000000];
}
class Demo{
	public static void main(String args[]){
		System.out.println("Start main");
		MyClass[] ar=new MyClass[100000];
		for(int i=0; i<100000; i++){
			System.out.println("i : "+i);
			ar[i]=new MyClass();
		}
		System.out.println("End main");
	}
}
