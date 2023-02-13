/*

Q) Given a matrix of size N x M, print whether it is a sparse matrix or not.
Note: If a matrix contain 0 in more than half of its cells, then it is called a sparse matrix.

Input Format:
First line of input contains N, M - size of the matrix. Its followed by N lines each containing M intergers - elements of the matrix.

Constraints:
1 <= N, M <= 100
0 <= ar[i] <= 10^9

Output Format:
Print "Yes" if the given matrix is a sparse matrix, otherwise print "No".

Sample Input 0:
2 3
5 0 0
0 8 0


Sample Output 0:
Yes

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
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
        if (a[i][j] == 0) {
          count++;
        }
      }
    }
    int s = (n * m) / 2;
    if (count > s) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}