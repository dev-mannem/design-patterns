package cdview;

import java.util.*;

public class PlayModel implements PlayModelInterface{
	ArrayList<PlayObserver> playObservers = new ArrayList<PlayObserver>();
	ArrayList<MINObserver> minObservers = new ArrayList<MINObserver>();
	int min = 90;

	public void on() {
		setMIN(90);
	}

	public void off() {
		setMIN(0);
	}

	public void setMIN(int min) {
		this.min = min;
		notifyMINObservers();
	}

	public int getMIN() {
		return min;
	}

	void playEvent() {
		notifyPlayObservers();
	}


	public void registerObserver(PlayObserver o) {
		playObservers.add(o);
	}

	public void notifyPlayObservers() {
		for(int i = 0; i < playObservers.size(); i++) {
			PlayObserver observer = (PlayObserver)playObservers.get(i);
			observer.updatePlay();
		}
	}

	public void registerObserver(MINObserver o) {
		minObservers.add(o);
	}

	public void notifyMINObservers() {
		for(int i = 0; i < minObservers.size(); i++) {
			MINObserver observer = (MINObserver)minObservers.get(i);
			observer.updateMIN();
		}
	}


	public void removeObserver(PlayObserver o) {
		int i = playObservers.indexOf(o);
		if (i >= 0) {
			playObservers.remove(i);
		}
	}



	public void removeObserver(MINObserver o) {
		int i = minObservers.indexOf(o);
		if (i >= 0) {
			minObservers.remove(i);
		}
	}

}
