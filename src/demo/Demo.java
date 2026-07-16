package demo;

import java.util.ArrayList;
import java.util.Random;

class WaterLevelObserver{
    public void update(int waterLavel){
    
    }
}
class Alarm extends WaterLevelObserver{
    @Override
    public void update(int waterLevel){
        System.out.println(waterLevel>=50?"Alarm ON":"Alarm OFF");
    }
}
class Spliter extends WaterLevelObserver{
    @Override
    public void update(int waterLevel){
        System.out.println(waterLevel>=50?"Spliter ON":"Spliter OFF");
    }
}
class Display extends WaterLevelObserver{
    @Override
    public void update(int waterLevel){
        System.out.println("Water Level : "+waterLevel);
    }
}

class SmsSender extends WaterLevelObserver{
    @Override
    public void update(int waterLevel){
        System.out.println(waterLevel>=50?"Warning : "+waterLevel:"Normal : "+waterLevel);
    }
}

class ControllRoom{
    private ArrayList<WaterLevelObserver> observerList = new ArrayList<>();
    private int waterLevel;
    
  public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
      observerList.add(waterLevelObserver);
  }
    
    public void setWaterLevel(int waterLevel){
        if(this.waterLevel != waterLevel){
            this.waterLevel = waterLevel;
        }
        notifyDevice();
    }
    
    public void notifyDevice(){
        for (WaterLevelObserver waterLevelObserver : observerList) {
            waterLevelObserver.update(waterLevel);
        }
    }
}
class Demo{
    public static void main(String[] args) throws InterruptedException {
        ControllRoom controllRoom = new ControllRoom();
        controllRoom.addWaterLevelObserver(new Alarm());
        controllRoom.addWaterLevelObserver(new Alarm());
        controllRoom.addWaterLevelObserver(new Spliter());
        controllRoom.addWaterLevelObserver(new Spliter());
        controllRoom.addWaterLevelObserver(new Display());
        controllRoom.addWaterLevelObserver(new SmsSender());
        
        Random r = new Random();
        while(true){
            int waterLevel = r.nextInt(101);
            controllRoom.setWaterLevel(waterLevel);
            Thread.sleep(1000);
                    
        }
    }   
}

