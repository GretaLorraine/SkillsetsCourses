package com.skillsets.singleton;

public class MySingleton {

	// early load a new instance
//	private static MySingleton instance = new MySingleton();
//
//	private MySingleton() {
//	}
//
//	public static MySingleton getInstance() {
//		return instance;
//	}

	
	// lazy load a new instance
	private static MySingleton instance = null;

	private MySingleton() {
	}

	public static MySingleton getInstance() {
		if(instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}
}
