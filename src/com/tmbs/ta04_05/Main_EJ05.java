package com.tmbs.ta04_05;


public class Main_EJ05 {

	static int a=77;
	static int b=11;
	static int c=33;
    static int d=44;

	public static void main(String args[]) {
		Main_EJ05 ej5_Main = new Main_EJ05();
		ej5_Main.runEjercicio5();
	}

	private  void runEjercicio5() {
		
		System.out.println("\nVariables iniciales: \n" + toString());

		System.out.println("\nB toma valor de C: \n" + toString());
		c = a;
		System.out.println("\nC toma valor de A: \n" + toString());
		a = d;
		System.out.println("\nA toma valor de D: \n" + toString());
		d = b;
		System.out.println("\nD toma valor de B: \n" + toString());
	}
	
	@Override
	public String toString() {
		return "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d ;
	}
}
