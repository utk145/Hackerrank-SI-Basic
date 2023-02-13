/*
Q) Given a sentence S and a character ch, count occurrence of the given character in the sentence


Input Format:
First line of input contains a sentence - S and second line of input contains a single lowercase character - ch.


Constraints:
1 <= len(S) <= 100


Output Format:
Print count of the given character in the sentence.


Sample Input 0:
Data Structures & Algorithms
s

Sample Output 0:
2

Explanation 0:
Self Explanatory

*/




import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char ch = sc.next().charAt(0);
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ch) {
        count++;
      }
    }

    System.out.println(count);
  }
}