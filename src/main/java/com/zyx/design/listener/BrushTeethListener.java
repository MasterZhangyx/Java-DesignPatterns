package com.zyx.design.listener;

import java.util.EventListener;

public class BrushTeethListener implements EventListener{
		public void fireAfterEventInvoked(BrushTeethEvent event) {
			BrushTeethEvent sleepEvent = event;
			System.out.println("睡前准备"+ sleepEvent.getEventName());
		}
}
