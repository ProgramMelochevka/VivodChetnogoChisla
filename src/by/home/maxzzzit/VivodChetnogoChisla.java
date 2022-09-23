package by.home.maxzzzit;

import java.util.Scanner;

public class VivodChetnogoChisla {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("Введите целое число: ");
		num = scn.nextInt();
		if (num % 2 == 0)
			System.out.println("Значение переменной = " + num + " - это число четное");
		else {
			num += 1;
			System.out.println("Значение переменной = " + num + " - это число было не четное, а сейчас четное");
		}
		System.out.println("Работа завершена");
	}

}
