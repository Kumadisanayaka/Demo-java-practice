import java.util.*;
interface WaterLevelObserver{
	abstract public void update(int waterLevel);
}
class Splitter implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println(waterLevel>=75 ? "Splitter ON":"Splitter OFF");
	}	
}
class Alarm implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println(waterLevel>=50 ? "Alarm ON":"Alarm OFF");
	}
}
class Display implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("WaterLevel : "+waterLevel);
	}
}
class SMSSender implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("Sending water level : "+waterLevel);
	}
}
class ControlRoom{
	private ArrayList <WaterLevelObserver>observerList=new ArrayList<>();
	
	private int waterLevel;
	
	public void addWaterLevelObserver(WaterLevelObserver ob){
		observerList.add(ob);
	}
	public void setWaterLevel(int waterLevel){
		if(this.waterLevel!=waterLevel){
			this.waterLevel=waterLevel;
		}
		for(WaterLevelObserver ob : observerList){
			ob.update(waterLevel);
		}
	}
}
class Demo{	
	public static void main(String args[]){
		ControlRoom controlRoom=new ControlRoom();
		controlRoom.addWaterLevelObserver(new Alarm());
		controlRoom.addWaterLevelObserver(new Alarm());
		controlRoom.addWaterLevelObserver(new Display());
		controlRoom.addWaterLevelObserver(new SMSSender());
		controlRoom.addWaterLevelObserver(new SMSSender());
		controlRoom.addWaterLevelObserver(new Splitter());
		Random r=new Random();
		while(true){
			int waterLevel=r.nextInt(101); //0 to 100
			controlRoom.setWaterLevel(waterLevel);
			try{Thread.sleep(1000);}catch(Exception ex){}
			System.out.println();
		}	
	}
}
