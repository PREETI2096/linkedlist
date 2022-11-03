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
//public void append(int new_data)
//{
//    /* 1. Allocate the Node &
//       2. Put in the data
//       3. Set next as null */
//    Node new_node = new Node(new_data);
//
//    /* 4. If the Linked List is empty, then make the
//          new node as head */
//    if (head == null)
//    {
//        head = new Node(new_data);
//        return;
//    }
//
///* 4. This new node is going to be the last node, so
//  make next of it as null */
//new_node.next = null;
//
///* 5. Else traverse till the last node */
//Node last = head; 
//while (last.next != null)
//last = last.next;
//
///* 6. Change the next of last node */
//last.next = new_node;
//return;
//}
//
///* This function prints contents of linked list starting from
//the given node */
//
//
//
