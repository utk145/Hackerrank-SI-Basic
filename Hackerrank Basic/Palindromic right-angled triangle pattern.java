/*
Q) Print palindromic right-angled triangle pattern using characters. See example for more details.


Input Format:
First and only line of input contains a integer N - size of the pattern.


Constraints:
1 <= N <= 26


Output Format:
For the given integer N, print the palindromic right-angled triangle pattern.


Sample Input 0:
5

Sample Output 0:
A 
A B A 
A B C B A 
A B C D C B A 
A B C D E D C B A

Explanation 0:
Self Explanatory

*/



import java.util.*;
import java.io.*;

public class Solution{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) ('A' + j) + " ");
      }
      for (int j = i - 1; j >= 0; j--) {
        System.out.print((char) ('A' + j) + " ");
      }
      System.out.println();
    }
    
  }
}
