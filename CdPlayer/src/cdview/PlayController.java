package cdview;

public class PlayController implements ControllerInterface {
	PlayModelInterface model;
	CDView view;
   
	public PlayController(PlayModelInterface model) {
		this.model = model;
		view = new CDView(this, model);
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
  
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
  
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
    
	public void forward() {
        int min = model.getMIN();
        model.setMIN(min + 3);
	}
    
	public void backward() {
        int min = model.getMIN();
        model.setMIN(min - 3);
  	}
	
	public void initial(){
		model.setMIN(0);
	}
  
 	public void setMIN(int min) {
		model.setMIN(min);
	}
}
