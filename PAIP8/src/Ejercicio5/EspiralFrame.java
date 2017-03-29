/**
 * PRACTICA 8: Ejercicio 5
 * 
 * Este ejercicio nos pide construir una clase que pinte una espiral.
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio5;

import javax.swing.JFrame;

public class EspiralFrame extends JFrame {
	public EspiralFrame(){
		setTitle("Espiral");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new EspiralPanel());
	}
}
