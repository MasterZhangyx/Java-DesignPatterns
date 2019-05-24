package com.zyx.design.strategy;
/**
 * 测试策略模式
 * 1:使用接口+多个实现+使用者注入接口场景
 * @author zyx
 *
 */
public class ToBeiJingTest {
	public static void main(String[] args) {
		//1
		ToBeiJing toBeiJing = new ToBeiJing(new RunByBicycle());
		toBeiJing.TravelToBeiJing();
		//2
		ToBeiJing toBeiJing02 = new ToBeiJing(new RunByCar());
		toBeiJing02.TravelToBeiJing();
		//3
		ToBeiJing toBeiJing03 = new ToBeiJing(new RunByPlane());
		toBeiJing03.TravelToBeiJing();
	}
	
}
