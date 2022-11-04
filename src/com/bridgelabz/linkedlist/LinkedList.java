package com.bridgelabz.linkedlist;

public class LinkedList<T> {
	
public Node<T> head;
public Node<T> tail;

public void push(T data) {
	Node<T> node = new Node<>(data);
	if(head == null) {
		head = node;    
		tail = node;
		}else {
		node.setNext(head);
		head = node; 
	}	
}
public void add(T data) {
	Node<T> node = new Node(data);
	if(head == null) {   
		head = node; 
		tail = node;     
	}else {
		tail.setNext(node); 
		tail = node;
	}
}
public void append(T data) {
	Node<T> node = new Node(data);
	if(head == null) {
		head = node;
		tail = node;
		}else {
				tail.setNext(node);
				tail =  node;
			}
		}
public void insert(T data) {
	Node <T> node = new Node(data);
	if(head == null) {
     	head = node;
		//tail = node;
	}else {
		Node<T> temp = head;
		while(temp.getNext() != null) {
		   temp = temp.getNext();	         
		}
		temp.setNext(node);
	}
}
	
	
public void show() {
	if(head == null) {
		System.out.println("Linked list is empty");
	}else {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.getKey()+ " ");
			temp = (Node<T>)temp.getNext();
			}
		System.out.println();			
		}
	}
}
