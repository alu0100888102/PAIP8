/**
 * PRACTICA 8: Ejercicio 2
 * 
 * Este ejercicio nos pide construir una clase abstracta capaz de representar cualquier funci�n.
 * 
 * @author alu0100888102
 * @version 1.0
 * �ngel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio2;

import java.awt.*;
import javax.swing.*;

public abstract class FuncionAbstracta extends JPanel {
	/**estas constantes nos permiten colcar los ejes dentro del panel*/
	static final int A_EJE_Y = 250;
	static final int A_EJE_X = 250;
	static final int LEFT = -250;
	static final int RIGHT = 250;
	/**El poligono guarda la funci�n*/
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
	
	/** Construye F(x) en el pol�gono */
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
