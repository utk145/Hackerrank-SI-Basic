/*

Q)  Given two matrices A and B each of size N x M, print sum of the matrices (A + B)..



**************************************************************
Note: Try solving it by declaring only a single matrix.
**************************************************************




Input Format:
First line of input contains N, M - size of the matrices. Its followed by 2*N lines, each containing M integers - elements of the matrices. First N lines for matrix A and the next N lines for matrix B.


Constraints:
1 <= N, M <= 100
-109 <= ar[i] <= 10^9



Output Format:
Print sum of the 2 given matrices (A + B).


Sample Input 0:
2 3
5 -1 3
19 8 4
4 5 -6
1 -2 12


Sample Output 0:
9 4 -3
20 6 16



Explanation 0:
Self Explanatory.

*/





// Approach 1 -  By declaring three Matrices

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[n][m];
    int[][] b = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        b[i][j] = sc.nextInt();
      }
    }
    int[][] c = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        c[i][j] = a[i][j] + b[i][j];
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}





// Approach 2 -  By declaring only one matrix

import java.util.Scanner;
import java.io.*;
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

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] += sc.nextInt();
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}




