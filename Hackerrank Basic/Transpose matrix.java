/*

Q)  Given a matrix of size N x M, print transpose of the matrix.


Input Format:
First line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.


Constraints:
1 <= N, M <= 100
-109 <= ar[i] <= 10^9


Output Format:
Print the transposed of the given matrix.


Sample Input 0:
2 2
5 -1
19 8

Sample Output 0:
5 19
-1 8

Explanation 0:
Self Explanatory

*/

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    for (int j = 0; j < m; j++) {
      for (int i = 0; i < n; i++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}