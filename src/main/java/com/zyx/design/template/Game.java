package com.zyx.design.template;
/**
 * 玩游戏
 * @author zyx
 *
 */
public abstract class Game {
	public final void paly() {
		stepone();
		steptwo();
		stepthree();
	}
	public abstract void stepone();
	public abstract void steptwo();
	public abstract void stepthree();
}
