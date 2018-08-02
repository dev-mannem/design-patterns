/*
 * Subject is an interface which has methods
 * to register, remove and notify observers.
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
