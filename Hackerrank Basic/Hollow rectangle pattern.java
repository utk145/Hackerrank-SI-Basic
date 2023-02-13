/*

Q) Print hollow rectangle pattern using '*'. See example for more details.


Input Format:
Input contains two integers W - width of the rectangle and L - length of the rectangle.


Constraints:
2 <= W <= 50
2 <= L <= 50


Output Format:
For the given integers W and L, print the hollow rectangle pattern.


Sample Input 0:
5 4

Sample Output 0:
*****
*   *
*   *
*****


*/

import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int l = sc.nextInt();
        sc.close();
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == l - 1 || j == 0 || j == w - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


