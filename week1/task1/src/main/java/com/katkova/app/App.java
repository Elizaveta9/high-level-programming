package com.katkova.app;

import java.util.Scanner;
class App {
	public static void main(String[] args){
		String name = getUserName();
		printHello(name);
	}
	// Запрашивает у пользователя имя
	public static String getUserName(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите имя: ");
		String name = sc.nextLine();
		return name;
	}
	// Выводит приветствие
	public static void printHello(String name){
		System.out.printf("Привет, %s!\n", name); 
	}
}
