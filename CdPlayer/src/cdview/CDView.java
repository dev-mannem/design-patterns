package cdview;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CDView implements ActionListener,  PlayObserver, MINObserver {
	PlayModelInterface model;
	ControllerInterface controller;
	JFrame viewFrame;
	JPanel viewPanel;
	Play play;
	JLabel minOutputLabel;
	JFrame controlFrame;
	JPanel controlPanel;
	JLabel minLabel;
	JTextField minTextField;
	JButton setMINButton;
	JButton forwardButton;
	JButton backwardButton;
	JButton initialButton;
	JMenuBar menuBar;
	JMenuBar menuBar1;
	JMenu menu;
	JMenu menu1;
	JMenuItem startMenuItem;
	JMenuItem stopMenuItem;

	public CDView(ControllerInterface controller, PlayModelInterface model) {	
		this.controller = controller;
		this.model = model;
		model.registerObserver((PlayObserver)this);
		model.registerObserver((MINObserver)this);
	}

	public void createView() {
		// Create all Swing components here
		viewPanel = new JPanel(new GridLayout(1, 2));
		viewFrame = new JFrame("View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setPreferredSize(new Dimension(400, 160));
		minOutputLabel = new JLabel("offline", SwingConstants.CENTER);
		play = new Play();
		JPanel minPanel = new JPanel(new GridLayout(2, 1));
		menuBar1 = new JMenuBar();
		menu1 = new JMenu("CD Play View");
		minPanel.add(play);
		
		minPanel.add(minOutputLabel);
		minPanel.setPreferredSize(new Dimension(400, 160));
		viewPanel.add(minPanel);
		viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
		viewFrame.pack();
		viewFrame.setVisible(true);
	}


	public void createControls() {
		// Create all Swing components here
		JFrame.setDefaultLookAndFeelDecorated(true);
		controlFrame = new JFrame("Control");
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controlFrame.setPreferredSize(new Dimension(400, 160));

		controlPanel = new JPanel(new GridLayout(1, 2));

		menuBar = new JMenuBar();
		menu = new JMenu("CD Play Control");
		startMenuItem = new JMenuItem("Start");
		menu.add(startMenuItem);
		startMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				controller.start();
			}
		});
		stopMenuItem = new JMenuItem("Stop");
		menu.add(stopMenuItem); 
		stopMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				controller.stop();
			}
		});
		JMenuItem exit = new JMenuItem("Quit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		menu.add(exit);
		menu1.add(exit);
		menuBar.add(menu);
		menuBar1.add(menu1);
		controlFrame.setJMenuBar(menuBar);
		viewFrame.setJMenuBar(menuBar1);

		minTextField = new JTextField(2);
		minLabel = new JLabel("Enter MIN:", SwingConstants.RIGHT);
		setMINButton = new JButton("Set");
		setMINButton.setPreferredSize(new Dimension(10,40));
		forwardButton = new JButton("FORWARD");
		backwardButton = new JButton("BACKWARD");
		initialButton = new JButton("INITIAL");
		setMINButton.addActionListener(this);
		forwardButton.addActionListener(this);
		backwardButton.addActionListener(this);
		initialButton.addActionListener(this);

		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

		buttonPanel.add(backwardButton);
		buttonPanel.add(forwardButton);
		buttonPanel.add(initialButton);

		JPanel enterPanel = new JPanel(new GridLayout(1, 2));
		enterPanel.add(minLabel);
		enterPanel.add(minTextField);
		JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
		insideControlPanel.add(enterPanel);
		insideControlPanel.add(setMINButton);
		insideControlPanel.add(buttonPanel);
		controlPanel.add(insideControlPanel);

		minLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		minOutputLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

		controlFrame.getRootPane().setDefaultButton(setMINButton);
		controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

		controlFrame.pack();
		controlFrame.setVisible(true);
	}

	public void enableStopMenuItem() {
		stopMenuItem.setEnabled(true);
	}

	public void disableStopMenuItem() {
		stopMenuItem.setEnabled(false);
	}

	public void enableStartMenuItem() {
		startMenuItem.setEnabled(true);
	}

	public void disableStartMenuItem() {
		startMenuItem.setEnabled(false);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == setMINButton) {
			int min = Integer.parseInt(minTextField.getText());
			controller.setMIN(min);			
			
		} else if (event.getSource() == forwardButton) {
			controller.forward();
		} else if (event.getSource() == backwardButton) {
			controller.backward();
		}else if (event.getSource() == initialButton) {
			controller.initial();
		}
		updatePlay();
		
	}

	public void updateMIN() {
		if (model != null) {
			int min = model.getMIN();
			
			if (min == 0) {
				
					if (minOutputLabel != null) {
						minOutputLabel.setText("Initial");
					}
			} else {
				if (minOutputLabel != null) {
					minOutputLabel.setText("Current MIN: " + model.getMIN());
				}
			}
		}
	}

	public void updatePlay() {
		if (play != null) {
			play.setValue(model.getMIN());
		}
	}
}