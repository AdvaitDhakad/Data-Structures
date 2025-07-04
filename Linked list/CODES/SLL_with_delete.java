// Name :- Shubham Dalvi
// Roll No :- 1509
// Unit 4 :- Lists
// Program :- Singly Linked List

import java.util.Scanner;
/* 1. Node Template */

class Node
{
	int data;
	Node next;

	/* Constructor */	
	public Node(int d)
	{
		data = d;
		next = null;
	}//End of Constructor

} //end of Node

/* 2. List Template */
class List
{
	Node head;
	Node tail;

	public List()
	{
		head = null;
		tail = null;
	}

	/* Insert at the end of SLL */

	public void InsertTail(int val)
	{
		//1. Make a new node using val
		Node x = new Node(val);
		
		//2. Check for first node in the SLL
		if(head == null)
		{
			head = x;
			tail = x;
		}
		else
		{
			tail.next = x; // Link to the tail of the SLL
			tail = x;      // Update tail to x	
		}
		
	}

	/* Count the number of nodes */
	public void count()
	{
		Node temp = head;
		int count = 0;
		
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}

		System.out.println("Number of nodes :- " + count);
		
	}//end of count
	
	/* Display the SLL */
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("End of SLL");
		
	}//End of display

	/* Search for a node */
	public void search(int val)
	{
		Node temp = head;
		int flag = 0;
		while(temp!=null)
		{
			if(temp.data == val)
			{
				flag = 1;
				break;
			}
			temp = temp.next;
		}
		if(flag == 1)
		{
			System.out.println("Search Successfully  " + temp.data);
		}
		else
		{
			System.out.println("Not Found  " + temp.data);
		}
	}


	/* Delete a node */
	public void delete(int val){
		Node temp = head;
		int flag = 0;
		Node prev = null;
		while(temp!=null)
		{
			if(temp.data == val)
			{
				flag = 1;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		
		//step 2 :- Unsuccessful search - return control
		if(flag == 0)
		{
			System.out.println("Value not found");
			return;
		}

		//step 3 :- Successful saerch 
		//step 3A :- Single Node Deletion
		if(temp == head && temp == tail)  //step 3a: Single Node Deletion
		{
			head = null;
			tail = null;	
		}
		else if(temp == head)		// step 3b: head node deletion
		{
			head = head.next;
			
		}
		else if(temp == tail)			//step 3c: Tail Node Deletion 	
		{	
			tail = prev;
			tail.next = null;	
		}		
		else				//Any other node deleted	
		{
			prev.next = temp.next;
		}

	}//end of delete


}//end of list

/* 3. Interface */
class SLL
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
			
		//Create object of List

		List s = new List();
		char ch;

		do
		{
			System.out.println(" *** Singly LInked List *** ");
	
			System.out.println("1. Insert at the end of the SLL");
			System.out.println("2. Count the number of nodes");
			System.out.println("3. Display the SLL");
			System.out.println("4. Search for a node");
			System.out.println("5. Delete a node");

			System.out.println("Enter your choice : ");
			int choice = scan.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("In option 1");
					s.InsertTail(scan.nextInt());
					break;

				case 2:
					System.out.println("In option 2");
					s.count();
					break;
				
				case 3:
					System.out.println("In option 3");
					s.display();
					break;


				case 4:
					System.out.println("In option 4");
					s.search(scan.nextInt());
					break;

				case 5:
					System.out.println("In option 5");
					s.delete(scan.nextInt());
					break;

				default:
					System.out.println("Incorrect Choice");
					break;
			}// end of switch 

			System.out.println("Do you want to continue (Type y or n): ");
			ch = scan.next().charAt(0);
		}while(ch == 'y' || ch == 'Y'); //end of do while loop
	 	
	}// end of void main
}// end of SLL
























