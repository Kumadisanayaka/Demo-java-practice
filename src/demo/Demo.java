package demo;

import java.util.ArrayList;
import java.util.Random;
class WaterLevelObserver{
    public void update(int waterLevel){
        
    }
}
class Alarm extends WaterLevelObserver{
    @Override
    public void update(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON":"Alarm OFF");
    }
}
class Spliter extends WaterLevelObserver{
    @Override
    public void update(int waterLevel){
        System.out.println(waterLevel>=75 ? "Spliter ON":"Spliter OFF");
    }
}
class Display extends WaterLevelObserver{
    @Override
    public void update(int waterLevel){
        System.out.println("WaterLevel : "+waterLevel);
    }
}
class SMSSender extends WaterLevelObserver{
    @Override
    public void update(int waterLevel){
        System.out.println("Sending SMS..."+waterLevel);
    }
}
class ControlRoom{
    private WaterLevelObserver[] observerArray=new WaterLevelObserver[0];
    private int waterLevel;
    
    private void extendsArray(){
        WaterLevelObserver[] tempObserverArray=new WaterLevelObserver[observerArray.length+1];
        for (int i = 0; i < observerArray.length; i++) {
            tempObserverArray[i]=observerArray[i];
        }
        observerArray=tempObserverArray;
    }
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        extendsArray();
        observerArray[observerArray.length-1]=waterLevelObserver;
    }
    public void setWaterLevel(int waterLevel){
        if(this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
        }
        notifyObserver();
    }
    public void notifyObserver(){
        for (WaterLevelObserver waterLevelObserver : observerArray) {
            waterLevelObserver.update(waterLevel);
        }
    }
}
public class Demo {
    public static void main(String[] args) throws InterruptedException{
        ControlRoom controlRoom=new ControlRoom();
        controlRoom.addWaterLevelObserver(new Alarm());
        controlRoom.addWaterLevelObserver(new Alarm());
        controlRoom.addWaterLevelObserver(new Alarm());
        controlRoom.addWaterLevelObserver(new Display());
        controlRoom.addWaterLevelObserver(new SMSSender());
        controlRoom.addWaterLevelObserver(new Spliter());
        
        Random r=new Random();
        while(true){
            int waterLevel=r.nextInt(101);
            controlRoom.setWaterLevel(waterLevel);
            Thread.sleep(1000);
        }
    }
}
