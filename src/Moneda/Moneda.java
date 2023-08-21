package Moneda;

import javax.swing.JOptionPane;

public class Moneda {

	ConvertirDesdePesos monedaAConvertir = new ConvertirDesdePesos();
	ConvertirValorAPesos pesosAConvertir = new ConvertirValorAPesos();
	
	public void ConvertirPesos(double pesos) {
		String convertOption = (JOptionPane.showInputDialog(null, "Selecciona a qué moneda deseas realizar la conversión", "Monedas",
								JOptionPane.PLAIN_MESSAGE, null, new Object[]
								{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"},
								"Seleccionar")).toString();
		
		switch (convertOption) {
		case "De Pesos a Dólar":
        	monedaAConvertir.ConvertirPesosADolares(pesos);
        	break;
        case "De Pesos a Euro":
        	monedaAConvertir.ConvertirPesosAEuros(pesos);
        	break;
        case "De Pesos a Libras":
        	monedaAConvertir.ConvertirPesosALibras(pesos);
        	break;
        case "De Pesos a Yen":
        	monedaAConvertir.ConvertirPesosAYen(pesos);
        	break;
        case "De Pesos a Won Coreano":
        	monedaAConvertir.ConvertirPesosAWon(pesos);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesosAConvertir.ConvertirDolaresAPesos(pesos);
        	break;
        case "De Euro a Pesos":
        	pesosAConvertir.ConvertirEurosAPesos(pesos);
        	break;
        case "De Libras a Pesos":
        	pesosAConvertir.ConvertirLibrasAPesos(pesos);
        	break;
        case "De Yen a Pesos":
        	pesosAConvertir.ConvertirYenAPesos(pesos);
        	break;
        case "De Won Coreano a Pesos":
        	pesosAConvertir.ConvertirWonAPesos(pesos);
            break;
		}
	}
}
