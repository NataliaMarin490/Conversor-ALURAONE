package Distancia;

import javax.swing.JOptionPane;

public class Distancia {

	ConvertirDistancia distancia = new ConvertirDistancia();
	
	public void ConvesorDistancia(double medida) {
		String convertOption = (JOptionPane.showInputDialog(null, "Selecciona la conversión que deseas realizar", "Distancias",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De mm a cm", "De mm a metro", "De mm a km","De cm a mm","De cm a metro", "De cm a km", "De metro a mm","De metro a cm","De metro a km", "De km a mm","De km a metro","De km a cm"},
				"Seleccionar")).toString();
		
		switch (convertOption) {
		case "De mm a cm":
			distancia.ConvertirMmACm(medida);
			break;
		case "De mm a metro":
			distancia.ConvertirMmAKm(medida);
			break;
		case "De mm a km":
			distancia.ConvertirMmAKm(medida);
			break;
		case "De cm a mm":
			distancia.ConvertirCmAMm(medida);
			break;
		case "De cm a metro":
			distancia.ConvertirCmAMetros(medida);
			break;
		case "De cm a km":
			distancia.ConvertirCmAKm(medida);
			break;
		case "De metro a mm": 
			distancia.ConvertirMetrosAMm(medida);
			break;
		case "De metro a cm":
			distancia.ConvertirMetrosACm(medida);
			break;
		case "De metro a km":
			distancia.ConvertirMetrosAKm(medida);
			break;
		case "De km a mm":
			distancia.ConvertirKmAMm(medida);
			break;
		case "De km a metro":
			distancia.ConvertirKmAMetros(medida);
			break;
		case "De km a cm":
			distancia.ConvertirKmACm(medida);
			break;
		}
	}
	
}
