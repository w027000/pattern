package com.zch.pattern.structural.flyweight;

public class Client {

	public static void main(String[] args) {
		Chess chess1 = ChessFlyWeightFactory.getChess("黑色");
		Chess chess2 = ChessFlyWeightFactory.getChess("黑色");
		System.out.println(chess1);
		System.out.println(chess2);

		System.out.println("增加外部状态的处理===========");

		chess1.display(new Coordinate(10, 10));
		chess2.display(new Coordinate(20, 20));
	}

}
