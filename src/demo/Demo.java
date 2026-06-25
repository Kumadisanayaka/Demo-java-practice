package demo;

import java.util.Random;

class Alarm{
    public void operateAlarm(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON":"Alarm OFF");
    }
}
class Display{
    public void display(int waterLevel){
        System.out.println("WaterLevel : "+waterLevel);
    }
}
class SMSSender{
    public void sendSMS(int waterLevel){
        System.out.println("Sending SMS..."+waterLevel);
    }
}
class ControlRoom{
    private Alarm alarm;
    private Display display;
    private SMSSender sMSSender;
    
    private int waterLevel;
    

    public void addAlarm(Alarm alarm){
        this.alarm=alarm;
    }
    public void addDisplay(Display display){
        this.display=display;
    }
    public void addSMSSender(SMSSender sMSSender){
        this.sMSSender=sMSSender;
    }
    
    public void setWaterLevel(int waterLevel){
        if(this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
        }
        notifyDevices();
    }
    public void notifyDevices(){
        alarm.operateAlarm(waterLevel);
        display.display(waterLevel);
        sMSSender.sendSMS(waterLevel);
    }
}
public class Demo {
    public static void main(String[] args) throws InterruptedException{
        ControlRoom controlRoom=new ControlRoom();
        controlRoom.addAlarm(new Alarm());
        controlRoom.addDisplay(new Display());
        controlRoom.addSMSSender(new SMSSender());
        
        Random r=new Random();
        while(true){
            int waterLevel=r.nextInt(101);
            controlRoom.setWaterLevel(waterLevel);
            Thread.sleep(1000);
        }
    }
}
