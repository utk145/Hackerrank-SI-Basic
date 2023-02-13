/*

Q) Print multiplication table for given integer N.


Input Format:
First and only line of input contains a single integer N.


Constraints:
-10^5 <= N <= 10^5


Output Format:
Print multiplication table for given integer N.


Sample Input 0:
9

Sample Output 0:
9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
9 * 10 = 90

Explanation 0:
Self Explanatory

*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
}








import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for(int i=1;i<=10;i++){
            System.out.println(n+" * "+(i)+" = "+(n*i));
        }
    }
}



