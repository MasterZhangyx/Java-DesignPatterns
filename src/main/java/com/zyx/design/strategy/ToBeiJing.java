package com.zyx.design.strategy;

public class ToBeiJing {
	private Run run;
	public ToBeiJing(Run run) {
		this.run = run;
	}
	public void TravelToBeiJing() {
		run.toBeiJing();
	}
}
