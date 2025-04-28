package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        System.out.println(BinarySearchUsingRecursion(0,arr.length-1,arr,search));
    }
    public  static int BinarySearchUsingRecursion(int start,int end,int[] arr, int search){
        if(start>=arr.length)return -1;
        int mid = (start+end)/2;
        if(arr[mid]==search)return start+1;
        else if (arr[mid]>search)end = mid-1;
        else start = mid+1;
        return BinarySearchUsingRecursion(start,end,arr,search);
    }
}
