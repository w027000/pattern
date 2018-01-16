package com.zch.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFactory {

	private static Map<String, Chess> map = new HashMap<>();

	public static Chess getChess(String color) {
		if (map.get(color) != null) {
			return map.get(color);
		} else {
			Chess chess = new ConcreteChess(color);
			map.put(color, chess);
			return chess;
		}
	}

}
