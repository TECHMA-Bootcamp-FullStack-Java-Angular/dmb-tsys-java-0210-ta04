package com.tmbs.ta04_02;

public class Main_EJ02 {

	public static void main(String[] args) {
		
		int n1 = 7;
		double n2 = 3.4;
		
		System.out.println("\n"
				+"Suma: " + n1 + "+" + n2 + " = " + String.format("%.2f", (n1 + n2))+"\n"
				+"Resta: " + n1 + "-" + n2 + " = " + String.format("%.2f", (n1 - n2))+"\n"
				+"Producto: " + n1 + "x" + n2 + " = " + String.format("%.2f", (n1 * n2))+"\n"
				+"Division: " + n1 + "/" + n2 + " = " + String.format("%.2f", (n1 / n2))+"\n"
				+"Residuo: " + n1 + " entre" + n2 + " = " + String.format("%.2f", (n1 % n2)));
	}

}
