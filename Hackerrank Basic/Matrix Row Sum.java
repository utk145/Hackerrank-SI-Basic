/*

Q) Given a matrix of size N x M, print row-wise sum, separated by a newline.




****************************************************************
Note: Try to solve this without declaring/storing the matrix.
****************************************************************


Input Format:
First line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.


Constraints:
1 <= N, M <= 100
-106 <= ar[i] <= 10^6


Output Format:
Print row-wise sum of the matrix, separated by a newline.


Sample Input 0:
2 3
5 -1 3
19 8 -5


Sample Output 0:
7
22


Explanation 0:
Self Explanatory.

*/




import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
      
    }
}




