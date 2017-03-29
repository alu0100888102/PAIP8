/**
 * PRACTICA 8: Ejercicio 1
 * 
 * Este ejercicio nos pide construir una clase que muestre una funci�n cuadr�tica.
 * 
 * Pasamos como parametros la constante y el multiplicador de la funci�n cuadr�tica
 * 
 * mx^2 +c
 * 
 * @author alu0100888102
 * @version 1.0
 * �ngel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio1;

public class Main {
	public static void main(String[] args) {
	    Cuadratica frame = new Cuadratica(Integer.parseInt(args[0]),Double.parseDouble(args[1]));
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setSize(250, 250);
	    frame.setVisible(true);
	  }
}
