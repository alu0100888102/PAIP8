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

public class Main {
	public static void main(String[] args) {
	    EscaleraFrame frame = new EscaleraFrame(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setSize(550, 550);
	    frame.setVisible(true);
	  }
}
