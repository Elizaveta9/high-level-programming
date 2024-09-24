package com.katkova.app;

import java.util.Scanner;

class App {
	public static void main(String[] args){
		int a = getA();
		printV(a);
	}
	// Получить сторону додекаэдра
	public static int getA(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сторону додекаэдра: ");
		int a = sc.nextInt();
		return a;
	}
	// Рассчиать объем додекаэдра
	public static void printV(int a) {
		double V = (15 + 7 * Math.sqrt(5) / 4 * Math.pow(a, 3));
		System.out.println("Объем = " + V);
	}
}
