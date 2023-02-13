/*

Q) Print right-angled triangle pattern. See example for more details.


Input Format:
First line of input contains a single integer N - the size of the triangle.


Constraints:
1 <= N <= 50


Output Format:
For the given integer, print the right-angled triangle pattern.


Sample Input 0:
5

Sample Output 0:
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

Explanation 0:
Self Explanatory

*/




import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {

    Scanner m = new Scanner(System.in);
    int n = m.nextInt();

    for (int i = 1; i <= n; i++) {
      int tmp = i;
      for (int j = 1; j <= i; j++) {
        System.out.print(tmp + " ");
        tmp = tmp + n - j;
      }
      System.out.println();
    }

  }
}
