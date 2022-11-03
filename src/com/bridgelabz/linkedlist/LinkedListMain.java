package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("Welcome to linkedlist problem");
	LinkedList<Integer> list1 = new LinkedList<>();
	list1.push(70);
	list1.push(30);
	list1.push(56);
	list1.show();
	
	LinkedList<Integer> list2 = new LinkedList<>();
	list2.add(70);
	list2.add(30);
	list2.add(56);
	list2.show();
	
	LinkedList<Integer> list3 = new LinkedList<>();
	list3.append(56);
	list3.append(30);
	list3.append(70);
	list3.show();
	}
}
