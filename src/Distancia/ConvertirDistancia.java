package Distancia;

import javax.swing.JOptionPane;

public class ConvertirDistancia {
	
	public void ConvertirMmACm(double valor) {
		double medida = valor * 10;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Centímetros");
	}
	
	public void ConvertirMmAMetros(double valor) {
		double medida = valor / 1000;
		medida = (double) Math.round(medida *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Metros");
	}
	
	public void ConvertirMmAKm(double valor) {
		double medida = valor / 1000000;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Kilómetros");
	}
	
	public void ConvertirCmAMm(double valor) {
		double medida = valor * 10;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Milímetros");
	}
	
	public void ConvertirCmAMetros(double valor) {
		double medida = valor / 100;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Metros");
	}
	
	public void ConvertirCmAKm(double valor) {
		double medida = valor / 100000;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Kilómetros");
	}
	
	public void ConvertirMetrosAMm(double valor) {
		double medida = valor * 1000;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Milímetros");
	}
	
	public void ConvertirMetrosACm(double valor) {
		double medida = valor * 100;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Centímetros");
	}
	
	public void ConvertirMetrosAKm(double valor) {
		double medida = valor / 1000;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Kilómetros");
	}
	
	public void ConvertirKmAMm(double valor) {
		double medida = valor * 1000000;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Milímetros");
	}
	
	public void ConvertirKmACm(double valor) {
		double medida = valor * 100000;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Centímetros");
	}
	
	public void ConvertirKmAMetros(double valor) {
		double medida = valor * 1000;
		medida = (double) Math.round(medida *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " +medida+ " Metros");
	}
	
}
