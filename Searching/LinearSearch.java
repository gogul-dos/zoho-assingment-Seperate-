package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        System.out.println(linearSearchUsingRecursion(0,arr,search));
    }
    public  static int linearSearchUsingRecursion(int start,int[] arr, int search){
        if(start>=arr.length)return -1;
        if(arr[start]==search)return start+1;
        return linearSearchUsingRecursion(start+1,arr,search);
    }
}
