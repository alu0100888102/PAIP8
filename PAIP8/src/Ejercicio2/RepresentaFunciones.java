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

import javax.swing.*;
import java.awt.*;

public class RepresentaFunciones  extends JFrame{
	public RepresentaFunciones(){
		setLayout(new GridLayout(0, 2, 5, 5));
		setTitle("Funciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Seno());
		add(new Coseno());
	}
}
