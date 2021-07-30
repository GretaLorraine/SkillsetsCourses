package com.skillsets.iterator;

import java.util.Iterator;

public class CourseRepository implements Iterable<String> {
	
	private String [] courses;
	private int index;
	
	public CourseRepository() {
		courses = new String[0];
		index = 0;
	}
	
	public void addCourse(String course) {
		if(index == courses.length) {
			System.out.println("Adding new item: " + course);
			String [] moreCourses = new String[courses.length + 1];
			System.arraycopy(courses, 0, moreCourses, 0, courses.length);
			courses = moreCourses;
			moreCourses = null;
		}
		courses[index] = course;
		index++;
	}
	
	@Override
	public Iterator<String> iterator() {
		Iterator<String> itr = new Iterator<String>() {
			private int currentIndex = 0;
			
			@Override
			public boolean hasNext() {
				return currentIndex < courses.length;
			}
			
			@Override
			public String next() {
				return courses[currentIndex++];
			}
		};
		return itr;
	}

}
