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

import javax.swing.JFrame;

public class EscaleraFrame extends JFrame{
	public EscaleraFrame(int l, int a){
		setTitle("Escalera");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new EscaleraPanel(l,a));
	}
}
