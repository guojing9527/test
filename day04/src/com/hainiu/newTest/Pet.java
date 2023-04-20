package com.hainiu.newTest;
//设计宠物类，用户可以自由选择养猫还是养狗，可以给宠物起名字，还可以实现喂食互动的功能，宠物需要有饱食度和快乐度

public class Pet {
	String name;
	int full;
	int happy;
	public Pet(String name) {
		this(name, 50, 50);     //起始值
	}
	public Pet(String name,int full,int happy) { 
		this.name = name;
		this.full = full;
		this.happy = happy;
	}
	public void feed() {                   //宠物的喂食方法
		if(full == 100) {
			System.out.println(name+"已经吃饱了");
			return;
		}
		System.out.println("给"+name+"喂食");
		full += 10;
		System.out.println("饱食度："+full);
	}
	public void play() {//宠物的互动玩耍方法
		if(full == 0) {
			System.out.println(name+"已经饿得玩不动了");
			return;
		}
		System.out.println("陪"+name+"玩耍");
		happy += 10;
		full -= 10;
		System.out.println("快乐度："+happy);
		System.out.println("饱食度："+full);
	}
	public void punish() {       //宠物的惩罚方法
		//子类不同，改成调用方法
		System.out.println(
				"打"+name+"的pp，"+name+"哭叫："+cry());
		happy -= 10;
		System.out.println("快乐度："+happy);
	}
	public String cry() {            //小动物被打哭了
		//子类中重写，返回具体哭叫声
		return "哭的声音";
	}
}
