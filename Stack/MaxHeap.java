public class MaxHeap
{
	private int[] heap;
	private int size;
	private int capacity;

	//Constructor
	public MaxHeap(int capacity){
		this.capacity = capacity;
		this.heap = new int[capacity];
		this.size = 0;
	}//end of constructor
	
	//Parent Index
	private int parent(int i)	
	{
		return (i-1)/2;
	}

	//Left Child
	private int leftChild(int i)
	{
		return (2*i) + 1;
	}

	//Right Child
	private int rightChild(int i)
	{
		return (2*i) + 2;
	}

	//Insert an element in the heap
	public void insert(int value){
		if(size == capacity)
		{
			System.out.println("Heap is full");
			return;	
		}

		//Insert at the end of the array - almost complete property
		heap[size] = value;
		int current = size;
		size++;

		//reheapUp - max heap property
		while(current > 0 && heap[current] > heap[parent(current)])
		{
			swap(current, parent(current));
			current = parent(current);
		}//end of while
	}// end of insert

	//Delete - return element at the root
	public int delHeap()
	{
		if(size == 0)
		{
			System.out.println("Heap is empty");
			return -1;
		}
		
		int max = heap[0];		//root element
		heap[0] = heap[size-1];		//Moving last element to root
		size--;				//Reduce size of the loop
		
		reheapDown(0);			//Restore heap property
		
		return max;

	}

     	//reheapDOwn for max heap property
	private void reheapDown(int i)
	{
		int largest = i;
		int left = leftChild(i);
		int right = rightChild(i);

		//Find the larger of the left and right child
		if(left<size && heap[left]  > heap[largest])
		{
			largest = left;
		}
	
		if(right<size && heap[right]  > heap[largest])
		{
			largest = right;
		}

		//if largest is not the root - swap and continue
		if(largest != i)
		{
			swap(i, largest);
			reheapDown(largest);
		}
	}//end of reheapDown

	//Swap
	private void swap(int i, int j)
	{
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	public void Display()
	{
		System.out.println("Heap : ");

		for(int i = 0; i < size; i++){
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}//end of display

	//Main
	public static void main(String[] args)
	{
		MaxHeap h = new MaxHeap(12);

		h.insert(23);
		h.insert(7);
		h.insert(92);
		h.insert(6);
		h.insert(12);
		h.insert(14);
		h.insert(40);
		h.insert(44);
		h.insert(20);
		h.insert(21);

		h.Display();

		System.out.println("Element deleted : " + h.delHeap());
		h.Display();

	}
}//end of Maxheap
