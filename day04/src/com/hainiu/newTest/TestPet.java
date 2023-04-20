package com.hainiu.newTest;

import java.util.Random;
import java.util.Scanner;

public class TestPet {
	public static void main(String[] args) {
		System.out.println("1. 狗");
		System.out.println("2. 猫");
		System.out.print("选择：> ");
		int c = new Scanner(System.in).nextInt();
		System.out.print("给宠物起个名字：");
		String n = new Scanner(System.in).nextLine();
		//定义猫狗变量
		Dog dog ;
		Cat cat ;
		if(c == 1) {
			dog = new Dog(n);
			play(dog);
		} else {
			cat = new Cat(n);
			play(cat);
		}
	}
	private static void play(Dog dog) {
		System.out.println("按回车执行");
		while (true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(3);
			//Scanner sc=new Scanner(System.in);
//			Random r=new Random();
//			int z=r.nextInt(3);
			switch (r) {
				case 0:
					dog.feed();
					break;
				case 1:
					dog.play();
					break;
				default:
					dog.punish();
					break;
			}
		}
	}

	private static void play(Cat cat) {
		System.out.println("按回车执行");
		while (true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(3);
			switch (r) {
				case 0:
					cat.feed();
					break;
				case 1:
					cat.play();
					break;
				default:
					cat.punish();
					break;
			}
		}
	}
}
