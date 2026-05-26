package com.cts.collections;

public class SingleLinkedList {
	
	private int size;
	
	public SingleLinkedList() {
		this.size = 0;
	}
	
	Node head;
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			
			size++;
		}
	}
	
	public void addFirst(String data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
	}
	
	public void addLast(String data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		
		while(temp.next!=null) {
			
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	public void deleteFirst() {
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		size--;
		
		head = head.next;
	}
	
	public void deleteLast() {
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		size--;
		
		if(head.next == null) {
			head = null;
		}
		
		Node temp = head;
		
		while(temp.next.next!=null) {
			
			temp = temp.next;
		}
		
		temp.next = null;
	}
	
	public void printList() {
		
		if(head == null) {
			System.out.println("Linked List is Empty");
			return;
		}
		
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		
		System.out.println("Null");
	}
	
	public void reverseList() {
		
		if(head == null || head.next == null) {
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		
		while(currNode!=null) {
			
			Node nextNode = currNode.next;
			
			currNode.next = prevNode;
			
			// update
			prevNode = currNode;
			currNode = nextNode;
		}
		
		head.next = null;
		head = prevNode;
	}
	
	public int getSize() {
		return size;
	}
	
//	public void test() {
//		
//		System.out.println(head.next.next);
//	}
	
	public static void main(String[] args) {
		
		SingleLinkedList sl = new SingleLinkedList();
		
		sl.addFirst("Was");
		sl.addLast("it");
		sl.addLast("a");
		sl.addLast("car");
		sl.addLast("or");
		sl.addLast("cat");
		sl.addLast("i");
		sl.addLast("saw");
		
		
		
		sl.printList();
		
//		sl.test();
		
//		sl.deleteFirst();
//		sl.printList();
//		
//		sl.deleteLast();
//		sl.printList();
		
		System.out.println("Size: "+sl.getSize());
		
		sl.reverseList();
		sl.printList();
		
	}

}
