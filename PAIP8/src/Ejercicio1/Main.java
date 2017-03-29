/**
 * PRACTICA 8: Ejercicio 1
 * 
 * Este ejercicio nos pide construir una clase que muestre una función cuadrática.
 * 
 * Pasamos como parametros la constante y el multiplicador de la función cuadrática
 * 
 * mx^2 +c
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio1;

public class Main {
	public static void main(String[] args) {
	    Cuadratica frame = new Cuadratica(Integer.parseInt(args[0]),Double.parseDouble(args[1]));
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setSize(750, 750);
	    frame.setVisible(true);
	  }
}
