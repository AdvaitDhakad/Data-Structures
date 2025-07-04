/*
Name:  Advait Dhakad
Roll Number: 
Unit 1: Sorting
Program: Bubble Sort */

#include<iostream>

using namespace std;

int main()
{
	int arr[10],n,i;
	cout << "\t\t** BUBBLE SORT PROGRAM **\n\n";
	cout << "Enter the size of the array: ";
	cin >> n;
	for (i=0;i<n;i++){
		cout << "Enter Values in the array: ";
		cin >> arr[i];	
	}
	for (i=0;i<n;i++){
		cout << arr[i] << " ";	
	}
}
