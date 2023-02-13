import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int key = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int l = 0;
    int h = arr.length - 1;
    int mid = (l + h) / 2;
    while (l <= h) {
      if (key == arr[mid]) {
        System.out.println("true");
        break;
      }
      if (key < arr[mid]) {
        h = mid - 1;
      } else {
        l = mid + 1;
      }
      mid = (l + h) / 2;
    }
    if (l > h) {
      System.out.println("false");
    }
  }
}





//Algorithm for reference
/*
int BinarySearch(int A[],n,key){
    int l=1;int h=n;
    while(l<=h){
        int mid = (l+h)/2;
         if(key==A[mid]){
             return mid;
         }   
        if(key<A[mid]){
            h=mid-1;
        }else{
            l=mid+1;    
        }
    }
    return 0;
}

*/