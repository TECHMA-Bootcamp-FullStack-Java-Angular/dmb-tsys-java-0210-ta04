package com.tmbs.ta04_04;

public class Main_EJ04 {
	
	public static void main(String[] args) {
		runEjercicio4();
	}
	
	private static void runEjercicio4() {	
		int N = 10;
		
		System.out.println("El valor inicial de N es: " + N);
		System.out.println(N + " + 77 es " + (N += 77));
		System.out.println(N + " - 3 es " + (N -= 3));
		System.out.println(N + " multiplicado por 2 es " + (N *=  2));
	}

}
