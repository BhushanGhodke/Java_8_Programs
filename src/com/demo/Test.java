package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Integer> list =new ArrayList<Integer>();

	list.add(10);
	list.add(20);
	list.add(24);
	list.add(54);
	list.stream().forEach(System.out::println);
	
	System.out.println("List Element : "+list);
	

	
}
}
