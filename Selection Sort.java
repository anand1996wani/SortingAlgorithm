/*

Selection Sort

https://www.geeksforgeeks.org/problems/selection-sort/1

*/

class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int small = arr[i];
        int k = i;
        for(int j = i;j < arr.length;j++){
            if(small > arr[j]){
                small = arr[j];
                k = j;
            }
        }
        return k;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0;i < n;i++){
	        int k = select(arr, i);
	        int temp = arr[k];
	        arr[k] = arr[i];
	        arr[i] = temp;
	    }
	}
}
