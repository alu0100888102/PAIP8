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

import java.awt.*;
import javax.swing.*;

public class EspiralPanel extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int[] x ={10, 170, 170, 20, 20, 160, 160, 30, 30, 150, 150, 40, 40, 140, 140, 50, 50,
				130, 130, 60, 60, 120, 120, 70, 70, 110, 110, 80, 80, 100, 100, 90, 90};
		int[] y ={10, 10, 170, 170, 20, 20, 160, 160, 30, 30, 150, 150, 40, 40, 140, 140,
				50, 50, 130, 130, 60, 60, 120, 120, 70, 70, 110, 110, 80, 80, 100, 100, 90};
		g.drawPolyline(x, y, 33);
	}
}
