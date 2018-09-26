import java.util.Scanner;
public class Stack{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Stack s1 = new Stack();
		for(int i=0; i<s.length(); i++){
			s1.push(s.charAt(i));
		}
		String reverse="";
		while(!s1.isEmpty()){
			reverse+=s1.pop();
		}
		System.out.println(reverse);
		if(s.equals(reverse)){
			System.out.println("Palindrome PAL");
		}
		else{
			System.out.println("Nah cunt");
		}

	}


	private int size;
	private long [] stack;
	private int top;

	 public Stack(int s){
	maxize =s;
	stac
	 }
	 public void push(char j){
	 	top++;
	 	stack[top]=j;
	 }
	 public void makeEmpty(){
	 	top=-1;
	 }
	 public boolean isEmpty(){
	 return(top==-1);
	 }
	 public boolean isFull(){
	 	return(top==size-1);
	 }
	 public long peek(){
	 	return stack[top];
	 }
	 public long pop(){
	 	return stack[top--];
	 }
}