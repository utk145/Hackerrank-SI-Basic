/*
Q) Given a string, print all the letters present at odd index, followed by the letters present at even index.


Input Format:
Input contains a string S, consisting of ascii characters.


Constraints:
1 <= len(S) <= 100


Output Format:
Print letters present at odd index, followed by the letters present at even index.


Sample Input 0:
afdg5tg

Sample Output 0:
fgtad5g

Explanation 0:
Self Explanatory

*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String odd = "";
    String even = "";
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        even += s.charAt(i);
      } else {
        odd += s.charAt(i);
      }
    }
    System.out.println(odd + even);    
    }
}