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

import java.awt.*;
import javax.swing.*;

public class CaraPanel extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawOval(0, 0, 500, 500);
		g.setColor(Color.BLUE);
		g.fillOval(100, 100, 100, 100);
		g.fillOval(300, 100, 100, 100);
		g.setColor(Color.red);
		g.drawLine(100, 400, 400, 400);
	}
}
