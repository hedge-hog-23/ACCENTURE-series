// Problem Description :
// The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

// Note:

// Return -1 if the array is null
// Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// Computed values lie within the integer range.
// Example:

// Input:

// r: 7
// unit: 2
// n: 8
// arr: 2 8 3 5 7 4 1 2
// Output:

// 4

import java.util.*;
public class Main
{
    static int count(int r,int[] arr,int n){
	if (n == 0) return -1
        int count = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(sum<r){
                sum+=arr[i];
                count++;
            }
            else break;
        }
        return count;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int r = sc.nextInt();
	    int unit = sc.nextInt();
	    int n = sc.nextInt();
	    
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	       arr[i] = sc.nextInt(); 
	    }
	    
	    System.out.println(count(r*unit,arr,n));
	    
	}
}



