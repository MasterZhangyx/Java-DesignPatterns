package com.zyx.design.listener;

import java.util.EventListener;

public class WashingListener implements EventListener{
	public void fireAfterEventInvoked(WashEvent event) {
		WashEvent eatEvent = event;
		System.out.println("饭前准备"+ eatEvent.getEventName());
	}
}
