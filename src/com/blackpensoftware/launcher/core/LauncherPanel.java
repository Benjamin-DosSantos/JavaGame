package com.blackpensoftware.launcher.core;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import com.blackpensoftware.actionListeners.ExitListener;
import com.blackpensoftware.actionListeners.OptionsListener;
import com.blackpensoftware.actionListeners.StartListener;
import com.blackpensoftware.configuration.core.ConfigurationHandler;
import com.blackpensoftware.configuration.core.Settings;
import com.blackpensoftware.core.LWJGE_Window;
import com.blackpensoftware.logs.LogHandler;
import com.blackpensoftware.primitives.GameButton;

public class LauncherPanel extends JPanel{
	
	private Color bgColor = new Color(0, 102, 204);
	
	private GameButton startButton = new GameButton("Start Game");
	private GameButton optionsButton = new GameButton("Options");
	private GameButton exitButton = new GameButton("Exit");
	
	public LauncherPanel(){
		this.setBackground(bgColor);
		
		setupStartButton();
		setupOptionsButton();
		setupExitButton();
	}// End of constructor
	
	private void setupStartButton(){
		this.add(startButton, BorderLayout.CENTER);
		startButton.addActionListener(new StartListener());
	}
	
	private void setupOptionsButton(){
		this.add(optionsButton, BorderLayout.CENTER);
		optionsButton.addActionListener(new OptionsListener());
	}

	private void setupExitButton(){
		this.add(exitButton, BorderLayout.CENTER);
		exitButton.addActionListener(new ExitListener());
	}
}// End of class
