
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Contact{
    private String contactId;
    private String name;
    private String phoneNo;

    public Contact(String contactId, String name, String phoneNo) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    /**
     * @return the contactId
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * @param contactId the contactId to set
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
class Demo{
    public static void main(String args[]) throws IOException{
       /*Contact c1 = new Contact("C001", "Pathum", "0705614020");
       
        FileWriter fw = new FileWriter("contact.txt",true);
        fw.write(c1.getContactId()+","+c1.getName()+","+c1.getPhoneNo());
        fw.write("\n");
        fw.flush();*/
       
       Scanner input = new Scanner(new File("contact.txt"));
       FileWriter fw = new FileWriter("tempcontact.txt");
       String line = input.nextLine();
       while(input.hasNext()){
           fw.write(line+"\n");
           line = input.nextLine();
       }
       input.close();
       fw.close();
    }	
}
