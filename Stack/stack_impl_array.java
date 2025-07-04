/*
	Name: Advait Dhakad
	Roll No: 1510
	Unit 3: Stack
	Program: Stack - array implementation
*/

import java.util.Scanner;
class stack{
	int max;
	int [] sArray;
	int tos; 
	stack(int size){
		max = size;
		sArray = new int[max];
		tos = -1;
	}// end constructor
	void push(int ele){
		if (tos>=max-1){
			System.out.println("OVERFLOW");
		}
		else{
			sArray[++tos]=ele;
		}
	}// end of push
	int pop(){
		if(tos<0){
			System.out.println("UNDERFLOW");
			return -1;
		}
		else{	
			return sArray[tos--];
		}
	}// end of pop
	void display(){
		for(int i = tos; i>=0;i--)
		{
			System.out.println("| "+sArray[i]+"|");
		}
		System.out.println("--------");
	}// end of display
	int peek(){
		if(tos<0){
			System.out.println("The stack is empty");
			return -1;
		}
		else
			return sArray[tos];
	}// end of peek
	boolean isFull(){
		if (tos>=max-1){
			return true;		
		}
		else{
			return false;			
		}
	}// end of isFull
	boolean isEmpty(){
		if(tos<0){
			return true;
		}
		else{
			return false;
		}
	}// end of Empty
	
} //end of stack

class stack_impl_array{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the Stack:");
		stack s = new stack(scan.nextInt());
		char ch;
		do{	
			
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println("\n");
			System.out.println("\t******* STACK with array ************* \n");
			System.out.println(" 1 . PUSH");
			System.out.println(" 2 . POP");
			System.out.println(" 3 . Display the Stack");
			System.out.println(" 4 . PEEK");
			System.out.println(" 5 . IsFull");
			System.out.println(" 6 . IsEmpty \n");
			System.out.print("Enter your Choice: ");
			int choice = scan.nextInt();
			switch(choice){
				case 1:
					System.out.println("Selected PUSH");
					System.out.print("Enter the data you want insert: ");
					s.push(scan.nextInt());
					break;
				case 2:
					System.out.println("Selected POP");
					System.out.println(s.pop()>0? " The element was popped": " There was underflow no element popped");
					break;
				case 3:
					System.out.println("Selected to Display the Stack");
					s.display();
					break;
				case 4:
					System.out.println("Selected to PEEK");
					System.out.println("The element at TOS is: "+s.peek());
					break;
				case 5:
					System.out.println("Selected to check if stack is full");
					System.out.println(s.isFull()==true? "The Stack is full":"The stack is not full");
					break;
				case 6: 
					System.out.println("Selected to check if stack is Empty");
					System.out.println(s.isEmpty()==true? "The Stack is Empty":"The stack is not empty ");
					break;

				default:
					System.out.println("Wrong choice!!");
					break;	
			}// end of switch 
			System.out.print("Do you Want to Countinue(y or Y for yes):" );
			ch = scan.next().charAt(0);
			
		}while(ch=='y' || ch=='Y'); // end of while



	}
} // end  of stack_impl