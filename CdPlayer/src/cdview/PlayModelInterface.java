package cdview;

public interface PlayModelInterface {
	
	void on();
  
	void off();
  
    void setMIN(int min);
  
	int getMIN();
  
	void registerObserver(PlayObserver o);
  
	void removeObserver(PlayObserver o);
  
	void registerObserver(MINObserver o);
  
	void removeObserver(MINObserver o);
}
