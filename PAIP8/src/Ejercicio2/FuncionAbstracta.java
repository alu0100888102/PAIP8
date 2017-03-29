/**
 * PRACTICA 8: Ejercicio 2
 * 
 * Este ejercicio nos pide construir una clase abstracta capaz de representar cualquier función.
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio2;

import java.awt.*;
import javax.swing.*;

public abstract class FuncionAbstracta extends JPanel {
	/**estas constantes nos permiten colcar los ejes dentro del panel*/
	static final int A_EJE_Y = 500;
	static final int A_EJE_X = 500;
	static final int LEFT = -500;
	static final int RIGHT = 500;
	/**El poligono guarda la función*/
	private Polygon pol = new Polygon();
	
	/** Getters y setters*/
	public Polygon getPol() {
		return pol;
	}
	public void setPol(Polygon pol) {
		this.pol = pol;
	}
	
	/** Constructor */
	protected FuncionAbstracta(){}
	
	/** Construye F(x) en el polígono */
	public void dibujaFuncion(){
		for(int x = LEFT; x <= RIGHT ; x++)
			getPol().addPoint(x + A_EJE_Y, A_EJE_X - (int)(f(x)));
	}
	
	/** Pinta el poligono */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		dibujaFuncion();
		g.drawPolygon(getPol());
		
		/** Pintamos los ejes */
		g.drawLine(A_EJE_X, A_EJE_Y + LEFT, A_EJE_X, A_EJE_Y + RIGHT);
		g.drawLine(A_EJE_X + LEFT, A_EJE_Y, A_EJE_X + RIGHT, A_EJE_Y);
	}

	public abstract double f(int x);
}
