/* Name: Advait Dhakad
   Roll No: 1510
   Unit 1: Sorting & Searching
   Program: Binary Search */
   
#include<iostream>

using namespace std;

int main(){
	int arr[10],n,i,k;
	int first, mid, last;
	cout << "\t ***** BINARY SEARCH ****** \n";
	cout << "Enter the size of array: ";
	cin >> n;
	
	for(i=0;i<n;i++){
		cout << "Enter the element at " << i << ":";
		cin >> arr[i];
	}
	cout << "Original Array :";
	for(i=0; i<n; i++){
		cout << arr[i] << " ";
	}
	
// Binary Search
	cout << "\nEnter the element you want to seach: ";
	cin >> k;
	int flag = 0;
	first = 0;
	last = n-1;
	while (first <= last){
		mid = (first+last)/2;
		if(arr[mid] == k){
			cout << "\nThe Element is Found at " << mid  << " index \n";
			flag = 1;
			break;
			}
		else if(arr[mid] > k ){
			last = mid -1;
			}
		else {
			first = mid +1;
			}
	}
	if (flag == 0){
		cout << "\nElement not Found in the Array";
	}
}


