/*

Q)  Given a positive integer N, print the sum of 1st N natural numbers.


Input Format:
First and only line of input contains a positive integer - N.


Constraints:
1 <= N <= 10^4


Output Format:
Print the sum of 1st N natural numbers.


Sample Input 0:
4

Sample Output 0:
10

Explanation 0:
Self Explanatory

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner m=new Scanner(System.in);
    int n = m.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
        sum=sum+i;    
        }
    System.out.println(sum);
        
    
    }
}
