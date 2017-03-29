/**
 * PRACTICA 8: Ejercicio 1
 * 
 * Este ejercicio nos pide construir una clase que muestre una función cuadrática.
 * 
 * Esta clase aprovecha la clase "Función abstracta" del ejercicio 2 para dibujarse.
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package Ejercicio1;

import Ejercicio2.*;

public class PanelCuadratico extends FuncionAbstracta {
	private int constante;
	private double multiplicador;
	
	/** Constructor*/
	public PanelCuadratico(int c, double m){
		super();
		constante = c;
		multiplicador = m;
	}
	
	/** Setters y getters*/
	public int getConstante() {
		return constante;
	}
	public void setConstante(int constante) {
		this.constante = constante;
	}
	public double getMultiplicador() {
		return multiplicador;
	}
	public void setMultiplicador(double multiplicador) {
		this.multiplicador = multiplicador;
	}
	
	/** Funcion F(x) requerida por FuncionAbstracta*/
	public double f(int x){
		double out = x * x * getMultiplicador() + getConstante();
		return out;
	}
}
