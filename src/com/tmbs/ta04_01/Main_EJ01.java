package com.tmbs.ta04_01;

public class Main_EJ01 {
	
	public static void main(String[] args) {
		runEjercicio2();
	}
	
	private static void runEjercicio2() {
		
		int n = 5;
		double a = 4.56;
		char c = 'a';
		
		System.out.println("n:"+n+" a:"+a+" c:"+c);
		
		System.out.println("\n"
		+"Variable n es " + n + "\n"
		+"Variable a es " + a + "\n"
		+"Variable c es " + c + "\n"
		+"La suma de n + a es " + (n + a) + "\n"
		+"La resta de a - n es " + (a - n) + "\n"
		+"El valor numerico de c es " + (int) c
		);

	}
}
