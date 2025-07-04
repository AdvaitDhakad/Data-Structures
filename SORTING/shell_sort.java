/*
Name: Advait Dhakad
Roll No: 1510
Unit: Searching and Sorting
Program: Shell Sort
*/
class shell_sort{
	static void SSort(int[] arr){
		int n = arr.length;
		int j;
		for(int gap=n/2;gap>0;gap=gap/2){
			for(int i=gap; i<n;i++){
				int temp = arr[i];
				for(j = i; j>=gap && arr[j-gap]>temp; j=j-gap){
					arr[j]=arr[j-gap];			
				} // end of inner most loop (j)
				arr[j]=temp;
			} // end of inner loop(i)
		}// end of outer for loop (gap)
	} // end of SSort

	static void Display(int[] arr){
		for(int i: arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
	System.out.println("\t\t*******SHELL SORT*******");
	int[] arr = {12,94,57,86,54,3,2};
	System.out.println("Before Sorting: ");
	Display(arr);
	SSort(arr);
	System.out.println("After Sorting: ");
	Display(arr);
	
	

}
}