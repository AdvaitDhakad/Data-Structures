/* Name: Advait Dhakad
   Roll No: 1510
   Unit 1: Sorting & Searching
   Program: Linear Search */
   
#include<iostream>

using namespace std;

int main(){
	int arr[10],n,i,k;
	cout << "\t *** LINEAR SEARCH ****** \n";
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
	
//	BINARY SEARCH
	cout << "\nEnter the number you want to search: ";
	cin >> k;
	int flg = 0;
	for (i=0; i<n; i++){
		if (arr[i] == k){
			cout << "ELEMENT FOUND at index: " << i;
			flg = 1;
			break;
		}
	}
	if(flg == 0){
		cout << "Element not found";
	}
}
