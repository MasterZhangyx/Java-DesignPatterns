package com.zyx.design.listener;

public class ListenerPatternsTest {
	public static void main(String[] args) {
		Kid kid = new Kid("小明");
		kid.addListeners(new BrushTeethListener());
		kid.addListeners(new WashingListener());
		kid.eat();
		kid.sleep();
	}
}
