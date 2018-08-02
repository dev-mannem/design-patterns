/*
 * java.util.ArrayList is imported 
 * as ArrayList is a predefined
 * class in java.util package.
 */
import java.util.ArrayList;

/*
 * Trafficlights is a class which implements Subject interface
 * Hence overrides the methods in Subject interface and
 * also defines other methods like getRed,getGreen,
 * getYellow,setValues and valuesChanged.
 */
public class TrafficLights implements Subject {
	private ArrayList observers;
	private boolean red;
	private boolean yellow;
	private boolean green;
	
	public TrafficLights(){
		/*
    	 * This method is a constructor method with 
    	 * no arguments.
    	 */
		observers=new ArrayList();
	}

	public void registerObserver(Observer o) {
		/*
		 * registerObserver method is used to register
		 * observers.
		 */
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		/*
		 * removeObserver method is used to 
		 * remove observers.
		 */
		int i=observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		/*
		 * notifyObservers method is used to notify all 
		 * the observers about the changes or updates.
		 */
		for(int i=0;i<observers.size();i++){
			Observer observer=(Observer)observers.get(i);
			observer.update(red, yellow, green);
		}
	}
	
	public void valuesChanged(){
		/*
		 * valuesChanged method notifies the 
		 * observers about the changes in values.
		 */
		notifyObservers();
	}
	
	public void setValues(boolean red,boolean yellow,boolean green){
		/*
    	 * setValues method is used to set the interest
    	 * value returned by get methods.
    	 */
		this.red=red;
		this.yellow=yellow;
		this.green=green;
		valuesChanged();
	}
	
	public boolean getRed(){
		/*
    	 * getRed method is used to get the 
    	 * red value.
    	 */
		return red;
	}
	
	public boolean getYellow(){
		/*
    	 * getYellow method is used to get the 
    	 * yellow value.
    	 */
		return yellow;
	}
	
	public boolean getGreen(){
		/*
    	 * getGreen method is used to get the 
    	 * green value.
    	 */
		return green;
	}
}
