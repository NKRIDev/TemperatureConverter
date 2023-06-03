package fr.nkri.converter.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConverterController{

	public static void actionPerformed(ActionEvent e, JButton button, JTextField celsius, JTextField kelvin, JLabel result) {
		if(e.getSource().equals(button)) {

			if(!celsius.getText().isEmpty() && kelvin.getText().isEmpty()) {
				try {
					double celsiusDouble = Integer.parseInt(celsius.getText().toString());
					double resultKelvin = celsiusDouble + 273.15;
					
					result.setText(resultKelvin + " Kelvin");
				}
				catch (NumberFormatException ex) {
					celsius.setText("Indiquer un nombre");
					result.setText("Erreur");
				}
			}
			else if(!kelvin.getText().isEmpty()) {
				try {
					try {
						double kelvinDouble = Integer.parseInt(kelvin.getText().toString());
						double resultCelsius = kelvinDouble - 273.15;
						
						result.setText(resultCelsius + " Celsius");
					}
					catch (NumberFormatException ex) {
						kelvin.setText("Indiquer un nombre");
						result.setText("Erreur");
					}
				}
				catch (NumberFormatException ex) {
					result.setText("Kelvin n'est pas un nombre");
					kelvin.setText("");
				}
			}
			else {
				result.setText("Valeurs manquante !");
			}
		}
	}
}
