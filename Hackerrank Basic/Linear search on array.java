import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                System.out.println(i);
                temp++;
            }

        }
        if(temp==0){
            System.out.println(-1);
        }
    
    }
}