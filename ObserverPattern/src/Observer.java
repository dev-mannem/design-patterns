/*
 * Observer is an interface that contains
 * update method which is used to update
 * the details notified by notifier.
 */
public interface Observer {
	public void update(boolean red,boolean yellow,boolean green);
}
