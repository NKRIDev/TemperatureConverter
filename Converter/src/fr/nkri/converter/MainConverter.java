package fr.nkri.converter;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.UIManager;

import fr.nkri.converter.view.ConverterView;

public class MainConverter extends JFrame{

	private static MainConverter instance;
	private static ConverterView converterPanel;
	
	public MainConverter() {
		setTitle("Temperature converter");
		setSize(500, 500);
		setDefaultCloseOperation(3);
		setLayout(null);
		setBackground(new Color(0, 0, 0));
		
		setContentPane(converterPanel = new ConverterView());
		getContentPane().setBackground(new Color(64, 64, 64));
		
		setVisible(true);
	}
	
	public static void main(String[] args) throws Exception {
		setUIManager();
		instance = new MainConverter();
	}
	
	private static void setUIManager() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
