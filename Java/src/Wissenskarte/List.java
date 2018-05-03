package Wissenskarte;

import java.util.NoSuchElementException;

public class List {

	private Node first = null;
	private int currentSize = 0;
	private Counter counter = new Counter();
	
	public void addFirst (Wissenskarten w){
		first = new Node(w, first);
		currentSize++;
	}
	
	public void addLast (Wissenskarten w){ 
		if(first==null){
			addFirst(w);
		}else{
			Node lastNode = getNode(size()-1);
			lastNode.next = new Node(w, null);
			currentSize++;
		}
	}
	
	public Wissenskarten getFirst (){
		if( isEmpty() ) throw new NoSuchElementException();
			return first.data;
	}
	
	public Wissenskarten getLast (){
		if(isEmpty() ) throw new NoSuchElementException();
		return getWissenskarte(size()-1);
//			Node runPointer = first;
//			while(runPointer.next!=null){
//				runPointer = runPointer.next;
//			}
//			return runPointer.data;
	}
	
	public Wissenskarten getWissenskarte(int n){
		return getNode(n).data;
	}
	
	public Node getNode (int n){
		if(isEmpty() )throw new NoSuchElementException();
		int position = 0;
		Node runPointer = first;
		while(runPointer != null){
			if(position == n) return runPointer;
			position++;
			runPointer = runPointer.next;
			
		}
		throw new NoSuchElementException();
	}
	
	public Wissenskarten getWissenskarte (String keyword){
		if(isEmpty() )throw new NoSuchElementException();
		Node runPointer = first;
		while(runPointer != null){
			if( runPointer.data.enthalten(keyword)==true){
				return runPointer.data;
			}
			runPointer = runPointer.next;
		}
		throw new NoSuchElementException();
	}
	
	public boolean isEmpty (){
		return first == null;
	}
		
	public int size(){
		return currentSize;
//		if(isEmpty() ) return 0;
//		
//		int size = 0;
//		Node runPointer = first;
//		while(runPointer != null){
//			runPointer = runPointer.next;
//			size++; 
//		}
//		return size;
	}
	
	public void applyForEach (ApplyInterface applicator){
		if(isEmpty() )throw new NoSuchElementException();
		
		Node runPointer = first;
		while(runPointer!=null){
			applicator.apply(runPointer.data);
			runPointer = runPointer.next;
		}
	}

	private class Node{
		Wissenskarten data;
		Node next;
		
		private Node (Wissenskarten data, Node next){
			this.data = data;
			this.next = next;
		}
		
	}

}
