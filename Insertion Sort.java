/**

Insertion Sort

https://www.geeksforgeeks.org/problems/insertion-sort/1

*/

class Solution
{
  static void insert(int arr[],int i)
  {
    // Your code here
    int data = arr[i];
    int k = i - 1;
    while(k >= 0 && arr[k] > data) {
        arr[k + 1] = arr[k];
        k--;
    }
    arr[k + 1] = data;
  }
  
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
    //code here
    for(int i = 1;i < n;i++) {
        insert(arr, i);
    }
  }
}
