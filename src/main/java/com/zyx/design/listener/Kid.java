package com.zyx.design.listener;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public class Kid {
	private String name;
	private List<EventListener> listeners = new ArrayList<EventListener>();
	public Kid(String name) {
		this.setName(name);
	}
	public void eat() {
		for (EventListener eventListener : listeners) {
			if (eventListener instanceof WashingListener) {
				WashingListener washingListener = (WashingListener) eventListener;
				washingListener.fireAfterEventInvoked(new WashEvent(this, "洗手"));
			}
		}
		System.out.println(this.name + "可以吃饭了。");
	}
	public void sleep() {
		for (EventListener eventListener : listeners) {
			if (eventListener instanceof BrushTeethListener) {
				BrushTeethListener brushTeethListener = (BrushTeethListener) eventListener;
				brushTeethListener.fireAfterEventInvoked(new BrushTeethEvent(this, "刷牙"));
			}
		}
		System.out.println(this.name + "可以睡觉了。");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<EventListener> getListeners() {
		return listeners;
	}
	public void addListeners(EventListener listeners) {
		this.listeners.add(listeners);
	}
}
