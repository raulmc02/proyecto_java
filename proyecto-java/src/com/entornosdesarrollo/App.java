package com.entornosdesarrollo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hola mundo");


}
	public static String leerStringPorConsola() {
		Scanner sc=new Scanner(System.in);
		String result=sc.next();
		sc.close();
		return result;
	}

}
