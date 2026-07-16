package demo;

import java.util.Random;

class Alarm{
    public void operateAlarm(int waterLevel){
        System.out.println(waterLevel>=50?"Alarm ON":"Alarm OFF");
    }
}
class Display{
    public void display(int waterLevel){
        System.out.println("Water Level : "+waterLevel);
    }
}

class SmsSender{
    public void smsSender(int waterLevel){
        System.out.println(waterLevel>=50?"Warning : "+waterLevel:"Normal : "+waterLevel);
    }
}

class ControllRoom{
    private Alarm alarm;
    private Display display;
    private SmsSender smsSender;
    
    private int waterLevel;
    
    public void addAlarm(Alarm alarm){
        this.alarm = alarm;
    }
    
    public void addDisplay(Display display){
        this.display = display;
    }
    
    public void addSmsSender(SmsSender smsSender){
        this.smsSender = smsSender;
    }
    
    public void setWaterLevel(int waterLevel){
        if(this.waterLevel != waterLevel){
            this.waterLevel = waterLevel;
        }
        notifyDevice();
    }
    
    public void notifyDevice(){
        alarm.operateAlarm(waterLevel);
        display.display(waterLevel);
        smsSender.smsSender(waterLevel);
    }
}
class Demo{
    public static void main(String[] args) throws InterruptedException {
        ControllRoom controllRoom = new ControllRoom();
        controllRoom.addAlarm(new Alarm());
        controllRoom.addDisplay(new Display());
        controllRoom.addSmsSender(new SmsSender());
        
        Random r = new Random();
        while(true){
            int waterLevel = r.nextInt(101);
            controllRoom.setWaterLevel(waterLevel);
            Thread.sleep(1000);
                    
        }
    }   
}

