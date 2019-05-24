package com.zyx.design.listener;

import java.util.EventObject;
/**
 * 事件-睡觉
 * @author zyx
 *
 */
public class BrushTeethEvent extends EventObject {
	private String eventName;
	public BrushTeethEvent(Object source,String eventName) {
		super(source);
		this.eventName = eventName;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
}
