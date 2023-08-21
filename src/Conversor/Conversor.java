package Conversor;

import javax.swing.JOptionPane;

import Distancia.Distancia;
import Moneda.Moneda;

public class Conversor {
	
	public static void main(String[] args) {
		
		Moneda moneda = new Moneda();
		Distancia distancia = new Distancia();
		
		String convertOptions = (JOptionPane.showInputDialog(null, "Selecciona la conversión que deseas realizar", "Menú",
								JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Distancia"}, "Selección")).toString();
			
		if (convertOptions == "Conversor de Moneda") {
				
			String inputValue = JOptionPane.showInputDialog("Ingresa el valor que deseas convertir: ");
				
			if (onValidateNumber(inputValue)) {
				double value = Double.parseDouble(inputValue);
				moneda.ConvertirPesos(value);
					
			} else {
				JOptionPane.showMessageDialog(null, "El valor que ingresaste no es válido");
			}
		} else if (convertOptions == "Conversor de Distancia") {
			
			String inputValue = JOptionPane.showInputDialog("Ingresa el valor que deseas convertir: ");
			
			if (onValidateNumber(inputValue)) {
				double value = Double.parseDouble(inputValue);
				distancia.ConvesorDistancia(value);
					
			} else {
				JOptionPane.showMessageDialog(null, "El valor que ingresaste no es válido");
			}
		}
		
	}

	
    public static boolean onValidateNumber(String number) {
        try {
            double x = Double.parseDouble(number);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
