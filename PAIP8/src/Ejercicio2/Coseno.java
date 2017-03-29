/**
 * PRACTICA 8: Ejercicio 2
 * 
 * Este ejercicio nos pide construir una clase abstracta capaz de representar cualquier funci�n.
 * 
 * Esta clase representa un coseno
 * 
 * @author alu0100888102
 * @version 1.0
 * �ngel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio2;

public class Coseno extends FuncionAbstracta {
	/** La escala nos permite ampliar la funci�n*/
	
	double escala= 100;
	
	public double getEscala() {
		return escala;
	}

	public void setEscala(double escala) {
		this.escala = escala;
	}

	public double f(int x){
		return Math.cos(x/escala)*escala;
	}
}
