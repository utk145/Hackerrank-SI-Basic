/*

Q)  Given a matrix of size N x M, print column-wise sum, separated by a newline.


Input Format:
The first line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.


Constraints:
1 <= N, M <= 100
-106 <= ar[i] <= 10^6


Output Format:
Print column-wise sum of the matrix, separated by newline.


Sample Input 0:
2 2
5 -1
19 8

Sample Output 0:
24
7

Explanation 0:
Self Explanatory.

*/




import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    for (int j = 0; j < m; j++) {
      int sum = 0;
      for (int i = 0; i < n; i++) {
        sum += arr[i][j];
      }
      System.out.println(sum);
    }
  }
}