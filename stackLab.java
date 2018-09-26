

public class stackLab {
class Stack{
	private int maxSize;
	private int[] stackArray;
	private int top;

	public Stack(int size){ //Constructor
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}

	public void push(int value){ //Adds an element to the top of the stack
		top++;
		stackArray[top] = value;
	}

	public int pop(){ //Removes the top element of the stack and returns the value you've removed
		return stackArray[top--];
	}

	public int peek(){ //Returns the element at the top of the stack
		return stackArray[top];
	}

	public boolean isEmpty(){ //Returns true if the stack is empty
		return(top == -1);
	}

	public boolean isFull(){ //Returns true if the stack is full
		return(top+1 == maxSize);
	}
	public void makeEmpty(){ //Doesn't delete elements in the array but if you call
		top = -1;			 //push method after calling makeEmpty it will overwrite previous values
	}
}
//Example
public class Stacks{
	public static void main(String args[]){
		Stack myStack = new Stack(4); //Declare a stack of maximum size 4
		//Populate the stack
		myStack.push(5);
		myStack.push(8);
		myStack.push(2);
		myStack.push(9);

		System.out.println(myStack.isEmpty()); //will print false
		System.out.println(myStack.isFull()); //will print true
		System.out.println(myStack.peek()); //will print 9
		System.out.println(myStack.pop()); //will print 9
		System.out.println(myStack.peek()); // will print 2
	}
}


}