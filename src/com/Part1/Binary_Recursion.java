package com.Part1;

public class Binary_Recursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int target=34;
        System.out.println(search(arr,target,0, arr.length-1));
    }
    public static int search(int[]arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return search(arr,target,start,mid-1);
        }
        return search(arr,target,mid+1,end);
    }

}