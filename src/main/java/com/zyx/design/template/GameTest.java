package com.zyx.design.template;
/**
 * 模版模式的特点
 * 1:父类为抽象类，实现一个主要方法，和n个抽象方法，住房方式实现是有顺序的调用抽象方法。
 * 2:实现多个子类继承父类，然后实现父类的抽象方法
 * 3:运行父类主方法，调用子类实现的方法。
 * 4:父类规定流程，子类实现细节，从而完成不同的功能，例如数据库设计中，分为：
 * 	----连接数据库（连接mysql数据库，连接oracle数据库）
 * 	----执行数据操作（增，删，改，查）
 * 	----关闭数据库连接（关闭mysql数据库，关闭oracle数据库）
 * 步骤顺序不变，但是每一个步骤就都不同实现。
 * @author zyx
 *
 */
public class GameTest {
	public static void main(String[] args) {
		Game game = new FootBallGame();
		game.paly();
		Game game2 = new BasketBallGame();
		game2.paly();
	}
}
