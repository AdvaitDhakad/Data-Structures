public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;
    
    public MinHeap(int maxSize)
    {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize];
    }
    
    private int parent(int i)
    {
        return (i-1)/2;
    }
    
    private int leftChild(int i)
    {
        return 2*i + 1;
    }
    
    private int rightChild(int i)
    {
        return 2*i + 2;
    }
    
    private void swap(int i, int j)
    {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    private void reheapUp(int i)
    {
        int parent = parent(i);
        
        if(i > 0 && heap[i] < heap[parent])
        {
            swap(i, parent);
            reheapUp(parent);
        }
    }
    
    public void insert(int element)
    {
        if(size == maxSize)
        {
            System.out.println("Heap is full");
            return;
        }
        
        heap[size] = element;
        size++;
        
        reheapUp(size-1);
    }
    
    public int remove()
    {
        if(size == 0)
        {
            System.out.println("Heap is empty");
            return -1;
        }
        
        int min = heap[0];
        heap[0] = heap[size-1];
        size--;
        
        reheapDown(0);
        
        return min;
    }
    
    private void reheapDown(int i)
    {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);
        
        if(left < size && heap[left] < heap[smallest])
        {
            smallest = left;
        }
        
        if(right < size && heap[right] < heap[smallest])
        {
            smallest = right;
        }
        
        if(smallest != i)
        {
            swap(i, smallest);
            reheapDown(smallest);
        }
    }
    
    public void display()
    {
        System.out.println("Heap : ");
        
        for(int i = 0; i < size; i++)
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
}
