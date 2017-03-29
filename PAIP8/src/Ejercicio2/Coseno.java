/**
 * PRACTICA 8: Ejercicio 2
 * 
 * Este ejercicio nos pide construir una clase abstracta capaz de representar cualquier función.
 * 
 * Esta clase representa un coseno
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio2;

public class Coseno extends FuncionAbstracta {
	/** La escala nos permite ampliar la función*/
	
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
