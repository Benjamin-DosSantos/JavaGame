package com.blackpensoftware.launcher.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class LauncherFrame extends JFrame{
	private Color bgColor = Color.DARK_GRAY;
	
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private double width = screenSize.getWidth();
	private double height = screenSize.getHeight();
	
	private int frameWidth = (int)(width / 2);
	private int frameHeight = (int)(height / 2);
	
	private int framePositionX = frameWidth / 2;
	private int framePositionY = frameHeight / 2;
	
	private String title = "Game";
	
	public LauncherFrame(){
		this.setVisible(true);
		this.setSize(frameWidth, frameHeight);
		this.setBackground(bgColor);
		this.setLocation(framePositionX, framePositionY);
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame.setDefaultLookAndFeelDecorated(true);
		this.add(new LauncherPanel());
	}// End of constructor
}// End of class
