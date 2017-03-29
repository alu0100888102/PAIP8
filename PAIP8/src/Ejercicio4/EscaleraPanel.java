/**
 * PRACTICA 8: Ejercicio 4
 * 
 * Este ejercicio nos pide construir una clase que pinte una escalera.
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio4;

import javax.swing.*;
import java.awt.*;

public class EscaleraPanel extends JPanel {
	static final int NUM_PELDANOS = 10;
	
	private int longitudPeldano;
	private int alturaPeldano;
	
	/** Constructor */
	public EscaleraPanel(int l, int a){
		setLongitudPeldano(l);
		setAlturaPeldano(a);
	}
	
	/** Setters y getters */
	public int getLongitudPeldano() {
		return longitudPeldano;
	}
	public void setLongitudPeldano(int longitudPeldano) {
		this.longitudPeldano = longitudPeldano;
	}
	public int getAlturaPeldano() {
		return alturaPeldano;
	}
	public void setAlturaPeldano(int alturaPeldano) {
		this.alturaPeldano = alturaPeldano;
	}



	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for(int i =1; i <= NUM_PELDANOS; i++){
			g.drawRect(10, getAlturaPeldano() * i, getLongitudPeldano() * i, getAlturaPeldano());
		}
	}
}
