package com.tmbs.ta04_03;

public class Main_EJ03 {

	public static void main(String[] args) {		
		ejercicio3();
	}
	
	static int x=40;
	static int y=9;
	static double n=32.4;
	static double m=5.6;
	
	private static void ejercicio3() {
		
		System.out.println(" Las variables creadas son:\n\n [X = "+x+ "] ["+ "Y = "+y+"] ["+"N = "+n+"]  ["+"M = "+m+"]\n");
		
		
		System.out.println("\tSUMA: X + Y = " + (x + y));
		System.out.println("\tSUMA: N + M = " + (n + m)+"\n");
		
		System.out.println("\tRESTA: X - Y = " + (x - y));
		System.out.println("\tRESTA: N - M = " + String.format("%.2f", (n - m)) +"\n");
		
		System.out.println("\tPRODUCTO: X - Y = " + (x * y));
		System.out.println("\tPRODUCTO: N - M = " + String.format("%.2f", (n * m)) +"\n");
		
		System.out.println("\tDIVISION: X - Y = " + (x /y));
		System.out.println("\tDIVISION: N - M = " + String.format("%.2f", (n / m)) +"\n");;
		
		System.out.println("\tRESIDUO: X - Y = " + (x % y));
		System.out.println("\tRESIDUO: N - M = " + (n % m)+"\n");
		
		System.out.println("El doble de las variables X, Y, N y M es: "+(x*=2)+", " +(y*=2)+", " +(n*=2)+" y "+(m*=2));
		
		System.out.println("\n\tSUMA DE TODOS LOS VALORES: " + sum(x , y , n , m));
		System.out.println("\n\tPRODUCTO DE TODOS LOS VALORES: " + multiplication(x , y , n , m));		
		
	}

	static double sum(double... n) {
		double total = 0.0;

		for (int i = 0; i < n.length; i++) {
			total += n[i];
		}
		return total;
	}

	static double multiplication(double... n) {
		double total = 1D;

		for (int i = 0; i < n.length; i++) {
			total *= n[i];
		}
		return total;
	}


}
