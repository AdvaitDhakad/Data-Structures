#include<iostream>

using namespace std;

int arr[10], n, i;
void sort_insertion(){
    for(int i=1; i<n; i++){
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
    cout<<"Sorted array: ";
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main(){
    cout << "\t\t *** Binary Search ** \n\n" << endl;
    cout<<"Enter the number of elements: ";
    cin>>n;
    cout<<"Enter the elements: ";
    for(i=0; i<n; i++){
        cin>>arr[i];
    }
    sort_insertion();
    int key;
    cout<<"Enter the element to be searched: ";
    cin>>key;
    int low = 0, high = n-1, mid;
    while(low<=high){
        mid = (low+high)/2;
        if(arr[mid]==key){
            cout<<"Element found at position "<<mid+1<<endl;
            return 0;
        }
        else if(arr[mid]<key){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    cout<<"Element not found"<<endl;
    return 0;
}