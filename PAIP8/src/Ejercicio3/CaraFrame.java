/**
 * PRACTICA 8: Ejercicio 3
 * 
 * Este ejercicio nos pide construir una clase que pinte una cara.
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio3;

import javax.swing.JFrame;


public class CaraFrame extends JFrame {
	public CaraFrame(){
		setTitle("Carita");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new CaraPanel());
	}
}
