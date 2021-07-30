package com.skillsets.iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		CourseRepository repository = new CourseRepository();
		
		System.out.println("\n Let's add some courses:");
		repository.addCourse("Concepts and Features");
		repository.addCourse("Object Oriented Programming");
		repository.addCourse("Design Patterns");
		repository.addCourse("Arrays and ArrayLists");
		
		Iterator<String> courseIterator = repository.iterator();
		
//		System.out.println("\n Now let's iterate over the courses: ");
//		while(courseIterator.hasNext()) {
//			System.out.println(courseIterator.next());
//		}
		
		for(String course : repository) {
			System.out.println(course);
		}
		
	}

}
