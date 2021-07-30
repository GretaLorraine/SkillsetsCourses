package com.skillsets.singleton;

public class MySingletonDemo {

	public static void main(String[] args) {
	
		MySingleton instance = MySingleton.getInstance();
		System.out.println(instance);
		
		//grab another instance
		MySingleton newInstance = MySingleton.getInstance();
		System.out.println(newInstance);
		
	}
	
}
