package java_dsa;

import java.util.Scanner;

public class IntStack {
	private int[] arr;
	private int top;
	
	public IntStack() {
		arr = new int[5];
		top = -1;
		}
	
	public void push(int d) {
		if (isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		top++;
		arr[top] = d;
		printStack();
	}
	
	public boolean isFull() {
		if(top == arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int pop() {
		int d = -999;
		if (isEmpty()) {
			System.out.println("Stack is Empty or UnderFlow");
		}
		else {
			d = arr[top];
			top = top-1;
		}
		return d;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int peek() {
		int d = -999;
		if(isEmpty()) {
			System.out.println("UnderFlow or Stack is empty");
		}
		else {
			d = arr[top];
		}
		return d;
	}
	
	public void printStack() {
		System.out.println("----Stack Elements----");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		IntStack st = new IntStack();
		int choice = 0;
		
		do {
			System.out.println("-----Menu-----");
			System.out.println("Enter 1 to insert elements in Stack");
			System.out.println("Enter 2 to delete element from Stack");
			System.out.println("Enter 3 to peek stack elements");
			System.out.println("Enter 4 to print stack elements");
			System.out.println("Enter 9 to exit the menu");
			System.out.println("Enter your to choice:");
			choice = s.nextInt();
			
			switch(choice) {
			case 1:
				int value = s.nextInt();
				st.push(value);
				break;
				
			case 2:
				int pop_element = st.pop();
				System.out.println("---Removed Element---");
				System.out.println(pop_element);
				break;
				
			case 3:
				int peek_element = st.peek();
				System.out.println("-----Peek Element-----");
				System.out.println(peek_element);
				break;
				
			case 4:
				st.printStack();
				break;
				
			case 9:
				break;
				
			default:
				System.out.println("Invalid Choice");
			}
		}while(choice != 9);

	}

}
