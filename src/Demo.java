import java.util.*;
import java.io.*;
class Demo{
	public static void main(String args[])throws IOException{
	Scanner input=new Scanner(("Demo.java"));
            
            FileWriter fw = new FileWriter("demo.txt");
            while(input.hasNext()){
            String line = input.nextLine();
            fw.write(line+"\n");
            }
            input.close();
            fw.close();
	}
}

