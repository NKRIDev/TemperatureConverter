package fr.nkri.converter.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.nkri.converter.controller.ConverterController;

public class ConverterView extends JPanel implements ActionListener{
	
	private JTextField celsius;
	private JTextField kelvin;
	private JLabel result;
	
	private JLabel celsiusTitle;
	private JLabel kelvinTitle;
	
	private JButton button = new JButton("Convertir");
	
	public ConverterView() {
		Font font = new Font("Arial", 1, 20);

		setLayout(null);
		
		celsiusTitle = new JLabel("Celsisus", 0);
		celsiusTitle.setForeground(Color.BLACK);
		celsiusTitle.setFont(font);
		celsiusTitle.setBounds(30, 35, 220, 60);
		add(celsiusTitle);
		
		celsius = new JTextField("");
		celsius.setFont(font);
		celsius.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		celsius.setBackground(new Color(1, 1, 1));
		celsius.setOpaque(false);
		celsius.setForeground(Color.WHITE);
		celsius.setBounds(30, 50, 220, 70);
		add(celsius);
		
		kelvinTitle = new JLabel("Kelvin", 0);
		kelvinTitle.setForeground(Color.BLACK);
		kelvinTitle.setFont(font);
		kelvinTitle.setBounds(30, 195, 220, 43);
		add(kelvinTitle);
		
		kelvin = new JTextField("");
		kelvin.setFont(font);
		kelvin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		kelvin.setBackground(new Color(1, 1, 1));
		kelvin.setOpaque(false);
		kelvin.setForeground(Color.WHITE);
		kelvin.setBounds(30, 200, 220, 70);
		add(kelvin);
		
		result = new JLabel("Result: ", 0);
		result.setForeground(Color.PINK);
		result.setFont(font);
		result.setBounds(10, 300, 220, 30);
	    add(result);
	    
	    button.setFont(font);
	    button.setForeground(Color.WHITE);
	    button.setBounds(30, 400, 220, 43);
	    button.addActionListener(this);
	    add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ConverterController.actionPerformed(e, button, celsius, kelvin, result);
	}
}
