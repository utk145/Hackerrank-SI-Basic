/*

Q) Print half diamond pattern using '*'. See example for more details.


Input Format:
First and only line of input contains a single integer N.


Constraints:
1 <= N <= 50


Output Format:
For the given integer, print the half diamond pattern.


Sample Input 0:
5

Sample Output 0:
*
**
***
****
*****
****
***
**
*

Explanation 0:
Self Explanatory

*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
    int n = m.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = n - 1; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
