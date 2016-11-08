package com.blackpensoftware.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.blackpensoftware.core.Main;
import com.blackpensoftware.logs.LogHandler;

public class StartListener implements ActionListener{
	LogHandler log = Main.getLog();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		log.addLogText("User started a new game instance");
		new Main().run();
	}// End of actionPerformed method
}// End of class
