/**
 * PRACTICA 8: Ejercicio 1
 * 
 * Este ejercicio nos pide construir una clase que muestre una funci�n cuadr�tica
 * 
 * @author alu0100888102
 * @version 1.0
 * �ngel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio1;

import javax.swing.*;

public class Cuadratica extends JFrame {
	public Cuadratica(int cons, double mul){
		setTitle("Funci�n cuadr�tica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new PanelCuadratico(cons, mul));
	}
}
