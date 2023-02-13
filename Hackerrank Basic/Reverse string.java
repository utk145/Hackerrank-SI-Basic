/*
Q) Given a string, reverse the given string in-place and then print it.


Input Format:
Input contains a string S, consisting of ascii characters.


Constraints:
1 <= len(s) <= 100


Output Format:
Print the reversed string.


Sample Input 0:
fdsrd

Sample Output 0:
drsdf

Explanation 0:
Self Explanatory


*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            reversed+=ch;
        }
           System.out.println(reversed);
    }
}