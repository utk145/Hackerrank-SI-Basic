/*
Q)  Print hollow half inverted pyramid pattern using '*'. See example for more details.

Input Format:
First and only line of input contains a single integer N - the size of the pyramid.


Constraints:
1 <= N <= 50


Output Format:
For the given integer, print hollow half inverted pyramid pattern.


Sample Input 0:
5

Sample Output 0:
* * * * *
*     *
*   *
* *
*


*/



import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        if (j == n || i == 1 || j == i) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
