package cdview;

public class CdTestDrive {
	public static void main (String[] args) {
        PlayModelInterface model = new PlayModel();
		ControllerInterface controller = new PlayController(model);
    }
	

}

