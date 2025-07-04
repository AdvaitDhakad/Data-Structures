/*
	Name: Advait Dhakad
	Roll no: 1510
	Unit 4: Lists
	Program: Doubly Linked List */

import java.util.Scanner;

/* 1. Node Template */
class DNode{
	int data;
	DNode right;
	DNode left;
	/* Constructor */	
	public DNode(int d)
	{
		left = null;
		data = d;
		right = null;	
	}//End of Constructor

} //end of Node

class Dlist{
	DNode head;
	DNode tail;
	
	Dlist(){
		head = null;
		tail = null;
	} // end of constructor
	
	void insert(int ele){
		DNode x = new DNode(ele);
		if(head==null){
			head = x;
		}
		else{
			x.left = tail;
			tail.right = x;
		}
		tail=x;
		
	}//end of insert
	void display(){
		if (head==null){
			System.out.println("EMPTY LIST!!!");
		} 
		else{
			DNode tmp1 = head;
			DNode tmp2 = tail;
			System.out.println("Printing straight: ");
			while(tmp1.right!=null){
				System.out.print(tmp1.data + " <=>");
				tmp1 = tmp1.right;
			}
			System.out.println("End of list at the tail ");
			System.out.println("Printing Reverse: ");
			while(tmp2.left!=null){
				System.out.print(tmp2.data + "<=>");
				tmp2 = tmp2.left;
			}
			System.out.println("End of list at the head ");
		}
	}// end of display
	int count(){
		int number = 0;
		if (head==null){
			return 0;
		} 
		else{
			DNode tmp = head;
			while(tmp.right!=null){
				number++;
				tmp = tmp.right;
			}
			return number;
		}
			
	}// end of count
} //  end of Dlist


class DLL{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	char ch;
	Dlist d = new Dlist();
	do{	
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("\t\t********DOUBLY LINKED LIST*********");
		System.out.println(" 1 . Insert at the end of the DLL");
		System.out.println(" 2.  Insert at the head of the DLL");
		System.out.println(" 3 . Display the DLL");
		System.out.println(" 4 . Search for a Node");
		System.out.println(" 5 . Delete a node \n");
		System.out.println(" 6 . Count the number of nodes");
		System.out.print("Enter your Choice: ");
		int choice = scan.nextInt();
		switch(choice){
			case 1:
				System.out.println("Selected to insert the data");
				System.out.print("Enter the data you want insert: ");
				d.insert(scan.nextInt());
				break;
			case 2:
				System.out.println("Selected to  Count the number of nodes");
				break;
			case 3:
				System.out.println("Selected to Display the DLL");
				d.display();
				break;
			case 4:
				System.out.println("Selected to Search for a node");
				System.out.print("Enter the data you want Search:");
				break;
			case 5:
				System.out.println("Selected to Delete a node");
				break;
			default:
				System.out.println("Wrong choice!!");
				break;	
			}// end of switch 
		System.out.print("Do you Want to Countinue(y or Y for yes):" );
		ch = scan.next().charAt(0);
		}while(ch=='y' || ch=='Y'); // end of do while
	
	} //end of main
} // end of DLL