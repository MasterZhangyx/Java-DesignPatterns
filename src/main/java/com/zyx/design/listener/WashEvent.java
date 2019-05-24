package com.zyx.design.listener;

import java.util.EventObject;
/**
 * 事件-吃
 * @author zyx
 *
 */
public class WashEvent extends EventObject {
	private String eventName;
	public WashEvent(Object source,String eventName) {
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
