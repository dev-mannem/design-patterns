package cdview;
  
import java.awt.Color;

import javax.swing.*;

public class Play extends JProgressBar implements Runnable  { 
	private static final long serialVersionUID = 2L;
    JProgressBar progressBar;
	Thread thread;

	public Play() {
		thread = new Thread(this);
		setMaximum(200);
		progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setForeground(Color.GREEN);
        progressBar.setBackground(Color.BLACK);
		thread.start();
	}

	public void run() {
		for(;;) {
			int value = getValue();
			value = (int)(value * 2);
			setValue(value);
			repaint();
			try {
				Thread.sleep(100000000);
			} catch (Exception e) {};
		}
	}
}